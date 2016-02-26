package metadslx.core;

public enum ResolveKind {
    Name(1),
    Type(2),
    NameOrType(Name.getValue() | Type.getValue());
    
    private int value;
      
    private ResolveKind(int value) {
		this.value = value;
	}
    
    public int getValue() {
    	return this.value;
    }
    
    public boolean hasFlag(ResolveKind kind) {
    	return (value & kind.value) != 0;
    }
}
