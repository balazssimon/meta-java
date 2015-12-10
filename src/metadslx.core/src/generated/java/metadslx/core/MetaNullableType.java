package metadslx.core;


public interface MetaNullableType extends metadslx.core.MetaType
{
    metadslx.core.MetaType getInnerType();
    void setInnerType(metadslx.core.MetaType value);

}


