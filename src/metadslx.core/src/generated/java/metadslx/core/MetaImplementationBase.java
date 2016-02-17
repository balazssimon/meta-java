package metadslx.core;

/**
 * Base class for implementing the behavior of the model elements.
 * This class has to be be overriden in MetaImplementation to provide custom
 * implementation for the constructors, operations and property values.
 */
abstract class MetaImplementationBase {
    /**
	 * Implements the constructor: MetaAnnotatedElement()
    */
    public void MetaAnnotatedElement(MetaAnnotatedElement _this) {
    }

    /**
	 * Implements the constructor: MetaDocumentedElement()
    */
    public void MetaDocumentedElement(MetaDocumentedElement _this) {
    }

    /**
     * Implements the operation: MetaDocumentedElement.GetDocumentationLines()
     */
    public java.util.List<String> MetaDocumentedElement_getDocumentationLines(metadslx.core.MetaDocumentedElement _this) {
        throw new UnsupportedOperationException();
    }

    /**
	 * Implements the constructor: MetaNamedElement()
	 * Direct superclasses: metadslx.core.MetaDocumentedElement
	 * All superclasses: metadslx.core.MetaDocumentedElement
    */
    public void MetaNamedElement(MetaNamedElement _this) {
        this.MetaDocumentedElement(_this);
    }

    /**
	 * Implements the constructor: MetaTypedElement()
    */
    public void MetaTypedElement(MetaTypedElement _this) {
    }

    /**
	 * Implements the constructor: MetaType()
    */
    public void MetaType(MetaType _this) {
    }

    /**
	 * Implements the constructor: MetaAnnotation()
	 * Direct superclasses: metadslx.core.MetaNamedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement
    */
    public void MetaAnnotation(MetaAnnotation _this) {
        this.MetaNamedElement(_this);
    }

    /**
	 * Implements the constructor: MetaAnnotationProperty()
	 * Direct superclasses: metadslx.core.MetaNamedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement
    */
    public void MetaAnnotationProperty(MetaAnnotationProperty _this) {
        this.MetaNamedElement(_this);
    }

    /**
	 * Implements the constructor: MetaNamespace()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaNamespace(MetaNamespace _this) {
        this.MetaNamedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaDeclaration()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaDeclaration(MetaDeclaration _this) {
        this.MetaNamedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaModel()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaModel(MetaModel _this) {
        this.MetaNamedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaCollectionType()
	 * Direct superclasses: metadslx.core.MetaType
	 * All superclasses: metadslx.core.MetaType
    */
    public void MetaCollectionType(MetaCollectionType _this) {
        this.MetaType(_this);
    }

    /**
	 * Implements the constructor: MetaNullableType()
	 * Direct superclasses: metadslx.core.MetaType
	 * All superclasses: metadslx.core.MetaType
    */
    public void MetaNullableType(MetaNullableType _this) {
        this.MetaType(_this);
    }

    /**
	 * Implements the constructor: MetaPrimitiveType()
	 * Direct superclasses: metadslx.core.MetaType, metadslx.core.MetaNamedElement
	 * All superclasses: metadslx.core.MetaType, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement
    */
    public void MetaPrimitiveType(MetaPrimitiveType _this) {
        this.MetaType(_this);
        this.MetaNamedElement(_this);
    }

    /**
	 * Implements the constructor: MetaEnum()
	 * Direct superclasses: metadslx.core.MetaType, metadslx.core.MetaDeclaration
	 * All superclasses: metadslx.core.MetaType, metadslx.core.MetaDeclaration, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaEnum(MetaEnum _this) {
        this.MetaType(_this);
        this.MetaDeclaration(_this);
    }

    /**
	 * Implements the constructor: MetaEnumLiteral()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaTypedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaTypedElement
    */
    public void MetaEnumLiteral(MetaEnumLiteral _this) {
        this.MetaNamedElement(_this);
        this.MetaTypedElement(_this);
    }

