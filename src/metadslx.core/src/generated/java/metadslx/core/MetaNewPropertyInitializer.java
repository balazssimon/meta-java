package metadslx.core;


public interface MetaNewPropertyInitializer
{
    metadslx.core.MetaNewExpression getParent();
    void setParent(metadslx.core.MetaNewExpression value);
    String getPropertyName();
    void setPropertyName(String value);
    metadslx.core.MetaExpression getValue();
    void setValue(metadslx.core.MetaExpression value);
    metadslx.core.MetaProperty getProperty();
    void setProperty(metadslx.core.MetaProperty value);

}


