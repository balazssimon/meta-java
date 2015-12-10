package metadslx.core;

class MetaTypeConversionExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaTypeConversionExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaTypeConversionExpression; 
    }

    public MetaTypeConversionExpressionImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ((MetaTypeConversionExpression)this).getTypeReference(), true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaTypeConversionExpression.ExpressionProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> 	MetaInstance.Any	, true));
        metadslx.core.MetaImplementationProvider.implementation().MetaTypeConversionExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaTypeConversionExpression_MetaTypeConversionExpression().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaType getTypeReference() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaTypeConversionExpression.TypeReferenceProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setTypeReference(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypeConversionExpression.TypeReferenceProperty, value);
    }
    
    public metadslx.core.MetaExpression getExpression() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaTypeConversionExpression.ExpressionProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setExpression(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypeConversionExpression.ExpressionProperty, value);
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


