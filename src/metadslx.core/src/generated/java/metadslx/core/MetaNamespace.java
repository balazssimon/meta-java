package metadslx.core;

@metadslx.core.Scope
public interface MetaNamespace extends metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
{
    metadslx.core.MetaNamespace getParent();
    void setParent(metadslx.core.MetaNamespace value);
    java.util.List<metadslx.core.MetaNamespace> getUsings();
    metadslx.core.MetaModel getMetaModel();
    void setMetaModel(metadslx.core.MetaModel value);
    java.util.List<metadslx.core.MetaNamespace> getNamespaces();
    java.util.List<metadslx.core.MetaDeclaration> getDeclarations();

}


