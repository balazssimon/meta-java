package metadslx.core;

public class MetaExtensions {
    public static boolean isMetaScope(ModelObject symbol)
    {
        if (symbol == null) return false;
        if (isMetaScope(symbol.getClass())) return true;
        for (Class<?> intf: symbol.getClass().getInterfaces())
        {
            if (isMetaScope(intf)) return true;
        }
        return false;
    }

    public static boolean isMetaScope(Class symbolType)
    {
        if (symbolType == null) return false;
        return symbolType.getAnnotationsByType(Scope.class).length > 0;
    }

    public static boolean isMetaType(ModelObject symbol)
    {
        if (symbol == null) return false;
        if (isMetaType(symbol.getClass())) return true;
        for (Class<?> intf: symbol.getClass().getInterfaces())
        {
            if (isMetaType(intf)) return true;
        }
        return false;
    }

    public static boolean isMetaType(Class symbolType)
    {
        if (symbolType == null) return false;
        return symbolType.getAnnotationsByType(Type.class).length > 0;
    }

    public static boolean isMetaName(ModelProperty property)
    {
        if (property == null) return false;
        return property.getAnnotations().stream().anyMatch(a -> a instanceof Name);
    }
    
    public static boolean isNullOrEmpty(String text) {
    	return text == null || "".equals(text);
    }
    
    public static boolean isNullOrWhiteSpace(String text) {
    	return text == null || "".equals(text.trim());
    }
    
    public static boolean sameString(String left, String right) {
    	if (left == null && right == null) return true;
    	if (left == null && right != null) return false;
    	if (left != null && right == null) return false;
    	return left.equals(right);
    }
}
