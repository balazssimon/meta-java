package metadlsx.core;

import java.util.HashSet;

public class Model {
	private HashSet<ModelObject> instances = new HashSet<>();
	
	public Iterable<ModelObject> instances() {
		return this.instances;
	}
	
	public void addInstance(ModelObject obj) {
		this.instances.add(obj);
	}
	
	public void removeInstance(ModelObject obj) {
		this.instances.remove(obj);
	}
}
