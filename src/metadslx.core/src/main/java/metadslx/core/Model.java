package metadslx.core;

import java.util.HashSet;

public class Model {
	private HashSet<ModelObject> instances = new HashSet<>();
	
	public Iterable<ModelObject> instances() {
		return this.instances;
	}
	
	public Iterable<ModelObject> cachedInstances() {
		return new HashSet<ModelObject>(this.instances);
	}
	
	public void addInstance(ModelObject obj) {
		if (obj.mModel() != null && obj.mModel() != this) {
			throw new ModelException("The object "+obj+" is already contained by another model.");
		} else {
			this.instances.add(obj);
			obj.mSetModel(this);
		}
	}
	
	public void removeInstance(ModelObject obj) {
		this.instances.remove(obj);
		obj.mSetModel(null);
	}
	
	public void evalLazyValues() {
		int oldCount = -1;
		int uninitialized = -1;
		int oldUninitialized = 0;
		while (oldCount != this.instances.size() || oldUninitialized != uninitialized) {
			oldCount = this.instances.size();
			for (ModelObject mo: this.cachedInstances()) {
				mo.mEvalLazyValues();
			}
			oldUninitialized = uninitialized;
			uninitialized = 0;
			for (ModelObject mo: this.cachedInstances()) {
				if (mo.mHasUninitializedValue()) {
					++uninitialized;
				}
			}
		}
	}
}
