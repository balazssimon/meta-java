package metadlsx.core;

import java.util.ArrayList;

public class ModelCompilerContext {
	static ThreadLocal<ArrayList<ModelCompilerContext>> contextStack = ThreadLocal.withInitial(() -> new ArrayList<ModelCompilerContext>());
	
	private IModelCompiler compiler;
	
	ModelCompilerContext(IModelCompiler compiler) {
		this.compiler = compiler;
	}
	
	public static void requireContext() {
		synchronized (contextStack) {
			ArrayList<ModelCompilerContext> stack = contextStack.get();
			if (stack.size() == 0) {
				throw new ModelException("ModelCompilerContext is missing. Try running this operation within a ModelCompilerContextScope."); 
			}
		}		
	}
	
	public static boolean hasContext() {
		synchronized (contextStack) {
			ArrayList<ModelCompilerContext> stack = contextStack.get();
			return stack.size() > 0;
		}		
	}
	
	public static ModelCompilerContext current() {
		synchronized (contextStack) {
			ArrayList<ModelCompilerContext> stack = contextStack.get();
			if (stack.size() == 0) {
				return null;
			} else {
				return stack.get(stack.size()-1);
			}
		}
	}
	
	public IModelCompiler compiler() {
		return this.compiler;
	}
}
