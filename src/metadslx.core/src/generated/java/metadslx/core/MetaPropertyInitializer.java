package metadslx.core;


public interface MetaPropertyInitializer
{
    metadslx.core.MetaConstructor getConstructor();
    void setConstructor(metadslx.core.MetaConstructor value);
    String getPropertyName();
    void setPropertyName(String value);
    metadslx.core.MetaClass getPropertyContext();
    void setPropertyContext(metadslx.core.MetaClass value);
    metadslx.core.MetaProperty getProperty();
    void setProperty(metadslx.core.MetaProperty value);
    metadslx.core.MetaExpression getValue();
    void setValue(metadslx.core.MetaExpression value);

}


