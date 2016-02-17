package metadslx.core;

public interface MetaEnumLiteral extends metadslx.core.MetaNamedElement, metadslx.core.MetaTypedElement
{
    metadslx.core.MetaEnum getEnum();
    void setEnum(metadslx.core.MetaEnum value);

}


