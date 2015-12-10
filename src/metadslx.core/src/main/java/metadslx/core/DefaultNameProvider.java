package metadslx.core;

import java.util.ArrayList;
import java.util.List;

public class DefaultNameProvider implements INameProvider {

	@Override
	public String getName(Object node) {
		if (node == null) return null;
		return node.toString();
	}

	@Override
	public String getNameOf(ModelObject symbol) {
		if (symbol == null) return null;
		for (ModelProperty prop: symbol.mGetAllProperties()) {
			if (prop.isMetaName()) {
				Object value = symbol.mGet(prop);
				if (value == null) return null;
				else return value.toString();
			}
		}
		return null;
	}

	@Override
	public Object getValue(Object node) {
		if (node == null) return null;
		return node.toString();
	}

	@Override
	public Iterable<TextSpan> getSymbolTextSpans(ModelObject symbol) {
		ArrayList<TextSpan> result = new ArrayList<>();
		Object nameTreeNodes = symbol.mGet(MetaScopeEntryProperties.NameTreeNodesProperty);
		List<Object> nameTreeNodeList = (List<Object>)nameTreeNodes;
		if (nameTreeNodeList != null && nameTreeNodeList.size() > 0) {
			for (Object nameTreeNode: nameTreeNodeList) {
				result.add(this.getTreeNodeTextSpan(nameTreeNode));
			}
		} else {
			Object symbolTreeNodes = symbol.mGet(MetaScopeEntryProperties.SymbolTreeNodesProperty);
			List<Object> symbolTreeNodeList = (List<Object>)symbolTreeNodes;
			if (symbolTreeNodeList != null && symbolTreeNodeList.size() > 0) {
				for (Object symbolTreeNode: symbolTreeNodeList) {
					result.add(this.getTreeNodeTextSpan(symbolTreeNode));
				}
			}			
		}
		return result;
	}

	@Override
	public TextSpan getTreeNodeTextSpan(Object node) {
		return new TextSpan();
	}

}
