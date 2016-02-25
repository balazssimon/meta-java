package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;

import metadslx.core.ResolveFlags;

public class NameUseAnnotation {
	private List<Class<?>> symbolTypes;
	private ResolveFlags resolveFlags;

	public NameUseAnnotation() {
		this.symbolTypes = new ArrayList<Class<?>>();
		this.resolveFlags = ResolveFlags.All;
	}

	public List<Class<?>> getSymbolTypes() {
		return symbolTypes;
	}

	public ResolveFlags getResolveFlags() {
		return resolveFlags;
	}

	public void setResolveFlags(ResolveFlags resolveFlags) {
		this.resolveFlags = resolveFlags;
	}
}
