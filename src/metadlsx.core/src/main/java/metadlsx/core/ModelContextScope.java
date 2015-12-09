package metadlsx.core;

import java.util.ArrayList;

public class ModelContextScope implements AutoCloseable {

	public ModelContextScope(Model model) {
		if (model == null) throw new IllegalArgumentException("The model parameter cannot be null.");
		synchronized (ModelContext.contextStack) {
			ModelContext.contextStack.get().add(new ModelContext(model));
		}
	}
	
	@Override
	public void close() throws Exception {
		synchronized (ModelContext.contextStack) {
			ArrayList<ModelContext> stack = ModelContext.contextStack.get();
			stack.remove(stack.size()-1);
		}
	}

}
