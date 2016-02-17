package metadslx.compiler;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;

public interface IAntlr4Compiler extends ANTLRErrorListener {
	CommonTokenStream getCommonTokenStream();
}
