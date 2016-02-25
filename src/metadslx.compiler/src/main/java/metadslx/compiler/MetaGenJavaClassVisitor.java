package metadslx.compiler;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.compiler.MetaGeneratorParser.AdditionExpressionContext;
import metadslx.compiler.MetaGeneratorParser.AssignmentExpressionContext;
import metadslx.compiler.MetaGeneratorParser.BitwiseAndExpressionContext;
import metadslx.compiler.MetaGeneratorParser.BitwiseOrExpressionContext;
import metadslx.compiler.MetaGeneratorParser.BitwiseXorExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ConditionalExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ConfigDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.ConfigPropertyDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.ConfigPropertyGroupDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.DefaultValueExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ElementAccessExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ElseIfStatementContext;
import metadslx.compiler.MetaGeneratorParser.EqualityExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ExplicitAnonymousFunctionSignatureContext;
import metadslx.compiler.MetaGeneratorParser.ExplicitParameterContext;
import metadslx.compiler.MetaGeneratorParser.ExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ExpressionListContext;
import metadslx.compiler.MetaGeneratorParser.ExpressionStatementContext;
import metadslx.compiler.MetaGeneratorParser.FunctionCallExpressionContext;
import metadslx.compiler.MetaGeneratorParser.FunctionDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.FunctionSignatureContext;
import metadslx.compiler.MetaGeneratorParser.GeneratorDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.HasLoopExpressionContext;
import metadslx.compiler.MetaGeneratorParser.IdentifierExpressionContext;
import metadslx.compiler.MetaGeneratorParser.IfStatementBeginContext;
import metadslx.compiler.MetaGeneratorParser.IfStatementElseContext;
import metadslx.compiler.MetaGeneratorParser.IfStatementEndContext;
import metadslx.compiler.MetaGeneratorParser.ImplicitAnonymousFunctionSignatureContext;
import metadslx.compiler.MetaGeneratorParser.ImplicitParameterContext;
import metadslx.compiler.MetaGeneratorParser.LambdaExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LiteralContext;
import metadslx.compiler.MetaGeneratorParser.LogicalAndExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LogicalOrExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LogicalXorExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LoopChainIdentifierExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LoopChainItemContext;
import metadslx.compiler.MetaGeneratorParser.LoopChainMemberAccessExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LoopChainMethodCallExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LoopChainTypeofExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LoopRunExpressionContext;
import metadslx.compiler.MetaGeneratorParser.LoopRunListContext;
import metadslx.compiler.MetaGeneratorParser.LoopStatementBeginContext;
import metadslx.compiler.MetaGeneratorParser.LoopStatementEndContext;
import metadslx.compiler.MetaGeneratorParser.MainContext;
import metadslx.compiler.MetaGeneratorParser.MemberAccessExpressionContext;
import metadslx.compiler.MetaGeneratorParser.MultiplicationExpressionContext;
import metadslx.compiler.MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ParamListContext;
import metadslx.compiler.MetaGeneratorParser.ParameterContext;
import metadslx.compiler.MetaGeneratorParser.ParenthesizedExpressionContext;
import metadslx.compiler.MetaGeneratorParser.PostExpressionContext;
import metadslx.compiler.MetaGeneratorParser.PredefinedTypeMemberAccessExpressionContext;
import metadslx.compiler.MetaGeneratorParser.QualifiedNameContext;
import metadslx.compiler.MetaGeneratorParser.RelationalExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ReturnStatementContext;
import metadslx.compiler.MetaGeneratorParser.SingleParamAnonymousFunctionSignatureContext;
import metadslx.compiler.MetaGeneratorParser.SwitchBranchHeadStatementContext;
import metadslx.compiler.MetaGeneratorParser.SwitchCaseHeadStatementContext;
import metadslx.compiler.MetaGeneratorParser.SwitchCaseOrTypeIsHeadStatementContext;
import metadslx.compiler.MetaGeneratorParser.SwitchDefaultHeadStatementContext;
import metadslx.compiler.MetaGeneratorParser.SwitchStatementBeginContext;
import metadslx.compiler.MetaGeneratorParser.SwitchStatementEndContext;
import metadslx.compiler.MetaGeneratorParser.SwitchTypeIsHeadStatementContext;
import metadslx.compiler.MetaGeneratorParser.TemplateContentLineContext;
import metadslx.compiler.MetaGeneratorParser.TemplateDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.TemplateLineEndContext;
import metadslx.compiler.MetaGeneratorParser.TemplateOutputContext;
import metadslx.compiler.MetaGeneratorParser.TemplateSignatureContext;
import metadslx.compiler.MetaGeneratorParser.TemplateStatementContext;
import metadslx.compiler.MetaGeneratorParser.TemplateStatementStartEndContext;
import metadslx.compiler.MetaGeneratorParser.ThisExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeReferenceContext;
import metadslx.compiler.MetaGeneratorParser.TypecastExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypecheckExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeofTypeExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeofUnboundTypeExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeofVoidExpressionContext;
import metadslx.compiler.MetaGeneratorParser.UnaryExpressionContext;
import metadslx.compiler.MetaGeneratorParser.UsingGeneratorDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.VariableDeclarationStatementContext;

class MetaGenJavaClassVisitor extends MetaGenVisitor {
	private int tmpCounter = 0;
	private ArrayList<SwitchInfo> switchStack = new ArrayList<>();
	private ArrayList<LoopInfo> loopStack = new ArrayList<>();

	public MetaGenJavaClassVisitor(StringBuilder sb) {
		super(sb);
	}

	private String escapeText(String text) {
		StringBuilder sb = new StringBuilder();
		for (char ch : text.toCharArray()) {
			if (ch == '"' || ch == '\\')
				sb.append("\\" + ch);
			else
				sb.append(ch);
		}
		return sb.toString();
	}

	private String newTmp() {
		++tmpCounter;
		return "__tmp" + tmpCounter;
	}

