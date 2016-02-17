package metadslx.core;

public interface MetaFunction extends metadslx.core.MetaTypedElement, metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
{
    metadslx.core.MetaFunctionType getType();
    java.util.List<metadslx.core.MetaParameter> getParameters();
    metadslx.core.MetaType getReturnType();
    void setReturnType(metadslx.core.MetaType value);

}


