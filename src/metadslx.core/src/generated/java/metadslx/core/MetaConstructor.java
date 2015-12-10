package metadslx.core;


public interface MetaConstructor extends metadslx.core.MetaNamedElement, metadslx.core.MetaAnnotatedElement
{
    metadslx.core.MetaClass getParent();
    void setParent(metadslx.core.MetaClass value);
    java.util.List<metadslx.core.MetaPropertyInitializer> getInitializers();

}


