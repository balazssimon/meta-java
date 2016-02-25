package metadslx.core;

@SuppressWarnings("unchecked")
class MetaPropertyImpl extends metadslx.core.ModelObject implements metadslx.core.MetaProperty {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaProperty; 
    }

    public MetaPropertyImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.OppositePropertiesProperty, new metadslx.core.ModelList<MetaProperty>(this, metadslx.core.MetaDescriptor.MetaProperty.OppositePropertiesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.SubsettedPropertiesProperty, new metadslx.core.ModelList<MetaProperty>(this, metadslx.core.MetaDescriptor.MetaProperty.SubsettedPropertiesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.SubsettingPropertiesProperty, new metadslx.core.ModelList<MetaProperty>(this, metadslx.core.MetaDescriptor.MetaProperty.SubsettingPropertiesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.RedefinedPropertiesProperty, new metadslx.core.ModelList<MetaProperty>(this, metadslx.core.MetaDescriptor.MetaProperty.RedefinedPropertiesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.RedefiningPropertiesProperty, new metadslx.core.ModelList<MetaProperty>(this, metadslx.core.MetaDescriptor.MetaProperty.RedefiningPropertiesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaProperty(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaPropertyKind getKind() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.KindProperty); 
        if (result != null) return (metadslx.core.MetaPropertyKind)result;
        else return (metadslx.core.MetaPropertyKind)null;
    }
    
    public void setKind(metadslx.core.MetaPropertyKind value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.KindProperty, value);
    }
    
    public metadslx.core.MetaClass getClass_() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.ClassProperty); 
        if (result != null) return (metadslx.core.MetaClass)result;
        else return (metadslx.core.MetaClass)null;
    }
    
    public void setClass(metadslx.core.MetaClass value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaProperty.ClassProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaProperty> getOppositeProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.OppositePropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaProperty>)result;
        else return (java.util.List<metadslx.core.MetaProperty>)null;
    }
    
    public java.util.List<metadslx.core.MetaProperty> getSubsettedProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.SubsettedPropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaProperty>)result;
        else return (java.util.List<metadslx.core.MetaProperty>)null;
    }
    
    public java.util.List<metadslx.core.MetaProperty> getSubsettingProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.SubsettingPropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaProperty>)result;
        else return (java.util.List<metadslx.core.MetaProperty>)null;
    }
    
    public java.util.List<metadslx.core.MetaProperty> getRedefinedProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.RedefinedPropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaProperty>)result;
        else return (java.util.List<metadslx.core.MetaProperty>)null;
    }
    
    public java.util.List<metadslx.core.MetaProperty> getRedefiningProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaProperty.RedefiningPropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaProperty>)result;
        else return (java.util.List<metadslx.core.MetaProperty>)null;
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
    
    public metadslx.core.MetaType getType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, value);
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


