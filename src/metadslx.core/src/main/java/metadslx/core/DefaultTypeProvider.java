package metadslx.core;

import metadslx.core.MetaType;

public class DefaultTypeProvider implements ITypeProvider {

	@Override
	public ModelObject balance(ModelObject left, ModelObject right) {
        if (left == right) return left;
        if (left == MetaInstance.Error) return (ModelObject)MetaInstance.Error;
        if (right == MetaInstance.Error) return (ModelObject)MetaInstance.Error;
        if (left == MetaInstance.None) return (ModelObject)MetaInstance.None;
        if (right == MetaInstance.None) return (ModelObject)MetaInstance.None;
        if (left == MetaInstance.Object) return (ModelObject)MetaInstance.Object;
        if (right == MetaInstance.Object) return (ModelObject)MetaInstance.Object;
        if (left == MetaInstance.Any) return right;
        if (right == MetaInstance.Any) return left;
        MetaPrimitiveType primLeft = MetaExtensions.typeAs(left, MetaPrimitiveType.class);
        MetaPrimitiveType primRight = MetaExtensions.typeAs(right, MetaPrimitiveType.class);
        if (primLeft != null && primRight != null)
        {
            if (primLeft == MetaInstance.Byte && primRight == MetaInstance.Int) return (ModelObject)MetaInstance.Int;
            if (primLeft == MetaInstance.Byte && primRight == MetaInstance.Long) return (ModelObject)MetaInstance.Long;
            if (primLeft == MetaInstance.Int && primRight == MetaInstance.Byte) return (ModelObject)MetaInstance.Int;
            if (primLeft == MetaInstance.Int && primRight == MetaInstance.Long) return (ModelObject)MetaInstance.Long;
            if (primLeft == MetaInstance.Long && primRight == MetaInstance.Byte) return (ModelObject)MetaInstance.Long;
            if (primLeft == MetaInstance.Long && primRight == MetaInstance.Int) return (ModelObject)MetaInstance.Long;
            if (primLeft == MetaInstance.Byte && primRight == MetaInstance.Float) return (ModelObject)MetaInstance.Float;
            if (primLeft == MetaInstance.Byte && primRight == MetaInstance.Double) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Int && primRight == MetaInstance.Float) return (ModelObject)MetaInstance.Float;
            if (primLeft == MetaInstance.Int && primRight == MetaInstance.Double) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Long && primRight == MetaInstance.Float) return (ModelObject)MetaInstance.Float;
            if (primLeft == MetaInstance.Long && primRight == MetaInstance.Double) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Byte) return (ModelObject)MetaInstance.Float;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Byte) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Int) return (ModelObject)MetaInstance.Float;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Int) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Long) return (ModelObject)MetaInstance.Float;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Long) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Double) return (ModelObject)MetaInstance.Double;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Float) return (ModelObject)MetaInstance.Double;
            return (ModelObject)MetaInstance.Error;
        }
        MetaFactory factory = MetaFactory.instance();
        MetaNullableType nullLeft = MetaExtensions.typeAs(left, MetaNullableType.class);
        MetaNullableType nullRight = MetaExtensions.typeAs(right, MetaNullableType.class);
        if (nullLeft != null && nullRight != null)
        {
            ModelObject balancedInnerTypeObject = this.balance((ModelObject)nullLeft.getInnerType(), (ModelObject)nullRight.getInnerType());
            MetaType balancedInnerType = MetaExtensions.typeAs(balancedInnerTypeObject, MetaType.class);
            if (balancedInnerType != null && balancedInnerType != MetaInstance.Error)
            {
                MetaNullableType nullResult = factory.createMetaNullableType();
                nullResult.setInnerType(MetaExtensions.typeAs(balancedInnerType, MetaType.class));
                return (ModelObject)nullResult;
            }
            else
            {
                balancedInnerTypeObject = this.balance((ModelObject)nullLeft.getInnerType(), right);
                balancedInnerType = MetaExtensions.typeAs(balancedInnerTypeObject, MetaType.class);
                if (balancedInnerType != null && balancedInnerType != MetaInstance.Error)
                {
                    MetaNullableType nullResult = factory.createMetaNullableType();
                    nullResult.setInnerType(MetaExtensions.typeAs(balancedInnerType, MetaType.class));
                    return (ModelObject)nullResult;
                }
                else
                {
                    balancedInnerTypeObject = this.balance(left, (ModelObject)nullRight.getInnerType());
                    balancedInnerType = MetaExtensions.typeAs(balancedInnerTypeObject, MetaType.class);
                    if (balancedInnerType != null && balancedInnerType != MetaInstance.Error)
                    {
                        MetaNullableType nullResult = factory.createMetaNullableType();
                        nullResult.setInnerType(MetaExtensions.typeAs(balancedInnerType, MetaType.class));
                        return (ModelObject)nullResult;
                    }
                    else
                    {
                        return (ModelObject)MetaInstance.Error;
                    }
                }
            }
        }
        MetaCollectionType collLeft = MetaExtensions.typeAs(left, MetaCollectionType.class);
        MetaCollectionType collRight = MetaExtensions.typeAs(right, MetaCollectionType.class);
        if (collLeft != null && collRight != null)
        {
            if (collLeft.getKind() == collRight.getKind() && this.equals((ModelObject)collLeft.getInnerType(), (ModelObject)collRight.getInnerType()))
            {
                ModelObject balancedInnerTypeObject = this.balance((ModelObject)collLeft.getInnerType(), (ModelObject)collLeft.getInnerType());
                MetaType balancedInnerType = MetaExtensions.typeAs(balancedInnerTypeObject, MetaType.class);
                if (balancedInnerType != null && balancedInnerType != MetaInstance.Error)
                {
                    MetaCollectionType collResult = factory.createMetaCollectionType();
                    collResult.setKind(collLeft.getKind());
                    collResult.setInnerType(MetaExtensions.typeAs(balancedInnerType, MetaType.class));
                    return (ModelObject)collResult;
                }
                else
                {
                    return (ModelObject)MetaInstance.Error;
                }
            }
            else
            {
                return (ModelObject)MetaInstance.Error;
            }
        }
        MetaClass clsLeft = MetaExtensions.typeAs(left, MetaClass.class);
        MetaClass clsRight = MetaExtensions.typeAs(right, MetaClass.class);
        if (clsLeft != null && clsRight != null)
        {
            if (clsRight.getAllSuperClasses().contains(clsLeft))
            {
                return left;
            }
            if (clsLeft.getAllSuperClasses().contains(clsRight))
            {
                return right;
            }
            return (ModelObject)MetaInstance.Error;
        }
        return (ModelObject)MetaInstance.Error;
	}

	@Override
	public boolean isAssignableFrom(ModelObject left, ModelObject right) {
        if (this.equals(left, right)) return true;
        if (left == MetaInstance.Error) return false;
        if (right == MetaInstance.Error) return false;
        if (left == MetaInstance.None) return false;
        if (right == MetaInstance.None) return false;
        if (left == MetaInstance.Any) return true;
        if (left == MetaInstance.Object) return true;
        if (right == MetaInstance.Any) return true;
        if (right == MetaInstance.Object) return false;
        if (left == MetaInstance.ModelObject) return (right instanceof ModelObject) || (right == MetaInstance.ModelObject);
        if (left == MetaDescriptor.MetaType.getMetaClass()) return (right instanceof MetaType) || (right == MetaDescriptor.MetaType.getMetaClass());
        if (right == MetaInstance.ModelObject) return (left instanceof ModelObject) || (left == MetaInstance.ModelObject);
        if (right == MetaDescriptor.MetaType.getMetaClass()) return (left instanceof MetaType) || (left == MetaDescriptor.MetaType.getMetaClass());
        MetaPrimitiveType primLeft = MetaExtensions.typeAs(left, MetaPrimitiveType.class);
        MetaPrimitiveType primRight = MetaExtensions.typeAs(right, MetaPrimitiveType.class);
        if (primLeft != null && primRight != null)
        {
            if (primLeft == MetaInstance.Int && primRight == MetaInstance.Byte) return true;
            if (primLeft == MetaInstance.Long && primRight == MetaInstance.Byte) return true;
            if (primLeft == MetaInstance.Long && primRight == MetaInstance.Int) return true;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Byte) return true;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Byte) return true;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Int) return true;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Int) return true;
            if (primLeft == MetaInstance.Float && primRight == MetaInstance.Long) return true;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Long) return true;
            if (primLeft == MetaInstance.Double && primRight == MetaInstance.Float) return true;
            return false;
        }
        MetaNullableType nullLeft = MetaExtensions.typeAs(left, MetaNullableType.class);
        MetaNullableType nullRight = MetaExtensions.typeAs(right, MetaNullableType.class);
        if (nullLeft != null && nullRight != null)
        {
            return this.isAssignableFrom((ModelObject)nullLeft.getInnerType(), (ModelObject)nullRight.getInnerType())
                || this.isAssignableFrom((ModelObject)nullLeft.getInnerType(), right);
        }
        MetaCollectionType collLeft = MetaExtensions.typeAs(left, MetaCollectionType.class);
        MetaCollectionType collRight = MetaExtensions.typeAs(right, MetaCollectionType.class);
        if (collLeft != null && collRight != null)
        {
            return collLeft.getKind() == collRight.getKind() && this.equals((ModelObject)collLeft.getInnerType(), (ModelObject)collRight.getInnerType());
        }
        MetaClass clsLeft = MetaExtensions.typeAs(left, MetaClass.class);
        MetaClass clsRight = MetaExtensions.typeAs(right, MetaClass.class);
        if (clsLeft != null && clsRight != null)
        {
            return clsRight.getAllSuperClasses().contains(clsLeft);
        }
        return false;
	}

	@Override
	public boolean equals(ModelObject left, ModelObject right) {
        if (left == right) return true;
        if (left == MetaInstance.Error) return false;
        if (right == MetaInstance.Error) return false;
        if (left == MetaInstance.None) return false;
        if (right == MetaInstance.None) return false;
        if (left == MetaInstance.Any) return true;
        if (right == MetaInstance.Any) return true;
        if (left == MetaInstance.Object) return right == MetaInstance.Object;
        if (right == MetaInstance.Object) return false;
        if (left == MetaInstance.ModelObject) return right == MetaInstance.ModelObject;
        if (right == MetaInstance.ModelObject) return false;
        if (left == MetaDescriptor.MetaType.getMetaClass()) return right == MetaDescriptor.MetaType.getMetaClass();
        if (right == MetaDescriptor.MetaType.getMetaClass()) return false;
        if (left == MetaInstance.ModelObjectList)
        {
            if (right == MetaInstance.ModelObjectList) return true;
            MetaCollectionType cr = MetaExtensions.typeAs(right, MetaCollectionType.class);
            if (cr != null)
            {
                return cr.getKind() == MetaCollectionKind.List && this.equals((ModelObject)cr.getInnerType(), (ModelObject)MetaInstance.ModelObject);
            }
            else
            {
                return false;
            }
        }
        if (right == MetaInstance.ModelObjectList)
        {
            if (left == MetaInstance.ModelObjectList) return true;
            MetaCollectionType cl = MetaExtensions.typeAs(left, MetaCollectionType.class);
            if (cl != null)
            {
                return cl.getKind() == MetaCollectionKind.List && this.equals((ModelObject)cl.getInnerType(), (ModelObject)MetaInstance.ModelObject);
            }
            else
            {
                return false;
            }
        }
        MetaPrimitiveType primLeft = MetaExtensions.typeAs(left, MetaPrimitiveType.class);
        MetaPrimitiveType primRight = MetaExtensions.typeAs(right, MetaPrimitiveType.class);
        if (primLeft != null && primRight != null)
        {
            return false;
        }
        MetaNullableType nullLeft = MetaExtensions.typeAs(left, MetaNullableType.class);
        MetaNullableType nullRight = MetaExtensions.typeAs(right, MetaNullableType.class);
        if (nullLeft != null && nullRight != null)
        {
            return this.equals((ModelObject)nullLeft.getInnerType(), (ModelObject)nullRight.getInnerType());
        }
        MetaCollectionType collLeft = MetaExtensions.typeAs(left, MetaCollectionType.class);
        MetaCollectionType collRight = MetaExtensions.typeAs(right, MetaCollectionType.class);
        if (collLeft != null && collRight != null)
        {
            return collLeft.getKind() == collRight.getKind() && this.equals((ModelObject)collLeft.getInnerType(), (ModelObject)collRight.getInnerType());
        }
        MetaFunctionType funLeft = MetaExtensions.typeAs(left, MetaFunctionType.class);
        MetaFunctionType funRight = MetaExtensions.typeAs(right, MetaFunctionType.class);
        if (funLeft != null && funRight != null)
        {
            if (funLeft.getParameterTypes().size() != funRight.getParameterTypes().size()) return false;
            // TODO
            if (!this.equals((ModelObject)funLeft.getReturnType(), (ModelObject)funRight.getReturnType()))
            {
                if (MetaExtensions.sameString(funLeft.getReturnType().toString(), funRight.getReturnType().toString())) return true;
                else return false;
            }
            //if (!this.equals((ModelObject)funLeft.ReturnType, (ModelObject)funRight.ReturnType)) return false;
            for (int i = 0; i < funLeft.getParameterTypes().size(); i++)
            {
                if (!this.equals((ModelObject)funLeft.getParameterTypes().get(i), (ModelObject)funRight.getParameterTypes().get(i)))
                {
                    if (MetaExtensions.sameString(funLeft.getParameterTypes().get(i).toString(), funRight.getParameterTypes().get(i).toString())) return true;
                    else return false;
                }
            }
            return true;
        }
        return false;
	}

	@Override
	public MetaType getTypeOf(ModelObject symbol) {
        if (symbol == null) return MetaInstance.None;
        MetaTypedElement mte = MetaExtensions.typeAs(symbol, MetaTypedElement.class);
        if (mte != null) return mte.getType();
        MetaType mt = MetaExtensions.typeAs(symbol, MetaType.class);
        if (mt != null) return mt;
        return MetaInstance.None;
	}

	@Override
	public MetaType getTypeOf(Object value) {
        if (value == null) return MetaInstance.Object;
        ModelObject symbol = MetaExtensions.typeAs(value, ModelObject.class);
        if (symbol != null) return this.getTypeOf(symbol);
        if (value instanceof String) return MetaInstance.String;
        if (Boolean.class.isAssignableFrom(value.getClass())) return MetaInstance.Bool;
        if (Byte.class.isAssignableFrom(value.getClass())) return MetaInstance.Byte;
        if (Integer.class.isAssignableFrom(value.getClass())) return MetaInstance.Int;
        if (Long.class.isAssignableFrom(value.getClass())) return MetaInstance.Long;
        if (Float.class.isAssignableFrom(value.getClass())) return MetaInstance.Float;
        if (Double.class.isAssignableFrom(value.getClass())) return MetaInstance.Double;
        if (boolean.class.isAssignableFrom(value.getClass())) return MetaInstance.Bool;
        if (byte.class.isAssignableFrom(value.getClass())) return MetaInstance.Byte;
        if (int.class.isAssignableFrom(value.getClass())) return MetaInstance.Int;
        if (long.class.isAssignableFrom(value.getClass())) return MetaInstance.Long;
        if (float.class.isAssignableFrom(value.getClass())) return MetaInstance.Float;
        if (double.class.isAssignableFrom(value.getClass())) return MetaInstance.Double;
        return MetaInstance.None;
	}

	@Override
	public MetaType getReturnTypeOf(ModelObject symbol) {
        if (symbol == null) return MetaInstance.None;
        MetaFunction mf = MetaExtensions.typeAs(symbol, MetaFunction.class);
        if (mf != null) return mf.getReturnType();
        return MetaInstance.None;
	}


	@Override
	public boolean typeCheck(ModelObject symbol) {
        MetaExpression expr = MetaExtensions.typeAs(symbol, MetaExpression.class);
        if (expr == null) return true;
        boolean result = this.isAssignableFrom((ModelObject)expr.getExpectedType(), (ModelObject)expr.getType());
        if (!result)
        {
            IModelCompiler compiler = ModelCompilerContext.current();
            if (compiler != null)
            {
            	MetaType expType = expr.getExpectedType();
                if (expType == MetaInstance.None)
                {
                    return true;
                }
                else  if (expType == null)
                {
                	// TODO
                    //compiler.getDiagnostics().addError("The expression has no expected type.", compiler.getFileName(), symbol, false);
                }
                else if (expr.getType() == null)
                {
                    compiler.getDiagnostics().addError("The expression has no type.", compiler.getFileName(), symbol, false);
                }
                else
                {
                    compiler.getDiagnostics().addError("'" + expr.getExpectedType() + "' type expected, but expression has type '" + expr.getType() + "'.", compiler.getFileName(), symbol, false);
                }
            }
        }
        return result;
	}
}
