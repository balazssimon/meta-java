package metadslx.core;

public enum ResolutionLocation {
    Children(1),
    Inherited(2),
    Parent(4),
    Imported(8),
    ImportedScope(16),
    Scope(Children.getValue() | Inherited.getValue()),
    All(Children.getValue() | Inherited.getValue() | Parent.getValue() | Imported.getValue() | ImportedScope.getValue());
    
    private int value;
      
    private ResolutionLocation(int value) {
		this.value = value;
	}
    
    public int getValue() {
    	return this.value;
    }
    
    public boolean hasFlag(ResolutionLocation location) {
    	return (this.value & location.value) != 0;
    }
}
