package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;

public class PropertyAnnotation
{
    private List<Class> symbolTypes;
    private String name;
    private Object value;
    private boolean hasValue;

    public PropertyAnnotation()
    {
        this.symbolTypes = new ArrayList<Class>();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Class> getSymbolTypes() {
		return symbolTypes;
	}
    
}
