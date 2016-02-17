// Generated from AnnotatedAntlr4Parser.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnnotatedAntlr4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnnotatedAntlr4ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#grammarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarSpec(AnnotatedAntlr4Parser.GrammarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#grammarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarType(AnnotatedAntlr4Parser.GrammarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#prequelConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrequelConstruct(AnnotatedAntlr4Parser.PrequelConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#optionsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsSpec(AnnotatedAntlr4Parser.OptionsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(AnnotatedAntlr4Parser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#optionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValue(AnnotatedAntlr4Parser.OptionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#delegateGrammars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegateGrammars(AnnotatedAntlr4Parser.DelegateGrammarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#delegateGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegateGrammar(AnnotatedAntlr4Parser.DelegateGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#tokensSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensSpec(AnnotatedAntlr4Parser.TokensSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#annotatedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedId(AnnotatedAntlr4Parser.AnnotatedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(AnnotatedAntlr4Parser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#actionScopeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionScopeName(AnnotatedAntlr4Parser.ActionScopeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#modeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSpec(AnnotatedAntlr4Parser.ModeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(AnnotatedAntlr4Parser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSpec(AnnotatedAntlr4Parser.RuleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#parserRuleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserRuleSpec(AnnotatedAntlr4Parser.ParserRuleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#exceptionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionGroup(AnnotatedAntlr4Parser.ExceptionGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#exceptionHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionHandler(AnnotatedAntlr4Parser.ExceptionHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(AnnotatedAntlr4Parser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#rulePrequel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulePrequel(AnnotatedAntlr4Parser.RulePrequelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleReturns(AnnotatedAntlr4Parser.RuleReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#throwsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsSpec(AnnotatedAntlr4Parser.ThrowsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#localsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalsSpec(AnnotatedAntlr4Parser.LocalsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleAction(AnnotatedAntlr4Parser.RuleActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleModifiers(AnnotatedAntlr4Parser.RuleModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleModifier(AnnotatedAntlr4Parser.RuleModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBlock(AnnotatedAntlr4Parser.RuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleAltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleAltList(AnnotatedAntlr4Parser.RuleAltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#labeledAlt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledAlt(AnnotatedAntlr4Parser.LabeledAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#propertiesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesBlock(AnnotatedAntlr4Parser.PropertiesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRule(AnnotatedAntlr4Parser.LexerRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerRuleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRuleBlock(AnnotatedAntlr4Parser.LexerRuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerAltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerAltList(AnnotatedAntlr4Parser.LexerAltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerAlt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerAlt(AnnotatedAntlr4Parser.LexerAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerElements(AnnotatedAntlr4Parser.LexerElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerElement(AnnotatedAntlr4Parser.LexerElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#labeledLexerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledLexerElement(AnnotatedAntlr4Parser.LabeledLexerElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerBlock(AnnotatedAntlr4Parser.LexerBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommands(AnnotatedAntlr4Parser.LexerCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommand(AnnotatedAntlr4Parser.LexerCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerCommandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommandName(AnnotatedAntlr4Parser.LexerCommandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerCommandExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommandExpr(AnnotatedAntlr4Parser.LexerCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#altList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltList(AnnotatedAntlr4Parser.AltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(AnnotatedAntlr4Parser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(AnnotatedAntlr4Parser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#labeledElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledElement(AnnotatedAntlr4Parser.LabeledElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ebnf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbnf(AnnotatedAntlr4Parser.EbnfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#blockSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSuffix(AnnotatedAntlr4Parser.BlockSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ebnfSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbnfSuffix(AnnotatedAntlr4Parser.EbnfSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#lexerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerAtom(AnnotatedAntlr4Parser.LexerAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(AnnotatedAntlr4Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#notSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSet(AnnotatedAntlr4Parser.NotSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#blockSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSet(AnnotatedAntlr4Parser.BlockSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#setElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(AnnotatedAntlr4Parser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AnnotatedAntlr4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#ruleref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleref(AnnotatedAntlr4Parser.RulerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(AnnotatedAntlr4Parser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(AnnotatedAntlr4Parser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#elementOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOptions(AnnotatedAntlr4Parser.ElementOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#elementOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOption(AnnotatedAntlr4Parser.ElementOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AnnotatedAntlr4Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(AnnotatedAntlr4Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#annotationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationBody(AnnotatedAntlr4Parser.AnnotationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#annotationAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationAttributeList(AnnotatedAntlr4Parser.AnnotationAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#annotationAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationAttribute(AnnotatedAntlr4Parser.AnnotationAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AnnotatedAntlr4Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(AnnotatedAntlr4Parser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AnnotatedAntlr4Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AnnotatedAntlr4Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AnnotatedAntlr4Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(AnnotatedAntlr4Parser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotatedAntlr4Parser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(AnnotatedAntlr4Parser.NullLiteralContext ctx);
}