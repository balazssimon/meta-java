package metadslx.core;

public interface MetaFunctionType extends metadslx.core.MetaType
{
    java.util.List<metadslx.core.MetaType> getParameterTypes();
    metadslx.core.MetaType getReturnType();
    void setReturnType(metadslx.core.MetaType value);

}


