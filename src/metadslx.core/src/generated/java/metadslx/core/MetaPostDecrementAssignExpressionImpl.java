package metadslx.core;

@SuppressWarnings("unchecked")
class MetaPostDecrementAssignExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaPostDecrementAssignExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaPostDecrementAssignExpression; 
    }

    public MetaPostDecrementAssignExpressionImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaOperatorExpression.NameProperty, metadslx.core.Lazy.create(() -> "operator()--", true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaBoundExpression.UniqueDefinitionProperty, metadslx.core.Lazy.create(() -> true, true));
        this.mSet(metadslx.core.MetaDescriptor.MetaBoundExpression.ArgumentsProperty, new metadslx.core.ModelList<MetaExpression>(this, metadslx.core.MetaDescriptor.MetaBoundExpression.ArgumentsProperty));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionsProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getResolutionProvider().resolve(new metadslx.core.ResolutionInfo(ModelCompilerContext.current().getResolutionProvider().getCurrentScope(this), ResolveKind.Name, ((MetaOperatorExpression)this).getName())), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionProperty, metadslx.core.Lazy.create(() -> ((MetaBoundExpression)this).getUniqueDefinition() ? ModelCompilerContext.current().getBindingProvider().bind((ModelObject)((MetaBoundExpression)this), ((MetaBoundExpression)this).getDefinitions()) : null, true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().getTypeOf(((MetaBoundExpression)this).getDefinition()), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaPostDecrementAssignExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaOperatorExpression.NameProperty)) throw new ModelException("Readonly property Meta.MetaOperatorExpression.NameProperty was not set in MetaPostDecrementAssignExpression_MetaPostDecrementAssignExpression().");
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaPostDecrementAssignExpression_MetaPostDecrementAssignExpression().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaExpression getExpression() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaUnaryExpression.ExpressionProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setExpression(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaUnaryExpression.ExpressionProperty, value);
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaOperatorExpression.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public boolean getUniqueDefinition() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaBoundExpression.UniqueDefinitionProperty); 
        if (result != null) return (boolean)result;
        else return (boolean)false;
    }
    
    public java.util.List<metadslx.core.MetaExpression> getArguments() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaBoundExpression.ArgumentsProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaExpression>)result;
        else return (java.util.List<metadslx.core.MetaExpression>)null;
    }
    
    public metadslx.core.BindingInfo getDefinitions() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionsProperty); 
        if (result != null) return (metadslx.core.BindingInfo)result;
        else return (metadslx.core.BindingInfo)null;
    }
    
    public ModelObject getDefinition() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionProperty); 
        if (result != null) return (ModelObject)result;
        else return (ModelObject)null;
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


