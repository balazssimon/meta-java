package metadlsx.core;

public interface IBindingProvider {
	ModelObject bind(ModelObject context, Iterable<ModelObject> alternatives, BindingInfo info);
}
