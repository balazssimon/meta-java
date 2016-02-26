package metadslx.core;

import java.text.MessageFormat;

public class DiagnosticMessage implements Comparable<DiagnosticMessage> {

	private String fileName;
	private TextSpan textSpan;
	private String message;
	private Severity severity;
	private boolean isLog;
	
	public DiagnosticMessage(String message, String fileName, TextSpan textSpan, Severity severity, boolean isLog) {
		this.fileName = fileName;
		this.textSpan = textSpan;
		this.message = message;
		this.severity = severity;
		this.isLog = isLog;
	}

	public String getFileName() {
		return fileName;
	}

	public TextSpan getTextSpan() {
		return textSpan;
	}

	public String getMessage() {
		return message;
	}

	public Severity getSeverity() {
		return severity;
	}

	public boolean isLog() {
		return isLog;
	}

	@Override
	public String toString() {
		if (this.textSpan != null) {
			return MessageFormat.format("{0} in ''{1}'' ({2},{3}): {6}", this.severity, this.fileName, this.textSpan.getStartLine(), this.textSpan.getStartPosition(), this.textSpan.getEndLine(), this.textSpan.getEndPosition(), this.message);
		} else {
			return MessageFormat.format("{0} in ''{1}'' ({2},{3}): {6}", this.severity, this.fileName, 0, 0, 0, 0, this.message);
		}
	}

	@Override
	public int compareTo(DiagnosticMessage other) {
        if (other == this) return 0;
        if (other == null) return 1;
        if (this.fileName == null && other.fileName != null) return -1;
        if (this.fileName != null && other.fileName == null) return 1;
        int cmp;
        if (this.fileName != null && other.fileName != null)
        {
            cmp = this.fileName.compareTo(other.fileName);
            if (cmp != 0) return cmp;
        }
        if (this.textSpan == null) return -1;
        cmp = this.textSpan.compareTo(other.textSpan);
        if (cmp != 0) return cmp;
        cmp = this.severity.compareTo(other.severity);
        if (cmp != 0) return cmp;
        if (this.message == null) return -1;
        cmp = this.message.compareTo(other.message);
        if (cmp != 0) return cmp;
        return cmp;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DiagnosticMessage) {
			return this.compareTo((DiagnosticMessage)obj) == 0;
		}
		return false;
	}
}
