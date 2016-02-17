package metadslx.core;

class MetaFunctionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaFunction {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaFunction; 
    }

    public MetaFunctionImpl() {
        // Init metadslx.core.MetaDescriptor.MetaFunction.TypeProperty in metadslx.core.MetaImplementationProvider.implementation().MetaFunction_MetaFunction
        this.mSet(metadslx.core.MetaDescriptor.MetaFunction.ParametersProperty, new metadslx.core.ModelList<MetaParameter>(this, metadslx.core.MetaDescriptor.MetaFunction.ParametersProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaFunction(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaFunction.TypeProperty)) throw new ModelException("Readonly property Meta.MetaFunction.TypeProperty was not set in MetaFunction_MetaFunction().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaFunctionType getType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaFunction.TypeProperty); 
        if (result != null) return (metadslx.core.MetaFunctionType)result;
        else return (metadslx.core.MetaFunctionType)null;
    }
    
    public java.util.List<metadslx.core.MetaParameter> getParameters() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaFunction.ParametersProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaParameter>)result;
        else return (java.util.List<metadslx.core.MetaParameter>)null;
    }
    
    public metadslx.core.MetaType getReturnType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaFunction.ReturnTypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setReturnType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaFunction.ReturnTypeProperty, value);
    }
    
    public void setType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, value);
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


