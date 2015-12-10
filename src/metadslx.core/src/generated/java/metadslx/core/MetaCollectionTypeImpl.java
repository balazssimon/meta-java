package metadslx.core;

class MetaCollectionTypeImpl extends metadslx.core.ModelObject implements metadslx.core.MetaCollectionType {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaCollectionType; 
    }

    public MetaCollectionTypeImpl() {
        metadslx.core.MetaImplementationProvider.implementation().MetaCollectionType(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaCollectionKind getKind() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaCollectionType.KindProperty); 
        if (result != null) return (metadslx.core.MetaCollectionKind)result;
        else return (metadslx.core.MetaCollectionKind)null;
    }
    
    public void setKind(metadslx.core.MetaCollectionKind value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaCollectionType.KindProperty, value);
    }
    
    public metadslx.core.MetaType getInnerType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaCollectionType.InnerTypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setInnerType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaCollectionType.InnerTypeProperty, value);
    }
}