    /**
	 * Implements the constructor: MetaClass()
	 * Direct superclasses: metadslx.core.MetaType, metadslx.core.MetaDeclaration
	 * All superclasses: metadslx.core.MetaType, metadslx.core.MetaDeclaration, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaClass(MetaClass _this) {
        this.MetaType(_this);
        this.MetaDeclaration(_this);
    }

    /**
     * Implements the operation: MetaClass.GetAllSuperClasses()
     */
    public java.util.List<metadslx.core.MetaClass> MetaClass_getAllSuperClasses(metadslx.core.MetaClass _this) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: MetaClass.GetAllProperties()
     */
    public java.util.List<metadslx.core.MetaProperty> MetaClass_getAllProperties(metadslx.core.MetaClass _this) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: MetaClass.GetAllOperations()
     */
    public java.util.List<metadslx.core.MetaOperation> MetaClass_getAllOperations(metadslx.core.MetaClass _this) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: MetaClass.GetAllImplementedProperties()
     */
    public java.util.List<metadslx.core.MetaProperty> MetaClass_getAllImplementedProperties(metadslx.core.MetaClass _this) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the operation: MetaClass.GetAllImplementedOperations()
     */
    public java.util.List<metadslx.core.MetaOperation> MetaClass_getAllImplementedOperations(metadslx.core.MetaClass _this) {
        throw new UnsupportedOperationException();
    }

    /**
	 * Implements the constructor: MetaFunctionType()
	 * Direct superclasses: metadslx.core.MetaType
	 * All superclasses: metadslx.core.MetaType
    */
    public void MetaFunctionType(MetaFunctionType _this) {
        this.MetaType(_this);
    }

