package metadslx.core;

public interface IModelCompiler {
	ModelCompilerDiagnostics getDiagnostics();
	String getFileName();
	String getSource();
	RootScope getGlobalScope();
	INameProvider getNameProvider();
	ITypeProvider getTypeProvider();
	IResolutionProvider getResolutionProvider();
	IBindingProvider getBindingProvider();
}
