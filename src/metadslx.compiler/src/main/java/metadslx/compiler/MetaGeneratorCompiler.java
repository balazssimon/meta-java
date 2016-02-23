package metadslx.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MetaGeneratorCompiler extends MetaCompiler {

	public MetaGeneratorCompiler(String source, String fileName) {
		super(source, fileName);
	}

	private MetaGeneratorLexer lexer;
	private MetaGeneratorParser parser;
	private ParseTree parseTree;
	
	@Override
	protected void DoCompile() {
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

	public ParseTree getParseTree() {
		return parseTree;
	}

}