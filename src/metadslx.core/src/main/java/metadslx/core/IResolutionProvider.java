package metadslx.core;

public interface IResolutionProvider {
	ModelObject getParentScope(ModelObject symbol);
	ModelObject getCurrentScope(ModelObject symbol);
	ModelObject getCurrentTypeScopeOf(ModelObject symbol);
	BindingInfo resolve(ResolutionInfo resolutionInfo);
}
