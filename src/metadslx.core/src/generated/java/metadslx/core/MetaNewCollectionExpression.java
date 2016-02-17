package metadslx.core;

public interface MetaNewCollectionExpression extends metadslx.core.MetaExpression
{
    metadslx.core.MetaCollectionType getTypeReference();
    void setTypeReference(metadslx.core.MetaCollectionType value);
    java.util.List<metadslx.core.MetaExpression> getValues();

}


