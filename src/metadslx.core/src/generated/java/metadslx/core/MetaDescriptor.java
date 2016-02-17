package metadslx.core;

public final class MetaDescriptor {
    static {
        MetaAnnotatedElement.staticInit();
        MetaDocumentedElement.staticInit();
        MetaNamedElement.staticInit();
        MetaTypedElement.staticInit();
        MetaType.staticInit();
        MetaAnnotation.staticInit();
        MetaAnnotationProperty.staticInit();
        MetaNamespace.staticInit();
        MetaDeclaration.staticInit();
        MetaModel.staticInit();
        MetaCollectionType.staticInit();
        MetaNullableType.staticInit();
        MetaPrimitiveType.staticInit();
        MetaEnum.staticInit();
        MetaEnumLiteral.staticInit();
        MetaClass.staticInit();
        MetaFunctionType.staticInit();
        MetaFunction.staticInit();
        MetaGlobalFunction.staticInit();
        MetaOperation.staticInit();
        MetaConstant.staticInit();
        MetaConstructor.staticInit();
        MetaParameter.staticInit();
        MetaProperty.staticInit();
        MetaPropertyInitializer.staticInit();
        MetaSynthetizedPropertyInitializer.staticInit();
        MetaInheritedPropertyInitializer.staticInit();
        MetaExpression.staticInit();
        MetaBracketExpression.staticInit();
        MetaBoundExpression.staticInit();
        MetaThisExpression.staticInit();
        MetaNullExpression.staticInit();
        MetaTypeConversionExpression.staticInit();
        MetaTypeAsExpression.staticInit();
        MetaTypeCastExpression.staticInit();
        MetaTypeCheckExpression.staticInit();
        MetaTypeOfExpression.staticInit();
        MetaConditionalExpression.staticInit();
        MetaConstantExpression.staticInit();
        MetaIdentifierExpression.staticInit();
        MetaMemberAccessExpression.staticInit();
        MetaFunctionCallExpression.staticInit();
        MetaIndexerExpression.staticInit();
        MetaNewExpression.staticInit();
        MetaNewPropertyInitializer.staticInit();
        MetaNewCollectionExpression.staticInit();
        MetaOperatorExpression.staticInit();
        MetaUnaryExpression.staticInit();
        MetaUnaryPlusExpression.staticInit();
        MetaNegateExpression.staticInit();
        MetaOnesComplementExpression.staticInit();
        MetaNotExpression.staticInit();
        MetaUnaryAssignExpression.staticInit();
        MetaPostIncrementAssignExpression.staticInit();
        MetaPostDecrementAssignExpression.staticInit();
        MetaPreIncrementAssignExpression.staticInit();
        MetaPreDecrementAssignExpression.staticInit();
        MetaBinaryExpression.staticInit();
        MetaBinaryArithmeticExpression.staticInit();
        MetaMultiplyExpression.staticInit();
        MetaDivideExpression.staticInit();
        MetaModuloExpression.staticInit();
        MetaAddExpression.staticInit();
        MetaSubtractExpression.staticInit();
        MetaLeftShiftExpression.staticInit();
        MetaRightShiftExpression.staticInit();
        MetaBinaryComparisonExpression.staticInit();
        MetaLessThanExpression.staticInit();
        MetaLessThanOrEqualExpression.staticInit();
        MetaGreaterThanExpression.staticInit();
        MetaGreaterThanOrEqualExpression.staticInit();
        MetaEqualExpression.staticInit();
        MetaNotEqualExpression.staticInit();
        MetaBinaryLogicalExpression.staticInit();
        MetaAndExpression.staticInit();
        MetaOrExpression.staticInit();
        MetaExclusiveOrExpression.staticInit();
        MetaAndAlsoExpression.staticInit();
        MetaOrElseExpression.staticInit();
        MetaNullCoalescingExpression.staticInit();
        MetaAssignmentExpression.staticInit();
        MetaAssignExpression.staticInit();
        MetaArithmeticAssignmentExpression.staticInit();
        MetaMultiplyAssignExpression.staticInit();
        MetaDivideAssignExpression.staticInit();
        MetaModuloAssignExpression.staticInit();
        MetaAddAssignExpression.staticInit();
        MetaSubtractAssignExpression.staticInit();
        MetaLeftShiftAssignExpression.staticInit();
        MetaRightShiftAssignExpression.staticInit();
        MetaLogicalAssignmentExpression.staticInit();
        MetaAndAssignExpression.staticInit();
        MetaExclusiveOrAssignExpression.staticInit();
        MetaOrAssignExpression.staticInit();
    }

    static void staticInit() {}

