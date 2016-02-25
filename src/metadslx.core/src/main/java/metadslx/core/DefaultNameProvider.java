package metadslx.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
			if (MetaExtensions.isMetaName(prop)) {
				Object value = symbol.mGet(prop);
				if (value == null) return null;
				else return value.toString();
			}
		}
		return null;
	}

	@Override
	public Object getValue(Object node, Class<?> type) {
		if (node == null) return null;
        String value = node.toString();
        if (type == null)
        {
            if ("null".equals(value)) return null;
            if ("true".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value))
            {
                return Boolean.parseBoolean(value);
            }
            try {
                return Integer.parseInt(value);
            } catch(NumberFormatException ex) {
            	// nop
            }
            try {
                return Long.parseLong(value);
            } catch(NumberFormatException ex) {
            	// nop
            }
            try {
                return Float.parseFloat(value);
            } catch(NumberFormatException ex) {
            	// nop
            }
            try {
                return Double.parseDouble(value);
            } catch(NumberFormatException ex) {
            	// nop
            }
            return value;
        }
        else
        {
        	try {
        		Method met = type.getMethod("fromString", String.class);
        		if (met != null && !Modifier.isStatic(met.getModifiers())) {
        			return met.invoke(null, value);
        		}
        	} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        		// nop
        	}
        	try {
        		Constructor<?> ctr = type.getConstructor(String.class);
        		if (ctr != null) {
        			return ctr.newInstance(value);
        		}
        	} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        		// nop
        	}
        }
        return value;
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
