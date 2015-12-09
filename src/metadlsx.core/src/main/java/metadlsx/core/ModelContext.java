package metadlsx.core;

import java.util.ArrayList;

public class ModelContext {
	static ThreadLocal<ArrayList<ModelContext>> contextStack = ThreadLocal.withInitial(() -> new ArrayList<ModelContext>());
	
	private Model model;
	
	ModelContext(Model model) {
		this.model = model;
	}
	
	public static ModelContext current() {
		synchronized (contextStack) {
			ArrayList<ModelContext> stack = contextStack.get();
			if (stack.size() == 0) {
				return null;
			} else {
				return stack.get(stack.size()-1);
			}
		}
	}
	
	public Model model() {
		return this.model;
	}
}
