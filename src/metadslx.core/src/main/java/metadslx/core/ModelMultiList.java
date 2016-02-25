package metadslx.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ModelMultiList<T> extends ModelCollection<T> implements List<T> {
	private ArrayList<T> items;
	
	public ModelMultiList(ModelObject owner, ModelProperty ownerProperty) {
		super(owner, ownerProperty);
		this.items = new ArrayList<T>();
	}

	public ModelMultiList(ModelObject owner, ModelProperty ownerProperty, Iterable<T> values) {
		super(owner, ownerProperty);
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
	public <U> U[] toArray(U[] a) {
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
        if (this.items.remove(item))
        {
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
	public boolean addAll(int index, Collection<? extends T> c) {
		this.mFlushLazyItems();
		boolean result = false;
		for (T item : c) {
			this.items.add(index, item);
			this.owner.mOnAddValue(this.ownerProperty, item, true);
			result = true;
			++index;
		}
		return result;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		this.mFlushLazyItems();
		boolean removed = false;
		for (Object item : c) {
	        while (this.items.remove(item))
	        {
				this.owner.mOnRemoveValue(this.ownerProperty, item, true);
	            removed = true;
			}
		}
		return removed;
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
	public T get(int index) {
		this.mFlushLazyItems();
		return this.items.get(index);
	}

	@Override
	public T set(int index, T value) {
		this.mFlushLazyItems();
        Object item = this.items.get(index);
        this.items.set(index, null);
        this.owner.mOnRemoveValue(this.ownerProperty, item, true);
        item = value;
        this.items.set(index, value);
        this.owner.mOnAddValue(this.ownerProperty, item, true);
        return value;
	}

	@Override
	public void add(int index, T item) {
		this.mFlushLazyItems();
		this.items.add(index, item);
		this.owner.mOnAddValue(this.ownerProperty, item, true);
	}

	@Override
	public T remove(int index) {
		this.mFlushLazyItems();
		T item = this.items.remove(index);
        this.owner.mOnRemoveValue(this.ownerProperty, item, true);
        return item;
	}

	@Override
	public int indexOf(Object o) {
		this.mFlushLazyItems();
		return this.items.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		this.mFlushLazyItems();
		return this.items.lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		this.mFlushLazyItems();
		return this.items.subList(fromIndex, toIndex);
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

	@SuppressWarnings("unchecked")
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
