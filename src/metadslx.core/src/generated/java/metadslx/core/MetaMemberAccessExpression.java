package metadslx.core;


public interface MetaMemberAccessExpression extends metadslx.core.MetaBoundExpression
{
    metadslx.core.MetaExpression getExpression();
    void setExpression(metadslx.core.MetaExpression value);
    String getName();
    void setName(String value);

}


