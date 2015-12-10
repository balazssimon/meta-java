package metadslx.core;

class MetaDeclarationImpl extends metadslx.core.ModelObject implements metadslx.core.MetaDeclaration {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaDeclaration; 
    }

    public MetaDeclarationImpl() {
        this.mDerivedSet(metadslx.core.MetaDescriptor.MetaDeclaration.ModelProperty, () -> ((MetaDeclaration)this).getNamespace().getMetaModel());
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaDeclaration(this);
        this.mMakeDefault();
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
    
    public java.util.List<metadslx.core.MetaAnnotation> getAnnotations() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaAnnotation>)result;
        else return (java.util.List<metadslx.core.MetaAnnotation>)null;
    }
}


