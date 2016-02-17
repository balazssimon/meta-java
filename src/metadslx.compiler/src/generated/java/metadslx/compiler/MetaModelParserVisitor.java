// Generated from MetaModelParser.g4 by ANTLR 4.5.1
package metadslx.compiler;

import metadslx.core.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MetaModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MetaModelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MetaModelParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(MetaModelParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(MetaModelParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(MetaModelParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(MetaModelParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#annotationParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParams(MetaModelParser.AnnotationParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#annotationParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamList(MetaModelParser.AnnotationParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#annotationParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParam(MetaModelParser.AnnotationParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(MetaModelParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#metamodelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetamodelDeclaration(MetaModelParser.MetamodelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#metamodelPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetamodelPropertyList(MetaModelParser.MetamodelPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#metamodelProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetamodelProperty(MetaModelParser.MetamodelPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MetaModelParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(MetaModelParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#enumValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValues(MetaModelParser.EnumValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(MetaModelParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#enumMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumMemberDeclaration(MetaModelParser.EnumMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MetaModelParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#classAncestors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAncestors(MetaModelParser.ClassAncestorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#classAncestor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAncestor(MetaModelParser.ClassAncestorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(MetaModelParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(MetaModelParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(MetaModelParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#redefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedefinitions(MetaModelParser.RedefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#subsettings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsettings(MetaModelParser.SubsettingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#nameUseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameUseList(MetaModelParser.NameUseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(MetaModelParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MetaModelParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(MetaModelParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#typeOfReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfReference(MetaModelParser.TypeOfReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(MetaModelParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(MetaModelParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(MetaModelParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(MetaModelParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(MetaModelParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(MetaModelParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#invisibleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvisibleType(MetaModelParser.InvisibleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(MetaModelParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#collectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionType(MetaModelParser.CollectionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#collectionKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionKind(MetaModelParser.CollectionKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#operationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDeclaration(MetaModelParser.OperationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MetaModelParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MetaModelParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(MetaModelParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#initializerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerDeclaration(MetaModelParser.InitializerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#synthetizedPropertyInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthetizedPropertyInitializer(MetaModelParser.SynthetizedPropertyInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#inheritedPropertyInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritedPropertyInitializer(MetaModelParser.InheritedPropertyInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(MetaModelParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#expressionOrNewExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrNewExpressionList(MetaModelParser.ExpressionOrNewExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#expressionOrNewExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrNewExpression(MetaModelParser.ExpressionOrNewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexerExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexerExpression(MetaModelParser.IndexerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MetaModelParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(MetaModelParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(MetaModelParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostExpression(MetaModelParser.PostExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(MetaModelParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(MetaModelParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(MetaModelParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(MetaModelParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(MetaModelParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpression(MetaModelParser.MemberAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversionExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversionExpression(MetaModelParser.TypeConversionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MetaModelParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpression(MetaModelParser.BitwiseXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(MetaModelParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(MetaModelParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MetaModelParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(MetaModelParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MetaModelParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(MetaModelParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreExpression(MetaModelParser.PreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(MetaModelParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(MetaModelParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeCheckExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCheckExpression(MetaModelParser.TypeCheckExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(MetaModelParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MetaModelParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullCoalescingExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCoalescingExpression(MetaModelParser.NullCoalescingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(MetaModelParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjectExpression}
	 * labeled alternative in {@link MetaModelParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectExpression(MetaModelParser.NewObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newCollectionExpression}
	 * labeled alternative in {@link MetaModelParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewCollectionExpression(MetaModelParser.NewCollectionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#newPropertyInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPropertyInitList(MetaModelParser.NewPropertyInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#newPropertyInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPropertyInit(MetaModelParser.NewPropertyInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#postOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostOperator(MetaModelParser.PostOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#preOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreOperator(MetaModelParser.PreOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(MetaModelParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(MetaModelParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(MetaModelParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(MetaModelParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MetaModelParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(MetaModelParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(MetaModelParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#associationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociationDeclaration(MetaModelParser.AssociationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MetaModelParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MetaModelParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(MetaModelParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(MetaModelParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(MetaModelParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(MetaModelParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#scientificLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificLiteral(MetaModelParser.ScientificLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaModelParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(MetaModelParser.StringLiteralContext ctx);
}