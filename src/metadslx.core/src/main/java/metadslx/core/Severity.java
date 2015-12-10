package metadslx.core;

public enum Severity {
    Error(1),
    Warning(2),
    Info(4),
    All(Error.getValue() | Warning.getValue() | Info.getValue());
    
    private int value;
      
    private Severity(int value) {
		this.value = value;
	}
    
    public int getValue() {
    	return this.value;
    }
   
}
