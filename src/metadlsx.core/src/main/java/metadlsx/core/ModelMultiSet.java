package metadlsx.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ModelMultiSet<T> extends ModelCollection implements Collection<T> {
	private ArrayList<T> items;

	public ModelMultiSet(ModelObject owner, ModelProperty ownerProperty) {
		super(owner, ownerProperty);
		if (ownerProperty.getOppositeProperties().size() > 0) {
			throw new ModelException("Multi sets cannot have opposite properties.");
		}
		this.items = new ArrayList<T>();
	}

	public ModelMultiSet(ModelObject owner, ModelProperty ownerProperty, Iterable<? extends T> values) {
		super(owner, ownerProperty);
		if (ownerProperty.getOppositeProperties().size() > 0) {
			throw new ModelException("Multi sets cannot have opposite properties.");
		}
		this.items = new ArrayList<T>();
		for (T value : values) {
			this.add(value);
		}
	}

	@Override
	public int size() {
		this.mFlushLazyItems();
		return this.items.size();
	}

	@Override
	public boolean isEmpty() {
		this.mFlushLazyItems();
		return this.items.isEmpty();
	}

	@Override
	public boolean contains(Object item) {
		this.mFlushLazyItems();
		return this.items.contains(item);

	}

	@Override
	public Iterator<T> iterator() {
		this.mFlushLazyItems();
		return this.items.iterator();

	}

	@Override
	public Object[] toArray() {
		this.mFlushLazyItems();
		return this.items.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		this.mFlushLazyItems();
		return this.items.toArray(a);
	}

	@Override
	public boolean add(T item) {
		this.mFlushLazyItems();
		this.items.add(item);
		this.owner.mOnAddValue(this.ownerProperty, item, true);
		return true;
	}

	@Override
	public boolean remove(Object item) {
		this.mFlushLazyItems();
		if (this.items.remove(item)) {
			this.owner.mOnRemoveValue(this.ownerProperty, item, true);
			return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		this.mFlushLazyItems();
		for (Object item : c) {
			if (!this.items.contains(item)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		this.mFlushLazyItems();
		boolean result = false;
		for (T item : c) {
			this.items.add(item);
			this.owner.mOnAddValue(this.ownerProperty, item, true);
			result = true;
		}
		return result;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		this.mFlushLazyItems();
		boolean result = false;
		for (Object item : c) {
			while (this.items.remove(item)) {
				this.owner.mOnRemoveValue(this.ownerProperty, item, true);
				result = true;
			}
		}
		return result;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		this.mFlushLazyItems();
		boolean result = false;
		ArrayList<T> copy = new ArrayList<>(this.items);
		for (T item : copy) {
			if (!c.contains(item)) {
				while (this.items.remove(item)) {
					this.owner.mOnRemoveValue(this.ownerProperty, item, true);
					result = true;
				}
			}
		}
		return result;
	}

	@Override
	public void clear() {
		this.clearLazyItems();
		ArrayList<T> oldItems = this.items;
		this.items = new ArrayList<T>();
		for (T item : oldItems) {
			this.owner.mOnRemoveValue(this.ownerProperty, item, true);
		}
	}

	@Override
	public boolean mAdd(Object item, boolean firstCall) {
		this.mFlushLazyItems();
		if (firstCall) {
			this.items.add((T) item);
			this.owner.mOnAddValue(this.ownerProperty, item, firstCall);
			return true;
		}
		return false;
	}

	@Override
	public boolean mRemove(Object item, boolean firstCall) {
		this.mFlushLazyItems();
		if (firstCall && this.items.remove(item)) {
			this.owner.mOnRemoveValue(this.ownerProperty, item, firstCall);
			return true;
		}
		return false;
	}
}
