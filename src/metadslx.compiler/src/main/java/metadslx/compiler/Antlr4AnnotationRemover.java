package metadslx.compiler;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import metadslx.compiler.AnnotatedAntlr4Parser.AnnotationContext;
import metadslx.compiler.AnnotatedAntlr4Parser.OptionContext;
import metadslx.compiler.AnnotatedAntlr4Parser.PropertiesBlockContext;

public class Antlr4AnnotationRemover extends AnnotatedAntlr4ParserBaseVisitor<Object> {
	private TokenStreamRewriter rewriter;
	private BufferedTokenStream tokens;

	public Antlr4AnnotationRemover(BufferedTokenStream tokens) {
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}

	public String getText() {
		return rewriter.getText();
	}

	public Antlr4TextSpan getTokenSpanAt(int line, int column) {
		for (Token token : tokens.getTokens()) {
			if (token.getLine() == line && token.getCharPositionInLine() == column)
				return new Antlr4TextSpan(token);
		}
		return new Antlr4TextSpan(line, column + 1, line, column + 1);
	}

	private void removeText(ParserRuleContext context) {
		String text = this.tokens.getText(context);
		StringBuilder sb = new StringBuilder();
		for (char ch : text.toCharArray()) {
			if (ch == '\r' || ch == '\n') {
				sb.append(ch);
			} else {
				sb.append(' ');
			}
		}
		String newText = sb.toString();
		rewriter.replace(context.start, context.stop, newText);
	}

	@Override
	public Object visitOption(OptionContext ctx) {
		if ("generateCompiler".equals(ctx.id().getText())) {
			this.removeText(ctx);
		} else if ("generateCompilerBase".equals(ctx.id().getText())) {
			this.removeText(ctx);
		}
		return null;
	}

	@Override
	public Object visitAnnotation(AnnotationContext ctx) {
		this.removeText(ctx);
		return null;
	}

	@Override
	public Object visitPropertiesBlock(PropertiesBlockContext ctx) {
		this.removeText(ctx);
		return null;
	}
}
