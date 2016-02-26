package metadslx.core;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MetaImplementation extends MetaImplementationBase {
	@Override
	public List<String> MetaDocumentedElement_getDocumentationLines(metadslx.core.MetaDocumentedElement _this) {
		ArrayList<String> result = new ArrayList<>();
		if (_this.getDocumentation() == null) return result;
		BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(_this.getDocumentation().getBytes())));
		while(true) {
			String line = null;
			try {
				line = reader.readLine();
			} catch (IOException e) {
				// nop				
			}
			if (line == null) break;
			result.add(line);
		}
		return result;
	}
	
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
	public void MetaBoundExpression(metadslx.core.MetaBoundExpression _this) {
		super.MetaBoundExpression(_this);
		//((ModelObject)_this).mLazySetChild(MetaDescriptor.MetaBoundExpression.ArgumentsProperty, MetaDescriptor.MetaExpression.ExpectedTypeProperty, Lazy.create(() -> MetaInstance.None));
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
	
	@Override
	public List<metadslx.core.MetaProperty> MetaClass_getAllImplementedProperties(metadslx.core.MetaClass _this) {
		List<MetaProperty> props = _this.getAllProperties();
		int i = props.size()-1;
		while (i >= 0) {
			String name = props.get(i).getName();
			MetaProperty prop = null;
			for (MetaProperty p: props) {
				if (name.equals(p.getName())) {
					prop = p;
					break;
				}
			}
			if (prop != props.get(i)) {
				props.remove(i);
			}
			--i;
		}
		return props;
	}
	
	@Override
	public List<metadslx.core.MetaOperation> MetaClass_getAllImplementedOperations(metadslx.core.MetaClass _this) {
		List<MetaOperation> ops = _this.getAllOperations();
		int i = ops.size()-1;
		while (i >= 0) {
			String name = ops.get(i).getName();
			MetaOperation op = null;
			for (MetaOperation o: ops) {
				if (name.equals(o.getName())) {
					op = o;
					break;
				}
			}
			if (op != ops.get(i)) {
				ops.remove(i);
			}
			--i;
		}
		return ops;
	}
}
