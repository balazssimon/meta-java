package metadslx.core;

class MetaNewPropertyInitializerImpl extends metadslx.core.ModelObject implements metadslx.core.MetaNewPropertyInitializer {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaNewPropertyInitializer; 
    }

    public MetaNewPropertyInitializerImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.PropertyProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getBindingProvider().bind(this, ModelCompilerContext.current().getResolutionProvider().resolve(java.util.Arrays.asList(new metadslx.core.ModelObject[] { (ModelObject)((MetaNewPropertyInitializer)this).getParent().getType() }), ResolveKind.Name, ((MetaNewPropertyInitializer)this).getPropertyName(), new ResolutionInfo(), ResolveFlags.All), new BindingInfo()), true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.ValueProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().getTypeOf(((MetaNewPropertyInitializer)this).getProperty()), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaNewPropertyInitializer(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaNewExpression getParent() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.ParentProperty); 
        if (result != null) return (metadslx.core.MetaNewExpression)result;
        else return (metadslx.core.MetaNewExpression)null;
    }
    
    public void setParent(metadslx.core.MetaNewExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.ParentProperty, value);
    }
    
    public String getPropertyName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.PropertyNameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setPropertyName(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.PropertyNameProperty, value);
    }
    
    public metadslx.core.MetaExpression getValue() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.ValueProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setValue(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.ValueProperty, value);
    }
    
    public metadslx.core.MetaProperty getProperty() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.PropertyProperty); 
        if (result != null) return (metadslx.core.MetaProperty)result;
        else return (metadslx.core.MetaProperty)null;
    }
    
    public void setProperty(metadslx.core.MetaProperty value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewPropertyInitializer.PropertyProperty, value);
    }
}


