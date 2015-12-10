package metadlsx.core;

import java.util.List;

public interface IResolutionProvider {
	ModelObject getParentScope(ModelObject symbol);
	ModelObject getCurentScope(ModelObject symbol);
	ModelObject getCurrentTypeScopeOf(ModelObject symbol);
	Iterable<ModelObject> resolve(Iterable<ModelObject> scopes, ResolveKind kind, List<String> qualifiedName, ResolutionInfo info, ResolveFlags flags);
	Iterable<ModelObject> resolve(Iterable<ModelObject> scopes, ResolveKind kind, String name, ResolutionInfo info, ResolveFlags flags);
}
