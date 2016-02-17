package metadslx.core;

public interface MetaProperty extends metadslx.core.MetaNamedElement, metadslx.core.MetaTypedElement, metadslx.core.MetaAnnotatedElement
{
    metadslx.core.MetaPropertyKind getKind();
    void setKind(metadslx.core.MetaPropertyKind value);
    metadslx.core.MetaClass getClass_();
    void setClass(metadslx.core.MetaClass value);
    java.util.List<metadslx.core.MetaProperty> getOppositeProperties();
    java.util.List<metadslx.core.MetaProperty> getSubsettedProperties();
    java.util.List<metadslx.core.MetaProperty> getSubsettingProperties();
    java.util.List<metadslx.core.MetaProperty> getRedefinedProperties();
    java.util.List<metadslx.core.MetaProperty> getRedefiningProperties();

}


