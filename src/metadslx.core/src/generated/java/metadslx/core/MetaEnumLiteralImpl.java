package metadslx.core;

class MetaEnumLiteralImpl extends metadslx.core.ModelObject implements metadslx.core.MetaEnumLiteral {
    static {
        metadslx.core.MetaDescriptor.staticInit();
    }

	@Override
    public metadslx.core.MetaModel mMetaModel() {
        return metadslx.core.MetaInstance.Meta; 
    }

	@Override
    public metadslx.core.MetaClass mMetaClass() {
        return metadslx.core.MetaInstance.MetaEnumLiteral; 
    }

    public MetaEnumLiteralImpl() {
        this.mLazySet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, metadslx.core.Lazy.create(() -> ((MetaEnumLiteral)this).getEnum(), true));
        metadslx.core.MetaImplementationProvider.implementation().MetaEnumLiteral(this);
        this.mMakeDefault();
    }
    
    public metadslx.core.MetaEnum getEnum() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaEnumLiteral.EnumProperty); 
        if (result != null) return (metadslx.core.MetaEnum)result;
        else return (metadslx.core.MetaEnum)null;
    }
    
    public void setEnum(metadslx.core.MetaEnum value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaEnumLiteral.EnumProperty, value);
    }
    
    public String getName() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setName(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaNamedElement.NameProperty, value);
    }
    
    public String getDocumentation() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaDocumentedElement.DocumentationProperty); 
        if (result != null) return (String)result;
        else return (String)null;
    }
    
    public void setDocumentation(String value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaDocumentedElement.DocumentationProperty, value);
    }
    
    public metadslx.core.MetaType getType() {
        Object result = this.mGet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty); 
        if (result != null) return (metadslx.core.MetaType)result;
        else return (metadslx.core.MetaType)null;
    }
    
    public void setType(metadslx.core.MetaType value) {
        this.mSet(metadslx.core.MetaDescriptor.MetaTypedElement.TypeProperty, value);
    }
    
    public java.util.List<String> getDocumentationLines() {
        return metadslx.core.MetaImplementationProvider.implementation().MetaDocumentedElement_getDocumentationLines(this);
    }
}


