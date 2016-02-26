package metadslx.compiler;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

import metadslx.compiler.AnnotatedAntlr4Parser.ActionContext;
import metadslx.compiler.AnnotatedAntlr4Parser.AnnotatedIdContext;
import metadslx.compiler.AnnotatedAntlr4Parser.AnnotationAttributeContext;
import metadslx.compiler.AnnotatedAntlr4Parser.AtomContext;
import metadslx.compiler.AnnotatedAntlr4Parser.ExpressionContext;
import metadslx.compiler.AnnotatedAntlr4Parser.GrammarSpecContext;
import metadslx.compiler.AnnotatedAntlr4Parser.LabeledAltContext;
import metadslx.compiler.AnnotatedAntlr4Parser.LexerCommandContext;
import metadslx.compiler.AnnotatedAntlr4Parser.LexerRuleContext;
import metadslx.compiler.AnnotatedAntlr4Parser.ModeSpecContext;
import metadslx.compiler.AnnotatedAntlr4Parser.OptionContext;
import metadslx.compiler.AnnotatedAntlr4Parser.ParserRuleSpecContext;
import metadslx.compiler.AnnotatedAntlr4Parser.TokensSpecContext;

public class Antlr4AnnotationVisitor extends AnnotatedAntlr4ParserBaseVisitor<Object> {
	private AnnotatedAntlr4Compiler compiler;

	private AnnotatedAntlr4PropertiesBlockCompiler propertiesBlockCompiler;
	private AnnotatedAntlr4PropertyBlockExpressionPrinter propertiesBlockExpressionPrinter;

	private StringBuilder sb;
	private String indent;
	private int tmpCounter;

	private String parserName;
	private String lexerName;
	private String parserHeader;
	private String lexerHeader;
	private boolean generateCompiler = true;
	private boolean generateCompilerBase = false;

	private ArrayList<AnnotationType> annotationTypes = new ArrayList<>();
	private Grammar currentGrammar;
	private Mode currentMode;
	private LexerRule currentLexerRule;
	private ParserRule currentParserRule;
	private ParserRule currentParserRuleAlt;
	private ParserRuleElement currentElement;

	public Antlr4AnnotationVisitor(AnnotatedAntlr4Compiler compiler) {
		this.compiler = compiler;
		this.propertiesBlockCompiler = new AnnotatedAntlr4PropertiesBlockCompiler(compiler);
		this.propertiesBlockExpressionPrinter = new AnnotatedAntlr4PropertyBlockExpressionPrinter(this);
	}

	public AnnotatedAntlr4Compiler getCompiler() {
		return this.compiler;
	}

	protected String getTmpVariable() {
		++this.tmpCounter;
		return "__tmp" + this.tmpCounter;
	}

	protected void incIndent() {
		indent += "    ";
	}

	protected void decIndent() {
		indent = indent.substring(4);
	}

	protected void writeIndent() {
		sb.append(indent);
	}

	protected void write(String text) {
		sb.append(text);
	}

	protected void write(String format, Object... args) {
		sb.append(MessageFormat.format(format, args));
	}

	protected void appendLine() {
		sb.append("\n");
	}

	protected void writeLine() {
		this.writeLine("");
	}

	protected void writeLine(String text) {
		writeIndent();
		write(text);
		appendLine();
	}

	protected void writeLine(String format, Object... args) {
		writeIndent();
		write(format, args);
		appendLine();
	}

	@Override
	public Object visitGrammarSpec(GrammarSpecContext ctx) {
		if (ctx.grammarType().PARSER() != null) {
			this.parserName = ctx.id().getText();
			this.lexerName = this.parserName;
			this.compiler.setIsLexer(false);
			this.compiler.setIsParser(true);
		} else if (ctx.grammarType().LEXER() != null) {
			this.lexerName = ctx.id().getText();
			this.compiler.setIsLexer(true);
			this.compiler.setIsParser(false);
		} else {
			this.parserName = ctx.id().getText();
			this.lexerName = this.parserName;
			this.compiler.setIsLexer(true);
			this.compiler.setIsParser(true);
		}
		currentGrammar = new Grammar();
		currentGrammar.setName(ctx.id().getText());
		currentMode = new Mode();
		currentMode.setName("DEFAULT_MODE");
		currentGrammar.getModes().add(currentMode);
		this.collectAnnotations(ctx.annotation());
		return super.visitGrammarSpec(ctx);
	}

	@Override
	public Object visitTokensSpec(TokensSpecContext ctx) {
		for (AnnotatedIdContext id : ctx.annotatedId()) {
			this.currentLexerRule = new LexerRule();
			this.currentLexerRule.setName(id.id().getText());
			if (this.currentLexerRule != null) {
				this.currentGrammar.getLexerRules().add(this.currentLexerRule);
				this.currentMode.getLexerRules().add(this.currentLexerRule);
				this.collectAnnotations(id.annotation());
				this.currentLexerRule = null;
			}
		}
		return null;
	}

	@Override
	public Object visitOption(OptionContext ctx) {
		if ("tokenVocab".equals(ctx.id().getText())) {
			this.lexerName = ctx.optionValue().getText();
		}
		if ("generateCompiler".equals(ctx.id().getText())) {
			this.generateCompiler = "true".equals(ctx.optionValue().getText());
		}
		if ("generateCompilerBase".equals(ctx.id().getText())) {
			this.generateCompilerBase = "true".equals(ctx.optionValue().getText());
		}
		return super.visitOption(ctx);
	}

	@Override
	public Object visitAction(ActionContext ctx) {
		String id = ctx.id().getText();
		if ("header".equals(id)) {
			String scopeName = null;
			if (ctx.actionScopeName() != null) {
				scopeName = ctx.actionScopeName().getText();
			}
			String action = ctx.ACTION().getText();
			int first = action.indexOf('{');
			int last = action.lastIndexOf('}');
			if (first >= 0 && last >= 0) {
				action = action.substring(first + 1, last);
			}
			if (scopeName == null || "parser".equals(scopeName)) {
				this.parserHeader = action;
			}
			if (scopeName == null || "lexer".equals(scopeName)) {
				this.lexerHeader = action;
			}
		}
		return super.visitAction(ctx);
	}

	@Override
	public Object visitModeSpec(ModeSpecContext ctx) {
		currentMode = new Mode();
		if (ctx.id() != null) {
			currentMode.setName(ctx.id().getText());
		}
		currentGrammar.getModes().add(currentMode);
		this.collectAnnotations(ctx.annotation());
		return super.visitModeSpec(ctx);
	}

	@Override
	public Object visitLexerRule(LexerRuleContext ctx) {
		if (ctx.FRAGMENT() == null) {
			this.currentLexerRule = new LexerRule();
			this.currentLexerRule.setName(ctx.TOKEN_REF().getText());
			super.visitLexerRule(ctx);
			if (this.currentLexerRule != null) {
				this.currentGrammar.getLexerRules().add(this.currentLexerRule);
				this.currentMode.getLexerRules().add(this.currentLexerRule);
				this.collectAnnotations(ctx.annotation());
				this.currentLexerRule = null;
			}
		}
		return null;
	}

	@Override
	public Object visitLexerCommand(LexerCommandContext ctx) {
		if ("more".equals(ctx.lexerCommandName().getText())) {
			this.currentLexerRule = null;
		}
		return null;
	}

