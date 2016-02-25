package metadslx.core;

@SuppressWarnings("unchecked")
class MetaEnumImpl extends metadslx.core.ModelObject implements metadslx.core.MetaEnum {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaEnum; 
    }

    public MetaEnumImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaEnum.EnumLiteralsProperty, new metadslx.core.ModelList<MetaEnumLiteral>(this, metadslx.core.MetaDescriptor.MetaEnum.EnumLiteralsProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaEnum.OperationsProperty, new metadslx.core.ModelList<MetaOperation>(this, metadslx.core.MetaDescriptor.MetaEnum.OperationsProperty));
        this.mDerivedSet(metadslx.core.MetaDescriptor.MetaDeclaration.ModelProperty, () -> ((MetaDeclaration)this).getNamespace().getMetaModel());
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaEnum(this);
        this.mMakeDefault();
    }
    
    public java.util.List<metadslx.core.MetaEnumLiteral> getEnumLiterals() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaEnum.EnumLiteralsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaEnumLiteral>)result;
        else return (java.util.List<metadslx.core.MetaEnumLiteral>)null;
    }
    
    public java.util.List<metadslx.core.MetaOperation> getOperations() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaEnum.OperationsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaOperation>)result;
        else return (java.util.List<metadslx.core.MetaOperation>)null;
    }
    
    public metadslx.core.MetaNamespace getNamespace() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaDeclaration.NamespaceProperty); 
        if (result != null) return (metadslx.core.MetaNamespace)result;
        else return (metadslx.core.MetaNamespace)null;
    }
    
    public void setNamespace(metadslx.core.MetaNamespace value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaDeclaration.NamespaceProperty, value);
    }
    
    public metadslx.core.MetaModel getModel() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaDeclaration.ModelProperty); 
        if (result != null) return (metadslx.core.MetaModel)result;
        else return (metadslx.core.MetaModel)null;
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty, value);
    }
    
    public String getDocumentation() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaDocumentedElement.DocumentationProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setDocumentation(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaDocumentedElement.DocumentationProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaAnnotation> getAnnotations() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaAnnotation>)result;
        else return (java.util.List<metadslx.core.MetaAnnotation>)null;
    }
    
    public java.util.List<String> getDocumentationLines() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaDocumentedElement_getDocumentationLines(this);
    }
}


