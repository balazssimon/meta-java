package metadslx.core;

public interface MetaConstant extends metadslx.core.MetaTypedElement, metadslx.core.MetaDeclaration
{
    metadslx.core.MetaExpression getValue();
    void setValue(metadslx.core.MetaExpression value);

}


