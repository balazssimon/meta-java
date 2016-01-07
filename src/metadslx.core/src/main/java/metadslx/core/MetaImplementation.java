package metadslx.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MetaImplementation extends MetaImplementationBase {
	@Override
	public void MetaFunction(metadslx.core.MetaFunction _this) {
		super.MetaFunction(_this);
		MetaFunctionType type = MetaFactory.instance().createMetaFunctionType();
		((ModelObject)type).mUnSet(MetaDescriptor.MetaFunctionType.ParameterTypesProperty);
		((ModelObject)type).mLazySet(MetaDescriptor.MetaFunctionType.ParameterTypesProperty, Lazy.create(() -> new ModelMultiList<>((ModelObject)_this, MetaDescriptor.MetaFunctionType.ParameterTypesProperty, _this.getParameters().stream().map(p -> p.getType()).collect(java.util.stream.Collectors.toList())), true));
		((ModelObject)type).mLazySet(MetaDescriptor.MetaFunctionType.ReturnTypeProperty, Lazy.create(() -> _this.getReturnType(), true));
		((ModelObject)_this).mSet(MetaDescriptor.MetaFunction.TypeProperty, type);
	}
	
	@Override
	public void MetaUnaryExpression(metadslx.core.MetaUnaryExpression _this) {
		super.MetaUnaryExpression(_this);
		((ModelObject)_this).mLazyAdd(MetaDescriptor.MetaBoundExpression.ArgumentsProperty, Lazy.create(() -> _this.getExpression(), true));
	}
	
	@Override
	public void MetaBinaryExpression(metadslx.core.MetaBinaryExpression _this) {
		super.MetaBinaryExpression(_this);
        ((ModelObject)_this).mLazyAdd(MetaDescriptor.MetaBoundExpression.ArgumentsProperty, Lazy.create(() -> _this.getLeft(), true));
        ((ModelObject)_this).mLazyAdd(MetaDescriptor.MetaBoundExpression.ArgumentsProperty, Lazy.create(() -> _this.getRight(), true));
	}
	
	@Override
	public void MetaNewCollectionExpression(metadslx.core.MetaNewCollectionExpression _this) {
		super.MetaNewCollectionExpression(_this);
        ((ModelObject)_this).mLazySetChild(MetaDescriptor.MetaNewCollectionExpression.ValuesProperty, MetaDescriptor.MetaExpression.ExpectedTypeProperty, Lazy.create(() -> _this.getTypeReference().getInnerType(), true));
	}
	
	@Override
	public List<metadslx.core.MetaOperation> MetaClass_getAllOperations(metadslx.core.MetaClass _this) {
		ArrayList<MetaOperation> result = new ArrayList<>();
		for (MetaOperation oper: _this.getOperations()) {
			result.add(oper);
		}
		for (MetaClass cls: _this.getAllSuperClasses()) {
			for (MetaOperation oper: cls.getOperations()) {
				result.add(oper);
			}
		}
		return result;
	}
	
	@Override
	public List<metadslx.core.MetaProperty> MetaClass_getAllProperties(metadslx.core.MetaClass _this) {
		ArrayList<MetaProperty> result = new ArrayList<>();
		for (MetaProperty prop: _this.getProperties()) {
			result.add(prop);
		}
		for (MetaClass cls: _this.getAllSuperClasses()) {
			for (MetaProperty prop: cls.getProperties()) {
				result.add(prop);
			}
		}
		return result;
	}
	
	@Override
	public List<metadslx.core.MetaClass> MetaClass_getAllSuperClasses(metadslx.core.MetaClass _this) {
		ArrayList<MetaClass> result = new ArrayList<>();
		for (MetaClass sup: _this.getSuperClasses()) {
			Collection<MetaClass> allSupers = sup.getAllSuperClasses();
			if (!result.contains(sup)) {
				result.add(sup);
			}
			for (MetaClass supSup: allSupers) {
				if (!result.contains(supSup)) {
					result.add(supSup);
				}
			}
		}
		return result;
	}
}
