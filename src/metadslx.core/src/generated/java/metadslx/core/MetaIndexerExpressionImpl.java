package metadslx.core;

class MetaIndexerExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaIndexerExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaIndexerExpression; 
    }

    public MetaIndexerExpressionImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaBoundExpression.UniqueDefinitionProperty, metadslx.core.Lazy.create(() -> true, true));
        this.mSet(metadslx.core.MetaDescriptor.MetaBoundExpression.ArgumentsProperty, new metadslx.core.ModelList<MetaExpression>(this, metadslx.core.MetaDescriptor.MetaBoundExpression.ArgumentsProperty));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionsProperty, metadslx.core.Lazy.create(() -> ((MetaIndexerExpression)this).getExpression() instanceof MetaBoundExpression ? ((((MetaBoundExpression)((MetaIndexerExpression)this).getExpression()).getDefinitions()).stream().filter(e -> ModelCompilerContext.current().getTypeProvider().getTypeOf(e) instanceof metadslx.core.MetaFunctionType).collect(java.util.stream.Collectors.toList())).stream().filter(e -> ModelCompilerContext.current().getNameProvider().getNameOf((ModelObject)e) == "operator[]").collect(java.util.stream.Collectors.toList()) : null, true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getBindingProvider().bind(this, ((MetaBoundExpression)this).getDefinitions(), new BindingInfo()), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().getTypeOf(((MetaBoundExpression)this).getDefinition()), true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaIndexerExpression.ExpressionProperty, metadslx.core.MetaDescriptor.MetaBoundExpression.UniqueDefinitionProperty, metadslx.core.Lazy.create(() -> false, true));
        this.mLazySetChild(metadslx.core.MetaDescriptor.MetaIndexerExpression.ExpressionProperty, metadslx.core.MetaDescriptor.MetaExpression.ExpectedTypeProperty, metadslx.core.Lazy.create(() -> 	MetaInstance.None	, true));
        metadslx.core.MetaImplementationProvider.implementation().MetaIndexerExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaIndexerExpression_MetaIndexerExpression().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaExpression getExpression() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaIndexerExpression.ExpressionProperty); 
        if (result != null) return (metadslx.core.MetaExpression)result;
        else return (metadslx.core.MetaExpression)null;
    }
    
    public void setExpression(metadslx.core.MetaExpression value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaIndexerExpression.ExpressionProperty, value);
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
    
    public java.util.List<ModelObject> getDefinitions() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaBoundExpression.DefinitionsProperty); 
        if (result != null) return (java.util.List<ModelObject>)result;
        else return (java.util.List<ModelObject>)null;
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

