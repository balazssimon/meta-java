package metadslx.core;

import metadslx.core.MetaType;

public interface ITypeProvider {
	ModelObject balance(ModelObject left, ModelObject right);
	boolean isAssignableFrom(ModelObject left, ModelObject right);
	boolean equals(ModelObject left, ModelObject right);
	boolean typeCheck(ModelObject symbol);
	MetaType getTypeOf(ModelObject symbol);
	MetaType getTypeOf(Object value);
	MetaType getReturnTypeOf(ModelObject symbol);
}
