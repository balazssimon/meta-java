// Generated from MetaModelParser.g4 by ANTLR 4.5.1
package metadslx.compiler;

import metadslx.core.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaModelParser}.
 */
public interface MetaModelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MetaModelParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MetaModelParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(MetaModelParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(MetaModelParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(MetaModelParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(MetaModelParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(MetaModelParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(MetaModelParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(MetaModelParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(MetaModelParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#annotationParams}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParams(MetaModelParser.AnnotationParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#annotationParams}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParams(MetaModelParser.AnnotationParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#annotationParamList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamList(MetaModelParser.AnnotationParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#annotationParamList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamList(MetaModelParser.AnnotationParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#annotationParam}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParam(MetaModelParser.AnnotationParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#annotationParam}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParam(MetaModelParser.AnnotationParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(MetaModelParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(MetaModelParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#metamodelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMetamodelDeclaration(MetaModelParser.MetamodelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#metamodelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMetamodelDeclaration(MetaModelParser.MetamodelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#metamodelPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterMetamodelPropertyList(MetaModelParser.MetamodelPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#metamodelPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitMetamodelPropertyList(MetaModelParser.MetamodelPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#metamodelProperty}.
	 * @param ctx the parse tree
	 */
	void enterMetamodelProperty(MetaModelParser.MetamodelPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#metamodelProperty}.
	 * @param ctx the parse tree
	 */
	void exitMetamodelProperty(MetaModelParser.MetamodelPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MetaModelParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MetaModelParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(MetaModelParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(MetaModelParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void enterEnumValues(MetaModelParser.EnumValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#enumValues}.
	 * @param ctx the parse tree
	 */
	void exitEnumValues(MetaModelParser.EnumValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(MetaModelParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(MetaModelParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#enumMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberDeclaration(MetaModelParser.EnumMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#enumMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberDeclaration(MetaModelParser.EnumMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MetaModelParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MetaModelParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#classAncestors}.
	 * @param ctx the parse tree
	 */
	void enterClassAncestors(MetaModelParser.ClassAncestorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#classAncestors}.
	 * @param ctx the parse tree
	 */
	void exitClassAncestors(MetaModelParser.ClassAncestorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#classAncestor}.
	 * @param ctx the parse tree
	 */
	void enterClassAncestor(MetaModelParser.ClassAncestorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#classAncestor}.
	 * @param ctx the parse tree
	 */
	void exitClassAncestor(MetaModelParser.ClassAncestorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(MetaModelParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(MetaModelParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MetaModelParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MetaModelParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(MetaModelParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(MetaModelParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#redefinitions}.
	 * @param ctx the parse tree
	 */
	void enterRedefinitions(MetaModelParser.RedefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#redefinitions}.
	 * @param ctx the parse tree
	 */
	void exitRedefinitions(MetaModelParser.RedefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#subsettings}.
	 * @param ctx the parse tree
	 */
	void enterSubsettings(MetaModelParser.SubsettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#subsettings}.
	 * @param ctx the parse tree
	 */
	void exitSubsettings(MetaModelParser.SubsettingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#nameUseList}.
	 * @param ctx the parse tree
	 */
	void enterNameUseList(MetaModelParser.NameUseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#nameUseList}.
	 * @param ctx the parse tree
	 */
	void exitNameUseList(MetaModelParser.NameUseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(MetaModelParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(MetaModelParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MetaModelParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MetaModelParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MetaModelParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MetaModelParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#typeOfReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfReference(MetaModelParser.TypeOfReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#typeOfReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfReference(MetaModelParser.TypeOfReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(MetaModelParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(MetaModelParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(MetaModelParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(MetaModelParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MetaModelParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MetaModelParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(MetaModelParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(MetaModelParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MetaModelParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MetaModelParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(MetaModelParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(MetaModelParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#invisibleType}.
	 * @param ctx the parse tree
	 */
	void enterInvisibleType(MetaModelParser.InvisibleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#invisibleType}.
	 * @param ctx the parse tree
	 */
	void exitInvisibleType(MetaModelParser.InvisibleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(MetaModelParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(MetaModelParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType(MetaModelParser.CollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType(MetaModelParser.CollectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#collectionKind}.
	 * @param ctx the parse tree
	 */
	void enterCollectionKind(MetaModelParser.CollectionKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#collectionKind}.
	 * @param ctx the parse tree
	 */
	void exitCollectionKind(MetaModelParser.CollectionKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#operationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperationDeclaration(MetaModelParser.OperationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#operationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperationDeclaration(MetaModelParser.OperationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MetaModelParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MetaModelParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MetaModelParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MetaModelParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(MetaModelParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(MetaModelParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializerDeclaration(MetaModelParser.InitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializerDeclaration(MetaModelParser.InitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#synthetizedPropertyInitializer}.
	 * @param ctx the parse tree
	 */
	void enterSynthetizedPropertyInitializer(MetaModelParser.SynthetizedPropertyInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#synthetizedPropertyInitializer}.
	 * @param ctx the parse tree
	 */
	void exitSynthetizedPropertyInitializer(MetaModelParser.SynthetizedPropertyInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#inheritedPropertyInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInheritedPropertyInitializer(MetaModelParser.InheritedPropertyInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#inheritedPropertyInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInheritedPropertyInitializer(MetaModelParser.InheritedPropertyInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(MetaModelParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(MetaModelParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#expressionOrNewExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrNewExpressionList(MetaModelParser.ExpressionOrNewExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#expressionOrNewExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrNewExpressionList(MetaModelParser.ExpressionOrNewExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#expressionOrNewExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrNewExpression(MetaModelParser.ExpressionOrNewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#expressionOrNewExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrNewExpression(MetaModelParser.ExpressionOrNewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexerExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexerExpression(MetaModelParser.IndexerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexerExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexerExpression(MetaModelParser.IndexerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MetaModelParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MetaModelParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MetaModelParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MetaModelParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(MetaModelParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(MetaModelParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostExpression(MetaModelParser.PostExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostExpression(MetaModelParser.PostExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(MetaModelParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(MetaModelParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(MetaModelParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(MetaModelParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpression(MetaModelParser.BitwiseAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpression(MetaModelParser.BitwiseAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(MetaModelParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(MetaModelParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(MetaModelParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(MetaModelParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(MetaModelParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccessExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(MetaModelParser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversionExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversionExpression(MetaModelParser.TypeConversionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversionExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversionExpression(MetaModelParser.TypeConversionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MetaModelParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MetaModelParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpression(MetaModelParser.BitwiseXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpression(MetaModelParser.BitwiseXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(MetaModelParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(MetaModelParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(MetaModelParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(MetaModelParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(MetaModelParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(MetaModelParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MetaModelParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MetaModelParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MetaModelParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MetaModelParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(MetaModelParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(MetaModelParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreExpression(MetaModelParser.PreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreExpression(MetaModelParser.PreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpression(MetaModelParser.BitwiseOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpression(MetaModelParser.BitwiseOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(MetaModelParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeofExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(MetaModelParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCheckExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCheckExpression(MetaModelParser.TypeCheckExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCheckExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCheckExpression(MetaModelParser.TypeCheckExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MetaModelParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MetaModelParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MetaModelParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MetaModelParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullCoalescingExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullCoalescingExpression(MetaModelParser.NullCoalescingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullCoalescingExpression}
	 * labeled alternative in {@link MetaModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullCoalescingExpression(MetaModelParser.NullCoalescingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(MetaModelParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(MetaModelParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjectExpression}
	 * labeled alternative in {@link MetaModelParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectExpression(MetaModelParser.NewObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectExpression}
	 * labeled alternative in {@link MetaModelParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectExpression(MetaModelParser.NewObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newCollectionExpression}
	 * labeled alternative in {@link MetaModelParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewCollectionExpression(MetaModelParser.NewCollectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newCollectionExpression}
	 * labeled alternative in {@link MetaModelParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewCollectionExpression(MetaModelParser.NewCollectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#newPropertyInitList}.
	 * @param ctx the parse tree
	 */
	void enterNewPropertyInitList(MetaModelParser.NewPropertyInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#newPropertyInitList}.
	 * @param ctx the parse tree
	 */
	void exitNewPropertyInitList(MetaModelParser.NewPropertyInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#newPropertyInit}.
	 * @param ctx the parse tree
	 */
	void enterNewPropertyInit(MetaModelParser.NewPropertyInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#newPropertyInit}.
	 * @param ctx the parse tree
	 */
	void exitNewPropertyInit(MetaModelParser.NewPropertyInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#postOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostOperator(MetaModelParser.PostOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#postOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostOperator(MetaModelParser.PostOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#preOperator}.
	 * @param ctx the parse tree
	 */
	void enterPreOperator(MetaModelParser.PreOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#preOperator}.
	 * @param ctx the parse tree
	 */
	void exitPreOperator(MetaModelParser.PreOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(MetaModelParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(MetaModelParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(MetaModelParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(MetaModelParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(MetaModelParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(MetaModelParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(MetaModelParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(MetaModelParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MetaModelParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MetaModelParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(MetaModelParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(MetaModelParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MetaModelParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MetaModelParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#associationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAssociationDeclaration(MetaModelParser.AssociationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#associationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAssociationDeclaration(MetaModelParser.AssociationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MetaModelParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MetaModelParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MetaModelParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MetaModelParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(MetaModelParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(MetaModelParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(MetaModelParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(MetaModelParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(MetaModelParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(MetaModelParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MetaModelParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MetaModelParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#scientificLiteral}.
	 * @param ctx the parse tree
	 */
	void enterScientificLiteral(MetaModelParser.ScientificLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#scientificLiteral}.
	 * @param ctx the parse tree
	 */
	void exitScientificLiteral(MetaModelParser.ScientificLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaModelParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MetaModelParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaModelParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MetaModelParser.StringLiteralContext ctx);
}