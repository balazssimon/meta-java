package metadlsx.core;

public class ModelFactory {
	private String packageName;

    public ModelFactory()
    {
        this.packageName = this.getClass().getPackage().getName();
    }
    
    public ModelObject create(String name) {
    	// TODO
    	return null;
    }
    
    public <T extends ModelObject> T create(Class<T> type) {
    	// TODO
    	return null;
    }
    
    public void Init(ModelObject mobject, Iterable<ModelPropertyInitializer> initializers) {
    	
    }
}
