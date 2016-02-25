package metadslx.core;

import java.util.List;

@SuppressWarnings("unchecked")
@Scope
public class RootScope extends ModelObject {
	public RootScope() {
		this.mSet(RootScope.BuiltInEntriesProperty, new ModelList<ModelObject>(this, RootScope.BuiltInEntriesProperty));
		this.mSet(RootScope.EntriesProperty, new ModelList<ModelObject>(this, RootScope.EntriesProperty));
	}
	
	@ScopeEntry
	public static final ModelProperty BuiltInEntriesProperty =
		ModelProperty.register("BuiltInEntries", List.class, ModelObject.class, RootScope.class);
	
	@Containment
	@ScopeEntry
	public static final ModelProperty EntriesProperty =
		ModelProperty.register("Entries", List.class, ModelObject.class, RootScope.class);
	
	public List<ModelObject> getBuiltInEntries() {
		return (List<ModelObject>)this.mGet(RootScope.BuiltInEntriesProperty);
	}
	
	public List<ModelObject> getEntries() {
		return (List<ModelObject>)this.mGet(RootScope.EntriesProperty);
	}
}
