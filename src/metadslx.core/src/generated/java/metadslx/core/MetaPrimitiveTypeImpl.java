package metadslx.core;

class MetaPrimitiveTypeImpl extends metadslx.core.ModelObject implements metadslx.core.MetaPrimitiveType {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaPrimitiveType; 
    }

    public MetaPrimitiveTypeImpl() {
        metadslx.core.MetaImplementationProvider.implementation().MetaPrimitiveType(this);
        this.mMakeDefault();
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty, value);
    }
}


