package metadslx.core;

class MetaClassImpl extends metadslx.core.ModelObject implements metadslx.core.MetaClass {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaClass; 
    }

    public MetaClassImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaClass.SuperClassesProperty, new metadslx.core.ModelList<MetaClass>(this, metadslx.core.MetaDescriptor.MetaClass.SuperClassesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaClass.PropertiesProperty, new metadslx.core.ModelList<MetaProperty>(this, metadslx.core.MetaDescriptor.MetaClass.PropertiesProperty));
        this.mSet(metadslx.core.MetaDescriptor.MetaClass.OperationsProperty, new metadslx.core.ModelList<MetaOperation>(this, metadslx.core.MetaDescriptor.MetaClass.OperationsProperty));
        this.mDerivedSet(metadslx.core.MetaDescriptor.MetaDeclaration.ModelProperty, () -> ((MetaDeclaration)this).getNamespace().getMetaModel());
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty, new metadslx.core.ModelList<MetaAnnotation>(this, metadslx.core.MetaDescriptor.MetaAnnotatedElement.AnnotationsProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaClass(this);
        this.mMakeDefault();
    }
    
    public boolean getIsAbstract() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaClass.IsAbstractProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public void setIsAbstract(boolean value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaClass.IsAbstractProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaClass> getSuperClasses() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaClass.SuperClassesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaClass>)result;
        else return (java.util.List<metadslx.core.MetaClass>)null;
    }
    
    public java.util.List<metadslx.core.MetaProperty> getProperties() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaClass.PropertiesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaProperty>)result;
        else return (java.util.List<metadslx.core.MetaProperty>)null;
    }
    
    public java.util.List<metadslx.core.MetaOperation> getOperations() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaClass.OperationsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaOperation>)result;
        else return (java.util.List<metadslx.core.MetaOperation>)null;
    }
    
    public metadslx.core.MetaConstructor getConstructor() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaClass.ConstructorProperty); 
        if (result != null) return (metadslx.core.MetaConstructor)result;
        else return (metadslx.core.MetaConstructor)null;
    }
    
    public void setConstructor(metadslx.core.MetaConstructor value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaClass.ConstructorProperty, value);
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
    
    public java.util.List<metadslx.core.MetaClass> getAllSuperClasses() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaClass_getAllSuperClasses(this);
    }
    
    public java.util.List<metadslx.core.MetaProperty> getAllProperties() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaClass_getAllProperties(this);
    }
    
    public java.util.List<metadslx.core.MetaOperation> getAllOperations() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaClass_getAllOperations(this);
    }
    
    public java.util.List<metadslx.core.MetaProperty> getAllImplementedProperties() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaClass_getAllImplementedProperties(this);
    }
    
    public java.util.List<metadslx.core.MetaOperation> getAllImplementedOperations() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaClass_getAllImplementedOperations(this);
    }
}


