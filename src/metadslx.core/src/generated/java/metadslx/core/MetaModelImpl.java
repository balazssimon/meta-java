package metadslx.core;

class MetaModelImpl extends metadslx.core.ModelObject implements metadslx.core.MetaModel {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaModel; 
    }

    public MetaModelImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaModel(this);
        this.mMakeDefault();
    }
    
    public String getUri() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaModel.UriProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setUri(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaModel.UriProperty, value);
    }
    
    public metadslx.core.MetaNamespace getNamespace() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaModel.NamespaceProperty); 
        if (result != null) return (metadslx.core.MetaNamespace)result;
        else return (metadslx.core.MetaNamespace)null;
    }
    
    public void setNamespace(metadslx.core.MetaNamespace value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaModel.NamespaceProperty, value);
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


