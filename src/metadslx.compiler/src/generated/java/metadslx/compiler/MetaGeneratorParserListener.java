// Generated from MetaGeneratorParser.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaGeneratorParser}.
 */
public interface MetaGeneratorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MetaGeneratorParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MetaGeneratorParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(MetaGeneratorParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(MetaGeneratorParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#generatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorDeclaration(MetaGeneratorParser.GeneratorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#generatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorDeclaration(MetaGeneratorParser.GeneratorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingNamespaceDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingNamespaceDeclaration(MetaGeneratorParser.UsingNamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingNamespaceDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingNamespaceDeclaration(MetaGeneratorParser.UsingNamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usingGeneratorDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingGeneratorDeclaration(MetaGeneratorParser.UsingGeneratorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usingGeneratorDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingGeneratorDeclaration(MetaGeneratorParser.UsingGeneratorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#configDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConfigDeclaration(MetaGeneratorParser.ConfigDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#configDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConfigDeclaration(MetaGeneratorParser.ConfigDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configPropertyDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#configProperty}.
	 * @param ctx the parse tree
	 */
	void enterConfigPropertyDeclaration(MetaGeneratorParser.ConfigPropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configPropertyDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#configProperty}.
	 * @param ctx the parse tree
	 */
	void exitConfigPropertyDeclaration(MetaGeneratorParser.ConfigPropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code configPropertyGroupDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#configProperty}.
	 * @param ctx the parse tree
	 */
	void enterConfigPropertyGroupDeclaration(MetaGeneratorParser.ConfigPropertyGroupDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code configPropertyGroupDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#configProperty}.
	 * @param ctx the parse tree
	 */
	void exitConfigPropertyGroupDeclaration(MetaGeneratorParser.ConfigPropertyGroupDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MetaGeneratorParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MetaGeneratorParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MetaGeneratorParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MetaGeneratorParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(MetaGeneratorParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(MetaGeneratorParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MetaGeneratorParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MetaGeneratorParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MetaGeneratorParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MetaGeneratorParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MetaGeneratorParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MetaGeneratorParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MetaGeneratorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MetaGeneratorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(MetaGeneratorParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(MetaGeneratorParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MetaGeneratorParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MetaGeneratorParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MetaGeneratorParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MetaGeneratorParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MetaGeneratorParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MetaGeneratorParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#ifStatementBegin}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementBegin(MetaGeneratorParser.IfStatementBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#ifStatementBegin}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementBegin(MetaGeneratorParser.IfStatementBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(MetaGeneratorParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(MetaGeneratorParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#ifStatementElse}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementElse(MetaGeneratorParser.IfStatementElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#ifStatementElse}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementElse(MetaGeneratorParser.IfStatementElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#ifStatementEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementEnd(MetaGeneratorParser.IfStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#ifStatementEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementEnd(MetaGeneratorParser.IfStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MetaGeneratorParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MetaGeneratorParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopStatementBegin}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatementBegin(MetaGeneratorParser.LoopStatementBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopStatementBegin}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatementBegin(MetaGeneratorParser.LoopStatementBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopStatementEnd}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatementEnd(MetaGeneratorParser.LoopStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopStatementEnd}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatementEnd(MetaGeneratorParser.LoopStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopChain}.
	 * @param ctx the parse tree
	 */
	void enterLoopChain(MetaGeneratorParser.LoopChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopChain}.
	 * @param ctx the parse tree
	 */
	void exitLoopChain(MetaGeneratorParser.LoopChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopChainItem}.
	 * @param ctx the parse tree
	 */
	void enterLoopChainItem(MetaGeneratorParser.LoopChainItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopChainItem}.
	 * @param ctx the parse tree
	 */
	void exitLoopChainItem(MetaGeneratorParser.LoopChainItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopChainMemberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopChainMemberAccessExpression(MetaGeneratorParser.LoopChainMemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopChainMemberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopChainMemberAccessExpression(MetaGeneratorParser.LoopChainMemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopChainMethodCallExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopChainMethodCallExpression(MetaGeneratorParser.LoopChainMethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopChainMethodCallExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopChainMethodCallExpression(MetaGeneratorParser.LoopChainMethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopChainIdentifierExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopChainIdentifierExpression(MetaGeneratorParser.LoopChainIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopChainIdentifierExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopChainIdentifierExpression(MetaGeneratorParser.LoopChainIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopChainTypeofExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopChainTypeofExpression(MetaGeneratorParser.LoopChainTypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopChainTypeofExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopChainTypeofExpression(MetaGeneratorParser.LoopChainTypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopWhereExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopWhereExpression(MetaGeneratorParser.LoopWhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopWhereExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopWhereExpression(MetaGeneratorParser.LoopWhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopRunExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopRunExpression(MetaGeneratorParser.LoopRunExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopRunExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopRunExpression(MetaGeneratorParser.LoopRunExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopRunList}.
	 * @param ctx the parse tree
	 */
	void enterLoopRunList(MetaGeneratorParser.LoopRunListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopRunList}.
	 * @param ctx the parse tree
	 */
	void exitLoopRunList(MetaGeneratorParser.LoopRunListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#loopRun}.
	 * @param ctx the parse tree
	 */
	void enterLoopRun(MetaGeneratorParser.LoopRunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#loopRun}.
	 * @param ctx the parse tree
	 */
	void exitLoopRun(MetaGeneratorParser.LoopRunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(MetaGeneratorParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(MetaGeneratorParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchStatementBegin}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatementBegin(MetaGeneratorParser.SwitchStatementBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchStatementBegin}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatementBegin(MetaGeneratorParser.SwitchStatementBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchStatementEnd}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatementEnd(MetaGeneratorParser.SwitchStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchStatementEnd}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatementEnd(MetaGeneratorParser.SwitchStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchBranchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchStatement(MetaGeneratorParser.SwitchBranchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchBranchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchStatement(MetaGeneratorParser.SwitchBranchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchBranchHeadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchHeadStatement(MetaGeneratorParser.SwitchBranchHeadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchBranchHeadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchHeadStatement(MetaGeneratorParser.SwitchBranchHeadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchCaseOrTypeIsHeadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseOrTypeIsHeadStatement(MetaGeneratorParser.SwitchCaseOrTypeIsHeadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchCaseOrTypeIsHeadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseOrTypeIsHeadStatement(MetaGeneratorParser.SwitchCaseOrTypeIsHeadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchCaseHeadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseHeadStatement(MetaGeneratorParser.SwitchCaseHeadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchCaseHeadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseHeadStatement(MetaGeneratorParser.SwitchCaseHeadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchTypeIsHeadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchTypeIsHeadStatement(MetaGeneratorParser.SwitchTypeIsHeadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchTypeIsHeadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchTypeIsHeadStatement(MetaGeneratorParser.SwitchTypeIsHeadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchTypeAsHeadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchTypeAsHeadStatement(MetaGeneratorParser.SwitchTypeAsHeadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchTypeAsHeadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchTypeAsHeadStatement(MetaGeneratorParser.SwitchTypeAsHeadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchDefaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDefaultStatement(MetaGeneratorParser.SwitchDefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchDefaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDefaultStatement(MetaGeneratorParser.SwitchDefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#switchDefaultHeadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDefaultHeadStatement(MetaGeneratorParser.SwitchDefaultHeadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#switchDefaultHeadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDefaultHeadStatement(MetaGeneratorParser.SwitchDefaultHeadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(MetaGeneratorParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(MetaGeneratorParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateSignature}.
	 * @param ctx the parse tree
	 */
	void enterTemplateSignature(MetaGeneratorParser.TemplateSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateSignature}.
	 * @param ctx the parse tree
	 */
	void exitTemplateSignature(MetaGeneratorParser.TemplateSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(MetaGeneratorParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(MetaGeneratorParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateContentLine}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContentLine(MetaGeneratorParser.TemplateContentLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateContentLine}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContentLine(MetaGeneratorParser.TemplateContentLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateOutput}.
	 * @param ctx the parse tree
	 */
	void enterTemplateOutput(MetaGeneratorParser.TemplateOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateOutput}.
	 * @param ctx the parse tree
	 */
	void exitTemplateOutput(MetaGeneratorParser.TemplateOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateLineEnd}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLineEnd(MetaGeneratorParser.TemplateLineEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateLineEnd}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLineEnd(MetaGeneratorParser.TemplateLineEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateStatementStartEnd}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStatementStartEnd(MetaGeneratorParser.TemplateStatementStartEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateStatementStartEnd}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStatementStartEnd(MetaGeneratorParser.TemplateStatementStartEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#templateStatement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStatement(MetaGeneratorParser.TemplateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#templateStatement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStatement(MetaGeneratorParser.TemplateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(MetaGeneratorParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(MetaGeneratorParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedType(MetaGeneratorParser.PredefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedType(MetaGeneratorParser.PredefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#typeReferenceList}.
	 * @param ctx the parse tree
	 */
	void enterTypeReferenceList(MetaGeneratorParser.TypeReferenceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#typeReferenceList}.
	 * @param ctx the parse tree
	 */
	void exitTypeReferenceList(MetaGeneratorParser.TypeReferenceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(MetaGeneratorParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(MetaGeneratorParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MetaGeneratorParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MetaGeneratorParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(MetaGeneratorParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(MetaGeneratorParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(MetaGeneratorParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(MetaGeneratorParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(MetaGeneratorParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(MetaGeneratorParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(MetaGeneratorParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(MetaGeneratorParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MetaGeneratorParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MetaGeneratorParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(MetaGeneratorParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(MetaGeneratorParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(MetaGeneratorParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(MetaGeneratorParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#rankSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterRankSpecifiers(MetaGeneratorParser.RankSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#rankSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitRankSpecifiers(MetaGeneratorParser.RankSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#rankSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterRankSpecifier(MetaGeneratorParser.RankSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#rankSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitRankSpecifier(MetaGeneratorParser.RankSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#unboundTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUnboundTypeName(MetaGeneratorParser.UnboundTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#unboundTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUnboundTypeName(MetaGeneratorParser.UnboundTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#genericDimensionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGenericDimensionSpecifier(MetaGeneratorParser.GenericDimensionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#genericDimensionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGenericDimensionSpecifier(MetaGeneratorParser.GenericDimensionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 */
	void enterExplicitAnonymousFunctionSignature(MetaGeneratorParser.ExplicitAnonymousFunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 */
	void exitExplicitAnonymousFunctionSignature(MetaGeneratorParser.ExplicitAnonymousFunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implicitAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 */
	void enterImplicitAnonymousFunctionSignature(MetaGeneratorParser.ImplicitAnonymousFunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implicitAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 */
	void exitImplicitAnonymousFunctionSignature(MetaGeneratorParser.ImplicitAnonymousFunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleParamAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 */
	void enterSingleParamAnonymousFunctionSignature(MetaGeneratorParser.SingleParamAnonymousFunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleParamAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 */
	void exitSingleParamAnonymousFunctionSignature(MetaGeneratorParser.SingleParamAnonymousFunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#explicitParameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicitParameter(MetaGeneratorParser.ExplicitParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#explicitParameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicitParameter(MetaGeneratorParser.ExplicitParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#implicitParameter}.
	 * @param ctx the parse tree
	 */
	void enterImplicitParameter(MetaGeneratorParser.ImplicitParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#implicitParameter}.
	 * @param ctx the parse tree
	 */
	void exitImplicitParameter(MetaGeneratorParser.ImplicitParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeofUnboundTypeExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofUnboundTypeExpression(MetaGeneratorParser.TypeofUnboundTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeofUnboundTypeExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofUnboundTypeExpression(MetaGeneratorParser.TypeofUnboundTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(MetaGeneratorParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(MetaGeneratorParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typecheckExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypecheckExpression(MetaGeneratorParser.TypecheckExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typecheckExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypecheckExpression(MetaGeneratorParser.TypecheckExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(MetaGeneratorParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(MetaGeneratorParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MetaGeneratorParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MetaGeneratorParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostExpression(MetaGeneratorParser.PostExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostExpression(MetaGeneratorParser.PostExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeofVoidExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofVoidExpression(MetaGeneratorParser.TypeofVoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeofVoidExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofVoidExpression(MetaGeneratorParser.TypeofVoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(MetaGeneratorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(MetaGeneratorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpression(MetaGeneratorParser.BitwiseAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpression(MetaGeneratorParser.BitwiseAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(MetaGeneratorParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(MetaGeneratorParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(MetaGeneratorParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(MetaGeneratorParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(MetaGeneratorParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(MetaGeneratorParser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MetaGeneratorParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MetaGeneratorParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typecastExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypecastExpression(MetaGeneratorParser.TypecastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typecastExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypecastExpression(MetaGeneratorParser.TypecastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalXorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalXorExpression(MetaGeneratorParser.LogicalXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalXorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalXorExpression(MetaGeneratorParser.LogicalXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predefinedTypeMemberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedTypeMemberAccessExpression(MetaGeneratorParser.PredefinedTypeMemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predefinedTypeMemberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedTypeMemberAccessExpression(MetaGeneratorParser.PredefinedTypeMemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpression(MetaGeneratorParser.BitwiseXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpression(MetaGeneratorParser.BitwiseXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(MetaGeneratorParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(MetaGeneratorParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValueExpression(MetaGeneratorParser.DefaultValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValueExpression(MetaGeneratorParser.DefaultValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(MetaGeneratorParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(MetaGeneratorParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MetaGeneratorParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MetaGeneratorParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(MetaGeneratorParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(MetaGeneratorParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjectOrCollectionWithConstructorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectOrCollectionWithConstructorExpression(MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectOrCollectionWithConstructorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectOrCollectionWithConstructorExpression(MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(MetaGeneratorParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(MetaGeneratorParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpression(MetaGeneratorParser.BitwiseOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpression(MetaGeneratorParser.BitwiseOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasLoopExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHasLoopExpression(MetaGeneratorParser.HasLoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasLoopExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHasLoopExpression(MetaGeneratorParser.HasLoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MetaGeneratorParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MetaGeneratorParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterElementAccessExpression(MetaGeneratorParser.ElementAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitElementAccessExpression(MetaGeneratorParser.ElementAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeofTypeExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofTypeExpression(MetaGeneratorParser.TypeofTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeofTypeExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofTypeExpression(MetaGeneratorParser.TypeofTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MetaGeneratorParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MetaGeneratorParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(MetaGeneratorParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(MetaGeneratorParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(MetaGeneratorParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(MetaGeneratorParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(MetaGeneratorParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(MetaGeneratorParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MetaGeneratorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MetaGeneratorParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MetaGeneratorParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MetaGeneratorParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(MetaGeneratorParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(MetaGeneratorParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(MetaGeneratorParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(MetaGeneratorParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(MetaGeneratorParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(MetaGeneratorParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(MetaGeneratorParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(MetaGeneratorParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MetaGeneratorParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MetaGeneratorParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#scientificLiteral}.
	 * @param ctx the parse tree
	 */
	void enterScientificLiteral(MetaGeneratorParser.ScientificLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#scientificLiteral}.
	 * @param ctx the parse tree
	 */
	void exitScientificLiteral(MetaGeneratorParser.ScientificLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#dateOrTimeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateOrTimeLiteral(MetaGeneratorParser.DateOrTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#dateOrTimeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateOrTimeLiteral(MetaGeneratorParser.DateOrTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#dateTimeOffsetLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeOffsetLiteral(MetaGeneratorParser.DateTimeOffsetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#dateTimeOffsetLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeOffsetLiteral(MetaGeneratorParser.DateTimeOffsetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#dateTimeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(MetaGeneratorParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#dateTimeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(MetaGeneratorParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(MetaGeneratorParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(MetaGeneratorParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#timeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(MetaGeneratorParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#timeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(MetaGeneratorParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(MetaGeneratorParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(MetaGeneratorParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MetaGeneratorParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MetaGeneratorParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGeneratorParser#guidLiteral}.
	 * @param ctx the parse tree
	 */
	void enterGuidLiteral(MetaGeneratorParser.GuidLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGeneratorParser#guidLiteral}.
	 * @param ctx the parse tree
	 */
	void exitGuidLiteral(MetaGeneratorParser.GuidLiteralContext ctx);
}