package metadslx.compiler;

public class MetaCompilerException extends RuntimeException {
	private static final long serialVersionUID = 1L;

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
