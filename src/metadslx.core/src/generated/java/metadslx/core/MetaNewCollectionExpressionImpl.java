package metadslx.core;

@SuppressWarnings("unchecked")
class MetaNewCollectionExpressionImpl extends metadslx.core.ModelObject implements metadslx.core.MetaNewCollectionExpression {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaNewCollectionExpression; 
    }

    public MetaNewCollectionExpressionImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewCollectionExpression.ValuesProperty, new metadslx.core.ModelList<MetaExpression>(this, metadslx.core.MetaDescriptor.MetaNewCollectionExpression.ValuesProperty));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty, metadslx.core.Lazy.create(() -> ModelCompilerContext.current().getTypeProvider().typeCheck((ModelObject)((MetaExpression)this)), true));
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ((MetaNewCollectionExpression)this).getTypeReference(), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaNewCollectionExpression(this);
        if (!this.mIsSet(metadslx.core.MetaDescriptor.MetaExpression.NoTypeErrorProperty)) throw new ModelException("Readonly property Meta.MetaExpression.NoTypeErrorProperty was not set in MetaNewCollectionExpression_MetaNewCollectionExpression().");
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaCollectionType getTypeReference() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewCollectionExpression.TypeReferenceProperty); 
        if (result != null) return (metadslx.core.MetaCollectionType)result;
        else return (metadslx.core.MetaCollectionType)null;
    }
    
    public void setTypeReference(metadslx.core.MetaCollectionType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNewCollectionExpression.TypeReferenceProperty, value);
    }
    
    public java.util.List<metadslx.core.MetaExpression> getValues() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNewCollectionExpression.ValuesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaExpression>)result;
        else return (java.util.List<metadslx.core.MetaExpression>)null;
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


