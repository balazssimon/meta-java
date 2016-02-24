package metadslx.compiler;

public class NameDefAnnotation extends SymbolBasedAnnotation {
	private boolean merge;
	private boolean overload;
	private boolean scope;
	private String nestingProperty;

	public NameDefAnnotation() {
		this.scope = true;
	}

	public String getNestingProperty() {
		return nestingProperty;
	}

	public void setNestingProperty(String nestingProperty) {
		this.nestingProperty = nestingProperty;
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
