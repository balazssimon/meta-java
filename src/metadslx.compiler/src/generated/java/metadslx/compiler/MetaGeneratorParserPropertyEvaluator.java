package metadslx.compiler;

import metadslx.core.Lazy;


class MetaGeneratorParserPropertyEvaluator extends MetaCompilerPropertyEvaluator implements MetaGeneratorParserVisitor<Object>
{
    public MetaGeneratorParserPropertyEvaluator(MetaCompiler compiler)
    {
            super(compiler);
    }
    
    public Object visitMain(MetaGeneratorParser.MainContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNamespaceDeclaration(MetaGeneratorParser.NamespaceDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitGeneratorDeclaration(MetaGeneratorParser.GeneratorDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitUsingNamespaceDeclaration(MetaGeneratorParser.UsingNamespaceDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitUsingGeneratorDeclaration(MetaGeneratorParser.UsingGeneratorDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConfigDeclaration(MetaGeneratorParser.ConfigDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConfigPropertyDeclaration(MetaGeneratorParser.ConfigPropertyDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConfigPropertyGroupDeclaration(MetaGeneratorParser.ConfigPropertyGroupDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMethodDeclaration(MetaGeneratorParser.MethodDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFunctionDeclaration(MetaGeneratorParser.FunctionDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFunctionSignature(MetaGeneratorParser.FunctionSignatureContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParamList(MetaGeneratorParser.ParamListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParameter(MetaGeneratorParser.ParameterContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBody(MetaGeneratorParser.BodyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitStatement(MetaGeneratorParser.StatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitVariableDeclarationStatement(MetaGeneratorParser.VariableDeclarationStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReturnStatement(MetaGeneratorParser.ReturnStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionStatement(MetaGeneratorParser.ExpressionStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIfStatement(MetaGeneratorParser.IfStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIfStatementBegin(MetaGeneratorParser.IfStatementBeginContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitElseIfStatement(MetaGeneratorParser.ElseIfStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIfStatementElse(MetaGeneratorParser.IfStatementElseContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIfStatementEnd(MetaGeneratorParser.IfStatementEndContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopStatement(MetaGeneratorParser.LoopStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopStatementBegin(MetaGeneratorParser.LoopStatementBeginContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopStatementEnd(MetaGeneratorParser.LoopStatementEndContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopChain(MetaGeneratorParser.LoopChainContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopChainItem(MetaGeneratorParser.LoopChainItemContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopChainTypeofExpression(MetaGeneratorParser.LoopChainTypeofExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopChainIdentifierExpression(MetaGeneratorParser.LoopChainIdentifierExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopChainMemberAccessExpression(MetaGeneratorParser.LoopChainMemberAccessExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopChainMethodCallExpression(MetaGeneratorParser.LoopChainMethodCallExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopWhereExpression(MetaGeneratorParser.LoopWhereExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopRunExpression(MetaGeneratorParser.LoopRunExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopRunList(MetaGeneratorParser.LoopRunListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLoopRun(MetaGeneratorParser.LoopRunContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchStatement(MetaGeneratorParser.SwitchStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchStatementBegin(MetaGeneratorParser.SwitchStatementBeginContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchStatementEnd(MetaGeneratorParser.SwitchStatementEndContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchBranchStatement(MetaGeneratorParser.SwitchBranchStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchBranchHeadStatement(MetaGeneratorParser.SwitchBranchHeadStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchCaseOrTypeIsHeadStatement(MetaGeneratorParser.SwitchCaseOrTypeIsHeadStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchCaseHeadStatement(MetaGeneratorParser.SwitchCaseHeadStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchTypeIsHeadStatement(MetaGeneratorParser.SwitchTypeIsHeadStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchTypeAsHeadStatement(MetaGeneratorParser.SwitchTypeAsHeadStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchDefaultStatement(MetaGeneratorParser.SwitchDefaultStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSwitchDefaultHeadStatement(MetaGeneratorParser.SwitchDefaultHeadStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateDeclaration(MetaGeneratorParser.TemplateDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateSignature(MetaGeneratorParser.TemplateSignatureContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateBody(MetaGeneratorParser.TemplateBodyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateContentLine(MetaGeneratorParser.TemplateContentLineContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateOutput(MetaGeneratorParser.TemplateOutputContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateLineEnd(MetaGeneratorParser.TemplateLineEndContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateStatementStartEnd(MetaGeneratorParser.TemplateStatementStartEndContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTemplateStatement(MetaGeneratorParser.TemplateStatementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeArgumentList(MetaGeneratorParser.TypeArgumentListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPredefinedType(MetaGeneratorParser.PredefinedTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeReferenceList(MetaGeneratorParser.TypeReferenceListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeReference(MetaGeneratorParser.TypeReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitArrayType(MetaGeneratorParser.ArrayTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullableType(MetaGeneratorParser.NullableTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitGenericType(MetaGeneratorParser.GenericTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSimpleType(MetaGeneratorParser.SimpleTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitVoidType(MetaGeneratorParser.VoidTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReturnType(MetaGeneratorParser.ReturnTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionList(MetaGeneratorParser.ExpressionListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitVariableReference(MetaGeneratorParser.VariableReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRankSpecifiers(MetaGeneratorParser.RankSpecifiersContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRankSpecifier(MetaGeneratorParser.RankSpecifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitUnboundTypeName(MetaGeneratorParser.UnboundTypeNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitGenericDimensionSpecifier(MetaGeneratorParser.GenericDimensionSpecifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExplicitAnonymousFunctionSignature(MetaGeneratorParser.ExplicitAnonymousFunctionSignatureContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitImplicitAnonymousFunctionSignature(MetaGeneratorParser.ImplicitAnonymousFunctionSignatureContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSingleParamAnonymousFunctionSignature(MetaGeneratorParser.SingleParamAnonymousFunctionSignatureContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExplicitParameter(MetaGeneratorParser.ExplicitParameterContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitImplicitParameter(MetaGeneratorParser.ImplicitParameterContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitThisExpression(MetaGeneratorParser.ThisExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteralExpression(MetaGeneratorParser.LiteralExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeofVoidExpression(MetaGeneratorParser.TypeofVoidExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeofUnboundTypeExpression(MetaGeneratorParser.TypeofUnboundTypeExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeofTypeExpression(MetaGeneratorParser.TypeofTypeExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDefaultValueExpression(MetaGeneratorParser.DefaultValueExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNewObjectOrCollectionWithConstructorExpression(MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifierExpression(MetaGeneratorParser.IdentifierExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitHasLoopExpression(MetaGeneratorParser.HasLoopExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParenthesizedExpression(MetaGeneratorParser.ParenthesizedExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitElementAccessExpression(MetaGeneratorParser.ElementAccessExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFunctionCallExpression(MetaGeneratorParser.FunctionCallExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPredefinedTypeMemberAccessExpression(MetaGeneratorParser.PredefinedTypeMemberAccessExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMemberAccessExpression(MetaGeneratorParser.MemberAccessExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypecastExpression(MetaGeneratorParser.TypecastExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitUnaryExpression(MetaGeneratorParser.UnaryExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPostExpression(MetaGeneratorParser.PostExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMultiplicationExpression(MetaGeneratorParser.MultiplicationExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAdditionExpression(MetaGeneratorParser.AdditionExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRelationalExpression(MetaGeneratorParser.RelationalExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypecheckExpression(MetaGeneratorParser.TypecheckExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEqualityExpression(MetaGeneratorParser.EqualityExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBitwiseAndExpression(MetaGeneratorParser.BitwiseAndExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBitwiseXorExpression(MetaGeneratorParser.BitwiseXorExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBitwiseOrExpression(MetaGeneratorParser.BitwiseOrExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLogicalAndExpression(MetaGeneratorParser.LogicalAndExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLogicalXorExpression(MetaGeneratorParser.LogicalXorExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLogicalOrExpression(MetaGeneratorParser.LogicalOrExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConditionalExpression(MetaGeneratorParser.ConditionalExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAssignmentExpression(MetaGeneratorParser.AssignmentExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLambdaExpression(MetaGeneratorParser.LambdaExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedName(MetaGeneratorParser.QualifiedNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifierList(MetaGeneratorParser.IdentifierListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifier(MetaGeneratorParser.IdentifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteral(MetaGeneratorParser.LiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullLiteral(MetaGeneratorParser.NullLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBooleanLiteral(MetaGeneratorParser.BooleanLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNumberLiteral(MetaGeneratorParser.NumberLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIntegerLiteral(MetaGeneratorParser.IntegerLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDecimalLiteral(MetaGeneratorParser.DecimalLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitScientificLiteral(MetaGeneratorParser.ScientificLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDateOrTimeLiteral(MetaGeneratorParser.DateOrTimeLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDateTimeOffsetLiteral(MetaGeneratorParser.DateTimeOffsetLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDateTimeLiteral(MetaGeneratorParser.DateTimeLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDateLiteral(MetaGeneratorParser.DateLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTimeLiteral(MetaGeneratorParser.TimeLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCharLiteral(MetaGeneratorParser.CharLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitStringLiteral(MetaGeneratorParser.StringLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitGuidLiteral(MetaGeneratorParser.GuidLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
}

