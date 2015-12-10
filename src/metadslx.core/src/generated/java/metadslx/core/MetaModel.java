package metadslx.core;


public interface MetaModel extends metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
{
    String getUri();
    void setUri(String value);
    metadslx.core.MetaNamespace getNamespace();
    void setNamespace(metadslx.core.MetaNamespace value);

}


