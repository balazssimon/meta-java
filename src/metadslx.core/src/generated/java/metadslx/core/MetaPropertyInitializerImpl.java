package metadslx.core;

class MetaPropertyInitializerImpl extends metadslx.core.ModelObject implements metadslx.core.MetaPropertyInitializer {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaPropertyInitializer; 
    }

    public MetaPropertyInitializerImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyContextProperty, metadslx.core.Lazy.create(() -> metadslx.core.ModelUtils.as(MetaClass.class,ModelCompilerContext.current().getResolutionProvider().getCurrentTypeScopeOf((ModelObject)((MetaPropertyInitializer)this))), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getBindingProvider().bind(null, ModelCompilerContext.current().getResolutionProvider().resolve(new metadslx.core.ResolutionInfo((ModelObject)((MetaPropertyInitializer)this).getPropertyContext(), ResolveKind.Name, ((MetaPropertyInitializer)this).getPropertyName()))), true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaPropertyInitializer.ValueProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().getTypeOf(((MetaPropertyInitializer)this).getProperty()), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaPropertyInitializer(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaConstructor getConstructor() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.ConstructorProperty); 
        if (result != null) return (metadslx.core.MetaConstructor)result;
        else return (metadslx.core.MetaConstructor)null;
    }
    
    public void setConstructor(metadslx.core.MetaConstructor value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.ConstructorProperty, value);
    }
    
    public String getPropertyName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyNameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setPropertyName(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyNameProperty, value);
    }
    
    public metadslx.core.MetaClass getPropertyContext() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyContextProperty); 
        if (result != null) return (metadslx.core.MetaClass)result;
        else return (metadslx.core.MetaClass)null;
    }
    
    public void setPropertyContext(metadslx.core.MetaClass value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyContextProperty, value);
    }
    
    public metadslx.core.MetaProperty getProperty() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyProperty); 
        if (result != null) return (metadslx.core.MetaProperty)result;
        else return (metadslx.core.MetaProperty)null;
    }
    
    public void setProperty(metadslx.core.MetaProperty value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.PropertyProperty, value);
    }
    
    public metadslx.core.MetaExpression getValue() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.ValueProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setValue(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaPropertyInitializer.ValueProperty, value);
    }
}


