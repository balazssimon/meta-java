package metadslx.core;

import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.function.Supplier;

import metadslx.core.MetaClass;
import metadslx.core.MetaModel;

public abstract class ModelObject {
	private ModelProperty nameProperty = null;

	private HashMap<ModelProperty, WeakReference<Object>> defaultValues;
	private HashMap<ModelProperty, Object> values;
	private HashMap<ModelProperty, Lazy<Object>> initializers;
	private HashMap<ModelProperty, Supplier<Object>> derivedValues;
	private HashMap<ModelProperty, HashMap<ModelProperty, Lazy<Object>>> childInitializers;

	private String metaID;
	private ModelObject parent;
	private HashSet<ModelObject> children = new HashSet<ModelObject>();

	public ModelObject() {
		this(true);
	}

	public ModelObject(boolean addToModelContext) {
		if (addToModelContext && ModelContext.hasContext()) {
			ModelContext.current().addInstance(this);
		}
		this.metaID = UUID.randomUUID().toString();
		this.values = new HashMap<>();
		this.initializers = new HashMap<>();
		this.derivedValues = new HashMap<>();
		this.childInitializers = new HashMap<>();
	}

	public String getMetaID() {
		return this.metaID;
	}

	public MetaModel mMetaModel() {
		return null;
	}

	public MetaClass mMetaClass() {
		return null;
	}

	public void mEvalLazyValues() {
		Set<ModelProperty> properties = this.initializers.keySet();
		for (ModelProperty property : properties) {
			this.mGet(property);
		}
		properties = this.values.keySet();
		for (ModelProperty property : properties) {
			Object value = this.mGet(property);
			if (value instanceof ModelCollection) {
				ModelCollection collection = (ModelCollection) value;
				collection.mFlushLazyItems();
			}
		}
	}

	public boolean mHasUninitializedValue() {
		HashSet<ModelProperty> lazyProperties = new HashSet<ModelProperty>(this.initializers.keySet());
		HashSet<ModelProperty> valueProperties = new HashSet<ModelProperty>(this.values.keySet());
		lazyProperties.removeAll(valueProperties);
		if (lazyProperties.size() > 0)
			return true;
		for (ModelProperty property : valueProperties) {
			Object value = this.mGet(property);
			if (value instanceof ModelCollection) {
				ModelCollection collection = (ModelCollection) value;
				if (collection.mHasLazyItems())
					return true;
			}
		}
		return false;
	}

	public void mMakeDefault() {
		this.defaultValues = new HashMap<>();
		for (Entry<ModelProperty, Object> entry : this.values.entrySet()) {
			this.defaultValues.put(entry.getKey(), new WeakReference<Object>(entry.getValue()));
		}
	}

	public boolean mIsDefault(ModelProperty property) {
		Object currentValue = this.values.get(property);
		Object defaultValue = null;
		boolean lostDefaultValue = false;
		if (this.defaultValues != null) {
			WeakReference<Object> containedValue = this.defaultValues.get(property);
			if (containedValue != null) {
				defaultValue = containedValue.get();
				lostDefaultValue = containedValue.isEnqueued();
			}
		}
		if (!lostDefaultValue && defaultValue == null && currentValue == null)
			return true;
		else if (lostDefaultValue || defaultValue == null || currentValue == null)
			return false;
		else
			return defaultValue == currentValue;
	}

	public boolean mIsValueCreated(ModelProperty property) {
		return this.values.containsKey(property) || this.derivedValues.containsKey(property);
	}

	public boolean mIsSet(ModelProperty property) {
		return this.values.containsKey(property) || this.initializers.containsKey(property)
				|| this.derivedValues.containsKey(property);
	}

	public void mUnSet(ModelProperty property) {
		Object oldValue = this.values.get(property);
		if (oldValue != null) {
			if (property.isCollection() && oldValue instanceof ModelCollection) {
				((ModelCollection) oldValue).clear();
			} else {
				this.mRemove(property, oldValue);
			}
		}
		this.values.remove(property);
		this.initializers.remove(property);
	}

	public void mDerivedSet(ModelProperty property, Supplier<Object> value) {
		this.derivedValues.put(property, value);
	}

	public void mLazySet(ModelProperty property, Lazy<Object> value) {
		boolean containsValue = this.values.containsKey(property);
		Object oldValue = this.values.get(property);
		if (property.isCollection()) {
			throw new ModelException("Error in '" + this.toString() + "'. Cannot reassign a collection property '"
					+ property.toString() + "'. Consider adding the items instead.");
		} else if (containsValue && property.isReadonly()) {
			throw new ModelException("Error in '" + this.toString() + "'. Cannot reassign a readonly property '"
					+ property.toString() + "'.");
		} else {
			this.mRemove(property, oldValue);
		}
		this.values.remove(property);
		this.initializers.put(property, value);
	}

