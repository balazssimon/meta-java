package metadslx.core;

class MetaNamespaceImpl extends metadslx.core.ModelObject implements metadslx.core.MetaNamespace {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaNamespace; 
    }

    public MetaNamespaceImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamespace.UsingsProperty, new metadslx.core.ModelList<MetaNamespace>(this, metadslx.core.MetaDescriptor.MetaNamespace.UsingsProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaNamespace.NamespacesProperty, new metadslx.core.ModelList<MetaNamespace>(this, metadslx.core.MetaDescriptor.MetaNamespace.NamespacesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaNamespace.DeclarationsProperty, new metadslx.core.ModelList<MetaDeclaration>(this, metadslx.core.MetaDescriptor.MetaNamespace.DeclarationsProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaNamespace(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaNamespace getParent() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamespace.ParentProperty); 
        if (result != null) return (metadslx.core.MetaNamespace)result;
        else return (metadslx.core.MetaNamespace)null;
    }
    
    public void setParent(metadslx.core.MetaNamespace value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamespace.ParentProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaNamespace> getUsings() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamespace.UsingsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaNamespace>)result;
        else return (java.util.List<metadslx.core.MetaNamespace>)null;
    }
    
    public metadslx.core.MetaModel getMetaModel() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamespace.MetaModelProperty); 
        if (result != null) return (metadslx.core.MetaModel)result;
        else return (metadslx.core.MetaModel)null;
    }
    
    public void setMetaModel(metadslx.core.MetaModel value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamespace.MetaModelProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaNamespace> getNamespaces() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamespace.NamespacesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaNamespace>)result;
        else return (java.util.List<metadslx.core.MetaNamespace>)null;
    }
    
    public java.util.List<metadslx.core.MetaDeclaration> getDeclarations() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamespace.DeclarationsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaDeclaration>)result;
        else return (java.util.List<metadslx.core.MetaDeclaration>)null;
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


