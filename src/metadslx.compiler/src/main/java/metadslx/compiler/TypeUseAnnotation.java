package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;

import metadslx.core.ResolutionLocation;

public class TypeUseAnnotation {
	private List<Class<?>> symbolTypes;
	private ResolutionLocation location;

	public TypeUseAnnotation() {
		this.symbolTypes = new ArrayList<Class<?>>();
		this.location = ResolutionLocation.All;
	}

	public List<Class<?>> getSymbolTypes() {
		return symbolTypes;
	}

	public ResolutionLocation getLocation() {
		return location;
	}

	public void setLocation(ResolutionLocation location) {
		this.location = location;
	}
}
