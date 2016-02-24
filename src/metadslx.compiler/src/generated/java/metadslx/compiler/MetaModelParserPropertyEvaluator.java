package metadslx.compiler;

import metadslx.core.Lazy;


import metadslx.core.*;


class MetaModelParserPropertyEvaluator extends MetaCompilerPropertyEvaluator implements MetaModelParserVisitor<Object>
{
    public MetaModelParserPropertyEvaluator(MetaCompiler compiler)
    {
            super(compiler);
    }
    
    public Object visitMain(MetaModelParser.MainContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedName(MetaModelParser.QualifiedNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifierList(MetaModelParser.IdentifierListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedNameList(MetaModelParser.QualifiedNameListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotation(MetaModelParser.AnnotationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationParams(MetaModelParser.AnnotationParamsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationParamList(MetaModelParser.AnnotationParamListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationParam(MetaModelParser.AnnotationParamContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNamespaceDeclaration(MetaModelParser.NamespaceDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMetamodelDeclaration(MetaModelParser.MetamodelDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMetamodelPropertyList(MetaModelParser.MetamodelPropertyListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMetamodelProperty(MetaModelParser.MetamodelPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDeclaration(MetaModelParser.DeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumDeclaration(MetaModelParser.EnumDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumValues(MetaModelParser.EnumValuesContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumValue(MetaModelParser.EnumValueContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEnumMemberDeclaration(MetaModelParser.EnumMemberDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitClassDeclaration(MetaModelParser.ClassDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitClassAncestors(MetaModelParser.ClassAncestorsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitClassAncestor(MetaModelParser.ClassAncestorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitClassMemberDeclaration(MetaModelParser.ClassMemberDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFieldDeclaration(MetaModelParser.FieldDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFieldModifier(MetaModelParser.FieldModifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRedefinitions(MetaModelParser.RedefinitionsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSubsettings(MetaModelParser.SubsettingsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNameUseList(MetaModelParser.NameUseListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConstDeclaration(MetaModelParser.ConstDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFunctionDeclaration(MetaModelParser.FunctionDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitReturnType(MetaModelParser.ReturnTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeOfReference(MetaModelParser.TypeOfReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeReference(MetaModelParser.TypeReferenceContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSimpleType(MetaModelParser.SimpleTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitClassType(MetaModelParser.ClassTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitObjectType(MetaModelParser.ObjectTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPrimitiveType(MetaModelParser.PrimitiveTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitVoidType(MetaModelParser.VoidTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitInvisibleType(MetaModelParser.InvisibleTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullableType(MetaModelParser.NullableTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCollectionType(MetaModelParser.CollectionTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCollectionKind(MetaModelParser.CollectionKindContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOperationDeclaration(MetaModelParser.OperationDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParameterList(MetaModelParser.ParameterListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParameter(MetaModelParser.ParameterContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConstructorDeclaration(MetaModelParser.ConstructorDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitInitializerDeclaration(MetaModelParser.InitializerDeclarationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSynthetizedPropertyInitializer(MetaModelParser.SynthetizedPropertyInitializerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitInheritedPropertyInitializer(MetaModelParser.InheritedPropertyInitializerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionList(MetaModelParser.ExpressionListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionOrNewExpressionList(MetaModelParser.ExpressionOrNewExpressionListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionOrNewExpression(MetaModelParser.ExpressionOrNewExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitCastExpression(MetaModelParser.CastExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeofExpression(MetaModelParser.TypeofExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBracketExpression(MetaModelParser.BracketExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitThisExpression(MetaModelParser.ThisExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConstantExpression(MetaModelParser.ConstantExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifierExpression(MetaModelParser.IdentifierExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIndexerExpression(MetaModelParser.IndexerExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFunctionCallExpression(MetaModelParser.FunctionCallExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMemberAccessExpression(MetaModelParser.MemberAccessExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPostExpression(MetaModelParser.PostExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPreExpression(MetaModelParser.PreExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitUnaryExpression(MetaModelParser.UnaryExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeConversionExpression(MetaModelParser.TypeConversionExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTypeCheckExpression(MetaModelParser.TypeCheckExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMultiplicativeExpression(MetaModelParser.MultiplicativeExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAdditiveExpression(MetaModelParser.AdditiveExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitShiftExpression(MetaModelParser.ShiftExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComparisonExpression(MetaModelParser.ComparisonExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEqualityExpression(MetaModelParser.EqualityExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBitwiseAndExpression(MetaModelParser.BitwiseAndExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBitwiseXorExpression(MetaModelParser.BitwiseXorExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBitwiseOrExpression(MetaModelParser.BitwiseOrExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLogicalAndExpression(MetaModelParser.LogicalAndExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLogicalOrExpression(MetaModelParser.LogicalOrExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullCoalescingExpression(MetaModelParser.NullCoalescingExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitConditionalExpression(MetaModelParser.ConditionalExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAssignmentExpression(MetaModelParser.AssignmentExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteralExpression(MetaModelParser.LiteralExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNewObjectExpression(MetaModelParser.NewObjectExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNewCollectionExpression(MetaModelParser.NewCollectionExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNewPropertyInitList(MetaModelParser.NewPropertyInitListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNewPropertyInit(MetaModelParser.NewPropertyInitContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPostOperator(MetaModelParser.PostOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPreOperator(MetaModelParser.PreOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitUnaryOperator(MetaModelParser.UnaryOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitMultiplicativeOperator(MetaModelParser.MultiplicativeOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAdditiveOperator(MetaModelParser.AdditiveOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitShiftOperator(MetaModelParser.ShiftOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitComparisonOperator(MetaModelParser.ComparisonOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEqualityOperator(MetaModelParser.EqualityOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAssignmentOperator(MetaModelParser.AssignmentOperatorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAssociationDeclaration(MetaModelParser.AssociationDeclarationContext ctx)
    {
        this.setValue(ctx.source, "OppositeProperties", Lazy.create(() -> this.symbol(ctx.target)));
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifier(MetaModelParser.IdentifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteral(MetaModelParser.LiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullLiteral(MetaModelParser.NullLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBooleanLiteral(MetaModelParser.BooleanLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIntegerLiteral(MetaModelParser.IntegerLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDecimalLiteral(MetaModelParser.DecimalLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitScientificLiteral(MetaModelParser.ScientificLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitStringLiteral(MetaModelParser.StringLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
}

