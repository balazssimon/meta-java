package metadslx.compiler;

public abstract class SymbolBasedAnnotation {
	private Class<?> symbolType;
	private boolean overrideSymbolType;

	public Class<?> getSymbolType() {
		return symbolType;
	}

	public void setSymbolType(Class<?> symbolType) {
		this.symbolType = symbolType;
	}

	public boolean overrideSymbolType() {
		return overrideSymbolType;
	}

	public void setOverrideSymbolType(boolean overrideSymbolType) {
		this.overrideSymbolType = overrideSymbolType;
	}

}