package metadslx.core;

import java.util.ArrayList;
import java.util.List;

public class DefaultResolutionProvider implements IResolutionProvider {

	@Override
	public ModelObject getParentScope(ModelObject symbol) {
        IModelCompiler compiler = ModelCompilerContext.current();
        ModelObject result = null;
        if (compiler != null)
        {
            result = compiler.getGlobalScope();
        }
        if (symbol != null)
        {
        	symbol = symbol.mGetParent();
        }
        while(symbol != null && !MetaExtensions.isMetaScope(symbol))
        {
        	symbol = symbol.mGetParent();
        }
        if (symbol != null)
        {
            result = symbol;
        }
        return result;
	}

	@Override
	public ModelObject getCurrentScope(ModelObject symbol) {
        IModelCompiler compiler = ModelCompilerContext.current();
        ModelObject result = null;
        if (compiler != null)
        {
            result = compiler.getGlobalScope();
        }
        while (symbol != null && !MetaExtensions.isMetaScope(symbol))
        {
        	symbol = symbol.mGetParent();
        }
        if (symbol != null)
        {
            result = symbol;
        }
        return result;
	}

	@Override
	public ModelObject getCurrentTypeScopeOf(ModelObject symbol) {
        IModelCompiler compiler = ModelCompilerContext.current();
        ModelObject result = null;
        if (compiler != null)
        {
            result = compiler.getGlobalScope();
        }
        while (symbol != null && !MetaExtensions.isMetaScope(symbol) && !MetaExtensions.isMetaType(symbol))
        {
        	symbol = symbol.mGetParent();
        }
        if (symbol != null)
        {
            result = symbol;
        }
        return result;
	}

	@Override
	public BindingInfo resolve(ResolutionInfo resolutionInfo) {
        if (resolutionInfo == null || resolutionInfo.getQualifiedNameNodes().size() == 0) new BindingInfo(resolutionInfo, null, null, true);
        List<ModelObject> currentResult = resolutionInfo.getScopes();
        String name = null;
        Object node = null;
        Object errorNode = null;
        if (currentResult.size() > 0) {
        	errorNode = currentResult.get(0);
        }
        boolean first = true;
        boolean last = true;
        for (int i = 0; i < resolutionInfo.getQualifiedNameNodes().size(); i++)
        {
            node = resolutionInfo.getQualifiedNameNodes().get(i);
            if (node instanceof String)
            {
                name = (String)node;
            }
            else
            {
            	if (node != null) {
                	errorNode = node;
            	}
                name = ModelCompilerContext.current().getNameProvider().getName(node);
            }
            first = i == 0;
            last = i == resolutionInfo.getQualifiedNameNodes().size() - 1;
            currentResult = this.resolve(currentResult, last ? resolutionInfo.getKind() : ResolveKind.NameOrType, name, first ? resolutionInfo.getPosition() : -1, first ? resolutionInfo.getLocation() : ResolutionLocation.Scope, last ? resolutionInfo.getSymbolTypes() : null);
        }
        if (currentResult.size() == 0)
        {
            IModelCompiler compiler = ModelCompilerContext.current();
            if (compiler != null)
            {
                String nameKind = null;
                switch (last ? resolutionInfo.getKind() : ResolveKind.NameOrType)
                {
                    case Name:
                        nameKind = "name";
                        break;
                    case Type:
                        nameKind = "type";
                        break;
                    default:
                        nameKind = "name or type";
                        break;
                }
                compiler.getDiagnostics().addError("Could not resolve " + nameKind + " '" + name + "'.", compiler.getFileName(), errorNode, false);
            }
        }
        BindingInfo result = new BindingInfo(resolutionInfo, name, errorNode, currentResult.size() == 0);
        result.getResolvedObjects().addAll(currentResult);
        return result;
	}

    protected List<ModelObject> resolve(List<ModelObject> scopes, ResolveKind kind, String name, int position, ResolutionLocation location, List<Class<?>> symbolTypes)
    {
        ArrayList<ModelObject> result = new ArrayList<ModelObject>();
        for (ModelObject scope: scopes)
        {
            if (location.hasFlag(ResolutionLocation.Children))
            {
                result.addAll(this.resolveEntries(this.getEntries(scope, ScopeEntry.class), kind, name, position, symbolTypes));
            }
            if (location.hasFlag(ResolutionLocation.Inherited))
            {
                result.addAll(this.resolve(this.getScopes(scope, InheritedScope.class), kind, name, -1, ResolutionLocation.Scope, symbolTypes));
            }
            if (location.hasFlag(ResolutionLocation.Imported))
            {
                result.addAll(this.resolve(this.getScopes(scope, ImportedScope.class), kind, name, -1, ResolutionLocation.Scope, symbolTypes));
            }
            if (location.hasFlag(ResolutionLocation.ImportedScope))
            {
                result.addAll(this.resolveEntries(this.getEntries(scope, ImportedEntry.class), kind, name, -1, symbolTypes));
            }
        }
        if (location.hasFlag(ResolutionLocation.Parent) && result.size() == 0)
        {
            ArrayList<ModelObject> parentScopes = new ArrayList<ModelObject>();
            for (ModelObject scope: scopes)
            {
                ModelObject parentScope = this.getParentOrNullScope(scope);
                if (parentScope != null)
                {
                    parentScopes.add(parentScope);
                }
            }
            if (parentScopes.size() > 0)
            {
                result.addAll(this.resolve(parentScopes, kind, name, -1, ResolutionLocation.All, symbolTypes));
            }
        }
        return result;
    }

