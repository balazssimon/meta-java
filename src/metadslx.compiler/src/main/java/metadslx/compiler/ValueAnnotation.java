package metadslx.compiler;

public class ValueAnnotation
{
    private String name;
    private boolean hasName;
    private Object value;
    private boolean hasValue;
    private Class type;
    private boolean hasType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.hasName = true;
	}
	public boolean hasName() {
		return hasName;
	}
	public void setHasName(boolean hasName) {
		this.hasName = hasName;
	}

	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
		this.hasValue = true;
	}
	public boolean hasValue() {
		return hasValue;
	}
	public void setHasValue(boolean hasValue) {
		this.hasValue = hasValue;
	}

	public Class getType() {
		return type;
	}
	public void setType(Class type) {
		this.type = type;
		this.hasType = true;
	}
	public boolean hasType() {
		return hasType;
	}
	public void setHasType(boolean hasType) {
		this.hasType = hasType;
	}
}

