package metadslx.compiler;

import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

class AnnotatedAntlr4PropertiesBlockCompiler implements ANTLRErrorListener {
	private MetaCompiler compiler;
	private int startLine;
	private int startPos;
	private boolean hasErrors;

	public AnnotatedAntlr4PropertiesBlockCompiler(MetaCompiler compiler) {
		this.compiler = compiler;
	}

	public int getStartLine() {
		return startLine;
	}

	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public boolean hasErrors() {
		return hasErrors;
	}

	public MetaCompiler getCompiler() {
		return compiler;
	}

	public AnnotatedAntlr4PropertiesParser.PropertiesBlockContext compile(String propertiesBlock) {
		try {
			this.hasErrors = false;
			ANTLRInputStream inputStream = new ANTLRInputStream(propertiesBlock);
			AnnotatedAntlr4PropertiesLexer lexer = new AnnotatedAntlr4PropertiesLexer(inputStream);
			lexer.addErrorListener(this);
			CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
			AnnotatedAntlr4PropertiesParser parser = new AnnotatedAntlr4PropertiesParser(commonTokenStream);
			parser.addErrorListener(this);
			return parser.propertiesBlock();
		} catch (Exception ex) {
			this.hasErrors = true;
			this.compiler.getDiagnostics().addError(ex.toString(), this.compiler.getFileName(),
					new Antlr4TextSpan(this.startLine, this.startPos, this.startLine, this.startPos), true);
		}
		return null;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		Antlr4TextSpan antlr4TextSpan;
		if (offendingSymbol instanceof Token) {
			antlr4TextSpan = new Antlr4TextSpan((Token) offendingSymbol);
			antlr4TextSpan = new Antlr4TextSpan(this.startLine + antlr4TextSpan.getStartLine() - 1,
					antlr4TextSpan.getStartLine() == 1 ? this.startPos + antlr4TextSpan.getStartPosition() - 1
							: antlr4TextSpan.getStartPosition(),
					this.startLine + antlr4TextSpan.getEndLine() - 1, antlr4TextSpan.getEndLine() == 1
							? this.startPos + antlr4TextSpan.getEndPosition() - 1 : antlr4TextSpan.getEndPosition());
		} else {
			antlr4TextSpan = new Antlr4TextSpan(this.startLine + line,
					line == 1 ? this.startPos + charPositionInLine : charPositionInLine + 1, this.startLine + line,
					line == 1 ? this.startPos + charPositionInLine : charPositionInLine + 1);
		}
		this.hasErrors = true;
		this.compiler.getDiagnostics().addError(msg, this.compiler.getFileName(), antlr4TextSpan, false);
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
