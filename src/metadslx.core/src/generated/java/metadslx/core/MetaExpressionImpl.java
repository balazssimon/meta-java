package metadslx.core;

class MetaExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaExpression; 
    }

    public MetaExpressionImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaExpression_MetaExpression().");
        this.mMakeDefault();
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


