package metadslx.core;


public interface MetaCollectionType extends metadslx.core.MetaType
{
    metadslx.core.MetaCollectionKind getKind();
    void setKind(metadslx.core.MetaCollectionKind value);
    metadslx.core.MetaType getInnerType();
    void setInnerType(metadslx.core.MetaType value);

}