    protected Object getName(ModelObject entry)
    {
        if (entry != null)
        {
            for (ModelProperty prop: entry.mGetProperties())
            {
                if (MetaExtensions.isMetaName(prop))
                {
                    if (entry.mIsValueCreated(prop))
                    {
                        return entry.mGet(prop);
                    }
                    else
                    {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    protected ModelObject getParentOrNullScope(ModelObject scope)
    {
        if (scope == null) return null;
        ModelObject parent = scope.mGetParent();
        while (parent != null && !MetaExtensions.isMetaScope(parent))
        {
            parent = parent.mGetParent();
        }
        return parent;
    }

    protected <T> ArrayList<ModelObject> getScopes(ModelObject scope, Class<T> attribute)
    {
        ArrayList<ModelObject> result = new ArrayList<ModelObject>();
        if (scope == null) return result;
        for (ModelProperty prop: scope.mGetAllProperties())
        {
            if (prop.getAnnotations().stream().anyMatch(a -> attribute.isAssignableFrom(a.getClass())))
            {
                Object entry = scope.mGet(prop);
                ModelCollection<?> scopeEntries = MetaExtensions.typeAs(entry, ModelCollection.class);
                if (scopeEntries != null)
                {
                	Iterable<?> scopeEntryList = MetaExtensions.typeAs(scopeEntries, Iterable.class);
                    for (Object scopeEntry: scopeEntryList)
                    {
                        ModelObject scopeEntryObject = MetaExtensions.typeAs(scopeEntry, ModelObject.class);
                        if (scopeEntryObject != null && MetaExtensions.isMetaScope(scopeEntryObject))
                        {
                            result.add(scopeEntryObject);
                        }
                    }
                }
                else
                {
                    ModelObject entryObject = MetaExtensions.typeAs(entry, ModelObject.class);
                    if (entryObject != null && MetaExtensions.isMetaScope(entryObject))
                    {
                        result.add(entryObject);
                    }
                }
            }
        }
        return result;
    }

    protected <T> ArrayList<ModelObject> getEntries(ModelObject scope, Class<T> attribute)
    {
        ArrayList<ModelObject> result = new ArrayList<ModelObject>();
        if (scope == null) return result;
        for (ModelProperty prop: scope.mGetAllProperties())
        {
            if (prop.getAnnotations().stream().anyMatch(a -> attribute.isAssignableFrom(a.getClass())))
            {
                Object entry = scope.mGet(prop);
                ModelCollection<?> scopeEntries = MetaExtensions.typeAs(entry, ModelCollection.class);
                if (scopeEntries != null)
                {
                	Iterable<?> scopeEntryList = MetaExtensions.typeAs(scopeEntries, Iterable.class);
                    for (Object scopeEntry: scopeEntryList)
                    {
                        ModelObject scopeEntryObject = MetaExtensions.typeAs(scopeEntry, ModelObject.class);
                        if (scopeEntryObject != null)
                        {
                            result.add(scopeEntryObject);
                        }
                    }
                }
                else
                {
                    ModelObject entryObject = MetaExtensions.typeAs(entry, ModelObject.class);
                    if (entryObject != null)
                    {
                        result.add(entryObject);
                    }
                }
            }
        }
        return result;
    }

    protected ArrayList<ModelObject> resolveEntries(List<ModelObject> entries, ResolveKind kind, String name, int position, List<Class<?>> symbolTypes)
    {
        ArrayList<ModelObject> result = new ArrayList<ModelObject>();
        if (name == null) return result;
        for (ModelObject entry: entries)
        {
            ModelObject entryObject = MetaExtensions.typeAs(entry, ModelObject.class);
            if (entryObject != null && name.equals(this.getName(entryObject)))
            {
                if ((kind.hasFlag(ResolveKind.Type) && MetaExtensions.isMetaType(entryObject))
                    || (kind.hasFlag(ResolveKind.Name) && !MetaExtensions.isMetaType(entryObject)))
                {
                    boolean typeOK = false;
                    if (symbolTypes != null && symbolTypes.size() > 0)
                    {
                        for (Class<?> symbolType: symbolTypes)
                        {
                            if (symbolType.isAssignableFrom(entryObject.getClass()))
                            {
                                typeOK = true;
                                break;
                            }
                        }
                    }
                    else
                    {
                        typeOK = true;
                    }
                    if (typeOK)
                    {
                        result.add(entryObject);
                    }
                }
            }
        }
        return result;
    }

}
