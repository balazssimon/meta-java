package metadslx.core;


public interface MetaDeclaration extends metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
{
    metadslx.core.MetaNamespace getNamespace();
    void setNamespace(metadslx.core.MetaNamespace value);
    metadslx.core.MetaModel getModel();

}


