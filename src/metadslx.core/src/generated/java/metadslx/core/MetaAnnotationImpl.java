package metadslx.core;

class MetaAnnotationImpl extends metadslx.core.ModelObject implements metadslx.core.MetaAnnotation {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaAnnotation; 
    }

    public MetaAnnotationImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotation.PropertiesProperty, new metadslx.core.ModelList<MetaAnnotationProperty>(this, metadslx.core.MetaDescriptor.MetaAnnotation.PropertiesProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaAnnotation(this);
        this.mMakeDefault();
    }
    
    public java.util.List<metadslx.core.MetaAnnotationProperty> getProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaAnnotation.PropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaAnnotationProperty>)result;
        else return (java.util.List<metadslx.core.MetaAnnotationProperty>)null;
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
    
    public java.util.List<String> getDocumentationLines() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaDocumentedElement_getDocumentationLines(this);
    }
}


