package metadslx.compiler;

import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import metadslx.core.DefaultBindingProvider;
import metadslx.core.DefaultResolutionProvider;
import metadslx.core.DefaultTypeProvider;
import metadslx.core.IBindingProvider;
import metadslx.core.IModelCompiler;
import metadslx.core.INameProvider;
import metadslx.core.IResolutionProvider;
import metadslx.core.ITriviaProvider;
import metadslx.core.ITypeProvider;
import metadslx.core.Model;
import metadslx.core.ModelCompilerContextScope;
import metadslx.core.ModelCompilerDiagnostics;
import metadslx.core.ModelContextScope;
import metadslx.core.RootScope;

public abstract class MetaCompiler implements IModelCompiler, IAntlr4Compiler {
    private ModelCompilerDiagnostics diagnostics;
    private String fileName;
    private String source;
    private String defaultNamespace;
    private RootScope globalScope;
    private Model model;
    private ITriviaProvider triviaProvider;
    private INameProvider nameProvider;
    private ITypeProvider typeProvider;
    private IResolutionProvider resolutionProvider;
    private IBindingProvider bindingProvider;
    
    private MetaCompilerData data;
    private CommonTokenStream commonTokenStream;
	private List<Object> lexerAnnotations;
	private List<Object> parserAnnotations;
	private HashMap<Integer, List<Object>> modeAnnotations;
	private HashMap<Integer, List<Object>> tokenAnnotations;
	private HashMap<Class, List<Object>> ruleAnnotations;
	private HashMap<Object, List<Object>> treeAnnotations;
    
    public MetaCompiler(String source, String fileName) {
        this.diagnostics = new ModelCompilerDiagnostics();
        this.source = source;
        this.fileName = fileName;
        this.globalScope = new RootScope();
        this.model = new Model();
        this.data = new MetaCompilerData(this);
        // TODO:
        //this.triviaProvider = new Antlr4DefaultTriviaProvider(this);
        //this.nameProvider = new Antlr4DefaultNameProvider();
        this.typeProvider = new DefaultTypeProvider();
        this.resolutionProvider = new DefaultResolutionProvider();
        this.bindingProvider = new DefaultBindingProvider();
    }
    
    
    public void Compile() {
        try (ModelContextScope mcs = new ModelContextScope(this.getModel()))
        {
	        try (ModelCompilerContextScope mccs = new ModelCompilerContextScope(this))
	        {
	            this.DoCompile();
	        } catch (Exception e) {
				throw new MetaCompilerException(e);
			}
        }
    }
    
    protected abstract void DoCompile();
    
    
	public ModelCompilerDiagnostics getDiagnostics() {
		return diagnostics;
	}

	public String getFileName() {
		return fileName;
	}

	public String getSource() {
		return source;
	}

	public String getDefaultNamespace() {
		return defaultNamespace;
	}

	public void setDefaultNamespace(String defaultNamespace) {
		this.defaultNamespace = defaultNamespace;
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
	
	public MetaCompilerData getData() {
		return data;
	}

	protected void setData(MetaCompilerData data) {
		this.data = data;
	}
	
	public CommonTokenStream getCommonTokenStream() {
		return commonTokenStream;
	}

	protected void setCommonTokenStream(CommonTokenStream commonTokenStream) {
		this.commonTokenStream = commonTokenStream;
	}


	public List<Object> getLexerAnnotations() {
		return lexerAnnotations;
	}

	protected void setLexerAnnotations(List<Object> lexerAnnotations) {
		this.lexerAnnotations = lexerAnnotations;
	}

	public List<Object> getParserAnnotations() {
		return parserAnnotations;
	}

	protected void setParserAnnotations(List<Object> parserAnnotations) {
		this.parserAnnotations = parserAnnotations;
	}

	public HashMap<Integer, List<Object>> getModeAnnotations() {
		return modeAnnotations;
	}

	protected void setModeAnnotations(HashMap<Integer, List<Object>> modeAnnotations) {
		this.modeAnnotations = modeAnnotations;
	}

	public HashMap<Integer, List<Object>> getTokenAnnotations() {
		return tokenAnnotations;
	}

	protected void setTokenAnnotations(HashMap<Integer, List<Object>> tokenAnnotations) {
		this.tokenAnnotations = tokenAnnotations;
	}

	public HashMap<Class, List<Object>> getRuleAnnotations() {
		return ruleAnnotations;
	}

	protected void setRuleAnnotations(HashMap<Class, List<Object>> ruleAnnotations) {
		this.ruleAnnotations = ruleAnnotations;
	}

	public HashMap<Object, List<Object>> getTreeAnnotations() {
		return treeAnnotations;
	}

	protected void setTreeAnnotations(HashMap<Object, List<Object>> treeAnnotations) {
		this.treeAnnotations = treeAnnotations;
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
        if (offendingSymbol != null) {
            this.getDiagnostics().addError(msg, this.getFileName(), new Antlr4TextSpan(offendingSymbol), false);
        } else {
            this.getDiagnostics().addError(msg, this.getFileName(), new Antlr4TextSpan(line, charPositionInLine + 1, line, charPositionInLine + 1), false);
        }
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
			BitSet ambigAlts, ATNConfigSet configs) {
	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {
	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {
	}


}