	public static final String Uri = "http://metadslx.core/1.0";

    
    public static final class MetaAnnotatedElement {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAnnotatedElement; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty AnnotationsProperty =
            metadslx.core.ModelProperty.register("Annotations", metadslx.core.ModelList.class, metadslx.core.MetaAnnotation.class, metadslx.core.MetaAnnotatedElement.class, metadslx.core.MetaDescriptor.MetaAnnotatedElement.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaAnnotatedElement_AnnotationsProperty, true));
        
    }
    
    public static final class MetaDocumentedElement {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaDocumentedElement; 
        }
    
        public static final ModelProperty DocumentationProperty =
            metadslx.core.ModelProperty.register("Documentation", String.class, null, metadslx.core.MetaDocumentedElement.class, metadslx.core.MetaDescriptor.MetaDocumentedElement.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaDocumentedElement_DocumentationProperty, true));
        
    }
    
    public static final class MetaNamedElement {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNamedElement; 
        }
    
        @metadslx.core.Name
        public static final ModelProperty NameProperty =
            metadslx.core.ModelProperty.register("Name", String.class, null, metadslx.core.MetaNamedElement.class, metadslx.core.MetaDescriptor.MetaNamedElement.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNamedElement_NameProperty, true));
        
    }
    
    public static final class MetaTypedElement {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaTypedElement; 
        }
    
        @metadslx.core.Type
        public static final ModelProperty TypeProperty =
            metadslx.core.ModelProperty.register("Type", metadslx.core.MetaType.class, null, metadslx.core.MetaTypedElement.class, metadslx.core.MetaDescriptor.MetaTypedElement.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaTypedElement_TypeProperty, true));
        
    }
    
    public static final class MetaType {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaType; 
        }
    
    }
    
    public static final class MetaAnnotation {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAnnotation; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty PropertiesProperty =
            metadslx.core.ModelProperty.register("Properties", metadslx.core.ModelList.class, metadslx.core.MetaAnnotationProperty.class, metadslx.core.MetaAnnotation.class, metadslx.core.MetaDescriptor.MetaAnnotation.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaAnnotation_PropertiesProperty, true));
        
    }
    
    public static final class MetaAnnotationProperty {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAnnotationProperty; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ValueProperty =
            metadslx.core.ModelProperty.register("Value", metadslx.core.MetaExpression.class, null, metadslx.core.MetaAnnotationProperty.class, metadslx.core.MetaDescriptor.MetaAnnotationProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaAnnotationProperty_ValueProperty, true));
        
    }
    
    public static final class MetaNamespace {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNamespace; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaNamespace.class, propertyName="Namespaces")
        public static final ModelProperty ParentProperty =
            metadslx.core.ModelProperty.register("Parent", metadslx.core.MetaNamespace.class, null, metadslx.core.MetaNamespace.class, metadslx.core.MetaDescriptor.MetaNamespace.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNamespace_ParentProperty, true));
        
        @metadslx.core.ImportedScope
        public static final ModelProperty UsingsProperty =
            metadslx.core.ModelProperty.register("Usings", metadslx.core.ModelList.class, metadslx.core.MetaNamespace.class, metadslx.core.MetaNamespace.class, metadslx.core.MetaDescriptor.MetaNamespace.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNamespace_UsingsProperty, true));
        
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaModel.class, propertyName="Namespace")
        public static final ModelProperty MetaModelProperty =
            metadslx.core.ModelProperty.register("MetaModel", metadslx.core.MetaModel.class, null, metadslx.core.MetaNamespace.class, metadslx.core.MetaDescriptor.MetaNamespace.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNamespace_MetaModelProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaNamespace.class, propertyName="Parent")
        public static final ModelProperty NamespacesProperty =
            metadslx.core.ModelProperty.register("Namespaces", metadslx.core.ModelList.class, metadslx.core.MetaNamespace.class, metadslx.core.MetaNamespace.class, metadslx.core.MetaDescriptor.MetaNamespace.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNamespace_NamespacesProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaDeclaration.class, propertyName="Namespace")
        public static final ModelProperty DeclarationsProperty =
            metadslx.core.ModelProperty.register("Declarations", metadslx.core.ModelList.class, metadslx.core.MetaDeclaration.class, metadslx.core.MetaNamespace.class, metadslx.core.MetaDescriptor.MetaNamespace.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNamespace_DeclarationsProperty, true));
        
    }
    
    public static final class MetaDeclaration {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaDeclaration; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaNamespace.class, propertyName="Declarations")
        public static final ModelProperty NamespaceProperty =
            metadslx.core.ModelProperty.register("Namespace", metadslx.core.MetaNamespace.class, null, metadslx.core.MetaDeclaration.class, metadslx.core.MetaDescriptor.MetaDeclaration.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaDeclaration_NamespaceProperty, true));
        
        @metadslx.core.Readonly
        public static final ModelProperty ModelProperty =
            metadslx.core.ModelProperty.register("Model", metadslx.core.MetaModel.class, null, metadslx.core.MetaDeclaration.class, metadslx.core.MetaDescriptor.MetaDeclaration.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaDeclaration_ModelProperty, true));
        
    }
    
    public static final class MetaModel {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaModel; 
        }
    
        public static final ModelProperty UriProperty =
            metadslx.core.ModelProperty.register("Uri", String.class, null, metadslx.core.MetaModel.class, metadslx.core.MetaDescriptor.MetaModel.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaModel_UriProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaNamespace.class, propertyName="MetaModel")
        public static final ModelProperty NamespaceProperty =
            metadslx.core.ModelProperty.register("Namespace", metadslx.core.MetaNamespace.class, null, metadslx.core.MetaModel.class, metadslx.core.MetaDescriptor.MetaModel.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaModel_NamespaceProperty, true));
        
    }
    
    public static final class MetaCollectionType {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaCollectionType; 
        }
    
        public static final ModelProperty KindProperty =
            metadslx.core.ModelProperty.register("Kind", metadslx.core.MetaCollectionKind.class, null, metadslx.core.MetaCollectionType.class, metadslx.core.MetaDescriptor.MetaCollectionType.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaCollectionType_KindProperty, true));
        
        public static final ModelProperty InnerTypeProperty =
            metadslx.core.ModelProperty.register("InnerType", metadslx.core.MetaType.class, null, metadslx.core.MetaCollectionType.class, metadslx.core.MetaDescriptor.MetaCollectionType.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaCollectionType_InnerTypeProperty, true));
        
    }
    
    public static final class MetaNullableType {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNullableType; 
        }
    
        public static final ModelProperty InnerTypeProperty =
            metadslx.core.ModelProperty.register("InnerType", metadslx.core.MetaType.class, null, metadslx.core.MetaNullableType.class, metadslx.core.MetaDescriptor.MetaNullableType.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNullableType_InnerTypeProperty, true));
        
    }
    
    public static final class MetaPrimitiveType {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaPrimitiveType; 
        }
    
    }
    
    public static final class MetaEnum {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaEnum; 
        }
    
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaEnumLiteral.class, propertyName="Enum")
        public static final ModelProperty EnumLiteralsProperty =
            metadslx.core.ModelProperty.register("EnumLiterals", metadslx.core.ModelList.class, metadslx.core.MetaEnumLiteral.class, metadslx.core.MetaEnum.class, metadslx.core.MetaDescriptor.MetaEnum.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaEnum_EnumLiteralsProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaOperation.class, propertyName="Parent")
        public static final ModelProperty OperationsProperty =
            metadslx.core.ModelProperty.register("Operations", metadslx.core.ModelList.class, metadslx.core.MetaOperation.class, metadslx.core.MetaEnum.class, metadslx.core.MetaDescriptor.MetaEnum.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaEnum_OperationsProperty, true));
        
    }
    
    public static final class MetaEnumLiteral {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaEnumLiteral; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaEnum.class, propertyName="EnumLiterals")
        public static final ModelProperty EnumProperty =
            metadslx.core.ModelProperty.register("Enum", metadslx.core.MetaEnum.class, null, metadslx.core.MetaEnumLiteral.class, metadslx.core.MetaDescriptor.MetaEnumLiteral.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaEnumLiteral_EnumProperty, true));
        
    }
    
    public static final class MetaClass {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaClass; 
        }
    
        public static final ModelProperty IsAbstractProperty =
            metadslx.core.ModelProperty.register("IsAbstract", boolean.class, null, metadslx.core.MetaClass.class, metadslx.core.MetaDescriptor.MetaClass.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaClass_IsAbstractProperty, true));
        
        @metadslx.core.InheritedScope
        public static final ModelProperty SuperClassesProperty =
            metadslx.core.ModelProperty.register("SuperClasses", metadslx.core.ModelList.class, metadslx.core.MetaClass.class, metadslx.core.MetaClass.class, metadslx.core.MetaDescriptor.MetaClass.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaClass_SuperClassesProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaProperty.class, propertyName="Class")
        public static final ModelProperty PropertiesProperty =
            metadslx.core.ModelProperty.register("Properties", metadslx.core.ModelList.class, metadslx.core.MetaProperty.class, metadslx.core.MetaClass.class, metadslx.core.MetaDescriptor.MetaClass.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaClass_PropertiesProperty, true));
        
        @metadslx.core.ScopeEntry
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaOperation.class, propertyName="Parent")
        public static final ModelProperty OperationsProperty =
            metadslx.core.ModelProperty.register("Operations", metadslx.core.ModelList.class, metadslx.core.MetaOperation.class, metadslx.core.MetaClass.class, metadslx.core.MetaDescriptor.MetaClass.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaClass_OperationsProperty, true));
        
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaConstructor.class, propertyName="Parent")
        public static final ModelProperty ConstructorProperty =
            metadslx.core.ModelProperty.register("Constructor", metadslx.core.MetaConstructor.class, null, metadslx.core.MetaClass.class, metadslx.core.MetaDescriptor.MetaClass.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaClass_ConstructorProperty, true));
        
    }
    
    public static final class MetaFunctionType {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaFunctionType; 
        }
    
        public static final ModelProperty ParameterTypesProperty =
            metadslx.core.ModelProperty.register("ParameterTypes", metadslx.core.ModelMultiList.class, metadslx.core.MetaType.class, metadslx.core.MetaFunctionType.class, metadslx.core.MetaDescriptor.MetaFunctionType.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaFunctionType_ParameterTypesProperty, true));
        
        public static final ModelProperty ReturnTypeProperty =
            metadslx.core.ModelProperty.register("ReturnType", metadslx.core.MetaType.class, null, metadslx.core.MetaFunctionType.class, metadslx.core.MetaDescriptor.MetaFunctionType.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaFunctionType_ReturnTypeProperty, true));
        
    }
    
    public static final class MetaFunction {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaFunction; 
        }
    
        @metadslx.core.Type
        @metadslx.core.Readonly
        @metadslx.core.Redefines(declaringType=metadslx.core.MetaDescriptor.MetaTypedElement.class, propertyName="Type")
        public static final ModelProperty TypeProperty =
            metadslx.core.ModelProperty.register("Type", metadslx.core.MetaFunctionType.class, null, metadslx.core.MetaFunction.class, metadslx.core.MetaDescriptor.MetaFunction.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaFunction_TypeProperty, true));
        
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaParameter.class, propertyName="Function")
        public static final ModelProperty ParametersProperty =
            metadslx.core.ModelProperty.register("Parameters", metadslx.core.ModelList.class, metadslx.core.MetaParameter.class, metadslx.core.MetaFunction.class, metadslx.core.MetaDescriptor.MetaFunction.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaFunction_ParametersProperty, true));
        
        public static final ModelProperty ReturnTypeProperty =
            metadslx.core.ModelProperty.register("ReturnType", metadslx.core.MetaType.class, null, metadslx.core.MetaFunction.class, metadslx.core.MetaDescriptor.MetaFunction.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaFunction_ReturnTypeProperty, true));
        
    }
    
    public static final class MetaGlobalFunction {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaGlobalFunction; 
        }
    
    }
    
    public static final class MetaOperation {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaOperation; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaClass.class, propertyName="Operations")
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaEnum.class, propertyName="Operations")
        public static final ModelProperty ParentProperty =
            metadslx.core.ModelProperty.register("Parent", metadslx.core.MetaType.class, null, metadslx.core.MetaOperation.class, metadslx.core.MetaDescriptor.MetaOperation.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaOperation_ParentProperty, true));
        
    }
    
    public static final class MetaConstant {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaConstant; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ValueProperty =
            metadslx.core.ModelProperty.register("Value", metadslx.core.MetaExpression.class, null, metadslx.core.MetaConstant.class, metadslx.core.MetaDescriptor.MetaConstant.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConstant_ValueProperty, true));
        
    }
    
    public static final class MetaConstructor {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaConstructor; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaClass.class, propertyName="Constructor")
        public static final ModelProperty ParentProperty =
            metadslx.core.ModelProperty.register("Parent", metadslx.core.MetaClass.class, null, metadslx.core.MetaConstructor.class, metadslx.core.MetaDescriptor.MetaConstructor.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConstructor_ParentProperty, true));
        
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaPropertyInitializer.class, propertyName="Constructor")
        public static final ModelProperty InitializersProperty =
            metadslx.core.ModelProperty.register("Initializers", metadslx.core.ModelList.class, metadslx.core.MetaPropertyInitializer.class, metadslx.core.MetaConstructor.class, metadslx.core.MetaDescriptor.MetaConstructor.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConstructor_InitializersProperty, true));
        
    }
    
    public static final class MetaParameter {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaParameter; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaFunction.class, propertyName="Parameters")
        public static final ModelProperty FunctionProperty =
            metadslx.core.ModelProperty.register("Function", metadslx.core.MetaFunction.class, null, metadslx.core.MetaParameter.class, metadslx.core.MetaDescriptor.MetaParameter.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaParameter_FunctionProperty, true));
        
    }
    
    public static final class MetaProperty {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaProperty; 
        }
    
        public static final ModelProperty KindProperty =
            metadslx.core.ModelProperty.register("Kind", metadslx.core.MetaPropertyKind.class, null, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_KindProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaClass.class, propertyName="Properties")
        public static final ModelProperty ClassProperty =
            metadslx.core.ModelProperty.register("Class", metadslx.core.MetaClass.class, null, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_ClassProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaProperty.class, propertyName="OppositeProperties")
        public static final ModelProperty OppositePropertiesProperty =
            metadslx.core.ModelProperty.register("OppositeProperties", metadslx.core.ModelList.class, metadslx.core.MetaProperty.class, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_OppositePropertiesProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaProperty.class, propertyName="SubsettingProperties")
        public static final ModelProperty SubsettedPropertiesProperty =
            metadslx.core.ModelProperty.register("SubsettedProperties", metadslx.core.ModelList.class, metadslx.core.MetaProperty.class, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_SubsettedPropertiesProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaProperty.class, propertyName="SubsettedProperties")
        public static final ModelProperty SubsettingPropertiesProperty =
            metadslx.core.ModelProperty.register("SubsettingProperties", metadslx.core.ModelList.class, metadslx.core.MetaProperty.class, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_SubsettingPropertiesProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaProperty.class, propertyName="RedefiningProperties")
        public static final ModelProperty RedefinedPropertiesProperty =
            metadslx.core.ModelProperty.register("RedefinedProperties", metadslx.core.ModelList.class, metadslx.core.MetaProperty.class, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_RedefinedPropertiesProperty, true));
        
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaProperty.class, propertyName="RedefinedProperties")
        public static final ModelProperty RedefiningPropertiesProperty =
            metadslx.core.ModelProperty.register("RedefiningProperties", metadslx.core.ModelList.class, metadslx.core.MetaProperty.class, metadslx.core.MetaProperty.class, metadslx.core.MetaDescriptor.MetaProperty.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaProperty_RedefiningPropertiesProperty, true));
        
    }
    
    public static final class MetaPropertyInitializer {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaPropertyInitializer; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaConstructor.class, propertyName="Initializers")
        public static final ModelProperty ConstructorProperty =
            metadslx.core.ModelProperty.register("Constructor", metadslx.core.MetaConstructor.class, null, metadslx.core.MetaPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaPropertyInitializer_ConstructorProperty, true));
        
        public static final ModelProperty PropertyNameProperty =
            metadslx.core.ModelProperty.register("PropertyName", String.class, null, metadslx.core.MetaPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaPropertyInitializer_PropertyNameProperty, true));
        
        public static final ModelProperty PropertyContextProperty =
            metadslx.core.ModelProperty.register("PropertyContext", metadslx.core.MetaClass.class, null, metadslx.core.MetaPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaPropertyInitializer_PropertyContextProperty, true));
        
        public static final ModelProperty PropertyProperty =
            metadslx.core.ModelProperty.register("Property", metadslx.core.MetaProperty.class, null, metadslx.core.MetaPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaPropertyInitializer_PropertyProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ValueProperty =
            metadslx.core.ModelProperty.register("Value", metadslx.core.MetaExpression.class, null, metadslx.core.MetaPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaPropertyInitializer_ValueProperty, true));
        
    }
    
    public static final class MetaSynthetizedPropertyInitializer {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaSynthetizedPropertyInitializer; 
        }
    
    }
    
    public static final class MetaInheritedPropertyInitializer {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaInheritedPropertyInitializer; 
        }
    
        public static final ModelProperty ObjectNameProperty =
            metadslx.core.ModelProperty.register("ObjectName", String.class, null, metadslx.core.MetaInheritedPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaInheritedPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaInheritedPropertyInitializer_ObjectNameProperty, true));
        
        public static final ModelProperty ObjectProperty =
            metadslx.core.ModelProperty.register("Object", metadslx.core.MetaProperty.class, null, metadslx.core.MetaInheritedPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaInheritedPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaInheritedPropertyInitializer_ObjectProperty, true));
        
    }
    
    public static final class MetaExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaExpression; 
        }
    
        @metadslx.core.Readonly
        public static final ModelProperty NoTypeErrorProperty =
            metadslx.core.ModelProperty.register("NoTypeError", boolean.class, null, metadslx.core.MetaExpression.class, metadslx.core.MetaDescriptor.MetaExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaExpression_NoTypeErrorProperty, true));
        
        @metadslx.core.Readonly
        public static final ModelProperty ExpectedTypeProperty =
            metadslx.core.ModelProperty.register("ExpectedType", metadslx.core.MetaType.class, null, metadslx.core.MetaExpression.class, metadslx.core.MetaDescriptor.MetaExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaExpression_ExpectedTypeProperty, true));
        
    }
    
    public static final class MetaBracketExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaBracketExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaBracketExpression.class, metadslx.core.MetaDescriptor.MetaBracketExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBracketExpression_ExpressionProperty, true));
        
    }
    
    public static final class MetaBoundExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaBoundExpression; 
        }
    
        @metadslx.core.Readonly
        public static final ModelProperty UniqueDefinitionProperty =
            metadslx.core.ModelProperty.register("UniqueDefinition", boolean.class, null, metadslx.core.MetaBoundExpression.class, metadslx.core.MetaDescriptor.MetaBoundExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBoundExpression_UniqueDefinitionProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ArgumentsProperty =
            metadslx.core.ModelProperty.register("Arguments", metadslx.core.ModelList.class, metadslx.core.MetaExpression.class, metadslx.core.MetaBoundExpression.class, metadslx.core.MetaDescriptor.MetaBoundExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBoundExpression_ArgumentsProperty, true));
        
        @metadslx.core.Readonly
        public static final ModelProperty DefinitionsProperty =
            metadslx.core.ModelProperty.register("Definitions", metadslx.core.ModelList.class, ModelObject.class, metadslx.core.MetaBoundExpression.class, metadslx.core.MetaDescriptor.MetaBoundExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBoundExpression_DefinitionsProperty, true));
        
        @metadslx.core.Readonly
        public static final ModelProperty DefinitionProperty =
            metadslx.core.ModelProperty.register("Definition", ModelObject.class, null, metadslx.core.MetaBoundExpression.class, metadslx.core.MetaDescriptor.MetaBoundExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBoundExpression_DefinitionProperty, true));
        
    }
    
    public static final class MetaThisExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaThisExpression; 
        }
    
    }
    
    public static final class MetaNullExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNullExpression; 
        }
    
    }
    
    public static final class MetaTypeConversionExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaTypeConversionExpression; 
        }
    
        public static final ModelProperty TypeReferenceProperty =
            metadslx.core.ModelProperty.register("TypeReference", metadslx.core.MetaType.class, null, metadslx.core.MetaTypeConversionExpression.class, metadslx.core.MetaDescriptor.MetaTypeConversionExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaTypeConversionExpression_TypeReferenceProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaTypeConversionExpression.class, metadslx.core.MetaDescriptor.MetaTypeConversionExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaTypeConversionExpression_ExpressionProperty, true));
        
    }
    
    public static final class MetaTypeAsExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaTypeAsExpression; 
        }
    
    }
    
    public static final class MetaTypeCastExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaTypeCastExpression; 
        }
    
    }
    
    public static final class MetaTypeCheckExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaTypeCheckExpression; 
        }
    
        public static final ModelProperty TypeReferenceProperty =
            metadslx.core.ModelProperty.register("TypeReference", metadslx.core.MetaType.class, null, metadslx.core.MetaTypeCheckExpression.class, metadslx.core.MetaDescriptor.MetaTypeCheckExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaTypeCheckExpression_TypeReferenceProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaTypeCheckExpression.class, metadslx.core.MetaDescriptor.MetaTypeCheckExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaTypeCheckExpression_ExpressionProperty, true));
        
    }
    
    public static final class MetaTypeOfExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaTypeOfExpression; 
        }
    
        public static final ModelProperty TypeReferenceProperty =
            metadslx.core.ModelProperty.register("TypeReference", metadslx.core.MetaType.class, null, metadslx.core.MetaTypeOfExpression.class, metadslx.core.MetaDescriptor.MetaTypeOfExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaTypeOfExpression_TypeReferenceProperty, true));
        
    }
    
    public static final class MetaConditionalExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaConditionalExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ConditionProperty =
            metadslx.core.ModelProperty.register("Condition", metadslx.core.MetaExpression.class, null, metadslx.core.MetaConditionalExpression.class, metadslx.core.MetaDescriptor.MetaConditionalExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConditionalExpression_ConditionProperty, true));
        
        public static final ModelProperty BalancedTypeProperty =
            metadslx.core.ModelProperty.register("BalancedType", metadslx.core.MetaType.class, null, metadslx.core.MetaConditionalExpression.class, metadslx.core.MetaDescriptor.MetaConditionalExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConditionalExpression_BalancedTypeProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ThenProperty =
            metadslx.core.ModelProperty.register("Then", metadslx.core.MetaExpression.class, null, metadslx.core.MetaConditionalExpression.class, metadslx.core.MetaDescriptor.MetaConditionalExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConditionalExpression_ThenProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ElseProperty =
            metadslx.core.ModelProperty.register("Else", metadslx.core.MetaExpression.class, null, metadslx.core.MetaConditionalExpression.class, metadslx.core.MetaDescriptor.MetaConditionalExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConditionalExpression_ElseProperty, true));
        
    }
    
    public static final class MetaConstantExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaConstantExpression; 
        }
    
        public static final ModelProperty ValueProperty =
            metadslx.core.ModelProperty.register("Value", Object.class, null, metadslx.core.MetaConstantExpression.class, metadslx.core.MetaDescriptor.MetaConstantExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaConstantExpression_ValueProperty, true));
        
    }
    
    public static final class MetaIdentifierExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaIdentifierExpression; 
        }
    
        public static final ModelProperty NameProperty =
            metadslx.core.ModelProperty.register("Name", String.class, null, metadslx.core.MetaIdentifierExpression.class, metadslx.core.MetaDescriptor.MetaIdentifierExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaIdentifierExpression_NameProperty, true));
        
    }
    
    public static final class MetaMemberAccessExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaMemberAccessExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaMemberAccessExpression.class, metadslx.core.MetaDescriptor.MetaMemberAccessExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaMemberAccessExpression_ExpressionProperty, true));
        
        public static final ModelProperty NameProperty =
            metadslx.core.ModelProperty.register("Name", String.class, null, metadslx.core.MetaMemberAccessExpression.class, metadslx.core.MetaDescriptor.MetaMemberAccessExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaMemberAccessExpression_NameProperty, true));
        
    }
    
    public static final class MetaFunctionCallExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaFunctionCallExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaFunctionCallExpression.class, metadslx.core.MetaDescriptor.MetaFunctionCallExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaFunctionCallExpression_ExpressionProperty, true));
        
    }
    
    public static final class MetaIndexerExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaIndexerExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaIndexerExpression.class, metadslx.core.MetaDescriptor.MetaIndexerExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaIndexerExpression_ExpressionProperty, true));
        
    }
    
    public static final class MetaNewExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNewExpression; 
        }
    
        public static final ModelProperty TypeReferenceProperty =
            metadslx.core.ModelProperty.register("TypeReference", metadslx.core.MetaClass.class, null, metadslx.core.MetaNewExpression.class, metadslx.core.MetaDescriptor.MetaNewExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewExpression_TypeReferenceProperty, true));
        
        @metadslx.core.Containment
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.class, propertyName="Parent")
        public static final ModelProperty PropertyInitializersProperty =
            metadslx.core.ModelProperty.register("PropertyInitializers", metadslx.core.ModelList.class, metadslx.core.MetaNewPropertyInitializer.class, metadslx.core.MetaNewExpression.class, metadslx.core.MetaDescriptor.MetaNewExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewExpression_PropertyInitializersProperty, true));
        
    }
    
    public static final class MetaNewPropertyInitializer {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNewPropertyInitializer; 
        }
    
        @metadslx.core.Opposite(declaringType=metadslx.core.MetaDescriptor.MetaNewExpression.class, propertyName="PropertyInitializers")
        public static final ModelProperty ParentProperty =
            metadslx.core.ModelProperty.register("Parent", metadslx.core.MetaNewExpression.class, null, metadslx.core.MetaNewPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewPropertyInitializer_ParentProperty, true));
        
        public static final ModelProperty PropertyNameProperty =
            metadslx.core.ModelProperty.register("PropertyName", String.class, null, metadslx.core.MetaNewPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewPropertyInitializer_PropertyNameProperty, true));
        
        public static final ModelProperty ValueProperty =
            metadslx.core.ModelProperty.register("Value", metadslx.core.MetaExpression.class, null, metadslx.core.MetaNewPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewPropertyInitializer_ValueProperty, true));
        
        public static final ModelProperty PropertyProperty =
            metadslx.core.ModelProperty.register("Property", metadslx.core.MetaProperty.class, null, metadslx.core.MetaNewPropertyInitializer.class, metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewPropertyInitializer_PropertyProperty, true));
        
    }
    
    public static final class MetaNewCollectionExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNewCollectionExpression; 
        }
    
        public static final ModelProperty TypeReferenceProperty =
            metadslx.core.ModelProperty.register("TypeReference", metadslx.core.MetaCollectionType.class, null, metadslx.core.MetaNewCollectionExpression.class, metadslx.core.MetaDescriptor.MetaNewCollectionExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewCollectionExpression_TypeReferenceProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty ValuesProperty =
            metadslx.core.ModelProperty.register("Values", metadslx.core.ModelList.class, metadslx.core.MetaExpression.class, metadslx.core.MetaNewCollectionExpression.class, metadslx.core.MetaDescriptor.MetaNewCollectionExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaNewCollectionExpression_ValuesProperty, true));
        
    }
    
    public static final class MetaOperatorExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaOperatorExpression; 
        }
    
        @metadslx.core.Readonly
        public static final ModelProperty NameProperty =
            metadslx.core.ModelProperty.register("Name", String.class, null, metadslx.core.MetaOperatorExpression.class, metadslx.core.MetaDescriptor.MetaOperatorExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaOperatorExpression_NameProperty, true));
        
    }
    
    public static final class MetaUnaryExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaUnaryExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty ExpressionProperty =
            metadslx.core.ModelProperty.register("Expression", metadslx.core.MetaExpression.class, null, metadslx.core.MetaUnaryExpression.class, metadslx.core.MetaDescriptor.MetaUnaryExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaUnaryExpression_ExpressionProperty, true));
        
    }
    
    public static final class MetaUnaryPlusExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaUnaryPlusExpression; 
        }
    
    }
    
    public static final class MetaNegateExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNegateExpression; 
        }
    
    }
    
    public static final class MetaOnesComplementExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaOnesComplementExpression; 
        }
    
    }
    
    public static final class MetaNotExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNotExpression; 
        }
    
    }
    
    public static final class MetaUnaryAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaUnaryAssignExpression; 
        }
    
    }
    
    public static final class MetaPostIncrementAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaPostIncrementAssignExpression; 
        }
    
    }
    
    public static final class MetaPostDecrementAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaPostDecrementAssignExpression; 
        }
    
    }
    
    public static final class MetaPreIncrementAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaPreIncrementAssignExpression; 
        }
    
    }
    
    public static final class MetaPreDecrementAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaPreDecrementAssignExpression; 
        }
    
    }
    
    public static final class MetaBinaryExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaBinaryExpression; 
        }
    
        @metadslx.core.Containment
        public static final ModelProperty LeftProperty =
            metadslx.core.ModelProperty.register("Left", metadslx.core.MetaExpression.class, null, metadslx.core.MetaBinaryExpression.class, metadslx.core.MetaDescriptor.MetaBinaryExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBinaryExpression_LeftProperty, true));
        
        @metadslx.core.Containment
        public static final ModelProperty RightProperty =
            metadslx.core.ModelProperty.register("Right", metadslx.core.MetaExpression.class, null, metadslx.core.MetaBinaryExpression.class, metadslx.core.MetaDescriptor.MetaBinaryExpression.class, metadslx.core.Lazy.create(() -> metadslx.core.MetaInstance.MetaBinaryExpression_RightProperty, true));
        
    }
    
    public static final class MetaBinaryArithmeticExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaBinaryArithmeticExpression; 
        }
    
    }
    
    public static final class MetaMultiplyExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaMultiplyExpression; 
        }
    
    }
    
    public static final class MetaDivideExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaDivideExpression; 
        }
    
    }
    
    public static final class MetaModuloExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaModuloExpression; 
        }
    
    }
    
    public static final class MetaAddExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAddExpression; 
        }
    
    }
    
    public static final class MetaSubtractExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaSubtractExpression; 
        }
    
    }
    
    public static final class MetaLeftShiftExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaLeftShiftExpression; 
        }
    
    }
    
    public static final class MetaRightShiftExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaRightShiftExpression; 
        }
    
    }
    
    public static final class MetaBinaryComparisonExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaBinaryComparisonExpression; 
        }
    
    }
    
    public static final class MetaLessThanExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaLessThanExpression; 
        }
    
    }
    
    public static final class MetaLessThanOrEqualExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaLessThanOrEqualExpression; 
        }
    
    }
    
    public static final class MetaGreaterThanExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaGreaterThanExpression; 
        }
    
    }
    
    public static final class MetaGreaterThanOrEqualExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaGreaterThanOrEqualExpression; 
        }
    
    }
    
    public static final class MetaEqualExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaEqualExpression; 
        }
    
    }
    
    public static final class MetaNotEqualExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNotEqualExpression; 
        }
    
    }
    
    public static final class MetaBinaryLogicalExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaBinaryLogicalExpression; 
        }
    
    }
    
    public static final class MetaAndExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAndExpression; 
        }
    
    }
    
    public static final class MetaOrExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaOrExpression; 
        }
    
    }
    
    public static final class MetaExclusiveOrExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaExclusiveOrExpression; 
        }
    
    }
    
    public static final class MetaAndAlsoExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAndAlsoExpression; 
        }
    
    }
    
    public static final class MetaOrElseExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaOrElseExpression; 
        }
    
    }
    
    public static final class MetaNullCoalescingExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaNullCoalescingExpression; 
        }
    
    }
    
    public static final class MetaAssignmentExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAssignmentExpression; 
        }
    
    }
    
    public static final class MetaAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAssignExpression; 
        }
    
    }
    
    public static final class MetaArithmeticAssignmentExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaArithmeticAssignmentExpression; 
        }
    
    }
    
    public static final class MetaMultiplyAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaMultiplyAssignExpression; 
        }
    
    }
    
    public static final class MetaDivideAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaDivideAssignExpression; 
        }
    
    }
    
    public static final class MetaModuloAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaModuloAssignExpression; 
        }
    
    }
    
    public static final class MetaAddAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAddAssignExpression; 
        }
    
    }
    
    public static final class MetaSubtractAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaSubtractAssignExpression; 
        }
    
    }
    
    public static final class MetaLeftShiftAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaLeftShiftAssignExpression; 
        }
    
    }
    
    public static final class MetaRightShiftAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaRightShiftAssignExpression; 
        }
    
    }
    
    public static final class MetaLogicalAssignmentExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaLogicalAssignmentExpression; 
        }
    
    }
    
    public static final class MetaAndAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaAndAssignExpression; 
        }
    
    }
    
    public static final class MetaExclusiveOrAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaExclusiveOrAssignExpression; 
        }
    
    }
    
    public static final class MetaOrAssignExpression {
        static void staticInit() {}
    
        static {
            metadslx.core.MetaDescriptor.staticInit();
        }
    
        public static metadslx.core.MetaClass getMetaClass() {
            return metadslx.core.MetaInstance.MetaOrAssignExpression; 
        }
    
    }
}


