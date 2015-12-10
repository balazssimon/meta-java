package metadslx.core;

public class ModelPropertyInitializer {
	private ModelProperty property;
	private Lazy<Object> value;
	private Iterable<Lazy<Object>> values;

	public ModelPropertyInitializer(ModelProperty property, Lazy<Object> value) {
		this.property = property;
		this.value = value;
	}

	public ModelPropertyInitializer(ModelProperty property, Iterable<Lazy<Object>> values) {
		this.property = property;
		this.values = values;
	}

	public ModelProperty getProperty() {
		return property;
	}

	public Lazy<Object> getValue() {
		return value;
	}

	public Iterable<Lazy<Object>> getValues() {
		return values;
	}
}
