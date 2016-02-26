package metadslx.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ModelFactory {
	private String packageName;

    public ModelFactory()
    {
        this.packageName = this.getClass().getPackage().getName();
    }
    
    public ModelObject create(String name) {
    	if (name == null) return null;
    	String typeName = this.packageName+"."+name;
    	Class<?> type;
		try {
			type = this.getClass().getClassLoader().loadClass(typeName);
		} catch (ClassNotFoundException e) {
			return null;
		}
    	return (ModelObject)this.create(type);
    }
    
    @SuppressWarnings("unchecked")
	public <T> T create(Class<T> type) {
    	if (type == null) return null;
    	String typeName = type.getName()+"Impl";
    	Class<?> implType;
		try {
			implType = this.getClass().getClassLoader().loadClass(typeName);
		} catch (ClassNotFoundException e) {
			return null;
		}
		if (!type.isAssignableFrom(implType)) {
            throw new ModelException("Class type '" + implType.getName() + "' is not a descendant of the type '"+type.getName()+"'.");
		} else if (implType == null) {
            throw new ModelException("Class type '" + typeName + "' is not found.");
		} else {
			try {
				Constructor<?> ctr = implType.getDeclaredConstructor();
				if (ctr != null) {
					ctr.setAccessible(true);
					Object result = ctr.newInstance();
					if (result instanceof ModelObject) {
						return (T)result;
					} else {
	                    throw new ModelException("Class type '" + typeName + "' is not a descendant of '" + ModelObject.class.getName() + "'.");
					}
				} else {
		            throw new ModelException("Class type '" + typeName + "' has no default constructor.");
				}
			} catch (InvocationTargetException | IllegalArgumentException | InstantiationException | IllegalAccessException e) {
	            throw new ModelException("Class type '" + typeName + "' cannot be instantiated.");
			} catch (SecurityException | NoSuchMethodException e) {
	            throw new ModelException("Class type '" + typeName + "' has no default constructor.");
			}
		}
    }
    
    public void init(ModelObject mobject, Iterable<ModelPropertyInitializer> initializers) {
    	for (ModelPropertyInitializer init: initializers) {
    		if (!init.getProperty().isCollection()) {
    			mobject.mUnSet(init.getProperty());
    		} else {
    			ModelCollection<?> mc = (ModelCollection<?>)mobject.mGet(init.getProperty());
    			if (mc != null) {
    				mc.clear();
    			}
    		}
    	}
    	for (ModelPropertyInitializer init: initializers) {
    		if (init.getValues() != null) {
    			for (Lazy<Object> value: init.getValues()) {
    				mobject.mLazyAdd(init.getProperty(), value);
    			}
    		} else {
    			mobject.mLazyAdd(init.getProperty(), init.getValue());
    		}
    	}
    }
}