	@Override
	public Object visitParserRuleSpec(ParserRuleSpecContext ctx) {
		this.currentParserRule = new ParserRule();
		this.currentParserRule.setName(ctx.RULE_REF().getText());
		super.visitParserRuleSpec(ctx);
		if (this.currentParserRule != null) {
			this.currentGrammar.getParserRules().add(this.currentParserRule);
			this.collectAnnotations(ctx.annotation());
			this.handleAutoSymbols(this.currentParserRule);
			this.handleAutoProperties(this.currentParserRule);
			this.currentParserRule = null;
		}
		return null;
	}

	@Override
	public Object visitLabeledAlt(LabeledAltContext ctx) {
		if (ctx.id() != null) {
			this.currentParserRuleAlt = new ParserRule();
			this.currentParserRuleAlt.setName(ctx.id().getText());
			if (ctx.propertiesBlock() != null) {
				this.currentParserRuleAlt.setPropertiesBlock(ctx.propertiesBlock());
			}
			this.currentParserRule.getAlternatives().add(this.currentParserRuleAlt);
			this.collectAnnotations(ctx.annotation());
		} else {
			if (ctx.propertiesBlock() != null) {
				if (this.currentParserRule.getPropertiesBlock() != null) {
					this.compiler.getDiagnostics().addError("There are multiple property blocks for the rule.",
							this.compiler.getFileName(), new Antlr4TextSpan(ctx.getParent()), false);
				}
				this.currentParserRule.setPropertiesBlock(ctx.propertiesBlock());
			}
		}
		super.visitLabeledAlt(ctx);
		this.handleAutoSymbols(this.currentParserRuleAlt);
		this.handleAutoProperties(this.currentParserRuleAlt);
		this.currentParserRuleAlt = null;
		return null;
	}

	@Override
	public Object visitAtom(AtomContext ctx) {
		String name = null;
		if (ctx.terminal() != null) {
			if (ctx.terminal().TOKEN_REF() != null) {
				name = ctx.terminal().TOKEN_REF().getText();
			}
			/*
			 * if (ctx.terminal().STRING_LITERAL() != null) { name =
			 * ctx.terminal().STRING_LITERAL().getText(); }
			 */
		}
		if (ctx.ruleref() != null) {
			name = ctx.ruleref().RULE_REF().getText();
		}
		if (name != null) {
			AnnotatedAntlr4Parser.ElementContext element = null;
			if (ctx.getParent() instanceof AnnotatedAntlr4Parser.ElementContext) {
				element = (AnnotatedAntlr4Parser.ElementContext) ctx.getParent();
				this.currentElement = new ParserRuleElement();
				this.currentElement.setName(name);
				this.currentElement.setType(name);
				this.currentElement.setIsArray(element.ebnfSuffix() != null
						&& (element.ebnfSuffix().PLUS() != null || element.ebnfSuffix().STAR() != null));
			} else {
				if (ctx.getParent() instanceof AnnotatedAntlr4Parser.LabeledElementContext) {
					AnnotatedAntlr4Parser.LabeledElementContext labeledElement = (AnnotatedAntlr4Parser.LabeledElementContext) ctx
							.getParent();
					this.currentElement = new ParserRuleElement();
					this.currentElement.setName(labeledElement.id().getText());
					this.currentElement.setType(labeledElement.atom().getText());
					element = (AnnotatedAntlr4Parser.ElementContext) labeledElement.getParent();
					this.currentElement.setIsArray(element.ebnfSuffix() != null
							&& (element.ebnfSuffix().PLUS() != null || element.ebnfSuffix().STAR() != null));
				}
			}
			if (this.currentElement != null) {
				if (this.currentParserRuleAlt != null) {
					Optional<ParserRuleElement> optOldElement = this.currentParserRuleAlt.getElements().stream()
							.filter(e -> e.getName().equals(currentElement.getName())).findFirst();
					ParserRuleElement oldElement = null;
					if (optOldElement.isPresent()) {
						oldElement = optOldElement.get();
					}
					if (oldElement != null) {
						this.currentElement = oldElement;
						this.currentElement.setIsArray(true);
					} else {
						this.currentParserRuleAlt.getElements().add(this.currentElement);
					}
				} else if (this.currentParserRule != null) {
					Optional<ParserRuleElement> optOldElement = this.currentParserRule.getElements().stream()
							.filter(e -> e.getName().equals(currentElement.getName())).findFirst();
					ParserRuleElement oldElement = null;
					if (optOldElement.isPresent()) {
						oldElement = optOldElement.get();
					}
					if (oldElement != null) {
						this.currentElement = oldElement;
						this.currentElement.setIsArray(true);
					} else {
						this.currentParserRule.getElements().add(this.currentElement);
					}
				}
				if (element != null) {
					this.collectAnnotations(element.annotation());
				}
			}
		}
		super.visitAtom(ctx);
		this.currentElement = null;
		return null;
	}

	private void handleAutoSymbols(ParserRule rule) {
		if (rule == null)
			return;
		Optional<Annotation> autoSymbol = rule.getAnnotations().stream()
				.filter(a -> "AutoSymbol".equals(a.getType().getName())).findFirst();
		if (autoSymbol.isPresent()) {
			rule.getAnnotations().removeIf(a -> "AutoSymbol".equals(a.getType().getName()));
			if (rule.getAlternatives().size() > 0) {
				for (ParserRule alt : rule.getAlternatives()) {
					this.createSymbolAnnotations(alt);
				}
			} else {
				this.createSymbolAnnotations(rule);
			}
		}
	}

	private void handleAutoProperties(ParserRule rule) {
		if (rule == null)
			return;
		Optional<Annotation> autoProperty = rule.getAnnotations().stream()
				.filter(a -> "AutoProperty".equals(a.getType().getName())).findFirst();
		if (autoProperty.isPresent()) {
			rule.getAnnotations().removeIf(a -> "AutoProperty".equals(a.getType().getName()));
			if (rule.getAlternatives().size() > 0) {
				for (ParserRule alt : rule.getAlternatives()) {
					this.createPropertyAnnotations(alt);
				}
			} else {
				this.createPropertyAnnotations(rule);
			}
		}
	}

	private void createSymbolAnnotations(ParserRule rule) {
		if (rule == null)
			return;
		if (!rule.getAnnotations().stream().filter(a -> "Symbol".equals(a.getType().getName())).findAny().isPresent()) {
			AnnotationType symbolType = this.registerAnnotationType("Symbol");
			Annotation symbolAnnot = new Annotation();
			symbolAnnot.setType(symbolType);
			symbolAnnot.setValue(this.toPascalCase(rule.getName()));
			rule.getAnnotations().add(symbolAnnot);
		}
		this.createPropertyAnnotations(rule);
	}

	private void createPropertyAnnotations(ParserRule rule) {
		for (ParserRuleElement elem : rule.getElements()) {
			if (elem.isParserRule()) {
				if (elem.getAnnotations().stream().filter(a -> "Property".equals(a.getType().getName())).findAny()
						.isPresent())
					continue;
				AnnotationType propType = this.registerAnnotationType("Property");
				Annotation propAnnot = new Annotation();
				propAnnot.setType(propType);
				propAnnot.setValue(this.toPascalCase(elem.getName()));
				elem.getAnnotations().add(propAnnot);
			}
		}
	}

	private AnnotationType registerAnnotationType(String name) {
		Optional<AnnotationType> annotationTypeOpt = this.annotationTypes.stream()
				.filter(at -> name.equals(at.getName())).findFirst();
		AnnotationType annotationType = null;
		if (!annotationTypeOpt.isPresent()) {
			annotationType = new AnnotationType();
			annotationType.setName(name);
			this.annotationTypes.add(annotationType);
		} else {
			annotationType = annotationTypeOpt.get();
		}
		annotationType.setIsDynamic(this.compiler.isParser());
		return annotationType;
	}

