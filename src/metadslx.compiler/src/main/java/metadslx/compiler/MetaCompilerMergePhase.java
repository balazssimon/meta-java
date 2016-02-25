package metadslx.compiler;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.core.MetaExtensions;
import metadslx.core.Model;
import metadslx.core.ModelContext;
import metadslx.core.ModelObject;
import metadslx.core.ModelProperty;
import metadslx.core.RootScope;

public class MetaCompilerMergePhase extends MetaCompilerPhase {
	public MetaCompilerMergePhase(MetaCompiler compiler) {
		super(compiler);
	}


    protected void replaceSymbol(ParseTree node, ModelObject oldSymbol, ModelObject newSymbol)
    {
        this.getData().replaceSymbol(node, oldSymbol, newSymbol);
        for (int i = 0; i < this.getSymbolStack().size(); ++i)
        {
            if (this.getSymbolStack().get(i) == oldSymbol)
            {
                this.getSymbolStack().set(i, newSymbol);
            }
        }
        Model model = ModelContext.current();
        if (model != null)
        {
            model.removeInstance(oldSymbol);
            model.addInstance(newSymbol);
        }
    }

    @Override
    protected void handleNode(ParseTree node)
    {
        this.handleNames(node);
        super.handleNode(node);
    }

    protected void handleNames(ParseTree node)
    {
        if (this.currentNameKind() != this.currentScopeKind()) return;
        NameAnnotation na = this.getAnnotationFor(node, NameAnnotation.class);
        QualifiedNameAnnotation qna = this.getAnnotationFor(node, QualifiedNameAnnotation.class);
        if (na == null && qna == null) return;
        TypeDefAnnotation tda = this.getAnnotationFor(this.currentNameKind(), TypeDefAnnotation.class);
        NameDefAnnotation nda = this.getAnnotationFor(this.currentNameKind(), NameDefAnnotation.class);
        PropertyAnnotation pa = this.activeProperty();
        if (tda != null)
        {
            if (pa != null && !pa.hasValue())
            {
                ModelObject typeDef = this.currentSymbol();
                this.mergeNamedSymbols(this.currentNameKind(), node, this.parentSymbol(), pa.getName(), typeDef, tda.merge() && !tda.overload());
            }
        }
        if (nda != null)
        {
            if (MetaExtensions.isMetaScope(nda.getSymbolType()))
            {
                String propertyName = null;
                if (pa != null && !pa.hasValue())
                {
                    propertyName = pa.getName();
                }
                ModelObject parentSymbol = this.parentSymbol();
                if (parentSymbol == null)
                {
                    parentSymbol = this.getCompiler().getGlobalScope();
                    propertyName = RootScope.EntriesProperty.getName();
                }
                List<ParseTree> names = this.getNames(node);
                for (int i = 0; i < names.size(); ++i)
                {
                    ParseTree nameNode = names.get(i);
                    ModelObject nameDef = this.getData().getSymbol(nameNode);
                    ModelObject mergedNameDef;
                    mergedNameDef = this.mergeNamedSymbols(i == names.size() - 1 ? this.currentNameKind() : null, nameNode, parentSymbol, propertyName, nameDef, nda.merge() && !nda.overload());
                    parentSymbol = mergedNameDef;
                    propertyName = nda.getNestingProperty();
                }
            }
            else
            {
                if (pa != null && !pa.hasValue())
                {
                    ModelObject nameDef = this.currentSymbol();
                    this.mergeNamedSymbols(this.currentNameKind(), node, this.parentSymbol(), pa.getName(), nameDef, nda.merge() && !nda.overload());
                }
            }
        }
    }

    protected ModelObject mergeNamedSymbols(ParseTree defNode, ParseTree nameNode, ModelObject parent, String propertyName, ModelObject symbol, boolean merge)
    {
        if (parent == null) return symbol;
        if (propertyName == null) return symbol;
        if (symbol == null) return symbol;
        Object name = this.getNameProperty(nameNode, symbol);
        // TODO: if (propertyAnnotation.SymbolTypes)
        ModelProperty prop = parent.mFindProperty(propertyName);
        if (prop != null)
        {
            if (merge)
            {
                if (prop.isCollection())
                {
                    Object existingEntries = parent.mGet(prop);
                    if (existingEntries instanceof Iterable<?>)
                    {
                    	Iterable<?> collection = (Iterable<?>)existingEntries;
                        for (Object entry: collection)
                        {
                        	if (entry instanceof ModelObject) {
                                ModelObject mo = (ModelObject)entry;
                                Object existingName = this.getNameProperty(null, mo);
                                if (existingName != null && existingName.equals(name))
                                {
                                    this.replaceSymbol(nameNode, symbol, mo);
                                    this.replaceSymbol(defNode, symbol, mo);
                                    return mo;
                                }
                        	}
                        }
                    }
                }
                else
                {
                    Object existingEntry = parent.mGet(prop);
                    if (existingEntry != null)
                    {
                    	if (existingEntry instanceof ModelObject) {
                            ModelObject mo = (ModelObject)existingEntry;
	                        Object existingName = this.getNameProperty(null, mo);
	                        if (existingName != null && existingName.equals(name))
	                        {
	                            this.replaceSymbol(nameNode, symbol, mo);
	                            this.replaceSymbol(defNode, symbol, mo);
	                            return mo;
	                        }
	                        else
	                        {
	                            this.getCompiler().getDiagnostics().addError("Cannot replace existing value of the property '" + prop + "' in '" + existingEntry + "'.", this.getCompiler().getFileName(), nameNode, true);
	                            return symbol;
	                        }
                    	}
                    }
                }
            }
            parent.mAdd(prop, symbol);
        }
        return symbol;
    }
	
}