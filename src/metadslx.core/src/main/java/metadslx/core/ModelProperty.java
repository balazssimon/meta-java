package metadslx.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import metadslx.core.MetaProperty;

public class ModelProperty {
	private static HashMap<Class, HashMap<String, ModelProperty>> declaredProperties;
	private static HashMap<Class, HashMap<String, ModelProperty>> properties;
	private static HashMap<Class, PropertyCache> cachedProperties;
	
	static {
		ModelProperty.declaredProperties = new HashMap<Class, HashMap<String,ModelProperty>>();
		ModelProperty.properties = new HashMap<Class, HashMap<String,ModelProperty>>();
		ModelProperty.cachedProperties = new HashMap<Class, ModelProperty.PropertyCache>();
	}

	private String name;
	private boolean isMetaName;
	private String declaredName;
	private Class type;
	private Class owningType;
	private Class declaringType;
	
    private boolean initialized = false;
    private ArrayList<Object> annotations;
    private ArrayList<ModelProperty> oppositeProperties;
    private ArrayList<ModelProperty> subsettedProperties;
    private ArrayList<ModelProperty> subsettingProperties;
    private ArrayList<ModelProperty> redefinedProperties;
    private ArrayList<ModelProperty> redefiningProperties;
    private ArrayList<ModelProperty> cachedOppositeProperties;
    private ArrayList<ModelProperty> cachedSubsettedProperties;
    private ArrayList<ModelProperty> cachedSubsettingProperties;
    private ArrayList<ModelProperty> cachedRedefinedProperties;
    private ArrayList<ModelProperty> cachedRedefiningProperties;
    private boolean isReadonly = false;
    private boolean isContainment = false;
    private Class itemType = null;
    private boolean isCollection = false;
    private Lazy<MetaProperty> metaProperty = null;
	
    public ModelProperty(String name, Class type, Class itemType, Class owningType, String declaredName, Class declaringType, Lazy<MetaProperty> metaProperty) {
        this.name = name;
        this.declaredName = declaredName;
        this.type = type;
        this.itemType = itemType;
        this.owningType = owningType;
        this.declaringType = declaringType;
        this.annotations = new ArrayList<Object>();
        this.oppositeProperties = new ArrayList<ModelProperty>();
        this.subsettedProperties = new ArrayList<ModelProperty>();
        this.subsettingProperties = new ArrayList<ModelProperty>();
        this.redefinedProperties = new ArrayList<ModelProperty>();
        this.redefiningProperties = new ArrayList<ModelProperty>();
        this.metaProperty = metaProperty;
    }
    
	public String getName() {
		return name;
	}

	public String getDeclaredName() {
		return declaredName;
	}

	public Class getType() {
		return type;
	}

	public Class getOwningType() {
		return owningType;
	}

	public Class getDeclaringType() {
		return declaringType;
	}

	public MetaProperty getMetaProperty() {
		if (this.metaProperty != null) return this.metaProperty.value();
		else return null;
	}

	
	public ArrayList<Object> getAnnotations() {
		if (!this.initialized) this.init();
		return annotations;
	}

	public ArrayList<ModelProperty> getOppositeProperties() {
		if (!this.initialized) this.init();
		if (this.cachedOppositeProperties == null) {
			this.cachedOppositeProperties = new ArrayList<ModelProperty>(this.oppositeProperties);
		}
		return cachedOppositeProperties;
	}

	public ArrayList<ModelProperty> getSubsettedProperties() {
		if (!this.initialized) this.init();
		if (this.cachedSubsettedProperties == null) {
			this.cachedSubsettedProperties = new ArrayList<ModelProperty>(this.subsettedProperties);
		}
		return cachedSubsettedProperties;
	}

	public ArrayList<ModelProperty> getSubsettingProperties() {
		if (!this.initialized) this.init();
		if (this.cachedSubsettingProperties == null) {
			this.cachedSubsettingProperties = new ArrayList<ModelProperty>(this.subsettingProperties);
		}
		return cachedSubsettingProperties;
	}

	public ArrayList<ModelProperty> getRedefinedProperties() {
		if (!this.initialized) this.init();
		if (this.cachedRedefinedProperties == null) {
			this.cachedRedefinedProperties = new ArrayList<ModelProperty>(this.redefinedProperties);
		}
		return cachedRedefinedProperties;
	}

	public ArrayList<ModelProperty> getRedefiningProperties() {
		if (!this.initialized) this.init();
		if (this.cachedRedefiningProperties == null) {
			this.cachedRedefiningProperties = new ArrayList<ModelProperty>(this.redefiningProperties);
		}
		return cachedRedefiningProperties;
	}

	public boolean isReadonly() {
		return isReadonly;
	}

	public boolean isContainment() {
		return isContainment;
	}

	public Class getItemType() {
		return itemType;
	}

	public boolean isCollection() {
		return isCollection;
	}


