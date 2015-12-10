package metadlsx.core;

import java.util.ArrayList;

public class ModelCompilerContextScope implements AutoCloseable {
	public ModelCompilerContextScope() {
		synchronized (ModelCompilerContext.contextStack) {
			ModelCompilerContext.contextStack.get().add(new ModelCompilerContext(new DefaultModelCompiler()));
		}
	}

	public ModelCompilerContextScope(IModelCompiler compiler) {
		if (compiler == null) throw new IllegalArgumentException("The compiler parameter cannot be null.");
		synchronized (ModelCompilerContext.contextStack) {
			ModelCompilerContext.contextStack.get().add(new ModelCompilerContext(compiler));
		}
	}
	
	@Override
	public void close() throws Exception {
		synchronized (ModelCompilerContext.contextStack) {
			ArrayList<ModelCompilerContext> stack = ModelCompilerContext.contextStack.get();
			stack.remove(stack.size()-1);
		}
	}
}
