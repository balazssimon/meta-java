package metadslx.core;

import java.text.MessageFormat;

public class TextSpan implements Comparable<TextSpan> {

	private int startLine;
	private int startPosition;
	private int endLine;
	private int endPosition;

	public TextSpan() {
		this(0,0,0,0);
	}
	
	public TextSpan(int startLine, int startPosition, int endLine, int endPosition) {
		this.startLine = startLine;
		this.startPosition = startPosition;
		this.endLine = endLine;
		this.endPosition = endPosition;
	}
	
	public int getStartLine() {
		return startLine;
	}

	public int getStartPosition() {
		return startPosition;
	}

	public int getEndLine() {
		return endLine;
	}

	public int getEndPosition() {
		return endPosition;
	}

	@Override
	public int compareTo(TextSpan other) {
        int cmp;
        cmp = Integer.compare(this.startLine, other.startLine);
        if (cmp != 0) return cmp;
        cmp = Integer.compare(this.startPosition, other.startPosition);
        if (cmp != 0) return cmp;
        cmp = Integer.compare(this.endLine, other.endLine);
        if (cmp != 0) return cmp;
        cmp = Integer.compare(this.endPosition, other.endPosition);
        if (cmp != 0) return cmp;
        return 0;
	}

	@Override
	public String toString() {
		return MessageFormat.format("({0},{1})", this.startLine, this.startPosition);
	}
	
	@Override
	public int hashCode() {
		return this.startLine ^ this.startPosition ^ this.endLine ^ this.endPosition;
	}
}