	@Override
	public void close() {
		writeLine("private static class StringBuilder {");
		incIndent();
		writeLine("private boolean newLine;");
		writeLine("private java.lang.StringBuilder builder = new java.lang.StringBuilder();");
		writeLine("");
		writeLine("public StringBuilder() {");
		incIndent();
		writeLine("this.newLine = true;");
		decIndent();
		writeLine("}");
		writeLine("");
		writeLine("public void append(String str) {");
		incIndent();
		writeLine("if (str == null) return;");
		writeLine("if (!\"\".equals(str)) {");
		incIndent();
		writeLine("this.newLine = false;");
		decIndent();
		writeLine("}");
		writeLine("builder.append(str);");
		decIndent();
		writeLine("}");
		writeLine("");
		writeLine("public void append(Object obj) {");
		incIndent();
		writeLine("if (obj == null) return;");
		writeLine("String text = obj.toString();");
		writeLine("this.append(text);");
		decIndent();
		writeLine("}");
		writeLine("");
		writeLine("public void appendLine() {");
		incIndent();
		writeLine("this.appendLine(false);");
		decIndent();
		writeLine("}");
		writeLine("");
		writeLine("public void appendLine(boolean force) {");
		incIndent();
		writeLine("if (force || !this.newLine) {");
		incIndent();
		writeLine("builder.append(\"\\n\");");
		writeLine("this.newLine = true;");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		writeLine("");
		writeLine("@Override");
		writeLine("public String toString() {");
		incIndent();
		writeLine("return builder.toString();");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
	}

	@Override
	public Object visitGeneratorDeclaration(GeneratorDeclarationContext ctx) {
		appendLine();
		writeLine("@SuppressWarnings(\"unused\")");
		String name = ctx.identifier().getText();
		writeLine("public class {0} {1} {2}", name, "{", toComment(ctx));
		incIndent();
		String instancesType = "Object";
		if (ctx.typeReference() != null) {
			instancesType = ctx.typeReference().getText();
		}
		writeLine("private {0} Instances; {1}", instancesType, toComment(ctx));
		appendLine();
		writeLine("public {0}() {1} {2}", name, "{", toComment(ctx));
		incIndent();
		ConfigDeclarationContext config = ((MainContext) ctx.parent).configDeclaration();
		if (config != null) {
			String propertiesName = "Properties";
			if (config.identifier() != null)
				propertiesName = config.identifier().getText();
			writeLine("this.{0} = new __{1}();", toCamelCase(propertiesName), propertiesName);
		}
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("public {0}({1} instances) {2} {3}", name, instancesType, "{", toComment(ctx));
		incIndent();
		writeLine("this();");
		writeLine("this.Instances = instances;");
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("private BufferedReader __toReader(String text) {");
		incIndent();
		writeLine("String enc = \"UTF-8\";");
		writeLine("byte[] bytes = null;");
		writeLine("try {");
		incIndent();
		writeLine("if (text != null) {");
		incIndent();
		writeLine("bytes = text.getBytes(enc);");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("} catch (UnsupportedEncodingException e) {");
		incIndent();
		writeLine("bytes = null;");
		decIndent();
		writeLine("}");
		writeLine("if (bytes == null) {");
		incIndent();
		writeLine("bytes = new byte[0];");
		decIndent();
		writeLine("}");
		writeLine("try {");
		incIndent();
		writeLine("return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes), enc));");
		decIndent();
		writeLine("} catch (UnsupportedEncodingException e) {");
		incIndent();
		writeLine("return null;");
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("private <T> Stream<T> __var(T item) {");
		incIndent();
		writeLine("ArrayList<T> result = new ArrayList<>();");
		writeLine("result.add(item);");
		writeLine("return result.stream();");
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("private <T> Stream<T> __enumerate(T item) {");
		incIndent();
		writeLine("ArrayList<T> result = new ArrayList<>();");
		writeLine("result.add(item);");
		writeLine("return result.stream();");
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("private <T> Stream<T> __enumerate(Iterable<T> items) {");
		incIndent();
		writeLine("ArrayList<T> result = new ArrayList<>();");
		writeLine("for (T item: items) {");
		incIndent();
		writeLine("result.add(item);");
		decIndent();
		writeLine("}");
		writeLine("return result.stream();");
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("private int counter = 0;");
		writeLine("private int nextCounter() {");
		incIndent();
		writeLine("return ++counter;");
		decIndent();
		writeLine("}");
		appendLine();
		return null;
	}

	@Override
	public Object visitUsingGeneratorDeclaration(UsingGeneratorDeclarationContext ctx) {
		QualifiedNameContext qn = ctx.qualifiedName();
		String type = qn.getText();
		String name = "";
		if (ctx.identifier() == null) {
			name = qn.children.get(qn.children.size() - 1).getText();
		} else {
			name = ctx.identifier().getText();
		}
		writeLine("private {0} {1} = new {0}(); {2}", type, name, toComment(ctx));
		appendLine();
		return null;
	}

