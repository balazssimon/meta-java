package metadslx.core;

public interface MetaInheritedPropertyInitializer extends metadslx.core.MetaPropertyInitializer
{
    String getObjectName();
    void setObjectName(String value);
    metadslx.core.MetaProperty getObject();
    void setObject(metadslx.core.MetaProperty value);

}


