package metadslx.core;

@SuppressWarnings("unchecked")
class MetaNewExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaNewExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaNewExpression; 
    }

    public MetaNewExpressionImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewExpression.PropertyInitializersProperty, new metadslx.core.ModelList<MetaNewPropertyInitializer>(this, metadslx.core.MetaDescriptor.MetaNewExpression.PropertyInitializersProperty));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ((MetaNewExpression)this).getTypeReference(), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaNewExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaNewExpression_MetaNewExpression().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaClass getTypeReference() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewExpression.TypeReferenceProperty); 
        if (result != null) return (metadslx.core.MetaClass)result;
        else return (metadslx.core.MetaClass)null;
    }
    
    public void setTypeReference(metadslx.core.MetaClass value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewExpression.TypeReferenceProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaNewPropertyInitializer> getPropertyInitializers() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewExpression.PropertyInitializersProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaNewPropertyInitializer>)result;
        else return (java.util.List<metadslx.core.MetaNewPropertyInitializer>)null;
    }
    
    public boolean getNoTypeError() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public metadslx.core.MetaType getExpectedType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public metadslx.core.MetaType getType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, value);
    }
}