	@Override
	public Object visitConfigDeclaration(ConfigDeclarationContext ctx) {
		String name = "Properties";
		if (ctx.identifier() != null)
			name = ctx.identifier().getText();
		writeLine("private __{0} {1}; {2}", name, toCamelCase(name), toComment(ctx));
		writeLine("public __{0} get{0}() {1} {2}", name, "{", toComment(ctx));
		incIndent();
		writeLine("return {0};", toCamelCase(name));
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("public static class __{0} {1} {2}", name, "{", toComment(ctx));
		incIndent();
		writeLine("private __{0}() {1}", name, "{");
		incIndent();
		for (ParseTree child : ctx.children) {
			if (child instanceof ConfigPropertyDeclarationContext) {
				ConfigPropertyDeclarationContext prop = (ConfigPropertyDeclarationContext) child;
				if (prop.expression() != null) {
					writeIndent();
					write("this.{0} = ", toCamelCase(prop.identifier().getText()));
					visit(prop.expression());
					write("; {0}", toComment(prop.expression()));
					appendLine();
				}
			}
			if (child instanceof ConfigPropertyGroupDeclarationContext) {
				ConfigPropertyGroupDeclarationContext prop = (ConfigPropertyGroupDeclarationContext) child;
				writeLine("this.{0} = new __{1}();", toCamelCase(prop.identifier().getText()),
						prop.identifier().getText());
			}
		}
		decIndent();
		writeLine("}");
		for (ParseTree child : ctx.children) {
			if (child instanceof ConfigPropertyDeclarationContext) {
				ConfigPropertyDeclarationContext prop = (ConfigPropertyDeclarationContext) child;
				writeLine("private {0} {1}; {2}", prop.typeReference().getText(),
						toCamelCase(prop.identifier().getText()), toComment(ctx));
				writeLine("public {0} get{1}() {2} {3}", prop.typeReference().getText(), prop.identifier().getText(),
						"{", toComment(ctx));
				incIndent();
				writeLine("return {0};", toCamelCase(prop.identifier().getText()));
				decIndent();
				writeLine("}");
				writeLine("public void set{1}({0} {2}) {3} {4}", prop.typeReference().getText(),
						prop.identifier().getText(), toCamelCase(prop.identifier().getText()), "{", toComment(ctx));
				incIndent();
				writeLine("this.{0} = {0};", toCamelCase(prop.identifier().getText()));
				decIndent();
				writeLine("}");
				appendLine();
			}
			if (child instanceof ConfigPropertyGroupDeclarationContext) {
				ConfigPropertyGroupDeclarationContext prop = (ConfigPropertyGroupDeclarationContext) child;
				writeLine("private __{0} {1}; {2}", prop.identifier().getText(),
						toCamelCase(prop.identifier().getText()), toComment(prop));
				writeLine("public __{0} get{0}() {1} {2}", prop.identifier().getText(), "{", toComment(prop));
				incIndent();
				writeLine("return {0};", toCamelCase(prop.identifier().getText()));
				decIndent();
				writeLine("}");
				appendLine();
			}
		}
		decIndent();
		writeLine("}");
		appendLine();
		for (ParseTree child : ctx.children) {
			if (child instanceof ConfigPropertyGroupDeclarationContext) {
				ConfigPropertyGroupDeclarationContext prop = (ConfigPropertyGroupDeclarationContext) child;
				visit(prop);
			}
		}
		return null;
	}

	@Override
	public Object visitConfigPropertyGroupDeclaration(ConfigPropertyGroupDeclarationContext ctx) {
		String name = ctx.identifier().getText();
		writeLine("private __{0} {1}; {2}", name, toCamelCase(name), toComment(ctx));
		writeLine("public __{0} get{0}() {1} {2}", name, "{", toComment(ctx));
		incIndent();
		writeLine("return {0};", toCamelCase(name));
		decIndent();
		writeLine("}");
		appendLine();
		writeLine("public static class __{0} {1} {2}", name, "{", toComment(ctx));
		incIndent();
		writeLine("private __{0}() {", name);
		incIndent();
		for (ParseTree child : ctx.children) {
			if (child instanceof ConfigPropertyDeclarationContext) {
				ConfigPropertyDeclarationContext prop = (ConfigPropertyDeclarationContext) child;
				if (prop.expression() != null) {
					writeIndent();
					write("this.{0} = ", toCamelCase(prop.identifier().getText()));
					visit(prop.expression());
					write("; {0}", toComment(prop.expression()));
					appendLine();
				}
			}
			if (child instanceof ConfigPropertyGroupDeclarationContext) {
				ConfigPropertyGroupDeclarationContext prop = (ConfigPropertyGroupDeclarationContext) child;
				writeLine("this.{0} = new __{1}();", toCamelCase(prop.identifier().getText()),
						prop.identifier().getText());
			}
		}
		decIndent();
		writeLine("}");
		for (ParseTree child : ctx.children) {
			if (child instanceof ConfigPropertyDeclarationContext) {
				ConfigPropertyDeclarationContext prop = (ConfigPropertyDeclarationContext) child;
				writeLine("private {0} {1}; {2}", prop.typeReference().getText(),
						toCamelCase(prop.identifier().getText()), toComment(ctx));
				writeLine("public {0} get{1}() {2} {3}", prop.typeReference().getText(), prop.identifier().getText(),
						"{", toComment(ctx));
				incIndent();
				writeLine("return {0};", toCamelCase(prop.identifier().getText()));
				decIndent();
				writeLine("}");
				writeLine("public void set{1}({0} {2}) {3} {4}", prop.typeReference().getText(),
						prop.identifier().getText(), toCamelCase(prop.identifier().getText()), "{", toComment(ctx));
				incIndent();
				writeLine("this.{0} = {0};", toCamelCase(prop.identifier().getText()));
				decIndent();
				writeLine("}");
				appendLine();
			}
			if (child instanceof ConfigPropertyGroupDeclarationContext) {
				ConfigPropertyGroupDeclarationContext prop = (ConfigPropertyGroupDeclarationContext) child;
				writeLine("private __{0} {1}; {2}", prop.identifier().getText(),
						toCamelCase(prop.identifier().getText()), toComment(prop));
				writeLine("public __{0} get{0}() {1} {2}", prop.identifier().getText(), "{", toComment(prop));
				incIndent();
				writeLine("return {0};", toCamelCase(prop.identifier().getText()));
				decIndent();
				writeLine("}");
				appendLine();
			}
		}
		decIndent();
		writeLine("}");
		appendLine();
		for (ParseTree child : ctx.children) {
			if (child instanceof ConfigPropertyGroupDeclarationContext) {
				ConfigPropertyGroupDeclarationContext prop = (ConfigPropertyGroupDeclarationContext) child;
				visit(prop);
			}
		}
		return null;
	}

	@Override
	public Object visitFunctionDeclaration(FunctionDeclarationContext ctx) {
		visit(ctx.functionSignature());
		incIndent();
		tmpCounter = 0;
		visit(ctx.body());
		decIndent();
		writeLine("}");
		appendLine();
		return null;
	}

