package metadslx.compiler;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import metadslx.core.Lazy;
import metadslx.core.ModelFactory;
import metadslx.core.ModelObject;
import metadslx.core.ModelProperty;

public class MetaCompilerPropertyEvaluator extends AbstractParseTreeVisitor<Object> {
	private MetaCompiler compiler;
	protected ModelFactory modelFactory;

	public MetaCompilerPropertyEvaluator(MetaCompiler compiler) {
		this.compiler = compiler;
		this.modelFactory = new ModelFactory();
	}

	public MetaCompiler getCompiler() {
		return compiler;
	}

	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	@Override
	public Object visit(ParseTree tree) {
		try {
			return super.visit(tree);
		} catch (Exception ex) {
			this.compiler.getDiagnostics().addError("Exception: " + ex, this.compiler.getFileName(), tree, false);
		}
		return null;
	}

	public Object visitChildren(RuleNode node) {
		try {
			return super.visitChildren(node);
		} catch (Exception ex) {
			this.compiler.getDiagnostics().addError("Exception: " + ex, this.compiler.getFileName(), node, false);
		}
		return null;
	}

	public ModelObject symbol(ParseTree node) {
		ModelObject symbol = this.compiler.getData().getSymbol(node);
		if (symbol == null) {
			this.compiler.getDiagnostics().addError("Cannot resolve symbol. No symbols found for the node.",
					this.compiler.getFileName(), node, true);
		}
		return symbol;
	}

	public Object getValue(ParseTree node, String property) {
		if (node == null)
			return null;
		if (property == null)
			return null;
		Object symbol = this.symbol(node);
		if (symbol instanceof ModelObject) {
			ModelObject mo = (ModelObject) symbol;
			ModelProperty prop = mo.mFindProperty(property);
			if (prop != null) {
				return mo.mGet(prop);
			}
		}
		return null;
	}

	public void setValue(ParseTree node, String property, Lazy<Object> value) {
		if (node == null)
			return;
		if (property == null)
			return;
		if (value == null)
			return;
		Object symbol = this.symbol(node);
		if (symbol instanceof ModelObject) {
			ModelObject mo = (ModelObject) symbol;
			ModelProperty prop = mo.mFindProperty(property);
			if (prop != null) {
				if (prop.isCollection()) {
					mo.mLazyAdd(prop, value);
				} else {
					mo.mLazySet(prop, value);
				}
			}
		}
	}
}
