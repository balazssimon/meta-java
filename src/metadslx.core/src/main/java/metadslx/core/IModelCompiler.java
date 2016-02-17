package metadslx.core;

public interface IModelCompiler {
	ModelCompilerDiagnostics getDiagnostics();
	String getFileName();
	String getSource();
	RootScope getGlobalScope();
	Model getModel();
	ITriviaProvider getTriviaProvider();
	INameProvider getNameProvider();
	ITypeProvider getTypeProvider();
	IResolutionProvider getResolutionProvider();
	IBindingProvider getBindingProvider();
}
