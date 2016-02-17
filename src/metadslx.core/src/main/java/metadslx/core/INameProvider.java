package metadslx.core;

public interface INameProvider {
	String getName(Object node);
	String getNameOf(ModelObject symbol);
	Object getValue(Object node, Class type);
	Iterable<TextSpan> getSymbolTextSpans(ModelObject symbol);
	TextSpan getTreeNodeTextSpan(Object node);
}
