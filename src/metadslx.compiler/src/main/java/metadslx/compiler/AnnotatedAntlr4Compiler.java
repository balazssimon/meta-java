package metadslx.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class AnnotatedAntlr4Compiler extends MetaCompiler {
    private Antlr4AnnotationRemover remover;

    private AnnotatedAntlr4Parser.GrammarSpecContext parseTree;
    private AnnotatedAntlr4Lexer lexer;
    private AnnotatedAntlr4Parser parser;

    private String antlr4Jar;

    private boolean generateOutput;
    private String outputDirectory;
    private String antlr4Source;
    private String generatedSource;
    private boolean isLexer;
    private boolean isParser;
    private boolean hasAnnotatedAntlr4Errors;
    private boolean hasAntlr4Errors;
	
	public AnnotatedAntlr4Compiler(String source, String outputDirectory, String fileName)
	{
        super(source, fileName);
	    this.generateOutput = true;
	    this.outputDirectory = outputDirectory;
	}

	public boolean isGenerateOutput() {
		return generateOutput;
	}

	public void setGenerateOutput(boolean generateOutput) {
		this.generateOutput = generateOutput;
	}

	public boolean isLexer() {
		return isLexer;
	}

	void setIsLexer(boolean isLexer) {
		this.isLexer = isLexer;
	}

	public boolean isParser() {
		return isParser;
	}

	void setIsParser(boolean isParser) {
		this.isParser = isParser;
	}

	public AnnotatedAntlr4Parser.GrammarSpecContext getParseTree() {
		return parseTree;
	}

	public AnnotatedAntlr4Lexer getLexer() {
		return lexer;
	}

	public AnnotatedAntlr4Parser getParser() {
		return parser;
	}

	public String getAntlr4Jar() {
		return antlr4Jar;
	}

	public String getOutputDirectory() {
		return outputDirectory;
	}

	public String getAntlr4Source() {
		return antlr4Source;
	}

	public String getGeneratedSource() {
		return generatedSource;
	}

	public boolean hasAnnotatedAntlr4Errors() {
		return hasAnnotatedAntlr4Errors;
	}

	public boolean hasAntlr4Errors() {
		return hasAntlr4Errors;
	}

	@Override
	protected void doCompile() {
        ANTLRInputStream inputStream = new ANTLRInputStream(this.getSource());
        this.lexer = new AnnotatedAntlr4Lexer(inputStream);
        this.lexer.addErrorListener(this);
        this.setCommonTokenStream(new CommonTokenStream(this.lexer));
        this.parser = new AnnotatedAntlr4Parser(this.getCommonTokenStream());
        this.parser.addErrorListener(this);
        this.parseTree = this.parser.grammarSpec();
        Antlr4AnnotationVisitor av = new Antlr4AnnotationVisitor(this);
        av.visit(this.parseTree);
        this.generatedSource = av.generate(this.getDefaultNamespace());
        this.remover = new Antlr4AnnotationRemover(this.getCommonTokenStream());
        this.remover.visit(this.parseTree);
        this.antlr4Source = remover.getText();
        /*AnnotatedAntlr4LexerAnnotator annotator = new AnnotatedAntlr4LexerAnnotator();
        this.setLexerAnnotations(annotator.getLexerAnnotations());
        this.setModeAnnotations(annotator.getModeAnnotations());
        this.setTokenAnnotations(annotator.getTokenAnnotations());*/

        this.hasAnnotatedAntlr4Errors = this.getDiagnostics().hasErrors();
        // TODO: call ANTLR4
	}

	
}
