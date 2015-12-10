package metadslx.core;


public interface MetaOperation extends metadslx.core.MetaFunction
{
    metadslx.core.MetaType getParent();
    void setParent(metadslx.core.MetaType value);

}