	private void collectAnnotations(Iterable<AnnotatedAntlr4Parser.AnnotationContext> annotations) {
		for (AnnotatedAntlr4Parser.AnnotationContext annot : annotations) {
			String name = annot.qualifiedName().getText();
			AnnotationType annotationType = this.registerAnnotationType(name);
			Annotation annotation = new Annotation();
			annotation.setType(annotationType);
			if (this.currentElement != null) {
				this.currentElement.getAnnotations().add(annotation);
			} else if (this.currentParserRuleAlt != null) {
				this.currentParserRuleAlt.getAnnotations().add(annotation);
			} else if (this.currentParserRule != null) {
				this.currentParserRule.getAnnotations().add(annotation);
			} else if (this.currentLexerRule != null) {
				this.currentLexerRule.getAnnotations().add(annotation);
			} else if (this.currentMode != null) {
				this.currentMode.getAnnotations().add(annotation);
			} else if (this.currentGrammar != null) {
				this.currentGrammar.getAnnotations().add(annotation);
			} else {
				this.compiler.getDiagnostics().addWarning("No parent for annotation: " + annotation.getType().getName(),
						null, new Antlr4TextSpan(annot), false);
			}
			if (annot.annotationBody() != null) {
				if (annot.annotationBody().annotationAttributeList() != null) {
					for (AnnotationAttributeContext attr : annot.annotationBody().annotationAttributeList()
							.annotationAttribute()) {
						AnnotationProperty property = new AnnotationProperty();
						property.setName(attr.identifier().getText());
						if (attr.expression() != null) {
							String value = attr.expression().getText();
							property.setValue(value);
						} else if (attr.expressionList() != null) {
							for (ExpressionContext expr : attr.expressionList().expression()) {
								String value = expr.getText();
								property.getValues().add(value);
							}
						}
						annotation.getProperties().add(property);
						if (!annotationType.getProperties().contains(property.getName())) {
							annotationType.getProperties().add(property.getName());
						}
					}
				} else if (annot.annotationBody().expression() != null) {
					String value = annot.annotationBody().expression().getText();
					annotation.setValue(value);
				} else if (annot.annotationBody().expressionList() != null) {
					for (ExpressionContext expr : annot.annotationBody().expressionList().expression()) {
						String value = expr.getText();
						annotation.getValues().add(value);
					}
				}
			}
		}
	}

	protected String toAnnotationName(String name) {
		if (name == null || "".equals(name.trim()))
			return name;
		if (!name.endsWith("Annotation"))
			return name + "Annotation";
		else
			return name;
	}

	protected String toPascalCase(String name) {
		if (name == null || "".equals(name))
			return name;
		return ("" + name.charAt(0)).toUpperCase() + name.substring(1);
	}

	protected String toCamelCase(String name) {
		if (name == null || "".equals(name))
			return name;
		return ("" + name.charAt(0)).toLowerCase() + name.substring(1);
	}

	protected String toContextType(String ruleName) {
		if (ruleName == null || "".equals(ruleName))
			return ruleName;
		return this.parserName + "." + toPascalCase(ruleName) + "Context";
	}

	protected String toValue(String value, boolean dynamic) {
		if (value == null || "".equals(value.trim()))
			return null;
		if (value.length() >= 2 && value.startsWith("'") && value.endsWith("'")) {
			StringBuilder sb = new StringBuilder();
			value = value.substring(1, value.length() - 1);
			for (int i = 0; i < value.length(); ++i) {
				if (i + 1 < value.length() && value.charAt(i) == '\\') {
					sb.append(value.charAt(i));
					++i;
					sb.append(value.charAt(i));
				} else if (value.charAt(i) == '"') {
					sb.append("\\" + value.charAt(i));
				} else {
					sb.append(value.charAt(i));
				}
			}
			value = '"' + sb.toString() + '"';
			return value;
		} else if ("true".equals(value) || "false".equals(value) || "null".equals(value)) {
			return value;
		} else {
			boolean isIdentifier = Character.isJavaIdentifierStart(value.charAt(0));
			int dotCount = 0;
			int i = 1;
			while (isIdentifier && i < value.length()) {
				isIdentifier = isIdentifier
						&& (Character.isJavaIdentifierPart(value.charAt(i)) || value.charAt(i) == '.');
				if (value.charAt(i) == '.')
					++dotCount;
				++i;
			}
			if (isIdentifier) {
				if (dotCount == 0) {
					if (Character.isUpperCase(value.charAt(0))) {
						if (dynamic) {
							value = "node";
						} else {
							value = MessageFormat.format("{0}.{1}", this.lexerName, value);
						}
					} else {
						if (dynamic) {
							value = MessageFormat.format("context", toContextType(value));
						} else {
							value = MessageFormat.format("{0}.class", toContextType(value));
						}
					}
				} else if (dotCount == 1 && Character.isLowerCase(value.charAt(0))) {
					if (this.parserName != null) {
						String[] values = value.split(".");
						ParserRule pr = null;
						ParserRuleElement pre = null;
						for (ParserRule rule : this.currentGrammar.getParserRules()) {
							if (rule.getName().equals(values[0])) {
								pr = rule;
								break;
							}
							for (ParserRule alt : rule.getAlternatives()) {
								if (alt.getName().equals(values[0])) {
									pr = alt;
									break;
								}
							}
							if (pr != null)
								break;
						}
						if (pr != null) {
							for (ParserRuleElement elem : pr.getElements()) {
								if (elem.getName().equals(values[1])) {
									pre = elem;
									break;
								}
							}
							if (pre != null) {
								if (dynamic) {
									value = MessageFormat.format("context.{0}", pre.getAccessorName());
								} else {
									value = MessageFormat.format("{0}.class", toContextType(pre.getType()));
								}
							}
						}
					}
				}
			}
		}
		return value;
	}

	public String getGeneratedAnnotatorName() {
		if (this.compiler.isParser()) {
			return this.parserName+"Annotator";
		} else {
			return this.lexerName+"Annotator";
		}
	}
	
	public String generate(String targetPackage) {
		this.sb = new StringBuilder();
		this.indent = "";

		if (targetPackage != null && !"".equals(targetPackage.trim())) {
			writeLine("package {0};", targetPackage);
			appendLine();
		}
		writeLine("import java.util.ArrayList;");
		writeLine("import java.util.HashMap;");
		writeLine("import java.util.List;");
		writeLine("import java.util.Map;");
		appendLine();
		if (this.compiler.isLexer()) {
			writeLine("import org.antlr.v4.runtime.Token;");
		}
		if (this.compiler.isParser()) {
			writeLine("import org.antlr.v4.runtime.tree.ParseTree;");
		}
		writeLine("import org.antlr.v4.runtime.tree.TerminalNode;");
		appendLine();
		writeLine("import metadslx.core.IModelCompiler;");
		writeLine("import metadslx.core.ModelCompilerContext;");
		writeLine("import metadslx.compiler.*;");
		appendLine();
		if (this.compiler.isParser() && this.parserHeader != null && !"".equals(this.parserHeader.trim())) {
			writeLine(this.parserHeader);
		} else if (this.compiler.isLexer() && this.lexerHeader != null && !"".equals(this.lexerHeader.trim())) {
			writeLine(this.lexerHeader);
		}
		this.generateAnnotatorVisitor();
		return this.sb.toString();
	}

