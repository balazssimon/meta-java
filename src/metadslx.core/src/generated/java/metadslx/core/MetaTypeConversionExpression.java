package metadslx.core;

public interface MetaTypeConversionExpression extends metadslx.core.MetaExpression
{
    metadslx.core.MetaType getTypeReference();
    void setTypeReference(metadslx.core.MetaType value);
    metadslx.core.MetaExpression getExpression();
    void setExpression(metadslx.core.MetaExpression value);

}