	public void mLazySetChild(ModelProperty child, ModelProperty property, Lazy<Object> value) {
		HashMap<ModelProperty, Lazy<Object>> childProperties = this.childInitializers.get(child);
		if (childProperties == null) {
			childProperties = new HashMap<>();
			this.childInitializers.put(child, childProperties);
		}
		boolean containsValue = this.values.containsKey(property);
		if (containsValue && property.isReadonly()) {
			throw new ModelException("Error in '" + this.toString() + "'. Cannot reassign a readonly property '"
					+ property.toString() + "'.");
		} else {
			childProperties.remove(property);
		}
		childProperties.put(property, value);
		Object childObject = this.values.get(child);
		if (childObject instanceof ModelObject) {
			ModelObject childModelObject = (ModelObject) childObject;
			childModelObject.mLazyAdd(property, value);
		}
	}

	public void mSet(ModelProperty property, Object newValue) {
		boolean containsValue = this.values.containsKey(property);
		Object oldValue = this.values.get(property);
		if (containsValue) {
			if (newValue == oldValue)
				return;
			if (property.isCollection()) {
				throw new ModelException("Error in '" + this.toString() + "'. Cannot reassign a collection property '"
						+ property.toString() + "'. Consider adding the items instead.");
			} else if (property.isReadonly()) {
				throw new ModelException("Error in '" + this.toString() + "'. Cannot reassign a readonly property '"
						+ property.toString() + "'.");
			}
		}
		if (newValue instanceof ModelCollection) {
			this.values.put(property, newValue);
		} else {
			this.mAdd(property, newValue);
		}
	}

	public Object mGet(ModelProperty property) {
		return this.mGet(property, true);
	}

	public Object mGet(ModelProperty property, boolean evalLazyValue) {
		boolean containsValue = this.values.containsKey(property);
		if (containsValue) {
			return this.values.get(property);
		} else {
			if (evalLazyValue && this.initializers.containsKey(property)) {
				Lazy<Object> initializer = this.initializers.get(property);
				if (initializer != null) {
					// TODO: handle circular dependency
					Object value = initializer.value();
					this.values.put(property, value);
					if (!(value instanceof ModelCollection)) {
						this.mAdd(property, value);
					}
					return value;
				}
			} else if (this.derivedValues.containsKey(property)) {
				Supplier<Object> derived = this.derivedValues.get(property);
				if (derived != null) {
					return derived.get();
				}
			}
		}
		return null;
	}

	public Set<ModelProperty> mGetAllProperties() {
		HashSet<ModelProperty> result = new HashSet<ModelProperty>();
		for (ModelProperty prop : ModelProperty.getAllPropertiesForType(this.getClass())) {
			result.add(prop);
		}
		for (ModelProperty prop : this.values.keySet()) {
			result.add(prop);
		}
		for (ModelProperty prop : this.initializers.keySet()) {
			result.add(prop);
		}
		return result;
	}

	public ModelProperty mFindProperty(String name) {
		return this.selectSingleProperty(this.mFindProperties(name));
	}

	public Set<ModelProperty> mFindProperties(String name) {
		Set<ModelProperty> result = new HashSet<ModelProperty>();
		for (ModelProperty prop : this.mGetAllProperties()) {
			if (prop.getName().equals(name)) {
				result.add(prop);
			}
		}
		return result;
	}

	private ModelProperty selectSingleProperty(Set<ModelProperty> properties) {
		if (properties.size() == 0)
			return null;
		ModelProperty result = properties.iterator().next();
		if (properties.size() == 1)
			return result;
		throw new ModelException("More than one property named '" + result.getName() + "' found in " + this.toString());
	}

	public void mLazyAdd(ModelProperty property, Lazy<Object> value) {
		if (property.isCollection() && !this.values.containsKey(property)) {
			// Initializing lazy collection:
			this.mGet(property);
		}
		if (this.values.containsKey(property)) {
			Object oldValue = this.values.get(property);
			if (oldValue instanceof ModelCollection) {
				((ModelCollection) oldValue).mLazyAdd(value);
				return;
			} else if (property.isReadonly()) {
				throw new ModelException("Error in '" + this.toString() + "'. Cannot reassign a readonly property '"
						+ property.toString() + "'.");
			} else {
				this.mRemove(property, oldValue);
				this.values.remove(property);
			}
		}
		this.initializers.put(property, value);
	}

	public void mAdd(ModelProperty property, Object value) {
		this.mOnAddValue(property, value, true);
	}

	public void mRemove(ModelProperty property, Object value) {
		this.mOnRemoveValue(property, value, true);
	}

