package metadslx.core;

import java.util.ArrayList;
import java.util.List;

public class ResolutionInfo {
	private ResolveKind kind;
	private ArrayList<ModelObject> scopes;
	private ArrayList<Object> qualifiedNameNodes;
	private int position;
	private ResolutionLocation location;
	private ArrayList<Class<?>> symbolTypes;
	
	public ResolutionInfo() {
		this.kind = ResolveKind.NameOrType;
		this.scopes = new ArrayList<>();
		this.qualifiedNameNodes = new ArrayList<>();
		this.position = -1;
		this.location = ResolutionLocation.All;
		this.symbolTypes = new ArrayList<>();
	}

	public ResolutionInfo(Iterable<ModelObject> scopes, ResolveKind kind, Iterable<Object> qualifiedNameNodes, int position, ResolutionLocation location, Iterable<Class<?>> symbolTypes) {
		this();
		this.kind = kind;
		for (ModelObject mo: scopes) {
			this.scopes.add(mo);
		}
		for (Object o: qualifiedNameNodes) {
			this.qualifiedNameNodes.add(o);
		}
		this.position = position;
		this.location = location;
		for (Class<?> c: symbolTypes) {
			this.symbolTypes.add(c);
		}
	}
	
	public ResolutionInfo(ModelObject scope, ResolveKind kind, Object nameNode, int position, ResolutionLocation location) {
		this();
		this.kind = kind;
		this.scopes.add(scope);
		this.qualifiedNameNodes.add(nameNode);
		this.position = position;
		this.location = location;
	}
	
	public ResolutionInfo(ModelObject scope, ResolveKind kind, Object nameNode) {
		this();
		this.kind = kind;
		this.scopes.add(scope);
		this.qualifiedNameNodes.add(nameNode);
	}
	
	public ResolveKind getKind() {
		return kind;
	}

	public void setKind(ResolveKind kind) {
		this.kind = kind;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ResolutionLocation getLocation() {
		return location;
	}

	public void setLocation(ResolutionLocation location) {
		this.location = location;
	}

	public List<ModelObject> getScopes() {
		return scopes;
	}

	public List<Object> getQualifiedNameNodes() {
		return qualifiedNameNodes;
	}

	public List<Class<?>> getSymbolTypes() {
		return symbolTypes;
	}
	
}
