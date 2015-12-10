package metadslx.core;

class MetaFunctionTypeImpl extends metadslx.core.ModelObject implements metadslx.core.MetaFunctionType {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaFunctionType; 
    }

    public MetaFunctionTypeImpl() {
        this.mSet(metadslx.core.MetaDescriptor.MetaFunctionType.ParameterTypesProperty, new metadslx.core.ModelMultiList<MetaType>(this, metadslx.core.MetaDescriptor.MetaFunctionType.ParameterTypesProperty));
        metadslx.core.MetaImplementationProvider.implementation().MetaFunctionType(this);
        this.mMakeDefault();
    }
    
    public java.util.List<metadslx.core.MetaType> getParameterTypes() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaFunctionType.ParameterTypesProperty); 
        if (result != null) return (java.util.List<metadslx.core.MetaType>)result;
        else return (java.util.List<metadslx.core.MetaType>)null;
    }
    
    public metadslx.core.MetaType getReturnType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaFunctionType.ReturnTypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setReturnType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaFunctionType.ReturnTypeProperty, value);
    }
}


