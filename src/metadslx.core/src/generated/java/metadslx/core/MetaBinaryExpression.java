package metadslx.core;


public interface MetaBinaryExpression extends metadslx.core.MetaOperatorExpression
{
    metadslx.core.MetaExpression getLeft();
    void setLeft(metadslx.core.MetaExpression value);
    metadslx.core.MetaExpression getRight();
    void setRight(metadslx.core.MetaExpression value);

}


