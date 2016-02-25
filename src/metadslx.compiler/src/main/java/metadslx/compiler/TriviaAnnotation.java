package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;

public class TriviaAnnotation
{
    private List<Class<?>> symbolTypes;
    private String property;
    private boolean hasProperty;
    private TriviaPosition position;

    public TriviaAnnotation()
    {
        this.symbolTypes = new ArrayList<Class<?>>();
    }

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public boolean hasProperty() {
		return hasProperty;
	}

	public void setHasProperty(boolean hasProperty) {
		this.hasProperty = hasProperty;
	}

	public TriviaPosition getPosition() {
		return position;
	}

	public void setPosition(TriviaPosition position) {
		this.position = position;
	}

	public List<Class<?>> getSymbolTypes() {
		return symbolTypes;
	}
    
}
