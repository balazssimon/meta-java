package metadslx.core;

import java.util.ArrayList;

public class ModelCompilerContext {
	static ThreadLocal<ArrayList<ModelCompilerContext>> contextStack = ThreadLocal.withInitial(() -> new ArrayList<ModelCompilerContext>());

    private static DefaultModelCompiler defaultCompiler = new DefaultModelCompiler();
	
	private IModelCompiler compiler;
	
	ModelCompilerContext(IModelCompiler compiler) {
		this.compiler = compiler;
	}
	
	public static void requireContext() {
		synchronized (contextStack) {
			ArrayList<ModelCompilerContext> stack = contextStack.get();
			if (stack.size() <= 0) {
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
	
	public static IModelCompiler current() {
		synchronized (contextStack) {
			ArrayList<ModelCompilerContext> stack = contextStack.get();
			if (stack.size() > 0) {
				return stack.get(stack.size()-1).compiler;
			} else {
				return ModelCompilerContext.defaultCompiler;
			}
		}
	}
}
