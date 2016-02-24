package metadslx.compiler;

public class SymbolAnnotation extends SymbolBasedAnnotation
{
    private boolean noScope;

	public boolean noScope() {
		return noScope;
	}

	public void setNoScope(boolean noScope) {
		this.noScope = noScope;
	}
    
}
