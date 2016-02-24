package metadslx.compiler;

public class TypeDefAnnotation extends SymbolBasedAnnotation {
	private boolean merge;
	private boolean overload;
	private boolean scope;

	public TypeDefAnnotation() {
		this.scope = true;
	}

	public boolean merge() {
		return merge;
	}

	public void setMerge(boolean merge) {
		this.merge = merge;
	}

	public boolean overload() {
		return overload;
	}

	public void setOverload(boolean overload) {
		this.overload = overload;
	}

	public boolean scope() {
		return scope;
	}

	public void setScope(boolean scope) {
		this.scope = scope;
	}
}
