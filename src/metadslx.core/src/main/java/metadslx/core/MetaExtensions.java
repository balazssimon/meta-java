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

    public static boolean isMetaScope(Class<?> symbolType)
    {
        if (symbolType == null) return false;
        return symbolType.getAnnotationsByType(Scope.class).length > 0;
    }

    public static boolean isMetaType(ModelObject symbol)
    {
        if (symbol == null) return false;
        if (isMetaType(symbol.getClass())) return true;
        return false;
    }

    public static boolean isMetaType(Class<?> symbolType)
    {
        if (symbolType == null) return false;
        Type[] annots = symbolType.getAnnotationsByType(Type.class);
        if (annots.length > 0) return true;
        for (Class<?> intf: symbolType.getInterfaces())
        {
            if (isMetaType(intf)) return true;
        }
        return false;
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
    
    @SuppressWarnings("unchecked")
	public static <T> T typeAs(Object value, Class<T> type) {
    	if (value == null) return null;
    	if (type == null) return null;
    	if (type.isAssignableFrom(value.getClass())) {
    		return (T)value;
    	} else {
    		return null;
    	}
    }
    
    public static boolean isAssignableFrom(Class<?> target, Class<?> source) {
    	if (Object.class.equals(target.getClass())) return true;
    	if (boolean.class.equals(source) && Boolean.class.equals(target)) return true;
    	if (byte.class.equals(source) && Byte.class.equals(target)) return true;
    	if (int.class.equals(source) && Integer.class.equals(target)) return true;
    	if (long.class.equals(source) && Long.class.equals(target)) return true;
    	if (float.class.equals(source) && Float.class.equals(target)) return true;
    	if (double.class.equals(source) && Double.class.equals(target)) return true;
    	if (Boolean.class.equals(source) && boolean.class.equals(target)) return true;
    	if (Byte.class.equals(source) && byte.class.equals(target)) return true;
    	if (Integer.class.equals(source) && int.class.equals(target)) return true;
    	if (Long.class.equals(source) && long.class.equals(target)) return true;
    	if (Float.class.equals(source) && float.class.equals(target)) return true;
    	if (Double.class.equals(source) && double.class.equals(target)) return true;
    	boolean assignable = target.isAssignableFrom(source);
    	return assignable;
    }
}
