package metadslx.core;

public interface MetaUnaryExpression extends metadslx.core.MetaOperatorExpression
{
    metadslx.core.MetaExpression getExpression();
    void setExpression(metadslx.core.MetaExpression value);

}


