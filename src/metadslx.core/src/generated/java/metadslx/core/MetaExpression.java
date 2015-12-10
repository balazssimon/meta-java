package metadslx.core;


public interface MetaExpression extends metadslx.core.MetaTypedElement
{
    boolean getNoTypeError();
    metadslx.core.MetaType getExpectedType();

}


