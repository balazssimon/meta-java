package metadslx.compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.TextSpan;

public class Antlr4TextSpan extends TextSpan {
	public Antlr4TextSpan() {
		super(0, 0, 0, 0);
	}

	public Antlr4TextSpan(int startLine, int startPosition, int endLine, int endPosition) {
		super(startLine, startPosition, endLine, endPosition);
	}

	public Antlr4TextSpan(Object node) {
		this();
		if (node instanceof Token) {
			this.createFromToken((Token) node);
		} else {
			if (node instanceof ParseTree) {
				if (node instanceof TerminalNode) {
					this.createFromToken(((TerminalNode) node).getSymbol());
				} else if (node instanceof ParserRuleContext) {
					this.createFromRule(((ParserRuleContext) node));
				}
			}
		}
	}

	private void createFromToken(Token token) {
		if (token == null)
			return;
		this.setStartLine(token.getLine());
		this.setStartPosition(token.getCharPositionInLine() + 1);
		String text = token.getText();
		if (!text.contains("\n")) {
			this.setEndLine(this.getStartLine());
			this.setEndPosition(this.getStartPosition() + text.length());
		} else {
			int newLineCount = 0;
			for (int i = text.length() - 1; i >= 0; --i) {
				if (text.charAt(i) == '\n')
					++newLineCount;
			}
			this.setEndLine(token.getLine() + newLineCount);
			int index = text.lastIndexOf('\n');
			this.setEndPosition(text.length() - index);
		}
	}

	private void createFromRule(ParserRuleContext rule) {
		if (rule == null)
			return;
		this.setStartLine(rule.start.getLine());
		this.setStartPosition(rule.start.getCharPositionInLine() + 1);
		this.setEndLine(rule.stop.getLine());
		this.setEndPosition(rule.stop.getCharPositionInLine() + rule.stop.getText().length() + 1);
	}
}
