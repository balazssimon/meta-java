package metadslx.core;

public interface MetaBoundExpression extends metadslx.core.MetaExpression
{
    boolean getUniqueDefinition();
    java.util.List<metadslx.core.MetaExpression> getArguments();
    metadslx.core.BindingInfo getDefinitions();
    ModelObject getDefinition();

}


