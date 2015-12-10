package metadslx.core;

class MetaNullableTypeImpl extends metadslx.core.ModelObject implements metadslx.core.MetaNullableType {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaNullableType; 
    }

    public MetaNullableTypeImpl() {
        metadslx.core.MetaImplementationProvider.implementation().MetaNullableType(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaType getInnerType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNullableType.InnerTypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setInnerType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNullableType.InnerTypeProperty, value);
    }
}


