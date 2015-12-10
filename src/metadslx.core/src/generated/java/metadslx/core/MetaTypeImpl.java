package metadslx.core;

class MetaTypeImpl extends metadslx.core.ModelObject implements metadslx.core.MetaType {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaType; 
    }

    public MetaTypeImpl() {
        metadslx.core.MetaImplementationProvider.implementation().MetaType(this);
        this.mMakeDefault();
    }
}


