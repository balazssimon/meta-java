package metadslx.core;

public class DefaultModelCompiler implements IModelCompiler {

	private ModelCompilerDiagnostics diagnostics;
	private String fileName;
	private String source;
	private RootScope globalScope;
	private Model model;
	private ITriviaProvider triviaProvider;
	private INameProvider nameProvider;
	private ITypeProvider typeProvider;
	private IResolutionProvider resolutionProvider;
	private IBindingProvider bindingProvider;

	public DefaultModelCompiler() {
		this.diagnostics = new ModelCompilerDiagnostics();
		this.globalScope = new RootScope();
		this.model = new Model();
		this.triviaProvider = new DefaultTriviaProvider(); 
		this.nameProvider = new DefaultNameProvider(); 
		this.typeProvider = new DefaultTypeProvider(); 
		this.resolutionProvider = new DefaultResolutionProvider(); 
		this.bindingProvider = new DefaultBindingProvider(); 
	}
	
	public ModelCompilerDiagnostics getDiagnostics() {
		return diagnostics;
	}
	
	protected void setDiagnostics(ModelCompilerDiagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	protected void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getSource() {
		return source;
	}
	
	protected void setSource(String source) {
		this.source = source;
	}
	
	public RootScope getGlobalScope() {
		return globalScope;
	}
	
	protected void setGlobalScope(RootScope globalScope) {
		this.globalScope = globalScope;
	}
	
	public Model getModel() {
		return model;
	}
	
	protected void setModel(Model model) {
		this.model = model;
	}	
	
	public ITriviaProvider getTriviaProvider() {
		return triviaProvider;
	}
	
	protected void setTriviaProvider(ITriviaProvider triviaProvider) {
		this.triviaProvider = triviaProvider;
	}
	
	public INameProvider getNameProvider() {
		return nameProvider;
	}
	
	protected void setNameProvider(INameProvider nameProvider) {
		this.nameProvider = nameProvider;
	}
	
	public ITypeProvider getTypeProvider() {
		return typeProvider;
	}
	
	protected void setTypeProvider(ITypeProvider typeProvider) {
		this.typeProvider = typeProvider;
	}
	
	public IResolutionProvider getResolutionProvider() {
		return resolutionProvider;
	}
	
	protected void setResolutionProvider(IResolutionProvider resolutionProvider) {
		this.resolutionProvider = resolutionProvider;
	}
	
	public IBindingProvider getBindingProvider() {
		return bindingProvider;
	}
	
	protected void setBindingProvider(IBindingProvider bindingProvider) {
		this.bindingProvider = bindingProvider;
	}
}