    /**
	 * Implements the constructor: MetaFunction()
	 * Direct superclasses: metadslx.core.MetaTypedElement, metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaTypedElement, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
     * Initializes the following readonly properties:
     *    MetaFunction.Type
    */
    public void MetaFunction(MetaFunction _this) {
        this.MetaTypedElement(_this);
        this.MetaNamedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaGlobalFunction()
	 * Direct superclasses: metadslx.core.MetaFunction, metadslx.core.MetaDeclaration
	 * All superclasses: metadslx.core.MetaFunction, metadslx.core.MetaTypedElement, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement, metadslx.core.MetaDeclaration
     * Initializes the following readonly properties:
     *    MetaFunction.Type
    */
    public void MetaGlobalFunction(MetaGlobalFunction _this) {
        this.MetaFunction(_this);
        this.MetaDeclaration(_this);
    }

    /**
	 * Implements the constructor: MetaOperation()
	 * Direct superclasses: metadslx.core.MetaFunction
	 * All superclasses: metadslx.core.MetaFunction, metadslx.core.MetaTypedElement, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
     * Initializes the following readonly properties:
     *    MetaFunction.Type
    */
    public void MetaOperation(MetaOperation _this) {
        this.MetaFunction(_this);
    }

    /**
	 * Implements the constructor: MetaConstant()
	 * Direct superclasses: metadslx.core.MetaTypedElement, metadslx.core.MetaDeclaration
	 * All superclasses: metadslx.core.MetaTypedElement, metadslx.core.MetaDeclaration, metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaConstant(MetaConstant _this) {
        this.MetaTypedElement(_this);
        this.MetaDeclaration(_this);
    }

    /**
	 * Implements the constructor: MetaConstructor()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaConstructor(MetaConstructor _this) {
        this.MetaNamedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaParameter()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaTypedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaTypedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaParameter(MetaParameter _this) {
        this.MetaNamedElement(_this);
        this.MetaTypedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaProperty()
	 * Direct superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaTypedElement, metadslx.core.MetaAnnotatedElement
	 * All superclasses: metadslx.core.MetaNamedElement, metadslx.core.MetaDocumentedElement, metadslx.core.MetaTypedElement, metadslx.core.MetaAnnotatedElement
    */
    public void MetaProperty(MetaProperty _this) {
        this.MetaNamedElement(_this);
        this.MetaTypedElement(_this);
        this.MetaAnnotatedElement(_this);
    }

    /**
	 * Implements the constructor: MetaPropertyInitializer()
    */
    public void MetaPropertyInitializer(MetaPropertyInitializer _this) {
    }

    /**
	 * Implements the constructor: MetaSynthetizedPropertyInitializer()
	 * Direct superclasses: metadslx.core.MetaPropertyInitializer
	 * All superclasses: metadslx.core.MetaPropertyInitializer
    */
    public void MetaSynthetizedPropertyInitializer(MetaSynthetizedPropertyInitializer _this) {
        this.MetaPropertyInitializer(_this);
    }

    /**
	 * Implements the constructor: MetaInheritedPropertyInitializer()
	 * Direct superclasses: metadslx.core.MetaPropertyInitializer
	 * All superclasses: metadslx.core.MetaPropertyInitializer
    */
    public void MetaInheritedPropertyInitializer(MetaInheritedPropertyInitializer _this) {
        this.MetaPropertyInitializer(_this);
    }

    /**
	 * Implements the constructor: MetaExpression()
	 * Direct superclasses: metadslx.core.MetaTypedElement
	 * All superclasses: metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaExpression(MetaExpression _this) {
        this.MetaTypedElement(_this);
    }

    /**
	 * Implements the constructor: MetaBracketExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaBracketExpression(MetaBracketExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaBoundExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaBoundExpression(MetaBoundExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaThisExpression()
	 * Direct superclasses: metadslx.core.MetaBoundExpression
	 * All superclasses: metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaThisExpression(MetaThisExpression _this) {
        this.MetaBoundExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNullExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaNullExpression(MetaNullExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaTypeConversionExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaTypeConversionExpression(MetaTypeConversionExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaTypeAsExpression()
	 * Direct superclasses: metadslx.core.MetaTypeConversionExpression
	 * All superclasses: metadslx.core.MetaTypeConversionExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaTypeAsExpression(MetaTypeAsExpression _this) {
        this.MetaTypeConversionExpression(_this);
    }

    /**
	 * Implements the constructor: MetaTypeCastExpression()
	 * Direct superclasses: metadslx.core.MetaTypeConversionExpression
	 * All superclasses: metadslx.core.MetaTypeConversionExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaTypeCastExpression(MetaTypeCastExpression _this) {
        this.MetaTypeConversionExpression(_this);
    }

    /**
	 * Implements the constructor: MetaTypeCheckExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaTypeCheckExpression(MetaTypeCheckExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaTypeOfExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaTypeOfExpression(MetaTypeOfExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaConditionalExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaConditionalExpression(MetaConditionalExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaConstantExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaConstantExpression(MetaConstantExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaIdentifierExpression()
	 * Direct superclasses: metadslx.core.MetaBoundExpression
	 * All superclasses: metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaIdentifierExpression(MetaIdentifierExpression _this) {
        this.MetaBoundExpression(_this);
    }

    /**
	 * Implements the constructor: MetaMemberAccessExpression()
	 * Direct superclasses: metadslx.core.MetaBoundExpression
	 * All superclasses: metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaMemberAccessExpression(MetaMemberAccessExpression _this) {
        this.MetaBoundExpression(_this);
    }

    /**
	 * Implements the constructor: MetaFunctionCallExpression()
	 * Direct superclasses: metadslx.core.MetaBoundExpression
	 * All superclasses: metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaFunctionCallExpression(MetaFunctionCallExpression _this) {
        this.MetaBoundExpression(_this);
    }

    /**
	 * Implements the constructor: MetaIndexerExpression()
	 * Direct superclasses: metadslx.core.MetaBoundExpression
	 * All superclasses: metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaIndexerExpression(MetaIndexerExpression _this) {
        this.MetaBoundExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNewExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaNewExpression(MetaNewExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNewPropertyInitializer()
    */
    public void MetaNewPropertyInitializer(MetaNewPropertyInitializer _this) {
    }

    /**
	 * Implements the constructor: MetaNewCollectionExpression()
	 * Direct superclasses: metadslx.core.MetaExpression
	 * All superclasses: metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaExpression.NoTypeError
    */
    public void MetaNewCollectionExpression(MetaNewCollectionExpression _this) {
        this.MetaExpression(_this);
    }

    /**
	 * Implements the constructor: MetaOperatorExpression()
	 * Direct superclasses: metadslx.core.MetaBoundExpression
	 * All superclasses: metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaOperatorExpression(MetaOperatorExpression _this) {
        this.MetaBoundExpression(_this);
    }

    /**
	 * Implements the constructor: MetaUnaryExpression()
	 * Direct superclasses: metadslx.core.MetaOperatorExpression
	 * All superclasses: metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaUnaryExpression(MetaUnaryExpression _this) {
        this.MetaOperatorExpression(_this);
    }

    /**
	 * Implements the constructor: MetaUnaryPlusExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryExpression
	 * All superclasses: metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaUnaryPlusExpression(MetaUnaryPlusExpression _this) {
        this.MetaUnaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNegateExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryExpression
	 * All superclasses: metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaNegateExpression(MetaNegateExpression _this) {
        this.MetaUnaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaOnesComplementExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryExpression
	 * All superclasses: metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaOnesComplementExpression(MetaOnesComplementExpression _this) {
        this.MetaUnaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNotExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryExpression
	 * All superclasses: metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaNotExpression(MetaNotExpression _this) {
        this.MetaUnaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaUnaryAssignExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryExpression
	 * All superclasses: metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaUnaryAssignExpression(MetaUnaryAssignExpression _this) {
        this.MetaUnaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaPostIncrementAssignExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryAssignExpression
	 * All superclasses: metadslx.core.MetaUnaryAssignExpression, metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaPostIncrementAssignExpression(MetaPostIncrementAssignExpression _this) {
        this.MetaUnaryAssignExpression(_this);
    }

    /**
	 * Implements the constructor: MetaPostDecrementAssignExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryAssignExpression
	 * All superclasses: metadslx.core.MetaUnaryAssignExpression, metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaPostDecrementAssignExpression(MetaPostDecrementAssignExpression _this) {
        this.MetaUnaryAssignExpression(_this);
    }

    /**
	 * Implements the constructor: MetaPreIncrementAssignExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryAssignExpression
	 * All superclasses: metadslx.core.MetaUnaryAssignExpression, metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaPreIncrementAssignExpression(MetaPreIncrementAssignExpression _this) {
        this.MetaUnaryAssignExpression(_this);
    }

    /**
	 * Implements the constructor: MetaPreDecrementAssignExpression()
	 * Direct superclasses: metadslx.core.MetaUnaryAssignExpression
	 * All superclasses: metadslx.core.MetaUnaryAssignExpression, metadslx.core.MetaUnaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaPreDecrementAssignExpression(MetaPreDecrementAssignExpression _this) {
        this.MetaUnaryAssignExpression(_this);
    }

    /**
	 * Implements the constructor: MetaBinaryExpression()
	 * Direct superclasses: metadslx.core.MetaOperatorExpression
	 * All superclasses: metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaBinaryExpression(MetaBinaryExpression _this) {
        this.MetaOperatorExpression(_this);
    }

    /**
	 * Implements the constructor: MetaBinaryArithmeticExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryExpression
	 * All superclasses: metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaBinaryArithmeticExpression(MetaBinaryArithmeticExpression _this) {
        this.MetaBinaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaMultiplyExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaMultiplyExpression(MetaMultiplyExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaDivideExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaDivideExpression(MetaDivideExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaModuloExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaModuloExpression(MetaModuloExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAddExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAddExpression(MetaAddExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaSubtractExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaSubtractExpression(MetaSubtractExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaLeftShiftExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaLeftShiftExpression(MetaLeftShiftExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaRightShiftExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryArithmeticExpression
	 * All superclasses: metadslx.core.MetaBinaryArithmeticExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaRightShiftExpression(MetaRightShiftExpression _this) {
        this.MetaBinaryArithmeticExpression(_this);
    }

    /**
	 * Implements the constructor: MetaBinaryComparisonExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryExpression
	 * All superclasses: metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaBinaryComparisonExpression(MetaBinaryComparisonExpression _this) {
        this.MetaBinaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaLessThanExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryComparisonExpression
	 * All superclasses: metadslx.core.MetaBinaryComparisonExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaLessThanExpression(MetaLessThanExpression _this) {
        this.MetaBinaryComparisonExpression(_this);
    }

    /**
	 * Implements the constructor: MetaLessThanOrEqualExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryComparisonExpression
	 * All superclasses: metadslx.core.MetaBinaryComparisonExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaLessThanOrEqualExpression(MetaLessThanOrEqualExpression _this) {
        this.MetaBinaryComparisonExpression(_this);
    }

    /**
	 * Implements the constructor: MetaGreaterThanExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryComparisonExpression
	 * All superclasses: metadslx.core.MetaBinaryComparisonExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaGreaterThanExpression(MetaGreaterThanExpression _this) {
        this.MetaBinaryComparisonExpression(_this);
    }

    /**
	 * Implements the constructor: MetaGreaterThanOrEqualExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryComparisonExpression
	 * All superclasses: metadslx.core.MetaBinaryComparisonExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaGreaterThanOrEqualExpression(MetaGreaterThanOrEqualExpression _this) {
        this.MetaBinaryComparisonExpression(_this);
    }

    /**
	 * Implements the constructor: MetaEqualExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryComparisonExpression
	 * All superclasses: metadslx.core.MetaBinaryComparisonExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaEqualExpression(MetaEqualExpression _this) {
        this.MetaBinaryComparisonExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNotEqualExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryComparisonExpression
	 * All superclasses: metadslx.core.MetaBinaryComparisonExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaNotEqualExpression(MetaNotEqualExpression _this) {
        this.MetaBinaryComparisonExpression(_this);
    }

    /**
	 * Implements the constructor: MetaBinaryLogicalExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryExpression
	 * All superclasses: metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaBinaryLogicalExpression(MetaBinaryLogicalExpression _this) {
        this.MetaBinaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAndExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryLogicalExpression
	 * All superclasses: metadslx.core.MetaBinaryLogicalExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAndExpression(MetaAndExpression _this) {
        this.MetaBinaryLogicalExpression(_this);
    }

    /**
	 * Implements the constructor: MetaOrExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryLogicalExpression
	 * All superclasses: metadslx.core.MetaBinaryLogicalExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaOrExpression(MetaOrExpression _this) {
        this.MetaBinaryLogicalExpression(_this);
    }

    /**
	 * Implements the constructor: MetaExclusiveOrExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryLogicalExpression
	 * All superclasses: metadslx.core.MetaBinaryLogicalExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaExclusiveOrExpression(MetaExclusiveOrExpression _this) {
        this.MetaBinaryLogicalExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAndAlsoExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryLogicalExpression
	 * All superclasses: metadslx.core.MetaBinaryLogicalExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAndAlsoExpression(MetaAndAlsoExpression _this) {
        this.MetaBinaryLogicalExpression(_this);
    }

    /**
	 * Implements the constructor: MetaOrElseExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryLogicalExpression
	 * All superclasses: metadslx.core.MetaBinaryLogicalExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaOrElseExpression(MetaOrElseExpression _this) {
        this.MetaBinaryLogicalExpression(_this);
    }

    /**
	 * Implements the constructor: MetaNullCoalescingExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryExpression
	 * All superclasses: metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaNullCoalescingExpression(MetaNullCoalescingExpression _this) {
        this.MetaBinaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAssignmentExpression()
	 * Direct superclasses: metadslx.core.MetaBinaryExpression
	 * All superclasses: metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAssignmentExpression(MetaAssignmentExpression _this) {
        this.MetaBinaryExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAssignExpression()
	 * Direct superclasses: metadslx.core.MetaAssignmentExpression
	 * All superclasses: metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAssignExpression(MetaAssignExpression _this) {
        this.MetaAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaArithmeticAssignmentExpression()
	 * Direct superclasses: metadslx.core.MetaAssignmentExpression
	 * All superclasses: metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaArithmeticAssignmentExpression(MetaArithmeticAssignmentExpression _this) {
        this.MetaAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaMultiplyAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaMultiplyAssignExpression(MetaMultiplyAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaDivideAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaDivideAssignExpression(MetaDivideAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaModuloAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaModuloAssignExpression(MetaModuloAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAddAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAddAssignExpression(MetaAddAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaSubtractAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaSubtractAssignExpression(MetaSubtractAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaLeftShiftAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaLeftShiftAssignExpression(MetaLeftShiftAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaRightShiftAssignExpression()
	 * Direct superclasses: metadslx.core.MetaArithmeticAssignmentExpression
	 * All superclasses: metadslx.core.MetaArithmeticAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaRightShiftAssignExpression(MetaRightShiftAssignExpression _this) {
        this.MetaArithmeticAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaLogicalAssignmentExpression()
	 * Direct superclasses: metadslx.core.MetaAssignmentExpression
	 * All superclasses: metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaLogicalAssignmentExpression(MetaLogicalAssignmentExpression _this) {
        this.MetaAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaAndAssignExpression()
	 * Direct superclasses: metadslx.core.MetaLogicalAssignmentExpression
	 * All superclasses: metadslx.core.MetaLogicalAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaAndAssignExpression(MetaAndAssignExpression _this) {
        this.MetaLogicalAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaExclusiveOrAssignExpression()
	 * Direct superclasses: metadslx.core.MetaLogicalAssignmentExpression
	 * All superclasses: metadslx.core.MetaLogicalAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaExclusiveOrAssignExpression(MetaExclusiveOrAssignExpression _this) {
        this.MetaLogicalAssignmentExpression(_this);
    }

    /**
	 * Implements the constructor: MetaOrAssignExpression()
	 * Direct superclasses: metadslx.core.MetaLogicalAssignmentExpression
	 * All superclasses: metadslx.core.MetaLogicalAssignmentExpression, metadslx.core.MetaAssignmentExpression, metadslx.core.MetaBinaryExpression, metadslx.core.MetaOperatorExpression, metadslx.core.MetaBoundExpression, metadslx.core.MetaExpression, metadslx.core.MetaTypedElement
     * Initializes the following readonly properties:
     *    MetaOperatorExpression.Name
     *    MetaExpression.NoTypeError
    */
    public void MetaOrAssignExpression(MetaOrAssignExpression _this) {
        this.MetaLogicalAssignmentExpression(_this);
    }



}


