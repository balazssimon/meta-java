package metadslx.core;

class MetaConditionalExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaConditionalExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaConditionalExpression; 
    }

    public MetaConditionalExpressionImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().balance((ModelObject)((MetaConditionalExpression)this).getThen().getType(), (ModelObject)((MetaConditionalExpression)this).getElse().getType()), true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaConditionalExpression.ConditionProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> 	MetaInstance.Bool	, true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaConditionalExpression.ThenProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> ((MetaConditionalExpression)this).getExpectedType(), true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaConditionalExpression.ElseProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> ((MetaConditionalExpression)this).getExpectedType(), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaConditionalExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaConditionalExpression_MetaConditionalExpression().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaExpression getCondition() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConditionalExpression.ConditionProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setCondition(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaConditionalExpression.ConditionProperty, value);
    }
    
    public metadslx.core.MetaType getBalancedType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConditionalExpression.BalancedTypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setBalancedType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaConditionalExpression.BalancedTypeProperty, value);
    }
    
    public metadslx.core.MetaExpression getThen() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConditionalExpression.ThenProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setThen(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaConditionalExpression.ThenProperty, value);
    }
    
    public metadslx.core.MetaExpression getElse() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaConditionalExpression.ElseProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setElse(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaConditionalExpression.ElseProperty, value);
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


