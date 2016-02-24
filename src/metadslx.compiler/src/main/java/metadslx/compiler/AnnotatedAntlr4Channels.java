package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;

public class AnnotatedAntlr4Channels {
	public static int getLeadingTriviaTokenStartIndex(Token token, BufferedTokenStream tokenStream) {
		return AnnotatedAntlr4Channels.getLeadingTriviaTokenStartIndex(token, tokenStream, -1);
	}

	public static int getLeadingTriviaTokenStartIndex(Token token, BufferedTokenStream tokenStream, int triviaChannel) {
		List<Token> tokens = tokenStream.getTokens();
		int lastNewLine = -1;
		int i = token.getTokenIndex() - 1;
		int lastTriviaToken = token.getTokenIndex();
		int lastTriviaTokenBeforeNewLine = lastTriviaToken;
		while (i >= 0) {
			Token t = tokens.get(i);
			String text = t.getText();
			if (t.getChannel() == 0) {
				if (lastNewLine < 0)
					return lastTriviaToken;
				else
					return lastTriviaTokenBeforeNewLine;
			} else
				if (text != null && !"".equals(text.trim()) && (text.indexOf('\r') >= 0 || text.indexOf('\n') >= 0)) {
				lastTriviaTokenBeforeNewLine = lastTriviaToken;
				lastNewLine = i;
			} else if (triviaChannel < 0 || t.getChannel() == triviaChannel) {
				lastTriviaToken = i;
			}
			--i;
		}
		return lastTriviaToken;
	}

	public static int getTrailingTriviaTokenEndIndex(Token token, BufferedTokenStream tokenStream) {
		return AnnotatedAntlr4Channels.getTrailingTriviaTokenEndIndex(token, tokenStream, -1);
	}

	public static int getTrailingTriviaTokenEndIndex(Token token, BufferedTokenStream tokenStream, int triviaChannel) {
		List<Token> tokens = tokenStream.getTokens();
		int i = token.getTokenIndex() - 1;
		int lastTriviaToken = token.getTokenIndex();
		while (i < tokens.size()) {
			Token t = tokens.get(i);
			String text = t.getText();
			if (t.getChannel() == 0) {
				return lastTriviaToken;
			} else if (text.indexOf('\r') >= 0 || text.indexOf('\n') >= 0) {
				if (text == null || "".equals(text.trim()))
					return lastTriviaToken;
				else
					return i;
			} else if (triviaChannel < 0 || t.getChannel() == triviaChannel) {
				lastTriviaToken = i;
			}
			++i;
		}
		return lastTriviaToken;
	}

	public static List<Token> getLeadingTriviaTokens(Token token, BufferedTokenStream tokenStream) {
		return AnnotatedAntlr4Channels.getLeadingTriviaTokens(token, tokenStream, -1);
	}

	public static List<Token> getLeadingTriviaTokens(Token token, BufferedTokenStream tokenStream, int triviaChannel) {
		int startIndex = getLeadingTriviaTokenStartIndex(token, tokenStream, triviaChannel);
		int endIndex = token.getTokenIndex() - 1;
		if (startIndex >= 0 && startIndex <= endIndex && endIndex <= tokenStream.size()) {
			return tokenStream.getTokens(startIndex, endIndex);
		}
		return new ArrayList<Token>();
	}

	public static List<Token> getTrailingTriviaTokens(Token token, BufferedTokenStream tokenStream) {
		return AnnotatedAntlr4Channels.getTrailingTriviaTokens(token, tokenStream, -1);
	}

	public static List<Token> getTrailingTriviaTokens(Token token, BufferedTokenStream tokenStream, int triviaChannel) {
		int startIndex = token.getTokenIndex() + 1;
		int endIndex = getTrailingTriviaTokenEndIndex(token, tokenStream, triviaChannel);
		if (startIndex >= 0 && startIndex <= endIndex && endIndex <= tokenStream.size()) {
			return tokenStream.getTokens(startIndex, endIndex);
		}
		return new ArrayList<Token>();
	}
}
