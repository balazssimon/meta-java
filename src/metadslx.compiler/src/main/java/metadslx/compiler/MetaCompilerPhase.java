package metadslx.compiler;

import org.antlr.v4.runtime.tree.ParseTree;

public class MetaCompilerPhase {
	private MetaCompiler compiler;

	public MetaCompilerPhase(MetaCompiler compiler) {
		this.compiler = compiler;
	}

	public void visitNode(ParseTree node) {

	}
}
