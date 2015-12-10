package metadslx.core;

/**
 * Factory class for creating instances of model elements.
 */
public class MetaFactory extends ModelFactory {
    private static MetaFactory instance = new MetaFactory();

	private MetaFactory()
	{
	}

    /**
     * The singleton instance of the factory.
     */
    public static MetaFactory instance() {
        return MetaFactory.instance;
    }

    /**
     * Creates a new instance of MetaAnnotation.
     */
    public MetaAnnotation createMetaAnnotation() {
		return this.createMetaAnnotation(null);
	}
    /**
     * Creates a new instance of MetaAnnotation.
     */
    public MetaAnnotation createMetaAnnotation(Iterable<ModelPropertyInitializer> initializers) {
		MetaAnnotation result = new metadslx.core.MetaAnnotationImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAnnotationProperty.
     */
    public MetaAnnotationProperty createMetaAnnotationProperty() {
		return this.createMetaAnnotationProperty(null);
	}
    /**
     * Creates a new instance of MetaAnnotationProperty.
     */
    public MetaAnnotationProperty createMetaAnnotationProperty(Iterable<ModelPropertyInitializer> initializers) {
		MetaAnnotationProperty result = new metadslx.core.MetaAnnotationPropertyImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNamespace.
     */
    public MetaNamespace createMetaNamespace() {
		return this.createMetaNamespace(null);
	}
    /**
     * Creates a new instance of MetaNamespace.
     */
    public MetaNamespace createMetaNamespace(Iterable<ModelPropertyInitializer> initializers) {
		MetaNamespace result = new metadslx.core.MetaNamespaceImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaModel.
     */
    public MetaModel createMetaModel() {
		return this.createMetaModel(null);
	}
    /**
     * Creates a new instance of MetaModel.
     */
    public MetaModel createMetaModel(Iterable<ModelPropertyInitializer> initializers) {
		MetaModel result = new metadslx.core.MetaModelImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaCollectionType.
     */
    public MetaCollectionType createMetaCollectionType() {
		return this.createMetaCollectionType(null);
	}
    /**
     * Creates a new instance of MetaCollectionType.
     */
    public MetaCollectionType createMetaCollectionType(Iterable<ModelPropertyInitializer> initializers) {
		MetaCollectionType result = new metadslx.core.MetaCollectionTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNullableType.
     */
    public MetaNullableType createMetaNullableType() {
		return this.createMetaNullableType(null);
	}
    /**
     * Creates a new instance of MetaNullableType.
     */
    public MetaNullableType createMetaNullableType(Iterable<ModelPropertyInitializer> initializers) {
		MetaNullableType result = new metadslx.core.MetaNullableTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaPrimitiveType.
     */
    public MetaPrimitiveType createMetaPrimitiveType() {
		return this.createMetaPrimitiveType(null);
	}
    /**
     * Creates a new instance of MetaPrimitiveType.
     */
    public MetaPrimitiveType createMetaPrimitiveType(Iterable<ModelPropertyInitializer> initializers) {
		MetaPrimitiveType result = new metadslx.core.MetaPrimitiveTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaEnum.
     */
    public MetaEnum createMetaEnum() {
		return this.createMetaEnum(null);
	}
    /**
     * Creates a new instance of MetaEnum.
     */
    public MetaEnum createMetaEnum(Iterable<ModelPropertyInitializer> initializers) {
		MetaEnum result = new metadslx.core.MetaEnumImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaEnumLiteral.
     */
    public MetaEnumLiteral createMetaEnumLiteral() {
		return this.createMetaEnumLiteral(null);
	}
    /**
     * Creates a new instance of MetaEnumLiteral.
     */
    public MetaEnumLiteral createMetaEnumLiteral(Iterable<ModelPropertyInitializer> initializers) {
		MetaEnumLiteral result = new metadslx.core.MetaEnumLiteralImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaClass.
     */
    public MetaClass createMetaClass() {
		return this.createMetaClass(null);
	}
    /**
     * Creates a new instance of MetaClass.
     */
    public MetaClass createMetaClass(Iterable<ModelPropertyInitializer> initializers) {
		MetaClass result = new metadslx.core.MetaClassImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaFunctionType.
     */
    public MetaFunctionType createMetaFunctionType() {
		return this.createMetaFunctionType(null);
	}
    /**
     * Creates a new instance of MetaFunctionType.
     */
    public MetaFunctionType createMetaFunctionType(Iterable<ModelPropertyInitializer> initializers) {
		MetaFunctionType result = new metadslx.core.MetaFunctionTypeImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaGlobalFunction.
     */
    public MetaGlobalFunction createMetaGlobalFunction() {
		return this.createMetaGlobalFunction(null);
	}
    /**
     * Creates a new instance of MetaGlobalFunction.
     */
    public MetaGlobalFunction createMetaGlobalFunction(Iterable<ModelPropertyInitializer> initializers) {
		MetaGlobalFunction result = new metadslx.core.MetaGlobalFunctionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaOperation.
     */
    public MetaOperation createMetaOperation() {
		return this.createMetaOperation(null);
	}
    /**
     * Creates a new instance of MetaOperation.
     */
    public MetaOperation createMetaOperation(Iterable<ModelPropertyInitializer> initializers) {
		MetaOperation result = new metadslx.core.MetaOperationImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaConstant.
     */
    public MetaConstant createMetaConstant() {
		return this.createMetaConstant(null);
	}
    /**
     * Creates a new instance of MetaConstant.
     */
    public MetaConstant createMetaConstant(Iterable<ModelPropertyInitializer> initializers) {
		MetaConstant result = new metadslx.core.MetaConstantImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaConstructor.
     */
    public MetaConstructor createMetaConstructor() {
		return this.createMetaConstructor(null);
	}
    /**
     * Creates a new instance of MetaConstructor.
     */
    public MetaConstructor createMetaConstructor(Iterable<ModelPropertyInitializer> initializers) {
		MetaConstructor result = new metadslx.core.MetaConstructorImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaParameter.
     */
    public MetaParameter createMetaParameter() {
		return this.createMetaParameter(null);
	}
    /**
     * Creates a new instance of MetaParameter.
     */
    public MetaParameter createMetaParameter(Iterable<ModelPropertyInitializer> initializers) {
		MetaParameter result = new metadslx.core.MetaParameterImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaProperty.
     */
    public MetaProperty createMetaProperty() {
		return this.createMetaProperty(null);
	}
    /**
     * Creates a new instance of MetaProperty.
     */
    public MetaProperty createMetaProperty(Iterable<ModelPropertyInitializer> initializers) {
		MetaProperty result = new metadslx.core.MetaPropertyImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaSynthetizedPropertyInitializer.
     */
    public MetaSynthetizedPropertyInitializer createMetaSynthetizedPropertyInitializer() {
		return this.createMetaSynthetizedPropertyInitializer(null);
	}
    /**
     * Creates a new instance of MetaSynthetizedPropertyInitializer.
     */
    public MetaSynthetizedPropertyInitializer createMetaSynthetizedPropertyInitializer(Iterable<ModelPropertyInitializer> initializers) {
		MetaSynthetizedPropertyInitializer result = new metadslx.core.MetaSynthetizedPropertyInitializerImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaInheritedPropertyInitializer.
     */
    public MetaInheritedPropertyInitializer createMetaInheritedPropertyInitializer() {
		return this.createMetaInheritedPropertyInitializer(null);
	}
    /**
     * Creates a new instance of MetaInheritedPropertyInitializer.
     */
    public MetaInheritedPropertyInitializer createMetaInheritedPropertyInitializer(Iterable<ModelPropertyInitializer> initializers) {
		MetaInheritedPropertyInitializer result = new metadslx.core.MetaInheritedPropertyInitializerImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaBracketExpression.
     */
    public MetaBracketExpression createMetaBracketExpression() {
		return this.createMetaBracketExpression(null);
	}
    /**
     * Creates a new instance of MetaBracketExpression.
     */
    public MetaBracketExpression createMetaBracketExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaBracketExpression result = new metadslx.core.MetaBracketExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaThisExpression.
     */
    public MetaThisExpression createMetaThisExpression() {
		return this.createMetaThisExpression(null);
	}
    /**
     * Creates a new instance of MetaThisExpression.
     */
    public MetaThisExpression createMetaThisExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaThisExpression result = new metadslx.core.MetaThisExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNullExpression.
     */
    public MetaNullExpression createMetaNullExpression() {
		return this.createMetaNullExpression(null);
	}
    /**
     * Creates a new instance of MetaNullExpression.
     */
    public MetaNullExpression createMetaNullExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNullExpression result = new metadslx.core.MetaNullExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaTypeAsExpression.
     */
    public MetaTypeAsExpression createMetaTypeAsExpression() {
		return this.createMetaTypeAsExpression(null);
	}
    /**
     * Creates a new instance of MetaTypeAsExpression.
     */
    public MetaTypeAsExpression createMetaTypeAsExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaTypeAsExpression result = new metadslx.core.MetaTypeAsExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaTypeCastExpression.
     */
    public MetaTypeCastExpression createMetaTypeCastExpression() {
		return this.createMetaTypeCastExpression(null);
	}
    /**
     * Creates a new instance of MetaTypeCastExpression.
     */
    public MetaTypeCastExpression createMetaTypeCastExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaTypeCastExpression result = new metadslx.core.MetaTypeCastExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaTypeCheckExpression.
     */
    public MetaTypeCheckExpression createMetaTypeCheckExpression() {
		return this.createMetaTypeCheckExpression(null);
	}
    /**
     * Creates a new instance of MetaTypeCheckExpression.
     */
    public MetaTypeCheckExpression createMetaTypeCheckExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaTypeCheckExpression result = new metadslx.core.MetaTypeCheckExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaTypeOfExpression.
     */
    public MetaTypeOfExpression createMetaTypeOfExpression() {
		return this.createMetaTypeOfExpression(null);
	}
    /**
     * Creates a new instance of MetaTypeOfExpression.
     */
    public MetaTypeOfExpression createMetaTypeOfExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaTypeOfExpression result = new metadslx.core.MetaTypeOfExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaConditionalExpression.
     */
    public MetaConditionalExpression createMetaConditionalExpression() {
		return this.createMetaConditionalExpression(null);
	}
    /**
     * Creates a new instance of MetaConditionalExpression.
     */
    public MetaConditionalExpression createMetaConditionalExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaConditionalExpression result = new metadslx.core.MetaConditionalExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaConstantExpression.
     */
    public MetaConstantExpression createMetaConstantExpression() {
		return this.createMetaConstantExpression(null);
	}
    /**
     * Creates a new instance of MetaConstantExpression.
     */
    public MetaConstantExpression createMetaConstantExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaConstantExpression result = new metadslx.core.MetaConstantExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaIdentifierExpression.
     */
    public MetaIdentifierExpression createMetaIdentifierExpression() {
		return this.createMetaIdentifierExpression(null);
	}
    /**
     * Creates a new instance of MetaIdentifierExpression.
     */
    public MetaIdentifierExpression createMetaIdentifierExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaIdentifierExpression result = new metadslx.core.MetaIdentifierExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaMemberAccessExpression.
     */
    public MetaMemberAccessExpression createMetaMemberAccessExpression() {
		return this.createMetaMemberAccessExpression(null);
	}
    /**
     * Creates a new instance of MetaMemberAccessExpression.
     */
    public MetaMemberAccessExpression createMetaMemberAccessExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaMemberAccessExpression result = new metadslx.core.MetaMemberAccessExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaFunctionCallExpression.
     */
    public MetaFunctionCallExpression createMetaFunctionCallExpression() {
		return this.createMetaFunctionCallExpression(null);
	}
    /**
     * Creates a new instance of MetaFunctionCallExpression.
     */
    public MetaFunctionCallExpression createMetaFunctionCallExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaFunctionCallExpression result = new metadslx.core.MetaFunctionCallExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaIndexerExpression.
     */
    public MetaIndexerExpression createMetaIndexerExpression() {
		return this.createMetaIndexerExpression(null);
	}
    /**
     * Creates a new instance of MetaIndexerExpression.
     */
    public MetaIndexerExpression createMetaIndexerExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaIndexerExpression result = new metadslx.core.MetaIndexerExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNewExpression.
     */
    public MetaNewExpression createMetaNewExpression() {
		return this.createMetaNewExpression(null);
	}
    /**
     * Creates a new instance of MetaNewExpression.
     */
    public MetaNewExpression createMetaNewExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNewExpression result = new metadslx.core.MetaNewExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNewPropertyInitializer.
     */
    public MetaNewPropertyInitializer createMetaNewPropertyInitializer() {
		return this.createMetaNewPropertyInitializer(null);
	}
    /**
     * Creates a new instance of MetaNewPropertyInitializer.
     */
    public MetaNewPropertyInitializer createMetaNewPropertyInitializer(Iterable<ModelPropertyInitializer> initializers) {
		MetaNewPropertyInitializer result = new metadslx.core.MetaNewPropertyInitializerImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNewCollectionExpression.
     */
    public MetaNewCollectionExpression createMetaNewCollectionExpression() {
		return this.createMetaNewCollectionExpression(null);
	}
    /**
     * Creates a new instance of MetaNewCollectionExpression.
     */
    public MetaNewCollectionExpression createMetaNewCollectionExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNewCollectionExpression result = new metadslx.core.MetaNewCollectionExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaUnaryPlusExpression.
     */
    public MetaUnaryPlusExpression createMetaUnaryPlusExpression() {
		return this.createMetaUnaryPlusExpression(null);
	}
    /**
     * Creates a new instance of MetaUnaryPlusExpression.
     */
    public MetaUnaryPlusExpression createMetaUnaryPlusExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaUnaryPlusExpression result = new metadslx.core.MetaUnaryPlusExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNegateExpression.
     */
    public MetaNegateExpression createMetaNegateExpression() {
		return this.createMetaNegateExpression(null);
	}
    /**
     * Creates a new instance of MetaNegateExpression.
     */
    public MetaNegateExpression createMetaNegateExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNegateExpression result = new metadslx.core.MetaNegateExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaOnesComplementExpression.
     */
    public MetaOnesComplementExpression createMetaOnesComplementExpression() {
		return this.createMetaOnesComplementExpression(null);
	}
    /**
     * Creates a new instance of MetaOnesComplementExpression.
     */
    public MetaOnesComplementExpression createMetaOnesComplementExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaOnesComplementExpression result = new metadslx.core.MetaOnesComplementExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNotExpression.
     */
    public MetaNotExpression createMetaNotExpression() {
		return this.createMetaNotExpression(null);
	}
    /**
     * Creates a new instance of MetaNotExpression.
     */
    public MetaNotExpression createMetaNotExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNotExpression result = new metadslx.core.MetaNotExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaPostIncrementAssignExpression.
     */
    public MetaPostIncrementAssignExpression createMetaPostIncrementAssignExpression() {
		return this.createMetaPostIncrementAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaPostIncrementAssignExpression.
     */
    public MetaPostIncrementAssignExpression createMetaPostIncrementAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaPostIncrementAssignExpression result = new metadslx.core.MetaPostIncrementAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaPostDecrementAssignExpression.
     */
    public MetaPostDecrementAssignExpression createMetaPostDecrementAssignExpression() {
		return this.createMetaPostDecrementAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaPostDecrementAssignExpression.
     */
    public MetaPostDecrementAssignExpression createMetaPostDecrementAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaPostDecrementAssignExpression result = new metadslx.core.MetaPostDecrementAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaPreIncrementAssignExpression.
     */
    public MetaPreIncrementAssignExpression createMetaPreIncrementAssignExpression() {
		return this.createMetaPreIncrementAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaPreIncrementAssignExpression.
     */
    public MetaPreIncrementAssignExpression createMetaPreIncrementAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaPreIncrementAssignExpression result = new metadslx.core.MetaPreIncrementAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaPreDecrementAssignExpression.
     */
    public MetaPreDecrementAssignExpression createMetaPreDecrementAssignExpression() {
		return this.createMetaPreDecrementAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaPreDecrementAssignExpression.
     */
    public MetaPreDecrementAssignExpression createMetaPreDecrementAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaPreDecrementAssignExpression result = new metadslx.core.MetaPreDecrementAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaMultiplyExpression.
     */
    public MetaMultiplyExpression createMetaMultiplyExpression() {
		return this.createMetaMultiplyExpression(null);
	}
    /**
     * Creates a new instance of MetaMultiplyExpression.
     */
    public MetaMultiplyExpression createMetaMultiplyExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaMultiplyExpression result = new metadslx.core.MetaMultiplyExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaDivideExpression.
     */
    public MetaDivideExpression createMetaDivideExpression() {
		return this.createMetaDivideExpression(null);
	}
    /**
     * Creates a new instance of MetaDivideExpression.
     */
    public MetaDivideExpression createMetaDivideExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaDivideExpression result = new metadslx.core.MetaDivideExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaModuloExpression.
     */
    public MetaModuloExpression createMetaModuloExpression() {
		return this.createMetaModuloExpression(null);
	}
    /**
     * Creates a new instance of MetaModuloExpression.
     */
    public MetaModuloExpression createMetaModuloExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaModuloExpression result = new metadslx.core.MetaModuloExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAddExpression.
     */
    public MetaAddExpression createMetaAddExpression() {
		return this.createMetaAddExpression(null);
	}
    /**
     * Creates a new instance of MetaAddExpression.
     */
    public MetaAddExpression createMetaAddExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaAddExpression result = new metadslx.core.MetaAddExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaSubtractExpression.
     */
    public MetaSubtractExpression createMetaSubtractExpression() {
		return this.createMetaSubtractExpression(null);
	}
    /**
     * Creates a new instance of MetaSubtractExpression.
     */
    public MetaSubtractExpression createMetaSubtractExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaSubtractExpression result = new metadslx.core.MetaSubtractExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaLeftShiftExpression.
     */
    public MetaLeftShiftExpression createMetaLeftShiftExpression() {
		return this.createMetaLeftShiftExpression(null);
	}
    /**
     * Creates a new instance of MetaLeftShiftExpression.
     */
    public MetaLeftShiftExpression createMetaLeftShiftExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaLeftShiftExpression result = new metadslx.core.MetaLeftShiftExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaRightShiftExpression.
     */
    public MetaRightShiftExpression createMetaRightShiftExpression() {
		return this.createMetaRightShiftExpression(null);
	}
    /**
     * Creates a new instance of MetaRightShiftExpression.
     */
    public MetaRightShiftExpression createMetaRightShiftExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaRightShiftExpression result = new metadslx.core.MetaRightShiftExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaLessThanExpression.
     */
    public MetaLessThanExpression createMetaLessThanExpression() {
		return this.createMetaLessThanExpression(null);
	}
    /**
     * Creates a new instance of MetaLessThanExpression.
     */
    public MetaLessThanExpression createMetaLessThanExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaLessThanExpression result = new metadslx.core.MetaLessThanExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaLessThanOrEqualExpression.
     */
    public MetaLessThanOrEqualExpression createMetaLessThanOrEqualExpression() {
		return this.createMetaLessThanOrEqualExpression(null);
	}
    /**
     * Creates a new instance of MetaLessThanOrEqualExpression.
     */
    public MetaLessThanOrEqualExpression createMetaLessThanOrEqualExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaLessThanOrEqualExpression result = new metadslx.core.MetaLessThanOrEqualExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaGreaterThanExpression.
     */
    public MetaGreaterThanExpression createMetaGreaterThanExpression() {
		return this.createMetaGreaterThanExpression(null);
	}
    /**
     * Creates a new instance of MetaGreaterThanExpression.
     */
    public MetaGreaterThanExpression createMetaGreaterThanExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaGreaterThanExpression result = new metadslx.core.MetaGreaterThanExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaGreaterThanOrEqualExpression.
     */
    public MetaGreaterThanOrEqualExpression createMetaGreaterThanOrEqualExpression() {
		return this.createMetaGreaterThanOrEqualExpression(null);
	}
    /**
     * Creates a new instance of MetaGreaterThanOrEqualExpression.
     */
    public MetaGreaterThanOrEqualExpression createMetaGreaterThanOrEqualExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaGreaterThanOrEqualExpression result = new metadslx.core.MetaGreaterThanOrEqualExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaEqualExpression.
     */
    public MetaEqualExpression createMetaEqualExpression() {
		return this.createMetaEqualExpression(null);
	}
    /**
     * Creates a new instance of MetaEqualExpression.
     */
    public MetaEqualExpression createMetaEqualExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaEqualExpression result = new metadslx.core.MetaEqualExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNotEqualExpression.
     */
    public MetaNotEqualExpression createMetaNotEqualExpression() {
		return this.createMetaNotEqualExpression(null);
	}
    /**
     * Creates a new instance of MetaNotEqualExpression.
     */
    public MetaNotEqualExpression createMetaNotEqualExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNotEqualExpression result = new metadslx.core.MetaNotEqualExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAndExpression.
     */
    public MetaAndExpression createMetaAndExpression() {
		return this.createMetaAndExpression(null);
	}
    /**
     * Creates a new instance of MetaAndExpression.
     */
    public MetaAndExpression createMetaAndExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaAndExpression result = new metadslx.core.MetaAndExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaOrExpression.
     */
    public MetaOrExpression createMetaOrExpression() {
		return this.createMetaOrExpression(null);
	}
    /**
     * Creates a new instance of MetaOrExpression.
     */
    public MetaOrExpression createMetaOrExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaOrExpression result = new metadslx.core.MetaOrExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaExclusiveOrExpression.
     */
    public MetaExclusiveOrExpression createMetaExclusiveOrExpression() {
		return this.createMetaExclusiveOrExpression(null);
	}
    /**
     * Creates a new instance of MetaExclusiveOrExpression.
     */
    public MetaExclusiveOrExpression createMetaExclusiveOrExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaExclusiveOrExpression result = new metadslx.core.MetaExclusiveOrExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAndAlsoExpression.
     */
    public MetaAndAlsoExpression createMetaAndAlsoExpression() {
		return this.createMetaAndAlsoExpression(null);
	}
    /**
     * Creates a new instance of MetaAndAlsoExpression.
     */
    public MetaAndAlsoExpression createMetaAndAlsoExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaAndAlsoExpression result = new metadslx.core.MetaAndAlsoExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaOrElseExpression.
     */
    public MetaOrElseExpression createMetaOrElseExpression() {
		return this.createMetaOrElseExpression(null);
	}
    /**
     * Creates a new instance of MetaOrElseExpression.
     */
    public MetaOrElseExpression createMetaOrElseExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaOrElseExpression result = new metadslx.core.MetaOrElseExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaNullCoalescingExpression.
     */
    public MetaNullCoalescingExpression createMetaNullCoalescingExpression() {
		return this.createMetaNullCoalescingExpression(null);
	}
    /**
     * Creates a new instance of MetaNullCoalescingExpression.
     */
    public MetaNullCoalescingExpression createMetaNullCoalescingExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaNullCoalescingExpression result = new metadslx.core.MetaNullCoalescingExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAssignExpression.
     */
    public MetaAssignExpression createMetaAssignExpression() {
		return this.createMetaAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaAssignExpression.
     */
    public MetaAssignExpression createMetaAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaAssignExpression result = new metadslx.core.MetaAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaMultiplyAssignExpression.
     */
    public MetaMultiplyAssignExpression createMetaMultiplyAssignExpression() {
		return this.createMetaMultiplyAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaMultiplyAssignExpression.
     */
    public MetaMultiplyAssignExpression createMetaMultiplyAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaMultiplyAssignExpression result = new metadslx.core.MetaMultiplyAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaDivideAssignExpression.
     */
    public MetaDivideAssignExpression createMetaDivideAssignExpression() {
		return this.createMetaDivideAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaDivideAssignExpression.
     */
    public MetaDivideAssignExpression createMetaDivideAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaDivideAssignExpression result = new metadslx.core.MetaDivideAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaModuloAssignExpression.
     */
    public MetaModuloAssignExpression createMetaModuloAssignExpression() {
		return this.createMetaModuloAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaModuloAssignExpression.
     */
    public MetaModuloAssignExpression createMetaModuloAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaModuloAssignExpression result = new metadslx.core.MetaModuloAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAddAssignExpression.
     */
    public MetaAddAssignExpression createMetaAddAssignExpression() {
		return this.createMetaAddAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaAddAssignExpression.
     */
    public MetaAddAssignExpression createMetaAddAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaAddAssignExpression result = new metadslx.core.MetaAddAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaSubtractAssignExpression.
     */
    public MetaSubtractAssignExpression createMetaSubtractAssignExpression() {
		return this.createMetaSubtractAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaSubtractAssignExpression.
     */
    public MetaSubtractAssignExpression createMetaSubtractAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaSubtractAssignExpression result = new metadslx.core.MetaSubtractAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaLeftShiftAssignExpression.
     */
    public MetaLeftShiftAssignExpression createMetaLeftShiftAssignExpression() {
		return this.createMetaLeftShiftAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaLeftShiftAssignExpression.
     */
    public MetaLeftShiftAssignExpression createMetaLeftShiftAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaLeftShiftAssignExpression result = new metadslx.core.MetaLeftShiftAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaRightShiftAssignExpression.
     */
    public MetaRightShiftAssignExpression createMetaRightShiftAssignExpression() {
		return this.createMetaRightShiftAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaRightShiftAssignExpression.
     */
    public MetaRightShiftAssignExpression createMetaRightShiftAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaRightShiftAssignExpression result = new metadslx.core.MetaRightShiftAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaAndAssignExpression.
     */
    public MetaAndAssignExpression createMetaAndAssignExpression() {
		return this.createMetaAndAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaAndAssignExpression.
     */
    public MetaAndAssignExpression createMetaAndAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaAndAssignExpression result = new metadslx.core.MetaAndAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaExclusiveOrAssignExpression.
     */
    public MetaExclusiveOrAssignExpression createMetaExclusiveOrAssignExpression() {
		return this.createMetaExclusiveOrAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaExclusiveOrAssignExpression.
     */
    public MetaExclusiveOrAssignExpression createMetaExclusiveOrAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaExclusiveOrAssignExpression result = new metadslx.core.MetaExclusiveOrAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}

    /**
     * Creates a new instance of MetaOrAssignExpression.
     */
    public MetaOrAssignExpression createMetaOrAssignExpression() {
		return this.createMetaOrAssignExpression(null);
	}
    /**
     * Creates a new instance of MetaOrAssignExpression.
     */
    public MetaOrAssignExpression createMetaOrAssignExpression(Iterable<ModelPropertyInitializer> initializers) {
		MetaOrAssignExpression result = new metadslx.core.MetaOrAssignExpressionImpl();
		if (initializers != null) {
			this.init((ModelObject)result, initializers);
		}
		return result;
	}
}


