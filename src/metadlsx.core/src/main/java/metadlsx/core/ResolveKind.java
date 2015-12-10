package metadlsx.core;

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
}
