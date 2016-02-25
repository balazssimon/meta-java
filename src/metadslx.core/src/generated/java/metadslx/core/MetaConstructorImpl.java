package metadslx.core;

@SuppressWarnings("unchecked")
class MetaConstructorImpl extends metadslx.core.ModelObject implements metadslx.core.MetaConstructor {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaConstructor; 
    }

    public MetaConstructorImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaConstructor.InitializersProperty, new metadslx.core.ModelList<MetaPropertyInitializer>(this, metadslx.core.MetaDescriptor.MetaConstructor.InitializersProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaConstructor(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaClass getParent() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConstructor.ParentProperty); 
        if (result != null) return (metadslx.core.MetaClass)result;
        else return (metadslx.core.MetaClass)null;
    }
    
    public void setParent(metadslx.core.MetaClass value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaConstructor.ParentProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaPropertyInitializer> getInitializers() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConstructor.InitializersProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaPropertyInitializer>)result;
        else return (java.util.List<metadslx.core.MetaPropertyInitializer>)null;
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


