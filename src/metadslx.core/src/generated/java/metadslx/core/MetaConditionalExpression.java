package metadslx.core;

public interface MetaConditionalExpression extends metadslx.core.MetaExpression
{
    metadslx.core.MetaExpression getCondition();
    void setCondition(metadslx.core.MetaExpression value);
    metadslx.core.MetaType getBalancedType();
    void setBalancedType(metadslx.core.MetaType value);
    metadslx.core.MetaExpression getThen();
    void setThen(metadslx.core.MetaExpression value);
    metadslx.core.MetaExpression getElse();
    void setElse(metadslx.core.MetaExpression value);

}


