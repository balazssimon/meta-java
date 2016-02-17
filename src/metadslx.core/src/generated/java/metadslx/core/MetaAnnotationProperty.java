package metadslx.core;

public interface MetaAnnotationProperty extends metadslx.core.MetaNamedElement
{
    metadslx.core.MetaExpression getValue();
    void setValue(metadslx.core.MetaExpression value);

}


