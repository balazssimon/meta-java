package metadslx.core;

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
				Object result = implType.newInstance();
				if (result instanceof ModelObject) {
					return (T)result;
				} else {
                    throw new ModelException("Class type '" + typeName + "' is not a descendant of '" + ModelObject.class.getName() + "'.");
				}
			} catch (InstantiationException | IllegalAccessException e) {
	            throw new ModelException("Class type '" + typeName + "' cannot be instantiated.");
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
