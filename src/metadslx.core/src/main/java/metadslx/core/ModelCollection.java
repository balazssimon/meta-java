package metadslx.core;

import java.util.ArrayList;

public abstract class ModelCollection {
	private ArrayList<Lazy<Object>> lazyItems;
	
	protected ModelObject owner;
	protected ModelProperty ownerProperty;
	
	public ModelCollection(ModelObject owner, ModelProperty ownerProperty) {
		this.lazyItems = null;
		this.owner = owner;
		this.ownerProperty = ownerProperty;
	}
	
	public boolean mHasLazyItems() {
		return this.lazyItems != null && this.lazyItems.size() > 0;
	}
	
	public void mFlushLazyItems() {
		if (this.lazyItems == null) return;
		ArrayList<Lazy<Object>> lazyCopy = this.lazyItems;
		this.lazyItems = null;
		for (Lazy<Object> item: lazyCopy) {
			if (item.value() != null) {
				this.mAdd(item.value(), true);
			}
		}
	}
	
	protected void clearLazyItems() {
		this.lazyItems = null;
	}
	
	public boolean mLazyAdd(Lazy<Object> value) {
		if (value == null) return false;
		if (this.lazyItems == null) {
			this.lazyItems = new ArrayList<>();
		}
		this.lazyItems.add(value);
		return true;
	}
	
	public boolean mLazyAdd(Iterable<Lazy<Object>> values) {
		if (values == null) return false;
		if (this.lazyItems == null) {
			this.lazyItems = new ArrayList<>();
		}
		for (Lazy<Object> value: values) {
			this.mLazyAdd(value);
		}
		return true;
	}
	
	public abstract void clear();
	public abstract boolean mAdd(Object item, boolean firstCall);
	public abstract boolean mRemove(Object item, boolean firstCall);
	
}
