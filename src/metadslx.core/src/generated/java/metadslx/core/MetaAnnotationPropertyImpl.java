package metadslx.core;

class MetaAnnotationPropertyImpl extends metadslx.core.ModelObject implements metadslx.core.MetaAnnotationProperty {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaAnnotationProperty; 
    }

    public MetaAnnotationPropertyImpl() {
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaAnnotationProperty.ValueProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> 	MetaInstance.Any	, true));
        metadslx.core.MetaImplementationProvider.implementation().MetaAnnotationProperty(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaExpression getValue() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaAnnotationProperty.ValueProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setValue(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaAnnotationProperty.ValueProperty, value);
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty, value);
    }
}


