package metadlsx.core;

public interface INameProvider {
	String getName(Object node);
	String getNameOf(ModelObject symbol);
	Object getValue(Object node);
	Iterable<TextSpan> getSymbolTextSpans(ModelObject symbol);
	TextSpan getTreeNodeTextSpan(Object node);
}