	@Override
	public Object visitFunctionSignature(FunctionSignatureContext ctx) {
		writeIndent();
		write("public {0} {1}(", ctx.returnType().getText(), ctx.identifier().getText());
		if (ctx.paramList() != null) {
			visit(ctx.paramList());
		}
		write(") {0} {1}", "{", toComment(ctx));
		appendLine();
		return null;
	}

	@Override
	public Object visitTemplateDeclaration(TemplateDeclarationContext ctx) {
		visit(ctx.templateSignature());
		incIndent();
		writeLine("StringBuilder __out = new StringBuilder();");
		tmpCounter = 0;
		visit(ctx.templateBody());
		writeLine("return __out.toString();");
		decIndent();
		writeLine("}");
		appendLine();
		return null;
	}

	@Override
	public Object visitTemplateSignature(TemplateSignatureContext ctx) {
		writeIndent();
		write("public String {0}(", ctx.identifier().getText());
		if (ctx.paramList() != null) {
			visit(ctx.paramList());
		}
		write(") {0} {1}", "{", toComment(ctx));
		appendLine();
		return null;
	}

	@Override
	public Object visitParamList(ParamListContext ctx) {
		String comma = "";
		for (ParameterContext param : ctx.parameter()) {
			write(comma);
			visit(param);
			comma = ", ";
		}
		return null;
	}

	@Override
	public Object visitParameter(ParameterContext ctx) {
		write("{0} {1}", ctx.typeReference().getText(), ctx.identifier().getText());
		if (ctx.expression() != null) {
			write(" = ");
			visit(ctx.expression());
		}
		return null;
	}

	@Override
	public Object visitVariableDeclarationStatement(VariableDeclarationStatementContext ctx) {
		writeIndent();
		write("{0} {1}", ctx.typeReference().getText(), ctx.identifier().getText());
		if (ctx.expression() != null) {
			write(" = ");
			visit(ctx.expression());
		}
		write("; " + toComment(ctx));
		appendLine();
		return null;
	}

	@Override
	public Object visitReturnStatement(ReturnStatementContext ctx) {
		writeIndent();
		write("return ");
		visit(ctx.expression());
		write("; " + toComment(ctx));
		appendLine();
		return null;
	}

	@Override
	public Object visitExpressionStatement(ExpressionStatementContext ctx) {
		writeIndent();
		visit(ctx.expression());
		write("; " + toComment(ctx));
		appendLine();
		return null;
	}

	@Override
	public Object visitIfStatementBegin(IfStatementBeginContext ctx) {
		writeIndent();
		write("if (");
		visit(ctx.expression());
		write(") {" + toComment(ctx));
		appendLine();
		incIndent();
		return null;
	}

	@Override
	public Object visitElseIfStatement(ElseIfStatementContext ctx) {
		decIndent();
		writeIndent();
		write("} else if (");
		visit(ctx.expression());
		write(") { " + toComment(ctx));
		appendLine();
		incIndent();
		return null;
	}

	@Override
	public Object visitIfStatementElse(IfStatementElseContext ctx) {
		decIndent();
		writeLine("} else {" + toComment(ctx));
		incIndent();
		return null;
	}

	@Override
	public Object visitIfStatementEnd(IfStatementEndContext ctx) {
		decIndent();
		writeLine("}");
		return null;
	}

	@Override
	public Object visitExpressionList(ExpressionListContext ctx) {
		String comma = "";
		for (ParseTree expr : ctx.children) {
			if (expr instanceof ExpressionContext) {
				write(comma);
				visit(expr);
				comma = ", ";
			}
		}
		return null;
	}

	@Override
	public Object visitThisExpression(ThisExpressionContext ctx) {
		write("this");
		return null;
	}

	@Override
	public Object visitLiteral(LiteralContext ctx) {
		write(ctx.getText());
		return null;
	}

	@Override
	public Object visitTypeofVoidExpression(TypeofVoidExpressionContext ctx) {
		write(ctx.getText());
		return null;
	}

	@Override
	public Object visitTypeofUnboundTypeExpression(TypeofUnboundTypeExpressionContext ctx) {
		write(ctx.getText());
		return null;
	}

	@Override
	public Object visitTypeofTypeExpression(TypeofTypeExpressionContext ctx) {
		write(ctx.getText());
		return null;
	}

	@Override
	public Object visitDefaultValueExpression(DefaultValueExpressionContext ctx) {
		write(ctx.getText());
		return null;
	}

	@Override
	public Object visitNewObjectOrCollectionWithConstructorExpression(
			NewObjectOrCollectionWithConstructorExpressionContext ctx) {
		write("new ");
		write(ctx.typeReference().getText());
		write("(");
		if (ctx.expressionList() != null) {
			visit(ctx.expressionList());
		}
		write(")");
		/*
		 * if (ctx.objectOrCollectionInitializer() != null) { throw new
		 * NotSupportedException(); }
		 */
		return null;
	}

	private String ResolveIdentifier(String name) {
		StringBuilder result = new StringBuilder();
		if (this.switchStack.size() > 0) {
			ArrayList<TypeReferenceContext> casts = new ArrayList<TypeReferenceContext>();
			for (int i = this.switchStack.size() - 1; i >= 0; i--) {
				SwitchInfo switchInfo = this.switchStack.get(i);
				if (name.equals(switchInfo.getIdentifierName())) {
					if (switchInfo.getAllowTypeAs() && switchInfo.getTypeAsContext() != null) {
						casts.add(switchInfo.getTypeAsContext());
					}
				}
			}
			if (casts.size() > 0) {
				result.append("(");
				for (int i = 0; i < casts.size(); i++) {
					result.append("(");
					result.append(casts.get(i).getText());
					result.append(")");
				}
				result.append(name);
				result.append(")");
			} else {
				result.append(name);
			}
		} else {
			result.append(name);
		}
		return result.toString();
	}

