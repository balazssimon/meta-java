package metadslx.core;

public class ModelUtils {
	public static <T> T as(Class<T> type, Object value) {
		if(type.isInstance(value)){
			return type.cast(value);
		}
		return null;
	}
}
