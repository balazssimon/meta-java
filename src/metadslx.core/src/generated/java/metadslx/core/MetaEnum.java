package metadslx.core;

@metadslx.core.Scope
public interface MetaEnum extends metadslx.core.MetaType, metadslx.core.MetaDeclaration
{
    java.util.List<metadslx.core.MetaEnumLiteral> getEnumLiterals();
    java.util.List<metadslx.core.MetaOperation> getOperations();

}


