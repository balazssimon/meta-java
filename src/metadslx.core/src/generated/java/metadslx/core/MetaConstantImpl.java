package metadslx.core;

class MetaConstantImpl extends metadslx.core.ModelObject implements metadslx.core.MetaConstant {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaConstant; 
    }

    public MetaConstantImpl() {
        this.mDerivedSet(metadslx.core.MetaDescriptor.MetaDeclaration.ModelProperty, () -> ((MetaDeclaration)this).getNamespace().getMetaModel());
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaConstant.ValueProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> ((MetaConstant)this).getType(), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaConstant(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaExpression getValue() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConstant.ValueProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setValue(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaConstant.ValueProperty, value);
    }
    
    public metadslx.core.MetaType getType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, value);
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


