// Generated from MetaGeneratorParser.g4 by ANTLR 4.5.1
package metadslx.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MetaGeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MetaGeneratorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MetaGeneratorParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(MetaGeneratorParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#generatorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorDeclaration(MetaGeneratorParser.GeneratorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingNamespaceDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingNamespaceDeclaration(MetaGeneratorParser.UsingNamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usingGeneratorDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingGeneratorDeclaration(MetaGeneratorParser.UsingGeneratorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#configDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigDeclaration(MetaGeneratorParser.ConfigDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code configPropertyDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#configProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigPropertyDeclaration(MetaGeneratorParser.ConfigPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code configPropertyGroupDeclaration}
	 * labeled alternative in {@link MetaGeneratorParser#configProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigPropertyGroupDeclaration(MetaGeneratorParser.ConfigPropertyGroupDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MetaGeneratorParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MetaGeneratorParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(MetaGeneratorParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(MetaGeneratorParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MetaGeneratorParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MetaGeneratorParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MetaGeneratorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(MetaGeneratorParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MetaGeneratorParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MetaGeneratorParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MetaGeneratorParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#ifStatementBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementBegin(MetaGeneratorParser.IfStatementBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(MetaGeneratorParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#ifStatementElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementElse(MetaGeneratorParser.IfStatementElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#ifStatementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementEnd(MetaGeneratorParser.IfStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MetaGeneratorParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopStatementBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatementBegin(MetaGeneratorParser.LoopStatementBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopStatementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatementEnd(MetaGeneratorParser.LoopStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChain(MetaGeneratorParser.LoopChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopChainItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChainItem(MetaGeneratorParser.LoopChainItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopChainMemberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChainMemberAccessExpression(MetaGeneratorParser.LoopChainMemberAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopChainMethodCallExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChainMethodCallExpression(MetaGeneratorParser.LoopChainMethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopChainIdentifierExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChainIdentifierExpression(MetaGeneratorParser.LoopChainIdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopChainTypeofExpression}
	 * labeled alternative in {@link MetaGeneratorParser#loopChainExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChainTypeofExpression(MetaGeneratorParser.LoopChainTypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopWhereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopWhereExpression(MetaGeneratorParser.LoopWhereExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopRunExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopRunExpression(MetaGeneratorParser.LoopRunExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopRunList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopRunList(MetaGeneratorParser.LoopRunListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#loopRun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopRun(MetaGeneratorParser.LoopRunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(MetaGeneratorParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchStatementBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatementBegin(MetaGeneratorParser.SwitchStatementBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchStatementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatementEnd(MetaGeneratorParser.SwitchStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchBranchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBranchStatement(MetaGeneratorParser.SwitchBranchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchBranchHeadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBranchHeadStatement(MetaGeneratorParser.SwitchBranchHeadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchCaseOrTypeIsHeadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseOrTypeIsHeadStatement(MetaGeneratorParser.SwitchCaseOrTypeIsHeadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchCaseHeadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseHeadStatement(MetaGeneratorParser.SwitchCaseHeadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchTypeIsHeadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchTypeIsHeadStatement(MetaGeneratorParser.SwitchTypeIsHeadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchTypeAsHeadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchTypeAsHeadStatement(MetaGeneratorParser.SwitchTypeAsHeadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchDefaultStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDefaultStatement(MetaGeneratorParser.SwitchDefaultStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#switchDefaultHeadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDefaultHeadStatement(MetaGeneratorParser.SwitchDefaultHeadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(MetaGeneratorParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateSignature(MetaGeneratorParser.TemplateSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(MetaGeneratorParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateContentLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContentLine(MetaGeneratorParser.TemplateContentLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateOutput(MetaGeneratorParser.TemplateOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateLineEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLineEnd(MetaGeneratorParser.TemplateLineEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateStatementStartEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStatementStartEnd(MetaGeneratorParser.TemplateStatementStartEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#templateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStatement(MetaGeneratorParser.TemplateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(MetaGeneratorParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#predefinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedType(MetaGeneratorParser.PredefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#typeReferenceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReferenceList(MetaGeneratorParser.TypeReferenceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(MetaGeneratorParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MetaGeneratorParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(MetaGeneratorParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(MetaGeneratorParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(MetaGeneratorParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(MetaGeneratorParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(MetaGeneratorParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(MetaGeneratorParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(MetaGeneratorParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#rankSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRankSpecifiers(MetaGeneratorParser.RankSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#rankSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRankSpecifier(MetaGeneratorParser.RankSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#unboundTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundTypeName(MetaGeneratorParser.UnboundTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#genericDimensionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDimensionSpecifier(MetaGeneratorParser.GenericDimensionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitAnonymousFunctionSignature(MetaGeneratorParser.ExplicitAnonymousFunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code implicitAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitAnonymousFunctionSignature(MetaGeneratorParser.ImplicitAnonymousFunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParamAnonymousFunctionSignature}
	 * labeled alternative in {@link MetaGeneratorParser#anonymousFunctionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParamAnonymousFunctionSignature(MetaGeneratorParser.SingleParamAnonymousFunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#explicitParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitParameter(MetaGeneratorParser.ExplicitParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#implicitParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitParameter(MetaGeneratorParser.ImplicitParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeofUnboundTypeExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofUnboundTypeExpression(MetaGeneratorParser.TypeofUnboundTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(MetaGeneratorParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typecheckExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecheckExpression(MetaGeneratorParser.TypecheckExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(MetaGeneratorParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(MetaGeneratorParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostExpression(MetaGeneratorParser.PostExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeofVoidExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofVoidExpression(MetaGeneratorParser.TypeofVoidExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(MetaGeneratorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(MetaGeneratorParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(MetaGeneratorParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(MetaGeneratorParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpression(MetaGeneratorParser.MemberAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MetaGeneratorParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typecastExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecastExpression(MetaGeneratorParser.TypecastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalXorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalXorExpression(MetaGeneratorParser.LogicalXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predefinedTypeMemberAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedTypeMemberAccessExpression(MetaGeneratorParser.PredefinedTypeMemberAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpression(MetaGeneratorParser.BitwiseXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(MetaGeneratorParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultValueExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValueExpression(MetaGeneratorParser.DefaultValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MetaGeneratorParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(MetaGeneratorParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(MetaGeneratorParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjectOrCollectionWithConstructorExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectOrCollectionWithConstructorExpression(MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(MetaGeneratorParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(MetaGeneratorParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasLoopExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasLoopExpression(MetaGeneratorParser.HasLoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(MetaGeneratorParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAccessExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccessExpression(MetaGeneratorParser.ElementAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeofTypeExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofTypeExpression(MetaGeneratorParser.TypeofTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MetaGeneratorParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link MetaGeneratorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(MetaGeneratorParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(MetaGeneratorParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(MetaGeneratorParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MetaGeneratorParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MetaGeneratorParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(MetaGeneratorParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(MetaGeneratorParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(MetaGeneratorParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(MetaGeneratorParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(MetaGeneratorParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#scientificLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificLiteral(MetaGeneratorParser.ScientificLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#dateOrTimeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateOrTimeLiteral(MetaGeneratorParser.DateOrTimeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#dateTimeOffsetLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeOffsetLiteral(MetaGeneratorParser.DateTimeOffsetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#dateTimeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiteral(MetaGeneratorParser.DateTimeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(MetaGeneratorParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#timeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeLiteral(MetaGeneratorParser.TimeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(MetaGeneratorParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(MetaGeneratorParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGeneratorParser#guidLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuidLiteral(MetaGeneratorParser.GuidLiteralContext ctx);
}