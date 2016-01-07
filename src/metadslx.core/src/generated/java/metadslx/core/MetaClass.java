package metadslx.core;

@Scope
public interface MetaClass extends metadslx.core.MetaType, metadslx.core.MetaDeclaration
{
    boolean getIsAbstract();
    void setIsAbstract(boolean value);
    java.util.List<metadslx.core.MetaClass> getSuperClasses();
    java.util.List<metadslx.core.MetaProperty> getProperties();
    java.util.List<metadslx.core.MetaOperation> getOperations();
    metadslx.core.MetaConstructor getConstructor();
    void setConstructor(metadslx.core.MetaConstructor value);

    java.util.List<metadslx.core.MetaClass> getAllSuperClasses();
    java.util.List<metadslx.core.MetaProperty> getAllProperties();
    java.util.List<metadslx.core.MetaOperation> getAllOperations();
    java.util.List<metadslx.core.MetaProperty> getAllImplementedProperties();
    java.util.List<metadslx.core.MetaOperation> getAllImplementedOperations();
}


