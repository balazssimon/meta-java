package metadslx.core;

import java.util.ArrayList;

public class ModelContext {
	static ThreadLocal<ArrayList<ModelContext>> contextStack = ThreadLocal.withInitial(() -> new ArrayList<ModelContext>());
	
	private Model model;
	
	ModelContext(Model model) {
		this.model = model;
	}
	
	public static void requireContext() {
		synchronized (contextStack) {
			ArrayList<ModelContext> stack = contextStack.get();
			if (stack.size() <= 0) {
				throw new ModelException("ModelContext is missing. Try running this operation within a ModelContextScope."); 
			}
		}		
	}
	
	public static boolean hasContext() {
		synchronized (contextStack) {
			ArrayList<ModelContext> stack = contextStack.get();
			return stack.size() > 0;
		}		
	}
	
	public static Model current() {
		synchronized (contextStack) {
			ArrayList<ModelContext> stack = contextStack.get();
			if (stack.size() <= 0) {
				return null;
			} else {
				return stack.get(stack.size()-1).model;
			}
		}
	}
}