	void mOnAddValue(ModelProperty property, Object value, boolean firstCall) {
		this.mOnAddValue(property, value, firstCall, AddRemoveDirection.None);
	}

	void mOnRemoveValue(ModelProperty property, Object value, boolean firstCall) {
		this.mOnRemoveValue(property, value, firstCall, AddRemoveDirection.None);
	}

	void mOnAddValue(ModelProperty property, Object value, boolean firstCall, AddRemoveDirection addRemoveDir) {
		if (this.nameProperty == null && property.isMetaName()) {
			this.nameProperty = property;
		}
		boolean added = false;
		Object oldValue = this.mGet(property);
		if (oldValue instanceof ModelCollection) {
			ModelCollection collection = (ModelCollection) oldValue;
			if (value != null && collection.mAdd(value, false)) {
				added = true;
			} else if (value != null && firstCall) {
				added = true;
			}
		} else {
			if (value != oldValue) {
				if (oldValue != null) {
					this.mOnRemoveValue(property, oldValue, false);
				}
				this.values.put(property, value);
				added = value != null;
			} else {
				added = value != null && firstCall;
			}
		}
		if (added) {
			ModelObject modelObjectValue = null;
			if (value instanceof ModelObject) {
				modelObjectValue = (ModelObject) value;
			}
			if (modelObjectValue != null) {
				if (property.isContainment()) {
					modelObjectValue.mSetParent(this);
				}
				HashMap<ModelProperty, Lazy<Object>> childProperties = this.childInitializers.get(property);
				if (childProperties != null) {
					for (Entry<ModelProperty, Lazy<Object>> childProp : childProperties.entrySet()) {
						modelObjectValue.mLazyAdd(childProp.getKey(), childProp.getValue());
					}
				}
			}

			Set<ModelProperty> allProperies = this.mGetAllProperties();
			ArrayList<ModelProperty> cachedSubsettedProperties = property.getSubsettedProperties();
			for (ModelProperty subsettedProperty : cachedSubsettedProperties) {
				if (allProperies.contains(subsettedProperty)) {
					this.mOnAddValue(subsettedProperty, value, true);
				}
			}

			if (addRemoveDir != AddRemoveDirection.Redefined) {
				ArrayList<ModelProperty> cachedRedefiningProperties = property.getRedefiningProperties();
				for (ModelProperty redefiningProperty : cachedRedefiningProperties) {
					if (allProperies.contains(redefiningProperty)) {
						this.mOnAddValue(redefiningProperty, value, true, AddRemoveDirection.Redefining);
					}
				}
			}
			if (addRemoveDir != AddRemoveDirection.Redefining) {
				ArrayList<ModelProperty> cachedRedefinedProperties = property.getRedefinedProperties();
				for (ModelProperty redefinedProperty : cachedRedefinedProperties) {
					if (allProperies.contains(redefinedProperty)) {
						this.mOnAddValue(redefinedProperty, value, true, AddRemoveDirection.Redefined);
					}
				}
			}
			ArrayList<ModelProperty> cachedOppositeProperties = property.getOppositeProperties();
			if (cachedOppositeProperties.size() > 0) {
				ModelObject oppositeObject = modelObjectValue;
				if (oppositeObject != null) {
					Set<ModelProperty> allOppositeProperies = oppositeObject.mGetAllProperties();
					for (ModelProperty oppositeProperty : cachedOppositeProperties) {
						if (allOppositeProperies.contains(oppositeProperty)) {
							oppositeObject.mOnAddValue(oppositeProperty, this, false);
						}
					}
				} else {
					throw new ModelException("Error adding the current object " + this.getClass().getName() + "."
							+ property.getName() + " to the opposite object. The current value must be a descendant of "
							+ ModelObject.class.getName() + ".");
				}
			}
		}
	}

