package metadslx.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import metadslx.compiler.MetaGeneratorParser.MainContext;

public class MetaGeneratorCompiler extends MetaCompiler {
	private MetaGeneratorLexer lexer;
	private MetaGeneratorParser parser;
	private MainContext parseTree;

	public MetaGeneratorCompiler(String source, String fileName) {
		super(source, fileName);
	}

	@Override
	protected void doCompile() {
		ANTLRInputStream inputStream = new ANTLRInputStream(this.getSource());
		this.lexer = new MetaGeneratorLexer(inputStream);
		this.lexer.addErrorListener(this);
		this.setCommonTokenStream(new CommonTokenStream(this.lexer));
		this.parser = new MetaGeneratorParser(this.getCommonTokenStream());
		this.parser.addErrorListener(this);
		this.parseTree = this.parser.main();
	}

	public MetaGeneratorLexer getLexer() {
		return lexer;
	}

	public MetaGeneratorParser getParser() {
		return parser;
	}

	public MainContext getParseTree() {
		return parseTree;
	}

}
