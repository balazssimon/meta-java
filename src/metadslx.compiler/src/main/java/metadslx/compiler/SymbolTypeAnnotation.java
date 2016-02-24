package metadslx.compiler;

public class SymbolTypeAnnotation {
	private String name;
	private boolean hasName;
	private Class symbolType;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		this.hasName = true;
	}

	public boolean hasName() {
		return hasName;
	}

	public void setHasName(boolean hasName) {
		this.hasName = hasName;
	}

	public Class getSymbolType() {
		return symbolType;
	}

	public void setSymbolType(Class symbolType) {
		this.symbolType = symbolType;
	}
}
