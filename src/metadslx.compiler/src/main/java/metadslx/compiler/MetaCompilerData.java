package metadslx.compiler;

import java.util.HashMap;
import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.core.Lazy;
import metadslx.core.ModelFactory;
import metadslx.core.ModelObject;

public class MetaCompilerData {
	private HashSet<ModelObject> symbols;
	private MetaCompiler compiler;
	private ModelFactory modelFactory;
	public HashMap<ParseTree, ModelObject> nodeToSymbol;
	public HashMap<ParseTree, Lazy<Object>> lazyNodeToSymbol;

	public MetaCompilerData(MetaCompiler compiler) {
		this.compiler = compiler;
		this.modelFactory = new ModelFactory();
		this.symbols = new HashSet<>();
		this.nodeToSymbol = new HashMap<>();
		this.lazyNodeToSymbol = new HashMap<>();
	}

	public Iterable<ModelObject> getSymbols() {
		return symbols;
	}

	public MetaCompiler getCompiler() {
		return compiler;
	}

	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	public HashMap<ParseTree, ModelObject> getNodeToSymbol() {
		return nodeToSymbol;
	}

	public HashMap<ParseTree, Lazy<Object>> getLazyNodeToSymbol() {
		return lazyNodeToSymbol;
	}

	public void registerSymbol(ParseTree node, ModelObject symbol) {
		if (symbol == null)
			return;
		if (node != null) {
			this.nodeToSymbol.put(node, symbol);
		}
		this.symbols.add(symbol);
	}

	public void registerLazySymbol(ParseTree node, Lazy<Object> symbol) {
		if (symbol == null)
			return;
		if (node != null) {
			this.lazyNodeToSymbol.put(node, symbol);
		}
	}

	public void replaceSymbol(ParseTree node, ModelObject oldSymbol, ModelObject newSymbol) {
		if (oldSymbol == null)
			return;
		if (newSymbol == null)
			return;
		if (oldSymbol == newSymbol)
			return;
		if (node != null) {
			this.nodeToSymbol.put(node, newSymbol);
		}
		this.symbols.remove(oldSymbol);
		this.symbols.add(newSymbol);
	}

	public ModelObject getSymbol(ParseTree node) {
		ModelObject symbol = this.nodeToSymbol.get(node);
		if (symbol != null) {
			return symbol;
		}
		Lazy<Object> lazySymbol = this.lazyNodeToSymbol.get(node);
		if (lazySymbol != null) {
			if (lazySymbol.value() instanceof ModelObject) {
				symbol = (ModelObject) lazySymbol.value();
				this.nodeToSymbol.put(node, symbol);
			}
			return symbol;
		}
		return null;
	}
}