	private void generateAnnotatorVisitor() {
		for (LexerRule rule : currentGrammar.getLexerRules()) {
			for (Annotation annot : rule.getAnnotations()) {
				if ("Syntax".equals(annot.getType().getName())) {
					if (!annot.getProperties().stream().anyMatch(p -> "first".equals(p.getName()))) {
						annot.getProperties().add(new AnnotationProperty("first", rule.getName()));
					}
					if (!annot.getProperties().stream().anyMatch(p -> "last".equals(p.getName()))) {
						annot.getProperties().add(new AnnotationProperty("last", rule.getName()));
					}
				}
			}
		}
		for (Mode mode : currentGrammar.getModes()) {
			for (Annotation annot : mode.getAnnotations()) {
				if ("Syntax".equals(annot.getType().getName())) {
					if (!annot.getProperties().stream().anyMatch(p -> "first".equals(p.getName()))) {
						annot.getProperties().add(new AnnotationProperty("first", mode.getName()));
					}
					if (!annot.getProperties().stream().anyMatch(p -> "last".equals(p.getName()))) {
						annot.getProperties().add(new AnnotationProperty("last", mode.getName()));
					}
				}
			}
		}

		writeLine("@SuppressWarnings(\"unused\")");
		if (this.compiler.isParser()) {
			writeLine("public class {0}Annotator extends {0}BaseVisitor<Object>", this.parserName);
		} else {
			writeLine("public class {0}Annotator", this.lexerName);
		}
		writeLine("{");
		incIndent();
		if (this.compiler.isParser() && !this.compiler.isLexer()) {
			writeLine("private {0}Annotator lexerAnnotator = new {0}Annotator();", this.lexerName);
		}
		writeLine("private List<Object> grammarAnnotations = new ArrayList<>();");
		if (this.compiler.isLexer()) {
			writeLine("private Map<Integer, List<Object>> tokenAnnotations = new HashMap<>();");
			writeLine("private Map<Integer, List<Object>> modeAnnotations = new HashMap<>();");
		}
		if (this.compiler.isParser()) {
			writeLine("private Map<Class<?>, List<Object>> ruleAnnotations = new HashMap<>();");
			writeLine("private Map<Object, List<Object>> treeAnnotations = new HashMap<>();");
		}

		writeLine();
		if (this.compiler.isParser()) {
			writeLine("public List<Object> getParserAnnotations() { return this.grammarAnnotations; }");
			if (this.compiler.isLexer()) {
				writeLine("public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }");
				writeLine(
						"public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }");
				writeLine(
						"public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }");
			} else {
				writeLine(
						"public List<Object> getLexerAnnotations() { return this.lexerAnnotator.getLexerAnnotations(); }");
				writeLine(
						"public Map<Integer, List<Object>> getTokenAnnotations() { return this.lexerAnnotator.getTokenAnnotations(); }");
				writeLine(
						"public Map<Integer, List<Object>> getModeAnnotations() { return this.lexerAnnotator.getModeAnnotations(); }");
			}
			writeLine("public Map<Class<?>, List<Object>> getRuleAnnotations() { return this.ruleAnnotations; }");
			writeLine(
					"public Map<Object, List<Object>> getTreeAnnotations() { return this.treeAnnotations; }");
		} else {
			writeLine("public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }");
			writeLine(
					"public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }");
			writeLine(
					"public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }");
		}

		writeLine();
		for (ParserRule rule : currentGrammar.getParserRules()) {
			for (Annotation annot : rule.getAnnotations()) {
				if (!annot.getType().isDynamic()) {
					writeLine("private {2} {0}_{1};", toCamelCase(rule.getName()), annot.getType().getName(),
							toAnnotationName(annot.getType().getName()));
				}
			}
			for (ParserRuleElement elem : rule.getElements()) {
				for (Annotation annot : elem.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						writeLine("private {3} {0}_{1}_{2};", toCamelCase(rule.getName()), toPascalCase(elem.getName()),
								annot.getType().getName(), toAnnotationName(annot.getType().getName()));
					}
				}
			}
			for (ParserRule alt : rule.getAlternatives()) {
				for (Annotation annot : alt.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						writeLine("private {2} {0}_{1};", toCamelCase(alt.getName()), annot.getType().getName(),
								toAnnotationName(annot.getType().getName()));
					}
				}
				for (ParserRuleElement elem : alt.getElements()) {
					for (Annotation annot : elem.getAnnotations()) {
						if (!annot.getType().isDynamic()) {
							writeLine("private {3} {0}_{1}_{2};", toCamelCase(alt.getName()),
									toPascalCase(elem.getName()), annot.getType().getName(),
									toAnnotationName(annot.getType().getName()));
						}
					}
				}
			}
		}
		writeLine();
		if (this.compiler.isParser()) {
			writeLine("public {0}Annotator()", this.parserName);
		} else {
			writeLine("public {0}Annotator()", this.lexerName);
		}
		writeLine("{");
		incIndent();
		writeLine("List<Object> annotList = null;");
		for (Annotation annot : currentGrammar.getAnnotations()) {
			String tmp = this.getTmpVariable();
			this.generateAnnotationCreation(annot, tmp, true);
			writeLine("this.grammarAnnotations.add({0});", tmp);
		}
		if (this.compiler.isLexer()) {
			for (Mode mode : currentGrammar.getModes()) {
				if (mode.getAnnotations().size() > 0) {
					writeLine();
					writeLine("annotList = new ArrayList<>();");
					writeLine("this.modeAnnotations.put({0}.{1}, annotList);", this.lexerName, mode.getName());
				}
				for (Annotation annot : mode.getAnnotations()) {
					String tmp = this.getTmpVariable();
					this.generateAnnotationCreation(annot, tmp, true);
					writeLine("annotList.add({0});", tmp);
				}
			}
			for (LexerRule token : currentGrammar.getLexerRules()) {
				if (token.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic())) {
					writeLine();
					writeLine("annotList = new ArrayList<>();");
					writeLine("this.tokenAnnotations.put({0}.{1}, annotList);", this.lexerName, token.getName());
				}
				for (Annotation annot : token.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						String tmp = this.getTmpVariable();
						this.generateAnnotationCreation(annot, tmp, true);
						writeLine("annotList.add({0});", tmp);
					}
				}
			}
		}
		for (ParserRule rule : currentGrammar.getParserRules()) {
			if (rule.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic()) || rule.getElements().stream()
					.anyMatch(e -> e.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic()))) {
				writeLine();
			}
			if (rule.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic())) {
				writeLine("annotList = new ArrayList<>();");
				writeLine("this.ruleAnnotations.put({0}.class, annotList);", toContextType(rule.getName()));
			}
			for (Annotation annot : rule.getAnnotations()) {
				if (!annot.getType().isDynamic()) {
					String tmp = MessageFormat.format("this.{0}_{1}", toCamelCase(rule.getName()),
							annot.getType().getName());
					this.generateAnnotationCreation(annot, tmp, false);
					writeLine("annotList.add({0});", tmp);
				}
			}
			for (ParserRuleElement elem : rule.getElements()) {
				for (Annotation annot : elem.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						String tmp = MessageFormat.format("this.{0}_{1}_{2}", toCamelCase(rule.getName()),
								toPascalCase(elem.getName()), annot.getType().getName());
						this.generateAnnotationCreation(annot, tmp, false);
					}
				}
			}
			for (ParserRule alt : rule.getAlternatives()) {
				if (rule.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic())
						|| alt.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic())
						|| alt.getElements().stream()
								.anyMatch(e -> e.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic()))) {
					writeLine();
				}
				if (rule.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic())
						|| alt.getAnnotations().stream().anyMatch(a -> !a.getType().isDynamic())) {
					writeLine("annotList = new ArrayList<>();");
					writeLine("this.ruleAnnotations.put({0}.class, annotList);", toContextType(alt.getName()));
				}
				for (Annotation annot : rule.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						writeLine("annotList.add(this.{0}_{1});", toCamelCase(rule.getName()),
								annot.getType().getName());
					}
				}
				for (Annotation annot : alt.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						String tmp = MessageFormat.format("this.{0}_{1}", toCamelCase(alt.getName()),
								annot.getType().getName());
						this.generateAnnotationCreation(annot, tmp, false);
						writeLine("annotList.add({0});", tmp);
					}
				}
				for (ParserRuleElement elem : alt.getElements()) {
					for (Annotation annot : elem.getAnnotations()) {
						if (!annot.getType().isDynamic()) {
							String tmp = MessageFormat.format("this.{0}_{1}_{2}", toCamelCase(alt.getName()),
									toPascalCase(elem.getName()), annot.getType().getName());
							this.generateAnnotationCreation(annot, tmp, false);
						}
					}
				}
			}
		}
		decIndent();
		writeLine("}");
		writeLine();
		if (this.compiler.isParser()) {
			writeLine("public Object visitTerminal(TerminalNode node)");
		} else {
			writeLine(
					"public Object visitTerminal(TerminalNode node, Map<Object, List<Object>> treeAnnotations)");
		}
		writeLine("{");
		incIndent();
		if (this.compiler.isLexer()) {
			writeLine("Token token = node.getSymbol();");
			writeLine("if (token != null)");
			writeLine("{");
			incIndent();
			writeLine("List<Object> annotList = this.tokenAnnotations.get(token.getType());");
			writeLine("if (annotList != null)");
			writeLine("{");
			incIndent();
			writeLine("List<Object> treeAnnotList = treeAnnotations.get(node);");
			writeLine("if (treeAnnotList == null)");
			writeLine("{");
			incIndent();
			writeLine("treeAnnotList = new ArrayList<>();");
			writeLine("treeAnnotations.put(node, treeAnnotList);");
			decIndent();
			writeLine("}");
			writeLine("treeAnnotList.addAll(annotList);");
			decIndent();
			writeLine("}");
			decIndent();
			writeLine("}");
			if (this.compiler.isParser()) {
				writeLine("this.handleSymbolType(node);");
			}
			writeLine("return null;");
		} else {
			writeLine("this.lexerAnnotator.visitTerminal(node, treeAnnotations);");
			if (this.compiler.isParser()) {
				writeLine("this.handleSymbolType(node);");
			}
			writeLine("return null;");
		}
		decIndent();
		writeLine("}");

		if (this.compiler.isParser()) {
			this.generateOverrideSymbolType();
			this.generateAnnotatorVisitMethods();
		}

		decIndent();
		writeLine("}");
	}

	private void generateOverrideSymbolType() {
		writeLine("");
		writeLine("private void handleSymbolType(ParseTree node)");
		writeLine("{");
		incIndent();
		writeLine("List<Object> treeAnnotList = this.treeAnnotations.get(node);");
		writeLine("if (treeAnnotList != null)");
		writeLine("{");
		incIndent();
		writeLine("for (Object treeAnnot: treeAnnotList)");
		writeLine("{");
		incIndent();
		writeLine("if (treeAnnot instanceof SymbolTypeAnnotation)");
		writeLine("{");
		incIndent();
		writeLine("SymbolTypeAnnotation sta = (SymbolTypeAnnotation)treeAnnot;");
		writeLine("if (sta.hasName())");
		writeLine("{");
		incIndent();
		writeLine("ModelCompilerContext.requireContext();");
		writeLine("IModelCompiler compiler = ModelCompilerContext.current();");
		writeLine("String name = compiler.getNameProvider().getName(node);");
		writeLine("if (sta.getName() == name)");
		writeLine("{");
		incIndent();
		writeLine("this.overrideSymbolType(node, sta.getSymbolType());");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		writeLine("else");
		writeLine("{");
		incIndent();
		writeLine("this.overrideSymbolType(node, sta.getSymbolType());");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		writeLine("treeAnnotList.removeIf(a -> a instanceof SymbolTypeAnnotation);");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		writeLine("");
		writeLine("private void overrideSymbolType(ParseTree node, Class<?> symbolType)");
		writeLine("{");
		incIndent();
		writeLine("if (node == null) return;");
		writeLine("if (symbolType == null) return;");
		writeLine("boolean set = false;");
		writeLine("while(!set && node != null)");
		writeLine("{");
		incIndent();
		writeLine("List<Object> treeAnnotList = this.treeAnnotations.get(node);");
		writeLine("if (treeAnnotList != null)");
		writeLine("{");
		incIndent();
		writeLine("for (Object treeAnnot: treeAnnotList)");
		writeLine("{");
		incIndent();
		writeLine("if (treeAnnot instanceof SymbolBasedAnnotation)");
		writeLine("{");
		incIndent();
		writeLine("SymbolBasedAnnotation sta = (SymbolBasedAnnotation)treeAnnot;");
		writeLine("set = true;");
		writeLine("if (sta.getSymbolType() == null)");
		writeLine("{");
		incIndent();
		writeLine("sta.setSymbolType(symbolType);");
		decIndent();
		writeLine("}");
		writeLine("else if (sta.overrideSymbolType())");
		writeLine("{");
		incIndent();
		writeLine("sta.setSymbolType(symbolType);");
		decIndent();
		writeLine("}");
		writeLine("else");
		writeLine("{");
		incIndent();
		writeLine(
				"throw new IllegalStateException(\"Cannot change symbol type from '\"+sta.getSymbolType()+\"' to '\"+symbolType+\"'\");");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		writeLine("node = node.getParent();");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
	}

	private void generateAnnotatorVisitMethods() {
		for (ParserRule rule : currentGrammar.getParserRules()) {
			if (rule.getAlternatives().size() == 0) {
				this.generateAnnotatorVisitMethod(rule, null);
			} else {
				for (ParserRule alt : rule.getAlternatives()) {
					this.generateAnnotatorVisitMethod(alt, rule);
				}
			}
		}
	}

	private void generateAnnotatorVisitMethod(ParserRule rule, ParserRule parentRule) {
		writeLine();
		writeLine("@Override");
		writeLine("public Object visit{0}({1} ctx)", toPascalCase(rule.getName()), toContextType(rule.getName()));
		writeLine("{");
		incIndent();
		if (rule.getAnnotations().size() > 0 || (parentRule != null && parentRule.getAnnotations().size() > 0)) {
			writeLine("List<Object> treeAnnotList = this.treeAnnotations.get(ctx);");
			writeLine("if (treeAnnotList == null)");
			writeLine("{");
			incIndent();
			writeLine("treeAnnotList = new ArrayList<>();");
			writeLine("this.treeAnnotations.put(ctx, treeAnnotList);");
			decIndent();
			writeLine("}");
			if (parentRule != null) {
				for (Annotation annot : parentRule.getAnnotations()) {
					if (!annot.getType().isDynamic()) {
						writeLine("treeAnnotList.add(this.{0}_{1});", toCamelCase(parentRule.getName()),
								annot.getType().getName());
					} else {
						String tmp = this.getTmpVariable();
						this.generateAnnotationCreation(annot, tmp, true);
						writeLine("treeAnnotList.add({0});", tmp);
					}
				}
			}
			for (Annotation annot : rule.getAnnotations()) {
				if (!annot.getType().isDynamic()) {
					writeLine("treeAnnotList.add(this.{0}_{1});", toCamelCase(rule.getName()),
							annot.getType().getName());
				} else {
					String tmp = this.getTmpVariable();
					this.generateAnnotationCreation(annot, tmp, true);
					writeLine("treeAnnotList.add({0});", tmp);
				}
			}
		}
		if (rule.HasElementAnnotations()) {
			writeLine("List<Object> elemAnnotList = null;");
			for (ParserRuleElement elem : rule.getElements()) {
				if (elem.getAnnotations().size() > 0) {
					writeLine("if (ctx.{0} != null)", elem.getAccessorName());
					writeLine("{");
					incIndent();
					if (elem.isArray()) {
						writeLine("for(Object elem: ctx.{0})", elem.getAccessorName());
						writeLine("{");
						incIndent();
					} else {
						writeLine("Object elem = ctx.{0};", elem.getAccessorName());
					}
					writeLine("elemAnnotList = this.treeAnnotations.get(elem);");
					writeLine("if (elemAnnotList == null)", elem.getAccessorName());
					writeLine("{");
					incIndent();
					writeLine("elemAnnotList = new ArrayList<>();");
					writeLine("this.treeAnnotations.put(elem, elemAnnotList);", elem.getAccessorName());
					decIndent();
					writeLine("}");
					for (Annotation annot : elem.getAnnotations()) {
						if (!annot.getType().isDynamic()) {
							writeLine("elemAnnotList.add(this.{0}_{1}_{2});", toCamelCase(rule.getName()),
									toPascalCase(elem.getName()), annot.getType().getName());
						} else {
							String tmp = this.getTmpVariable();
							this.generateAnnotationCreation(annot, tmp, true);
							writeLine("elemAnnotList.add({0});", tmp);
						}
					}
					if (elem.isArray()) {
						decIndent();
						writeLine("}");
					}
					decIndent();
					writeLine("}");
				}
			}
		}
		this.writeLine("this.handleSymbolType(ctx);");
		this.writeLine("return super.visit{0}(ctx);", toPascalCase(rule.getName()));
		decIndent();
		writeLine("}");
	}

	private void generateAnnotationCreation(Annotation annot, String variableName, boolean createVariable) {
		String annotName = this.toAnnotationName(annot.getType().getName());
		if (createVariable) {
			writeLine("{1} {0} = new {1}();", variableName, annotName);
		} else {
			writeLine("{0} = new {1}();", variableName, annotName);
		}
		if (annot.getValues().size() > 0) {
			for (String value : annot.getValues()) {
				if ("TypeUse".equals(annot.getType().getName()) || "NameUse".equals(annot.getType().getName())) {
					writeLine("{0}.getSymbolTypes().add({1}.class);", variableName, value);
				} else {
					String annotValue = this.toValue(value, annot.getType().isDynamic());
					writeLine("{0}.getValues().add({1});", variableName, annotValue);
				}
			}
		} else {
			if (annot.getValue() != null) {
				String annotValue = annot.getValue();
				if ("Symbol".equals(annot.getType().getName()) || "SymbolType".equals(annot.getType().getName())
						|| "TypeCtr".equals(annot.getType().getName()) || "TypeDef".equals(annot.getType().getName())
						|| "NameCtr".equals(annot.getType().getName()) || "NameDef".equals(annot.getType().getName())) {
					writeLine("{0}.setSymbolType({1}.class);", variableName, annotValue);
				} else if ("TypeUse".equals(annot.getType().getName()) || "NameUse".equals(annot.getType().getName())) {
					writeLine("{0}.getSymbolTypes().add({1}.class);", variableName, annotValue);
				} else if ("Property".equals(annot.getType().getName())) {
					int dotIndex = annotValue.lastIndexOf('.');
					if (dotIndex >= 0) {
						String symbolType = annotValue.substring(0, dotIndex + 1).trim();
						String propertyName = annotValue.substring(dotIndex + 1).trim();
						writeLine("{0}.getSymbolTypes().add({1}.class);", variableName, symbolType);
						writeLine("{0}.setName(\"{1}\");", variableName, propertyName);
					} else {
						writeLine("{0}.setName(\"{1}\");", variableName, annotValue);
					}
				} else if ("Trivia".equals(annot.getType().getName())) {
					int dotIndex = annotValue.lastIndexOf('.');
					if (dotIndex >= 0) {
						String symbolType = annotValue.substring(0, dotIndex + 1).trim();
						String propertyName = annotValue.substring(dotIndex + 1).trim();
						writeLine("{0}.getSymbolTypes().add({1}.class);", variableName, symbolType);
						writeLine("{0}.setProperty(\"{1}\");", variableName, propertyName);
					} else {
						writeLine("{0}.setProperty(\"{1}\");", variableName, annotValue);
					}
				} else if ("EnumValue".equals(annot.getType().getName())) {
					writeLine("{0}.setEnumType({1}.class);", variableName, annotValue);
				} else
					if ("Value".equals(annot.getType().getName()) || "PreDefSymbol".equals(annot.getType().getName())) {
					writeLine("{0}.setValue({1});", variableName, annotValue);
				} else {
					annotValue = this.toValue(annot.getValue(), annot.getType().isDynamic());
					writeLine("{0}.setValue({1});", variableName, annotValue);
				}
			}
		}
		for (AnnotationProperty prop : annot.getProperties()) {
			String propName = this.toPascalCase(prop.getName());
			if (prop.getValues().size() > 0) {
				for (String value : prop.getValues()) {
					if ("symbolTypes".equals(prop.getName()) && ("TypeUse".equals(annot.getType().getName())
							|| "NameUse".equals(annot.getType().getName())
							|| "Property".equals(annot.getType().getName())
							|| "Trivia".equals(annot.getType().getName()))) {
						writeLine("{0}.get{1}().add({2}.class);", variableName, propName, value);
					} else {
						String propValue = this.toValue(value, annot.getType().isDynamic());
						writeLine("{0}.get{1}().add({2});", variableName, propName, propValue);
					}
				}
			} else {
				if (prop.getValue() != null) {
					if ("symbolType".equals(prop.getName()) && ("Symbol".equals(annot.getType().getName())
							|| "SymbolType".equals(annot.getType().getName())
							|| "TypeCtr".equals(annot.getType().getName())
							|| "TypeDef".equals(annot.getType().getName())
							|| "NameCtr".equals(annot.getType().getName())
							|| "NameDef".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}({2}.class);", variableName, propName, prop.getValue());
					} else if (("symbolType".equals(prop.getName()) || "symbolTypes".equals(prop.getName()))
							&& ("TypeUse".equals(annot.getType().getName())
									|| "NameUse".equals(annot.getType().getName())
									|| "Property".equals(annot.getType().getName())
									|| "Trivia".equals(annot.getType().getName()))) {
						writeLine("{0}.getSymbolTypes().add({2}.class);", variableName, propName, prop.getValue());
					} else
						if ("nestingProperty".equals(prop.getName()) && ("NameDef".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}(\"{2}\");", variableName, propName, prop.getValue());
					} else if ("name".equals(prop.getName()) && ("Property".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}(\"{2}\");", variableName, propName, prop.getValue());
					} else if ("property".equals(prop.getName()) && ("Trivia".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}(\"{2}\");", variableName, propName, prop.getValue());
					} else if ("position".equals(prop.getName()) && ("Trivia".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}({2});", variableName, propName, prop.getValue());
					} else if ("value".equals(prop.getName()) && ("Value".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}({2});", variableName, propName, prop.getValue());
					} else if ("value".equals(prop.getName()) && ("PreDefSymbol".equals(annot.getType().getName()))) {
						writeLine("{0}.set{1}({2});", variableName, propName, prop.getValue());
					} else {
						String propValue = this.toValue(prop.getValue(), annot.getType().isDynamic());
						writeLine("{0}.set{1}({2});", variableName, propName, propValue);
					}
				}
			}

		}
	}

	public String getGeneratedPropertyEvaluatorName() {
		if (!this.compiler.isParser()) {
			return null;
		}
		return this.parserName+"PropertyEvaluator";
	}
	
	public String generatePropertyEvaluator(String targetPackage) {
		if (!this.compiler.isParser()) {
			return null;
		}
		this.sb = new StringBuilder();
		this.indent = "";

		if (targetPackage != null && !"".equals(targetPackage.trim())) {
			writeLine("package {0};", targetPackage);
			appendLine();
		}
		writeLine("import metadslx.compiler.MetaCompiler;");
		writeLine("import metadslx.compiler.MetaCompilerPropertyEvaluator;");
		writeLine("import metadslx.core.Lazy;");
		writeLine();
		if (this.compiler.isParser() && this.parserHeader != null && !"".equals(this.parserHeader.trim())) {
			writeLine(this.parserHeader);
		} else if (this.compiler.isLexer() && this.lexerHeader != null && !"".equals(this.lexerHeader.trim())) {
			writeLine(this.lexerHeader);
		}
		writeLine();
		writeLine("@SuppressWarnings(\"unused\")");
		writeLine(
				"class {0}PropertyEvaluator extends MetaCompilerPropertyEvaluator implements {0}Visitor<Object>",
				this.parserName);
		writeLine("{");
		incIndent();
		writeLine("public {0}PropertyEvaluator(MetaCompiler compiler)", this.parserName);
		writeLine("{");
		incIndent();
		writeLine("    super(compiler);");
		decIndent();
		writeLine("}");
		this.generatePropertyVisitMethods();
		decIndent();
		writeLine("}");
		return sb.toString();
	}

	private void generatePropertyVisitMethods() {
		for (ParserRule rule : currentGrammar.getParserRules()) {
			if (rule.getAlternatives().size() == 0) {
				this.generatePropertyVisitMethod(rule, null);
			} else {
				for (ParserRule alt : rule.getAlternatives()) {
					this.generatePropertyVisitMethod(alt, rule);
				}
			}
		}
	}

	private void generatePropertyVisitMethod(ParserRule rule, ParserRule parentRule) {
		writeLine();
		writeLine("public Object visit{0}({1} ctx)", toPascalCase(rule.getName()), toContextType(rule.getName()));
		writeLine("{");
		incIndent();
		if (rule.getPropertiesBlock() != null) {
			Antlr4TextSpan Antlr4TextSpan = new Antlr4TextSpan(rule.getPropertiesBlock().ACTION());
			this.propertiesBlockCompiler.setStartLine(Antlr4TextSpan.getStartLine());
			this.propertiesBlockCompiler.setStartPos(Antlr4TextSpan.getStartPosition());
			String text = rule.getPropertiesBlock().ACTION().getText();
			AnnotatedAntlr4PropertiesParser.PropertiesBlockContext propertiesBlock = this.propertiesBlockCompiler
					.compile(text);
			if (!this.propertiesBlockCompiler.hasErrors() && propertiesBlock != null) {
				this.propertiesBlockExpressionPrinter.setStartLine(Antlr4TextSpan.getStartLine());
				this.propertiesBlockExpressionPrinter.setStartPos(Antlr4TextSpan.getStartPosition());
				this.propertiesBlockExpressionPrinter.setParserRule(rule);
				this.propertiesBlockExpressionPrinter.visit(propertiesBlock);
			}
		}
		this.writeLine("return this.visitChildren(ctx);");
		decIndent();
		writeLine("}");
	}

	public String getGeneratedCompilerName() {
		if (!this.generateCompiler && !this.generateCompilerBase) {
			return null;
		}
		if (!this.compiler.isParser()) {
			return null;
		}
		String name = this.parserName;
		if (name.endsWith("Parser")) {
			name = name.substring(0, name.length() - 6);
		}
		if (this.generateCompilerBase) {
			name += "CompilerBase";
		} else {
			name += "Compiler";
		}
		return name;
	}
	
	public String generateCompiler(String targetPackage) {
		if (!this.compiler.isParser()) {
			return null;
		}
		if (!this.generateCompiler && !this.generateCompilerBase) {
			return null;
		}
		this.sb = new StringBuilder();
		this.indent = "";

		if (targetPackage != null && !"".equals(targetPackage.trim())) {
			writeLine("package {0};", targetPackage);
			appendLine();
		}
		writeLine("import org.antlr.v4.runtime.ANTLRInputStream;");
		writeLine("import org.antlr.v4.runtime.CommonTokenStream;");
		writeLine();
		writeLine("import metadslx.compiler.MetaCompiler;");
		writeLine("import metadslx.compiler.MetaCompilerDefinitionPhase;");
		writeLine("import metadslx.compiler.MetaCompilerMergePhase;");
		writeLine("import metadslx.compiler.MetaCompilerReferencePhase;");
		writeLine("import metadslx.core.ModelObject;");
		writeLine("import metadslx.core.TextSpan;");
		if (this.compiler.isParser() && this.parserHeader != null && !"".equals(this.parserHeader.trim())) {
			writeLine(this.parserHeader);
		} else if (this.compiler.isLexer() && this.lexerHeader != null && !"".equals(this.lexerHeader.trim())) {
			writeLine(this.lexerHeader);
		}
		writeLine();
		String name = this.getGeneratedCompilerName();
		ParserRule rootRule = null;
		if (this.currentGrammar.getParserRules().size() > 0) {
			rootRule = this.currentGrammar.getParserRules().get(0);
		}
		String rootName = null;
		String rootType = null;
		if (rootRule != null) {
			rootType = this.toContextType(rootRule.getName());
			rootName = rootRule.getName();
			if (reservedNames.contains(rootName))
				rootName = "@" + rootName;
			rootName += "()";
		} else {
			rootName = "";
		}
		writeLine("@SuppressWarnings(\"unused\")");
		if (this.generateCompilerBase) {
			writeLine("public abstract class {0} extends MetaCompiler", name);
		} else {
			writeLine("public class {0} extends MetaCompiler", name);
		}
		writeLine("{");
		incIndent();
		writeLine("public {0}(String source, String fileName)", name);
		writeLine("{");
		incIndent();
		writeLine("super(source, fileName);");
		decIndent();
		writeLine("}");
		writeLine();
		writeLine("@Override");
		writeLine("protected void doCompile()");
		writeLine("{");
		incIndent();
		writeLine("ANTLRInputStream inputStream = new ANTLRInputStream(this.getSource());");
		writeLine("this.lexer = new {0}(inputStream);", this.lexerName);
		writeLine("this.lexer.addErrorListener(this);");
		writeLine("this.setCommonTokenStream(new CommonTokenStream(this.lexer));");
		writeLine("this.parser = new {0}(this.getCommonTokenStream());", this.parserName);
		writeLine("this.parser.addErrorListener(this);");
		writeLine("this.parseTree = this.parser.{0};", rootName);
		writeLine("{0}Annotator annotator = new {0}Annotator();", this.parserName);
		writeLine("annotator.visit(this.parseTree);");
		writeLine("this.setLexerAnnotations(annotator.getLexerAnnotations());");
		writeLine("this.setParserAnnotations(annotator.getParserAnnotations());");
		writeLine("this.setModeAnnotations(annotator.getModeAnnotations());");
		writeLine("this.setTokenAnnotations(annotator.getTokenAnnotations());");
		writeLine("this.setRuleAnnotations(annotator.getRuleAnnotations());");
		writeLine("this.setTreeAnnotations(annotator.getTreeAnnotations());");
		writeLine("MetaCompilerDefinitionPhase definitionPhase = new MetaCompilerDefinitionPhase(this);");
		writeLine("definitionPhase.visitNode(this.parseTree);");
		writeLine("MetaCompilerMergePhase mergePhase = new MetaCompilerMergePhase(this);");
		writeLine("mergePhase.visitNode(this.parseTree);");
		writeLine("MetaCompilerReferencePhase referencePhase = new MetaCompilerReferencePhase(this);");
		writeLine("referencePhase.visitNode(this.parseTree);");
		writeLine("{0}PropertyEvaluator propertyEvaluator = new {0}PropertyEvaluator(this);", this.parserName);
		writeLine("propertyEvaluator.visit(this.parseTree);");
		writeLine();
		writeLine("this.getModel().evalLazyValues();");
		writeLine("for (ModelObject symbol: this.getData().getSymbols())");
		writeLine("{");
		incIndent();
		writeLine("if (symbol.mHasUninitializedValue())");
		writeLine("{");
		incIndent();
		writeLine("this.getDiagnostics().addError(\"The symbol '\" + symbol + \"' has uninitialized lazy values.\", this.getFileName(), this.getNameProvider().getSymbolTextSpans(symbol), true);");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		writeLine();
		writeLine("private " + rootType + " parseTree;");
		writeLine("private " + this.lexerName + " lexer;");
		writeLine("private " + this.parserName + " parser;");
		writeLine("public " + rootType + " getParseTree() { return this.parseTree; }");
		writeLine("public " + this.lexerName + " getLexer() { return this.lexer; }");
		writeLine("public " + this.parserName + " getParser() { return this.parser; }");
		decIndent();
		writeLine("}");
		return sb.toString();
	}

	public static class AnnotationType {
		public AnnotationType() {
			this.properties = new ArrayList<>();
		}

		private String name;
		private ArrayList<String> properties;
		private boolean isDynamic;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isDynamic() {
			return isDynamic;
		}

		public void setIsDynamic(boolean isDynamic) {
			this.isDynamic = isDynamic;
		}

		public ArrayList<String> getProperties() {
			return properties;
		}
	}

	public static class Annotation {
		public Annotation() {
			this.properties = new ArrayList<>();
			this.values = new ArrayList<>();
		}

		private AnnotationType type;
		private ArrayList<AnnotationProperty> properties;
		private String value;
		private ArrayList<String> values;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public AnnotationType getType() {
			return type;
		}

		public void setType(AnnotationType type) {
			this.type = type;
		}

		public ArrayList<AnnotationProperty> getProperties() {
			return properties;
		}

		public ArrayList<String> getValues() {
			return values;
		}
	}

	public static class AnnotationProperty {
		public AnnotationProperty() {
			this.values = new ArrayList<>();
		}

		public AnnotationProperty(String name, String value) {
			this.values = new ArrayList<>();
			this.name = name;
			this.value = value;
		}

		private String name;
		private String value;
		private ArrayList<String> values;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public ArrayList<String> getValues() {
			return values;
		}
	}

	public static class Grammar {
		public Grammar() {
			this.annotations = new ArrayList<>();
			this.parserRules = new ArrayList<>();
			this.lexerRules = new ArrayList<>();
			this.modes = new ArrayList<Mode>();
		}

		private String name;
		private ArrayList<Annotation> annotations;
		private ArrayList<ParserRule> parserRules;
		private ArrayList<LexerRule> lexerRules;
		private ArrayList<Mode> modes;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Annotation> getAnnotations() {
			return annotations;
		}

		public ArrayList<ParserRule> getParserRules() {
			return parserRules;
		}

		public ArrayList<LexerRule> getLexerRules() {
			return lexerRules;
		}

		public ArrayList<Mode> getModes() {
			return modes;
		}
	}

	public static class ParserRule {
		public ParserRule() {
			this.annotations = new ArrayList<>();
			this.elements = new ArrayList<>();
			this.alternatives = new ArrayList<>();
		}

		private String name;
		private ArrayList<Annotation> annotations;
		private ArrayList<ParserRuleElement> elements;
		private ArrayList<ParserRule> alternatives;
		private AnnotatedAntlr4Parser.PropertiesBlockContext propertiesBlock;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public AnnotatedAntlr4Parser.PropertiesBlockContext getPropertiesBlock() {
			return propertiesBlock;
		}

		public void setPropertiesBlock(AnnotatedAntlr4Parser.PropertiesBlockContext propertiesBlock) {
			this.propertiesBlock = propertiesBlock;
		}

		public ArrayList<Annotation> getAnnotations() {
			return annotations;
		}

		public ArrayList<ParserRuleElement> getElements() {
			return elements;
		}

		public ArrayList<ParserRule> getAlternatives() {
			return alternatives;
		}

		public boolean HasElementAnnotations() {
			for (ParserRuleElement elem : this.elements) {
				if (elem.getAnnotations().size() > 0)
					return true;
			}
			return false;
		}
	}

	public static class ParserRuleElement {
		public ParserRuleElement() {
			this.annotations = new ArrayList<>();
		}

		private String name;
		private String type;
		private ArrayList<Annotation> annotations;
		private boolean isArray;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isArray() {
			return isArray;
		}

		public void setIsArray(boolean isArray) {
			this.isArray = isArray;
		}

		public ArrayList<Annotation> getAnnotations() {
			return annotations;
		}

		public boolean isToken() {
			return !this.isParserRule();
		}

		public boolean isParserRule() {
			return this.type != null && !"".equals(this.type) && Character.isLowerCase(this.type.charAt(0));
		}

		public String getAccessorName() {
			String prefix = "";
			if (reservedNames.contains(this.name))
				prefix = "_";
			if (this.name != this.type) {
				return prefix + this.name;
			} else {
				return prefix + this.type + "()";
			}
		}
	}

	public static class Mode {
		public Mode() {
			this.annotations = new ArrayList<>();
			this.lexerRules = new ArrayList<>();
		}

		private String name;
		private ArrayList<Annotation> annotations;
		private ArrayList<LexerRule> lexerRules;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Annotation> getAnnotations() {
			return annotations;
		}

		public ArrayList<LexerRule> getLexerRules() {
			return lexerRules;
		}
	}

	public static class LexerRule {
		public LexerRule() {
			this.annotations = new ArrayList<>();
		}

		private String name;
		private ArrayList<Annotation> annotations;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Annotation> getAnnotations() {
			return annotations;
		}
	}

	private static final HashSet<String> reservedNames = new HashSet<>();
	private static final String[] reservedNamesArray = { "abstract", "continue", "for", "new", "switch", "assert",
			"default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double",
			"implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum",
			"instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final",
			"interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float",
			"native", "super", "while" };

	static {
		for (String s : reservedNamesArray)
			reservedNames.add(s);
	}
}