	private void init() {
		if (this.initialized) return;
		this.initialized = true;
		Field info;
		try {
			info = this.declaringType.getField(this.declaredName);
			if (info != null) {
				for(Annotation annot: info.getAnnotations()) {
					this.annotations.add(annot);
				}
				if (Collection.class.isAssignableFrom(this.type)) {
					this.isCollection = true;
				}
				this.isMetaName = info.getAnnotation(Name.class) != null;
				for (Opposite annot: info.getAnnotationsByType(Opposite.class)) {
					ModelProperty modelProperty = ModelProperty.find(annot.declaringType(), annot.propertyName());
					if (modelProperty != null) {
						this.oppositeProperties.add(modelProperty);
						this.cachedOppositeProperties = null;
					}
				}
				for (Subsets annot: info.getAnnotationsByType(Subsets.class)) {
					ModelProperty modelProperty = ModelProperty.find(annot.declaringType(), annot.propertyName());
					if (modelProperty != null) {
						this.subsettedProperties.add(modelProperty);
						this.cachedSubsettedProperties = null;
						modelProperty.subsettingProperties.add(this);
						modelProperty.cachedSubsettingProperties = null;
					}
				}
				for (Redefines annot: info.getAnnotationsByType(Redefines.class)) {
					ModelProperty modelProperty = ModelProperty.find(annot.declaringType(), annot.propertyName());
					if (modelProperty != null) {
						this.redefinedProperties.add(modelProperty);
						this.cachedRedefinedProperties = null;
						modelProperty.redefiningProperties.add(this);
						modelProperty.cachedRedefiningProperties = null;
					}
				}
				for (Readonly annot: info.getAnnotationsByType(Readonly.class)) {
					this.isReadonly = true;
				}
				for (Containment annot: info.getAnnotationsByType(Containment.class)) {
					this.isContainment = true;
				}
			}
		} catch (NoSuchFieldException e) {
			// nop
		}
	}
	
	public boolean isAssignableFrom(Class type) {
		if (this.type == null || type == null) return false;
		if (this.isCollection) {
			if (this.itemType == null) return false;
			return this.itemType.isAssignableFrom(type);
		} else {
			return this.type.isAssignableFrom(type);
		}
	}
	
    public static ModelProperty register(String name, Class type, Class innerType, Class owningType) {
        return ModelProperty.registerProperty(new ModelProperty(name, type, innerType, owningType, name + "Property", owningType, null));
    }
	
    public static ModelProperty register(String name, Class type, Class innerType, Class owningType, Class declaringType, Lazy<MetaProperty> metaProperty) {
        return ModelProperty.registerProperty(new ModelProperty(name, type, innerType, owningType, name + "Property", declaringType, metaProperty));
    }
	
    public static ModelProperty register(String name, Class type, Class innerType, Class owningType, String declaredName, Class declaringType, Lazy<MetaProperty> metaProperty) {
        return ModelProperty.registerProperty(new ModelProperty(name, type, innerType, owningType, declaredName, declaringType, metaProperty));
    }
	
	private static ModelProperty find(Class declaringType, String propertyName) {
		HashMap<String, ModelProperty> propertyList = ModelProperty.declaredProperties.get(declaringType);
		if (propertyList != null) {
			ModelProperty result = propertyList.get(propertyName);
			return result;
		}
		return null;
	}
	
	private static void clearCache() {
		ModelProperty.cachedProperties = new HashMap<Class, ModelProperty.PropertyCache>();
	}
	
	private static PropertyCache getCachedProperties(Class type) {
		PropertyCache propertyCache = ModelProperty.cachedProperties.get(type);
		if (propertyCache == null) {
			propertyCache = new PropertyCache();
			ModelProperty.cachedProperties.put(type, propertyCache);
			HashSet<ModelProperty> allProperties = new HashSet<ModelProperty>();
			HashMap<String, ModelProperty> propertyList = ModelProperty.properties.get(type);
			if (propertyList != null) {
				propertyCache.getProperties().addAll(propertyList.values());
				allProperties.addAll(propertyList.values());
			} 
			for (Class intf: type.getInterfaces()) {
				allProperties.addAll(ModelProperty.getCachedProperties(intf).getAllProperties());
			}
			propertyCache.getAllProperties().addAll(allProperties);
		}
		return propertyCache;
	}

	private static ModelProperty registerProperty(ModelProperty property) {
		HashMap<String, ModelProperty> propertyList = ModelProperty.properties.get(property.owningType);
		if (propertyList == null) {
			propertyList = new HashMap<String, ModelProperty>();
			ModelProperty.properties.put(property.owningType, propertyList);
		}
		if (propertyList.containsKey(property.name)) {
			throw new ModelException("Property '" + property + "' is already registered as '" + propertyList.get(property.name) + "'.");
		}
		HashMap<String, ModelProperty> declaredPropertyList = ModelProperty.properties.get(property.declaringType);
		if (declaredPropertyList == null) {
			declaredPropertyList = new HashMap<String, ModelProperty>();
			ModelProperty.declaredProperties.put(property.declaringType, declaredPropertyList);
		}
		if (declaredPropertyList.containsKey(property.name)) {
			throw new ModelException("Property '" + property + "' is already declared as '" + declaredPropertyList.get(property.name) + "'.");
		}
		propertyList.put(property.name, property);
		declaredPropertyList.put(property.name, property);
		ModelProperty.clearCache();
		return property;
	}
	
	public static Iterable<ModelProperty> getPropertiesForType(Class owningType) {
		return ModelProperty.getCachedProperties(owningType).getProperties();
	}
	
	public static Iterable<ModelProperty> getAllPropertiesForType(Class owningType) {
		return ModelProperty.getCachedProperties(owningType).getAllProperties();
	}
	
	@Override
	public String toString() {
		if (this.declaringType != this.owningType) {
			return this.owningType.getCanonicalName()+"."+this.name+" ("+this.declaringType.getCanonicalName()+"."+this.declaredName+")";
		} else {
			return this.owningType.getCanonicalName()+"."+this.name;
		}
	}
	
	public boolean isMetaName() {
		return this.isMetaName;
	}
	
	private static class PropertyCache {
		public PropertyCache() {
			this.properties = new ArrayList<ModelProperty>();
			this.allProperties = new ArrayList<ModelProperty>();
		}
		
	    private ArrayList<ModelProperty> properties;
	    private ArrayList<ModelProperty> allProperties;

	    public ArrayList<ModelProperty> getProperties() {
			return properties;
		}
		public ArrayList<ModelProperty> getAllProperties() {
			return allProperties;
		}
	}
}
