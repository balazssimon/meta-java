package metadslx.core;


public interface MetaParameter extends metadslx.core.MetaNamedElement, metadslx.core.MetaTypedElement, metadslx.core.MetaAnnotatedElement
{
    metadslx.core.MetaFunction getFunction();
    void setFunction(metadslx.core.MetaFunction value);

}


