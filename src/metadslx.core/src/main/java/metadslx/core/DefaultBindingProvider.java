package metadslx.core;

import java.util.List;

public class DefaultBindingProvider implements IBindingProvider {

    // TODO
    protected void selectBestAlternative(List<ModelObject> alternativeList, MetaFunctionCallExpression call)
    {
        if (alternativeList.size() <= 1) return;
        IModelCompiler compiler = ModelCompilerContext.current();
        for (int i = 0; i < alternativeList.size(); i++)
        {
            ModelObject alternative = alternativeList.get(i);
            MetaTypedElement mte = MetaExtensions.typeAs(alternative, MetaTypedElement.class);
            if (mte != null && mte.getType() instanceof MetaFunctionType)
            {
                MetaFunctionType ft = MetaExtensions.typeAs(mte.getType(), MetaFunctionType.class);
                boolean goodAlternative = false;
                if (ft.getParameterTypes().size() == call.getArguments().size())
                {
                    goodAlternative = true;
                    for (int j = 0; j < call.getArguments().size(); j++)
                    {
                        MetaType paramType = ft.getParameterTypes().get(j);
                        MetaType argType = call.getArguments().get(j).getType();
                        if (!compiler.getTypeProvider().isAssignableFrom((ModelObject)paramType, (ModelObject)argType))
                        {
                            goodAlternative = false;
                        }
                    }
                }
                if (!goodAlternative && alternativeList.size() > 1)
                {
                    alternativeList.remove(i);
                    --i;
                }
            }
        }
        if (alternativeList.size() <= 1) return;
        for (int i = 0; i < alternativeList.size(); i++)
        {
            ModelObject alternative = alternativeList.get(i);
            MetaTypedElement mte = MetaExtensions.typeAs(alternative, MetaTypedElement.class);
            if (mte != null && mte.getType() instanceof MetaFunctionType)
            {
                MetaFunctionType ft = MetaExtensions.typeAs(mte.getType(), MetaFunctionType.class);
                boolean goodAlternative = false;
                if (ft.getParameterTypes().size() == call.getArguments().size())
                {
                    goodAlternative = true;
                    for (int j = 0; j < call.getArguments().size(); j++)
                    {
                        MetaType paramType = ft.getParameterTypes().get(j);
                        MetaType argType = call.getArguments().get(j).getType();
                        if (!compiler.getTypeProvider().equals((ModelObject)paramType, (ModelObject)argType))
                        {
                            goodAlternative = false;
                        }
                    }
                }
                if (!goodAlternative && alternativeList.size() > 1)
                {
                    alternativeList.remove(i);
                    --i;
                }
            }
        }
    }

    protected String getKindName(ResolutionInfo resolutionInfo)
    {
        if (resolutionInfo == null) return "name or type";
        switch (resolutionInfo.getKind())
        {
            case Name:
                return "name";
            case Type:
                return "type";
            default:
                return "name or type";
        }
    }

	@Override
	public ModelObject bind(ModelObject context, BindingInfo bindingInfo) {
        if (bindingInfo == null) return null;
        if (bindingInfo.isResolutionError()) return null;
        IModelCompiler compiler = ModelCompilerContext.current();
        List<ModelObject> alternativeList = bindingInfo.getResolvedObjects();
        MetaFunctionCallExpression fce = MetaExtensions.typeAs(context, MetaFunctionCallExpression.class);
        if (fce != null)
        {
            for (int i = 0; i < alternativeList.size(); i++)
            {
                boolean goodAlternative = false;
                ModelObject alternative = alternativeList.get(i);
                MetaTypedElement mte = MetaExtensions.typeAs(alternative, MetaTypedElement.class);
                if (mte != null && mte.getType() instanceof MetaFunctionType)
                {
                    goodAlternative = true;
                }
                if (!goodAlternative)
                {
                    alternativeList.remove(i);
                    --i;
                }
            }
            this.selectBestAlternative(alternativeList, fce);
        }
        if (alternativeList.size() == 0)
        {
            if (compiler != null)
            {
                compiler.getDiagnostics().addError("Cannot resolve " + this.getKindName(bindingInfo.getResolutionInfo()) + " '"+bindingInfo.getName()+"'.", compiler.getFileName(), bindingInfo.getNode() == null ? context : bindingInfo.getNode(), false);
            }
            return null;
        }
        else if (alternativeList.size() > 1)
        {
            if (compiler != null)
            {
                compiler.getDiagnostics().addError("Ambiguous " + this.getKindName(bindingInfo.getResolutionInfo()) + " '" + bindingInfo.getName() + "'.", compiler.getFileName(), bindingInfo.getNode() == null ? context : bindingInfo.getNode(), false);
            }
            return null;
        }
        else
        {
            ModelObject symbol = alternativeList.get(0);
            if (fce != null)
            {
                MetaTypedElement mte = MetaExtensions.typeAs(symbol, MetaTypedElement.class);
                if (mte != null && mte.getType() instanceof MetaFunctionType)
                {
                    MetaFunctionType ft = MetaExtensions.typeAs(mte.getType(), MetaFunctionType.class);
                    if (ft.getParameterTypes().size() == fce.getArguments().size())
                    {
                        for (int i = 0; i < fce.getArguments().size(); i++)
                        {
                            MetaType paramType = ft.getParameterTypes().get(i);
                            ((ModelObject)fce.getArguments().get(i)).mLazySet(MetaDescriptor.MetaExpression.ExpectedTypeProperty, Lazy.create(() -> paramType));
                        }
                    }
                    else
                    {
                        compiler.getDiagnostics().addError("The number of formal and actual parameters are different.", compiler.getFileName(), context, false);
                    }
                }
            }
            // TODO
            return symbol;
        }
	}

}
