package metadslx.core;

public interface MetaNewExpression extends metadslx.core.MetaExpression
{
    metadslx.core.MetaClass getTypeReference();
    void setTypeReference(metadslx.core.MetaClass value);
    java.util.List<metadslx.core.MetaNewPropertyInitializer> getPropertyInitializers();

}


