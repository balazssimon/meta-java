package metadslx.compiler;

public class MetaCompilerException extends RuntimeException {
	public MetaCompilerException() {
	}

	public MetaCompilerException(String message) {
		super(message);
	}

	public MetaCompilerException(Throwable cause) {
		super(cause);
	}

	public MetaCompilerException(String message, Throwable cause) {
		super(message, cause);
	}
}