	void mOnRemoveValue(ModelProperty property, Object value, boolean firstCall, AddRemoveDirection addRemoveDir) {
		boolean removed = false;
		Object oldValue = this.mGet(property);
		if (oldValue instanceof ModelCollection) {
			ModelCollection collection = (ModelCollection) oldValue;
			if (value != null && collection.mRemove(value, false)) {
				removed = true;
			} else if (value != null && firstCall) {
				removed = true;
			}
		} else {
			if (value == oldValue) {
				this.values.put(property, null);
				removed = value != null;
			}
		}
		if (removed) {
			ModelObject modelObjectValue = null;
			if (value instanceof ModelObject) {
				modelObjectValue = (ModelObject) value;
			}
			if (modelObjectValue != null) {
				if (property.isContainment()) {
					modelObjectValue.mSetParent(this);
				}
				modelObjectValue.mSetParent(null);
			}

			Set<ModelProperty> allProperies = this.mGetAllProperties();
			ArrayList<ModelProperty> cachedSubsettingProperties = property.getSubsettingProperties();
			for (ModelProperty subsettingProperty : cachedSubsettingProperties) {
				if (allProperies.contains(subsettingProperty)) {
					this.mOnRemoveValue(subsettingProperty, value, true);
				}
			}

			if (addRemoveDir != AddRemoveDirection.Redefined) {
				ArrayList<ModelProperty> cachedRedefiningProperties = property.getRedefiningProperties();
				for (ModelProperty redefiningProperty : cachedRedefiningProperties) {
					if (allProperies.contains(redefiningProperty)) {
						this.mOnRemoveValue(redefiningProperty, value, true, AddRemoveDirection.Redefining);
					}
				}
			}
			if (addRemoveDir != AddRemoveDirection.Redefining) {
				ArrayList<ModelProperty> cachedRedefinedProperties = property.getRedefinedProperties();
				for (ModelProperty redefinedProperty : cachedRedefinedProperties) {
					if (allProperies.contains(redefinedProperty)) {
						this.mOnRemoveValue(redefinedProperty, value, true, AddRemoveDirection.Redefined);
					}
				}
			}
			ArrayList<ModelProperty> cachedOppositeProperties = property.getOppositeProperties();
			if (cachedOppositeProperties.size() > 0) {
				ModelObject oppositeObject = modelObjectValue;
				if (oppositeObject != null) {
					Set<ModelProperty> allOppositeProperies = oppositeObject.mGetAllProperties();
					for (ModelProperty oppositeProperty : cachedOppositeProperties) {
						if (allOppositeProperies.contains(oppositeProperty)) {
							oppositeObject.mOnRemoveValue(oppositeProperty, this, false);
						}
					}
				} else {
					throw new ModelException("Error adding the current object " + this.getClass().getName() + "."
							+ property.getName() + " to the opposite object. The current value must be a descendant of "
							+ ModelObject.class.getName() + ".");
				}
			}
		}
	}

	public ModelObject mGetParent() {
		return this.parent;
	}

	public void mSetParent(ModelObject value) {
		if (this.parent != value) {
			if (this.parent != null) {
				if (value != null) {
					throw new ModelException("Invalid new container parent " + value + ". The object " + this
							+ " is already contained by " + this.parent + ".");
				} else {
					this.parent.children.remove(this);
					this.parent = null;
				}
			} else {
				this.parent = value;
				this.parent.children.add(this);
			}
		}
	}

	public Iterable<ModelObject> mGetChildren() {
		return this.children;
	}

	@Override
	public String toString() {
		String typeName = this.getClass().getName();
		if (typeName.endsWith("Impl"))
			typeName = typeName.substring(0, typeName.length() - 4);
		String name = this.metaID;
		if (this.nameProperty != null) {
			Object nameValue = this.mGet(this.nameProperty);
			if (nameValue != null) {
				name = nameValue.toString();
				return typeName + "(" + name + ")";
			}
		}
		return typeName + "[" + name + "]";
	}

	private Set<ModelObject> findAllObjectsByID(String ID) {
		HashSet<ModelObject> result = new HashSet<ModelObject>();
		if (this.metaID.equals(ID)) {
			result.add(this);
		}
		for (ModelObject child : this.children) {
			Set<ModelObject> childResults = child.findAllObjectsByID(ID);
			result.addAll(childResults);
		}
		return result;
	}

	public Set<ModelObject> mFindAllObjectsByID(String ID) {
		return this.findAllObjectsByID(ID);
	}

	public ModelObject mFindObjectByID(String ID) {
		if (this.metaID == ID)
			return this;
		for (ModelObject child : this.children) {
			ModelObject result = child.mFindObjectByID(ID);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	public <T extends ModelObject> T mFindObjectByID(String ID, Class<T> type) {
		ModelObject obj = this.mFindObjectByID(ID);
		if (type.isAssignableFrom(obj.getClass())) {
			return (T) obj;
		} else {
			return null;
		}
	}

	private <T extends ModelObject> Set<T> findAllObjects(Class<T> type) {
		HashSet<T> result = new HashSet<T>();
		if (type.isAssignableFrom(this.getClass())) {
			result.add((T) this);
		}
		for (ModelObject child : this.children) {
			Set<T> childResults = child.findAllObjects(type);
			result.addAll(childResults);
		}
		return result;
	}

	public <T extends ModelObject> Set<T> mFindObjects(Class<T> type) {
		return this.findAllObjects(type);
	}

	public Annotation[] mGetAnnotations() {
		return this.getClass().getAnnotations();
	}
}