	public Object visitIdentifierExpression(IdentifierExpressionContext ctx) {
		write(ResolveIdentifier(ctx.getText()));
		return null;
	}

	public Object visitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
		write("(");
		visitChildren(ctx);
		write(")");
		return null;
	}

	public Object visitElementAccessExpression(ElementAccessExpressionContext ctx) {
		visit(ctx.expression());
		write("[");
		visit(ctx.expressionList());
		write("]");
		return null;
	}

	public Object visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
		visit(ctx.expression());
		write("(");
		if (ctx.expressionList() != null) {
			visit(ctx.expressionList());
		}
		write(")");
		return null;
	}

	public Object visitPredefinedTypeMemberAccessExpression(PredefinedTypeMemberAccessExpressionContext ctx) {
		write(ctx.getText());
		return null;
	}

	public Object visitMemberAccessExpression(MemberAccessExpressionContext ctx) {
		visit(ctx.expression());
		write(".");
		String name = ctx.identifier().getText();
		boolean getter = false;
		if (name.length() > 0 && Character.isUpperCase(name.charAt(0))) {
			getter = true;
			if (name.chars().allMatch(ch -> ch == '_' || Character.isDigit(ch) || Character.isUpperCase(ch))) {
				getter = false;
			}
		}
		if (getter) {
			write("get" + name + "()");
		} else {
			write(name);
		}
		if (ctx.typeArgumentList() != null) {
			write(ctx.typeArgumentList().getText());
		}
		return null;
	}

	public Object visitTypecastExpression(TypecastExpressionContext ctx) {
		write("(");
		write(ctx.typeReference().getText());
		write(")");
		visit(ctx.expression());
		return null;
	}

	public Object visitUnaryExpression(UnaryExpressionContext ctx) {
		write(ctx.getChild(0).getText());
		visit(ctx.expression());
		return null;
	}

	public Object visitPostExpression(PostExpressionContext ctx) {
		visit(ctx.expression());
		write(ctx.getChild(1).getText());
		return null;
	}

	public Object visitMultiplicationExpression(MultiplicationExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitAdditionExpression(AdditionExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitRelationalExpression(RelationalExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitTypecheckExpression(TypecheckExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		write(ctx.getChild(2).getText());
		return null;
	}

	public Object visitEqualityExpression(EqualityExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitBitwiseAndExpression(BitwiseAndExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitBitwiseXorExpression(BitwiseXorExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitBitwiseOrExpression(BitwiseOrExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitLogicalAndExpression(LogicalAndExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitLogicalXorExpression(LogicalXorExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitLogicalOrExpression(LogicalOrExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitConditionalExpression(ConditionalExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		write(" {0} ", ctx.getChild(3).getText());
		visit(ctx.getChild(4));
		return null;
	}

	public Object visitAssignmentExpression(AssignmentExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" {0} ", ctx.getChild(1).getText());
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitLambdaExpression(LambdaExpressionContext ctx) {
		visit(ctx.getChild(0));
		write(" -> ");
		visit(ctx.getChild(2));
		return null;
	}

	public Object visitImplicitAnonymousFunctionSignature(ImplicitAnonymousFunctionSignatureContext ctx) {
		write("(");
		String comma = "";
		for (ParseTree param : ctx.children) {
			if (param instanceof ImplicitParameterContext) {
				write(comma);
				visit(param);
				comma = ", ";
			}
		}
		write(")");
		return null;
	}

	public Object visitExplicitAnonymousFunctionSignature(ExplicitAnonymousFunctionSignatureContext ctx) {
		write("(");
		String comma = "";
		for (ParseTree param : ctx.children) {
			if (param instanceof ExplicitParameterContext) {
				write(comma);
				visit(param);
				comma = ", ";
			}
		}
		write(")");
		return null;
	}

	public Object visitSingleParamAnonymousFunctionSignature(SingleParamAnonymousFunctionSignatureContext ctx) {
		visit(ctx.implicitParameter());
		return null;
	}

	public Object visitImplicitParameter(ImplicitParameterContext ctx) {
		write(ctx.identifier().getText());
		return null;
	}

	public Object visitExplicitParameter(ExplicitParameterContext ctx) {
		write("{0} {1}", ctx.typeReference().getText(), ctx.identifier().getText());
		return null;
	}

	private boolean isTemplateOutputExpression(TemplateStatementStartEndContext statementStartEnd) {
		TemplateStatementContext statement = statementStartEnd.templateStatement();
		if (statement != null && statement.expressionStatement() != null) {
			ExpressionContext expression = statement.expressionStatement().expression();
			return !(expression instanceof LambdaExpressionContext
					|| expression instanceof AssignmentExpressionContext);
		}
		return false;
	}

	private boolean forceNewLine(TemplateContentLineContext ctx) {
		String lineEndText = ctx.templateLineEnd().getText();
		return lineEndText.startsWith("^");
	}

	private boolean noNewLine(TemplateContentLineContext ctx) {
		String lineEndText = ctx.templateLineEnd().getText();
		return lineEndText.startsWith("\\");
	}

	public Object visitTemplateContentLine(TemplateContentLineContext ctx) {
		boolean forceNewLine = this.forceNewLine(ctx);
		boolean noNewLine = this.noNewLine(ctx);
		int lastIndex = ctx.getChildCount() - 2;
		int nonWhitespaceOutputCount = 0;
		int outputExpressionCount = 0;
		int statementCount = 0;
		for (int i = 0; i <= lastIndex; ++i) {
			ParseTree child = ctx.children.get(i);
			if (child instanceof TemplateOutputContext) {
				TemplateOutputContext toc = (TemplateOutputContext) child;
				if (toc.getText() != null && !toc.getText().trim().equals("")) {
					++nonWhitespaceOutputCount;
				}
			}
			if (child instanceof TemplateStatementStartEndContext) {
				TemplateStatementStartEndContext tse = (TemplateStatementStartEndContext) child;
				if (tse.templateStatement() != null) {
					if (isTemplateOutputExpression(tse)) {
						++outputExpressionCount;
					} else {
						++statementCount;
					}
				}
			}
		}
		if (statementCount == 0 && outputExpressionCount == 0) {
			if (nonWhitespaceOutputCount > 0) {
				for (int i = 0; i <= lastIndex; ++i) {
					ParseTree child = ctx.children.get(i);
					visit(child);
				}
				if (forceNewLine || !noNewLine) {
					visitTemplateLineEnd(ctx.templateLineEnd());
				}
			} else {
				if (forceNewLine) {
					visitTemplateLineEnd(ctx.templateLineEnd());
				}
			}
		} else if (statementCount > 0 && (outputExpressionCount == 0 && nonWhitespaceOutputCount == 0)) {
			for (int i = 0; i <= lastIndex; ++i) {
				ParseTree child = ctx.children.get(i);
				if (child instanceof TemplateStatementStartEndContext) {
					visit(child);
				}
			}
			if (forceNewLine) {
				visitTemplateLineEnd(ctx.templateLineEnd());
			}
		} else if (outputExpressionCount > 0) {
			int startIndex = 0;
			int endIndex = lastIndex;
			String prefix = newTmp() + "Prefix";
			String prefixText = null;
			if (lastIndex >= 1) {
				TemplateOutputContext output = null;
				if (ctx.children.get(0) instanceof TemplateOutputContext) {
					output = (TemplateOutputContext) ctx.children.get(0);
					prefixText = output.getText();
				}
				if (prefixText != null && prefixText.trim().equals("")) {
					writeLine("String {0} = \"{1}\"; {2}", prefix, escapeText(prefixText), toComment(output));
					startIndex = 1;
				}
			}
			for (int i = startIndex; i <= endIndex; ++i) {
				ParseTree child = ctx.children.get(i);
				String tmp = newTmp();
				boolean hasOutput = false;
				boolean closeBraces = false;
				if (child instanceof TemplateOutputContext) {
					TemplateOutputContext output = (TemplateOutputContext) child;
					writeLine("String {0}Line = \"{1}\"; {2}", tmp, escapeText(output.getText()), toComment(output));
					hasOutput = true;
				} else if (child instanceof TemplateStatementStartEndContext) {
					TemplateStatementStartEndContext statement = (TemplateStatementStartEndContext) child;
					if (statement.templateStatement() != null) {
						if (isTemplateOutputExpression(statement)) {
							closeBraces = true;
							writeLine("StringBuilder {0} = new StringBuilder();", tmp);
							visitTemplateStatement(statement.templateStatement(), tmp);
							writeLine("try (BufferedReader {0}Reader = this.__toReader({0}.toString())) {1}", tmp, "{");
							incIndent();
							writeLine("boolean {0}_first = true;", tmp);
							writeLine("boolean {0}_last = !{0}Reader.ready();", tmp);
							writeLine("while({0}_first || !{0}_last) {1}", tmp, "{");
							incIndent();
							writeLine("{0}_first = false;", tmp);
							writeLine("String {0}Line = {0}Reader.readLine();", tmp);
							writeLine("{0}_last = !{0}Reader.ready();", tmp);
							hasOutput = true;
						} else {
							visit(statement);
						}
					}
				}
				if (startIndex > 0 && i == startIndex) {
					writeLine("__out.append({0});", prefix);
				}
				if (hasOutput) {
					writeLine("if ({0}Line != null) __out.append({0}Line);", tmp);
					if (closeBraces) {
						writeLine("if (!{0}_last) __out.appendLine(true);", tmp);
					}
				}
				if (i == endIndex) {
					if (forceNewLine || !noNewLine) {
						visitTemplateLineEnd(ctx.templateLineEnd());
					}
				}
				if (hasOutput) {
					if (closeBraces) {
						decIndent();
						writeLine("}");
						decIndent();
						writeLine("} catch (IOException e) {");
						incIndent();
						writeLine("// nop");
						decIndent();
						writeLine("}");
					}
				}
			}
		} else {
			for (int i = 0; i <= lastIndex; ++i) {
				ParseTree child = ctx.children.get(i);
				visit(child);
			}
			if (forceNewLine || !noNewLine) {
				visitTemplateLineEnd(ctx.templateLineEnd());
			}
		}
		return null;
	}

	public Object visitTemplateOutput(TemplateOutputContext ctx, String output) {
		writeLine("{0}.append(\"{1}\"); {2}", output, escapeText(ctx.TemplateOutput().getText()), toComment(ctx));
		return null;
	}

	public Object visitTemplateOutput(TemplateOutputContext ctx) {
		return visitTemplateOutput(ctx, "__out");
	}

	public Object visitTemplateLineEnd(TemplateLineEndContext ctx, String output) {
		if (ctx.TemplateCrLf() != null) {
			String lineBreakText = ctx.TemplateCrLf().getText();
			String force = lineBreakText.startsWith("^") ? "true" : "false";
			if (!lineBreakText.startsWith("\\")) {
				writeLine("{0}.appendLine({2}); {1}", output, toComment(ctx), force);
			}
		} else if (ctx.TemplateLineBreak() != null) {
			String lineBreakText = ctx.TemplateLineBreak().getText();
			String force = lineBreakText.startsWith("^") ? "true" : "false";
			if (!ctx.TemplateLineBreak().getText().startsWith("\\")) {
				writeLine("{0}.appendLine({2}); {1}", output, toComment(ctx), force);
			}
		} else if (ctx.TemplateLineControl() != null) {
			String lineBreakText = ctx.TemplateLineControl().getText();
			String force = lineBreakText.startsWith("^") ? "true" : "false";
			if (!ctx.TemplateLineControl().getText().startsWith("\\")) {
				writeLine("{0}.appendLine({2}); {1}", output, toComment(ctx), force);
			}
		}
		return null;
	}

	public Object visitTemplateLineEnd(TemplateLineEndContext ctx) {
		return visitTemplateLineEnd(ctx, "__out");
	}

	public Object visitTemplateStatement(TemplateStatementContext ctx, String output) {
		if (ctx.expressionStatement() != null) {
			ExpressionContext expression = ctx.expressionStatement().expression();
			if (expression instanceof LambdaExpressionContext || expression instanceof AssignmentExpressionContext) {
				writeIndent();
				visit(expression);
				write(";");
				appendLine();
			} else {
				writeIndent();
				write("{0}.append(", output);
				visit(expression);
				write(");");
				appendLine();
			}
		} else {
			visitChildren(ctx);
		}
		return null;
	}

	public Object visitTemplateStatement(TemplateStatementContext ctx) {
		return visitTemplateStatement(ctx, "__out");
	}

	public Object visitLoopStatementBegin(LoopStatementBeginContext ctx) {
		LoopInfo li = this.getLoops().get(ctx);
		loopStack.add(li);
		writeLine("AtomicInteger {0}_counter = new AtomicInteger();", li.getName());
		for (int i = 0; i < li.getItems().size(); i++) {
			LoopItemInfo lii = li.getItems().get(i);
			LoopChainItemContext lci = lii.getChainItem();
			if (lci.loopChainExpression() instanceof LoopChainTypeofExpressionContext) {
				LoopChainTypeofExpressionContext expression = (LoopChainTypeofExpressionContext) lci
						.loopChainExpression();
				writeLine(
						"__enumerate({1}).filter({0}_filter -> (Object){0}_filter instanceof {2}).map({0}_map -> ({2})(Object){0}_map).forEach({0} -> {3} {4}",
						lii.getName(), i > 0 ? ResolveIdentifier(li.getItems().get(i - 1).getName()) : "",
						expression.typeReference().getText(), "{", toComment(lci));
				incIndent();
			} else if (i == 0) {
				writeIndent();
				write("__enumerate(");
				visit(lci);
				write(").forEach({0} -> {1} {2}", lii.getName(), "{", toComment(lci));
				appendLine();
				incIndent();
			} else {
				writeIndent();
				write("__enumerate({1}.");
				visit(lci);
				write(").forEach({0} -> {2} {3}", lii.getName(),
						i > 0 ? ResolveIdentifier(li.getItems().get(i - 1).getName()) : "", "{", toComment(lci));
				appendLine();
				incIndent();
			}
		}
		if (ctx.loopWhereExpression() != null) {
			writeIndent();
			write("if (");
			visit(ctx.loopWhereExpression().expression());
			write(") {0} {1}", "{", toComment(ctx.loopWhereExpression()));
			appendLine();
			incIndent();
		}
		if (ctx.loopRunExpression() != null) {
			LoopRunListContext lrl = (LoopRunListContext) ctx.loopRunExpression().children.get(1);
			visit(lrl);
		}
		writeLine("int {0}_iteration = {0}_counter.incrementAndGet();", li.getName());
		if (ctx.loopRunExpression() != null) {
			LoopRunExpressionContext lre = ctx.loopRunExpression();
			for (int i = lre.getChildCount() - 1; i >= 2; --i) {
				ParseTree child = lre.children.get(i);
				if (child instanceof LoopRunListContext) {
					LoopRunListContext lrl = (LoopRunListContext) child;
					if (i == lre.getChildCount() - 1)
						writeIndent();
					write("if ({0}_iteration >= {1}) {2} {3}", li.getName(), i / 2 + 1, "{", toComment(lrl));
					appendLine();
					incIndent();
					visit(lrl);
					decIndent();
					if (i >= 5) {
						writeIndent();
						write("} else ");
					} else {
						writeLine("}");
					}
				}
			}
		}
		return null;
	}

	public Object visitLoopStatementEnd(LoopStatementEndContext ctx) {
		LoopInfo li = null;
		if (loopStack.size() > 0) {
			li = loopStack.remove(loopStack.size() - 1);
		}
		if (li != null) {
			if (li.getLoop().loopWhereExpression() != null) {
				decIndent();
				writeLine("}");
			}
			for (int i = 0; i < li.getItems().size(); ++i) {
				decIndent();
				writeIndent();
				write("});");
				appendLine();
			}
		}
		return null;
	}

	public Object visitHasLoopExpression(HasLoopExpressionContext ctx) {
		LoopInfo li = this.getHasLoops().get(ctx);
		for (int i = 0; i < li.getItems().size(); ++i) {
			LoopItemInfo lii = li.getItems().get(i);
			LoopChainItemContext lci = lii.getChainItem();
			if (i > 0) {
				writeIndent();
			}
			if (lci.loopChainExpression() instanceof LoopChainTypeofExpressionContext) {
				LoopChainTypeofExpressionContext expression = (LoopChainTypeofExpressionContext) lci
						.loopChainExpression();
				write("__enumerate({1}).filter({0}_filter -> (Object){0}_filter instanceof {2}).map({0}_map -> ({2})(Object){0}_map).anyMatch({0} -> {3}",
						lii.getName(), i > 0 ? ResolveIdentifier(li.getItems().get(i - 1).getName()) : "",
						expression.typeReference().getText(), toComment(lci));
				appendLine();
				incIndent();
			} else if (i == 0) {
				write("__enumerate(");
				visit(lci);
				write(").anyMatch({0} -> {1}", lii.getName(), toComment(lci));
				appendLine();
				incIndent();
			} else {
				write("__enumerate({1}.");
				visit(lci);
				write(").anyMatch({0} -> {2}", lii.getName(),
						i > 0 ? ResolveIdentifier(li.getItems().get(i - 1).getName()) : "", toComment(lci));
				appendLine();
				incIndent();
			}
		}
		if (ctx.loopWhereExpression() != null) {
			writeIndent();
			visit(ctx.loopWhereExpression().expression());
			appendLine();
		} else {
			writeLine("true", li.getName());
		}
		for (int i = 0; i < li.getItems().size(); ++i) {
			decIndent();
			writeIndent();
			write(")");
			if (i < li.getItems().size() - 1) {
				appendLine();
			}
		}
		return null;
	}

	public Object visitLoopChainIdentifierExpression(LoopChainIdentifierExpressionContext ctx) {
		write(ResolveIdentifier(ctx.identifier().getText()));
		if (ctx.typeArgumentList() != null) {
			write(ctx.typeArgumentList().getText());
		}
		return null;
	}

	public Object visitLoopChainMemberAccessExpression(LoopChainMemberAccessExpressionContext ctx) {
		visit(ctx.loopChainExpression());
		write(".");
		write(ctx.identifier().getText());
		if (ctx.typeArgumentList() != null) {
			write(ctx.typeArgumentList().getText());
		}
		return null;
	}

	public Object visitLoopChainMethodCallExpression(LoopChainMethodCallExpressionContext ctx) {
		visit(ctx.loopChainExpression());
		write("(");
		if (ctx.expressionList() != null) {
			visit(ctx.expressionList());
		}
		write(")");
		return null;
	}

	public Object visitSwitchStatementBegin(SwitchStatementBeginContext ctx) {
		String tmp1 = newTmp();
		SwitchInfo switchInfo = new SwitchInfo();
		switchInfo.setTmpName(tmp1);
		this.switchStack.add(switchInfo);
		if (ctx.expression() instanceof IdentifierExpressionContext) {
			IdentifierExpressionContext id = (IdentifierExpressionContext) ctx.expression();
			if (id != null && id.typeArgumentList() == null) {
				switchInfo.setAllowTypeAs(true);
				switchInfo.setIdentifierName(id.identifier().getText());
			}
		}
		writeIndent();
		write("__var(");
		this.visit(ctx.expression());
		write(").forEach({0} -> {1} {2}", tmp1, "{", toComment(ctx.expression()));
		appendLine();
		incIndent();
		return null;
	}

	public Object visitSwitchStatementEnd(SwitchStatementEndContext ctx) {
		if (this.switchStack.size() > 0) {
			this.switchStack.remove(this.switchStack.size() - 1);
		}
		decIndent();
		writeLine("}");
		decIndent();
		writeLine("}); {0}", toComment(ctx));
		appendLine();
		return null;
	}

	public Object visitSwitchBranchHeadStatement(SwitchBranchHeadStatementContext ctx) {
		SwitchInfo switchInfo = null;
		if (this.switchStack.size() > 0) {
			switchInfo = this.switchStack.get(this.switchStack.size() - 1);
		} else {
			switchInfo = new SwitchInfo();
		}
		if (switchInfo.getCaseCount() > 0) {
			decIndent();
			writeLine("}");
			writeIndent();
			write("else ");
		} else {
			writeIndent();
		}
		switchInfo.setCaseCount(switchInfo.getCaseCount() + 1);
		switchInfo.setTypeAsContext(null);
		if (ctx.switchTypeAsHeadStatement() != null) {
			if (switchInfo.getAllowTypeAs()) {
				switchInfo.setTypeAsContext(ctx.switchTypeAsHeadStatement().typeReference());
			} else {
				// TODO: error message
			}
			write("if ({0} instanceof ", switchInfo.getIdentifierName());
			write(ctx.switchTypeAsHeadStatement().typeReference().getText());
			write(") {0}", toComment(ctx));
		} else {
			write("if (");
			SwitchCaseOrTypeIsHeadStatementContext currentCase = null;
			for (int i = 0; i < ctx.switchCaseOrTypeIsHeadStatement().size(); ++i) {
				currentCase = ctx.switchCaseOrTypeIsHeadStatement().get(i);
				if (i == 0) {
					incIndent();
				} else {
					writeIndent();
				}
				visit(currentCase);
				if (i == ctx.switchCaseOrTypeIsHeadStatement().size() - 1) {
					write(") {0}", toComment(currentCase));
					decIndent();
				} else {
					write(" || {0}", toComment(currentCase));
					appendLine();
				}
			}
		}
		appendLine();
		writeLine("{");
		incIndent();
		return null;
	}

	public Object visitSwitchCaseHeadStatement(SwitchCaseHeadStatementContext ctx) {
		SwitchInfo switchInfo = null;
		if (this.switchStack.size() > 0) {
			switchInfo = this.switchStack.get(this.switchStack.size() - 1);
		} else {
			switchInfo = new SwitchInfo();
		}
		String delim = "";
		for (int i = 0; i < ctx.expressionList().expression().size(); i++) {
			write("{0}{1} == ", delim, switchInfo.getTmpName());
			visit(ctx.expressionList().expression().get(i));
			delim = " || ";
		}
		return null;
	}

	public Object visitSwitchTypeIsHeadStatement(SwitchTypeIsHeadStatementContext ctx) {
		SwitchInfo switchInfo = null;
		if (this.switchStack.size() > 0) {
			switchInfo = this.switchStack.get(this.switchStack.size() - 1);
		} else {
			switchInfo = new SwitchInfo();
		}
		write("{0} instanceof ", switchInfo.getTmpName());
		String delim = "";
		for (int i = 0; i < ctx.typeReferenceList().typeReference().size(); i++) {
			write("{0}{1} == ", delim, switchInfo.getTmpName());
			write(ctx.typeReferenceList().typeReference().get(i).getText());
			delim = " || ";
		}
		return null;
	}

	public Object visitSwitchDefaultHeadStatement(SwitchDefaultHeadStatementContext ctx) {
		SwitchInfo switchInfo = null;
		if (this.switchStack.size() > 0) {
			switchInfo = this.switchStack.get(this.switchStack.size() - 1);
		} else {
			switchInfo = new SwitchInfo();
		}
		decIndent();
		writeLine("{0} else {1} {2}", "}", "{", toComment(ctx));
		incIndent();
		switchInfo.setCaseCount(switchInfo.getCaseCount() + 1);
		switchInfo.setTypeAsContext(null);
		return null;
	}

}
