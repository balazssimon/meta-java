package metadslx.core;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ModelCollection<T> implements Collection<T> {
	private ArrayList<Lazy<? extends T>> lazyItems;
	
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
		ArrayList<Lazy<? extends T>> lazyCopy = this.lazyItems;
		this.lazyItems = null;
		for (Lazy<? extends T> item: lazyCopy) {
			if (item.value() != null) {
				this.mAdd(item.value(), true);
			}
		}
	}
	
	protected void clearLazyItems() {
		this.lazyItems = null;
	}
	
	public boolean mLazyAdd(Lazy<? extends T> value) {
		if (value == null) return false;
		if (this.lazyItems == null) {
			this.lazyItems = new ArrayList<>();
		}
		this.lazyItems.add(value);
		return true;
	}
	
	public boolean mLazyAdd(Iterable<Lazy<? extends T>> values) {
		if (values == null) return false;
		if (this.lazyItems == null) {
			this.lazyItems = new ArrayList<>();
		}
		for (Lazy<? extends T> value: values) {
			this.mLazyAdd(value);
		}
		return true;
	}
	
	public abstract void clear();
	public abstract boolean mAdd(T item, boolean firstCall);
	public abstract boolean mRemove(T item, boolean firstCall);

}
