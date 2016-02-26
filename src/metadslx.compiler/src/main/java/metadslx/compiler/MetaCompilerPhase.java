package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.core.Lazy;
import metadslx.core.MetaExtensions;
import metadslx.core.ModelFactory;
import metadslx.core.ModelObject;
import metadslx.core.ModelProperty;

public class MetaCompilerPhase {
    public static final ArrayList<Class<?>> ScopeBoundaryAnnotations = new ArrayList<>();
    public static final ArrayList<Class<?>> SymbolBoundaryAnnotations = new ArrayList<>();
    public static final ArrayList<Class<?>> NameKindAnnotations = new ArrayList<>();
    public static final ArrayList<Class<?>> VisitBoundaryAnnotations = new ArrayList<>();

    static {
    	ScopeBoundaryAnnotations.add(TypeDefAnnotation.class);
    	ScopeBoundaryAnnotations.add(NameDefAnnotation.class);
    	ScopeBoundaryAnnotations.add(TypeCtrAnnotation.class);
    	ScopeBoundaryAnnotations.add(NameCtrAnnotation.class);
    	ScopeBoundaryAnnotations.add(TypeUseAnnotation.class);
    	ScopeBoundaryAnnotations.add(NameUseAnnotation.class);
    	ScopeBoundaryAnnotations.add(SymbolAnnotation.class);
    	ScopeBoundaryAnnotations.add(PreDefSymbolAnnotation.class);
    	ScopeBoundaryAnnotations.add(ScopeAnnotation.class);
    	ScopeBoundaryAnnotations.add(PropertyAnnotation.class);
    	ScopeBoundaryAnnotations.add(ExpressionAnnotation.class);

    	SymbolBoundaryAnnotations.add(TypeDefAnnotation.class);
    	SymbolBoundaryAnnotations.add(NameDefAnnotation.class);
    	SymbolBoundaryAnnotations.add(TypeCtrAnnotation.class);
    	SymbolBoundaryAnnotations.add(NameCtrAnnotation.class);
    	SymbolBoundaryAnnotations.add(ScopeAnnotation.class);
    	SymbolBoundaryAnnotations.add(SymbolAnnotation.class);
    	SymbolBoundaryAnnotations.add(PreDefSymbolAnnotation.class);

    	NameKindAnnotations.add(TypeDefAnnotation.class);
    	NameKindAnnotations.add(NameDefAnnotation.class);
    	NameKindAnnotations.add(TypeUseAnnotation.class);
    	NameKindAnnotations.add(NameUseAnnotation.class);
    	NameKindAnnotations.add(PropertyAnnotation.class);
    	NameKindAnnotations.add(ScopeAnnotation.class);
    	NameKindAnnotations.add(ExpressionAnnotation.class);

    	VisitBoundaryAnnotations.add(NameAnnotation.class);
    	VisitBoundaryAnnotations.add(QualifiedNameAnnotation.class);
    }
	
	private MetaCompiler compiler;
	private ModelFactory modelFactory;
    private ArrayList<ModelObject> symbolStack;
    private ArrayList<PropertyAnnotation> propertyStack;
    private ArrayList<Integer> scopeKindRestoreStack;
    private ArrayList<ParseTree> scopeKindStack;
    private ArrayList<Integer> nameKindRestoreStack;
    private ArrayList<ParseTree> nameKindStack;
    
	public MetaCompilerPhase(MetaCompiler compiler) {
		this.compiler = compiler;
		this.modelFactory = new ModelFactory();
		this.symbolStack = new ArrayList<>();
		this.propertyStack = new ArrayList<>();
		this.scopeKindRestoreStack = new ArrayList<>();
		this.scopeKindStack = new ArrayList<>();
		this.nameKindRestoreStack = new ArrayList<>();
		this.nameKindStack = new ArrayList<>();
	}

	protected MetaCompilerData getData() {
		return this.compiler.getData();
	}
	
	protected MetaCompiler getCompiler() {
		return compiler;
	}

	protected ModelFactory getModelFactory() {
		return modelFactory;
	}

	protected ArrayList<ModelObject> getSymbolStack() {
		return symbolStack;
	}

	protected ArrayList<PropertyAnnotation> getPropertyStack() {
		return propertyStack;
	}

	protected ArrayList<Integer> getScopeKindRestoreStack() {
		return scopeKindRestoreStack;
	}

	protected ArrayList<ParseTree> getScopeKindStack() {
		return scopeKindStack;
	}

	protected ArrayList<Integer> getNameKindRestoreStack() {
		return nameKindRestoreStack;
	}

	protected ArrayList<ParseTree> getNameKindStack() {
		return nameKindStack;
	}
	
	protected ModelObject currentSymbol() {
        if (this.symbolStack.size() > 0)
        {
            return this.symbolStack.get(this.symbolStack.size() - 1);
        }
        else
        {
            return null;
        }
	}

	protected ModelObject activeScopeSymbol() {
        int index = this.symbolStack.size() - 1;
        while (index >= 0 && (this.symbolStack.get(index) == null || !MetaExtensions.isMetaScope(this.symbolStack.get(index)))) --index;
        if (index >= 0)
        {
            return this.symbolStack.get(index);
        }
        else
        {
            return null;
        }
	}

	protected ModelObject activeSymbol() {
        int index = this.symbolStack.size() - 1;
        while (index >= 0 && this.symbolStack.get(index) == null) --index;
        if (index >= 0)
        {
            return this.symbolStack.get(index);
        }
        else
        {
            return null;
        }
	}

	protected ModelObject parentSymbol() {
        int index = this.symbolStack.size() - 1;
        while (index >= 0 && this.symbolStack.get(index) == null) --index;
        ModelObject activeSymbol = null;
        if (index >= 0)
        {
            activeSymbol = this.symbolStack.get(index);
        }
        --index;
        while (index >= 0 && (this.symbolStack.get(index) == null || this.symbolStack.get(index) == activeSymbol)) --index;
        if (index >= 0)
        {
            return this.symbolStack.get(index);
        }
        else
        {
            return null;
        }
	}

	protected PropertyAnnotation currentProperty() {
        if (this.propertyStack.size() > 0)
        {
            return this.propertyStack.get(this.propertyStack.size() - 1);
        }
        else
        {
            return null;
        }
	}

	protected PropertyAnnotation activeProperty() {
        int index = this.propertyStack.size() - 1;
        while (index >= 0 && this.propertyStack.get(index) == null) --index;
        if (index >= 0)
        {
            return this.propertyStack.get(index);
        }
        else
        {
            return null;
        }
	}

	protected ParseTree currentScopeKind() {
        if (this.scopeKindStack.size() > 0)
        {
            return this.scopeKindStack.get(this.scopeKindStack.size() - 1);
        }
        else
        {
            return null;
        }
	}

	protected int currentScopeKindRestoreCount() {
        if (this.scopeKindRestoreStack.size() > 0)
        {
            return this.scopeKindRestoreStack.get(this.scopeKindRestoreStack.size() - 1);
        }
        else
        {
            return 0;
        }
	}

	protected int currentNameKindRestoreCount() {
        if (this.nameKindRestoreStack.size() > 0)
        {
            return this.nameKindRestoreStack.get(this.nameKindRestoreStack.size() - 1);
        }
        else
        {
            return 0;
        }
	}

	protected ParseTree currentNameKind() {
        if (this.nameKindStack.size() > 0)
        {
            return this.nameKindStack.get(this.nameKindStack.size() - 1);
        }
        else
        {
            return null;
        }
	}

    protected void addSymbol(ParseTree node, ModelObject symbol)
    {
        if (symbol == null) return;
        if (this.symbolStack.size() > 0)
        {
            if (this.symbolStack.get(this.symbolStack.size() - 1) == null)
            {
                this.symbolStack.set(this.symbolStack.size() - 1, symbol);
            }
            else
            {
                this.compiler.getDiagnostics().addError("There are multiple symbols defined for this node.", this.compiler.getFileName(), node, true);
            }
        }
    }

    protected void addProperty(ParseTree node, PropertyAnnotation propertyAnnotation)
    {
        if (propertyAnnotation == null) return;
        if (this.propertyStack.size() > 0)
        {
            if (this.propertyStack.get(this.propertyStack.size() - 1) == null)
            {
                this.propertyStack.set(this.propertyStack.size() - 1, propertyAnnotation);
            }
            else
            {
                this.compiler.getDiagnostics().addError("There are multiple properties defined for this node.", this.compiler.getFileName(), node, true);
            }
        }
    }

    public void visitNode(ParseTree node) {
        try
        {
            this.symbolStack.add(null);
            this.propertyStack.add(null);
            this.scopeKindRestoreStack.add(this.scopeKindStack.size());
            this.nameKindRestoreStack.add(this.nameKindStack.size());
            try
            {
                this.handleProperties(node);
                this.handleSymbols(node);
                this.handleNameKinds(node);
                this.handleScopeKinds(node);
                this.handleNode(node);
            }
            finally
            {
                int restoreCount = 0;
                restoreCount = this.scopeKindStack.size()-this.currentScopeKindRestoreCount();
                for (int i = 0; i < restoreCount; ++i) {
                	if (this.scopeKindStack.size() > 0) {
                        this.scopeKindStack.remove(this.scopeKindStack.size()-1);
                	}
                }
                this.scopeKindRestoreStack.remove(this.scopeKindRestoreStack.size() - 1);
                restoreCount = this.nameKindStack.size()-this.currentNameKindRestoreCount();
                for (int i = 0; i < restoreCount; ++i) {
                	if (this.nameKindStack.size() > 0) {
                        this.nameKindStack.remove(this.nameKindStack.size()-1);
                	}
                }
                this.nameKindRestoreStack.remove(this.nameKindRestoreStack.size() - 1);
                this.propertyStack.remove(this.propertyStack.size() - 1);
                this.symbolStack.remove(this.symbolStack.size() - 1);
            }
        }
        catch (Exception ex)
        {
            this.compiler.getDiagnostics().addError(ex.toString(), this.compiler.getFileName(), node, true);
        }
	}
    
    protected void visitChildren(ParseTree node)
    {
        if (!this.isVisitBoundary(node))
        {
            for (int i = 0; i < node.getChildCount(); ++i)
            {
                this.visitNode(node.getChild(i));
            }
        }
    }

    protected void handleNode(ParseTree node)
    {
        this.visitChildren(node);
    }

    protected void handleProperties(ParseTree node)
    {
        List<PropertyAnnotation> pas = this.getAnnotationsFor(node, PropertyAnnotation.class).stream().filter(pa -> !MetaExtensions.isNullOrEmpty(pa.getName()) && !pa.hasValue()).collect(Collectors.toList());
        for (PropertyAnnotation pa: pas)
        {
            this.addProperty(node, pa);
        }
    }

    protected void handleSymbols(ParseTree node)
    {
        ModelObject symbol = this.compiler.getData().getSymbol(node);
        if (symbol != null)
        {
            this.addSymbol(node, symbol);
        }
    }

    protected void handleNameKinds(ParseTree node)
    {
        int counter = 0;
        for (Class<?> type: MetaCompilerPhase.NameKindAnnotations)
        {
            Object annot = this.getAnnotationFor(node, type);
            if (annot != null)
            {
                if (annot instanceof PropertyAnnotation)
                {
                    PropertyAnnotation pa = (PropertyAnnotation)annot;
                    if (MetaExtensions.isNullOrEmpty(pa.getName()))
                    {
                        ++counter;
                    }
                }
                else
                {
                    ++counter;
                }
            }
        }
        if (counter == 0) return;
        this.nameKindStack.add(node);
    }

    protected void handleScopeKinds(ParseTree node)
    {
        if (this.isScopeBoundary(node))
        {
            this.scopeKindStack.add(node);
        }
    }

    protected boolean isScopeBoundary(ParseTree node)
    {
        for (Object annot: this.getAnnotationsFor(node))
        {
            if (MetaCompilerPhase.ScopeBoundaryAnnotations.stream().anyMatch(a -> a.equals(annot.getClass())))
            {
                return true;
            }
        }
        return false;
    }

    protected boolean isSymbolBoundary(ParseTree node)
    {
        for (Object annot: this.getAnnotationsFor(node))
        {
            if (MetaCompilerPhase.SymbolBoundaryAnnotations.stream().anyMatch(a -> a.equals(annot.getClass())))
            {
                return true;
            }
        }
        return false;
    }

    protected boolean isVisitBoundary(ParseTree node)
    {
        for (Object annot: this.getAnnotationsFor(node))
        {
            if (MetaCompilerPhase.VisitBoundaryAnnotations.stream().anyMatch(a -> a.equals(annot.getClass())))
            {
                return true;
            }
        }
        return false;
    }

    protected <T> T getAnnotationFor(ParseTree tree, Class<T> annotationType)
    {
        if (tree == null) return null;
        if (annotationType == null) return null;
        List<T> annotList = this.getAnnotationsFor(tree, annotationType);
        if (annotList.size() > 0) return annotList.get(0);
        else return null;
    }

    protected List<Object> getAnnotationsFor(ParseTree tree)
    {
    	return this.getAnnotationsFor(tree, Object.class);
    }
    
    @SuppressWarnings("unchecked")
	protected <T> List<T> getAnnotationsFor(ParseTree tree, Class<T> annotationType)
    {
        if (tree == null) return new ArrayList<T>();
        if (annotationType == null) return new ArrayList<T>();
        List<Object> annotList = this.compiler.getTreeAnnotations().get(tree);
        if (annotList != null)
        {
            return (List<T>)annotList.stream().filter(a -> annotationType.isAssignableFrom(a.getClass())).collect(Collectors.toList());
        }
        return new ArrayList<T>();
    }

    protected ArrayList<ParseTree> getQualifiedNames(ParseTree tree)
    {
        ArrayList<ParseTree> result = new ArrayList<ParseTree>();
        if (tree == null) return result;
        QualifiedNameAnnotation qna = this.getAnnotationFor(tree, QualifiedNameAnnotation.class);
        NameAnnotation na = this.getAnnotationFor(tree, NameAnnotation.class);
        if (qna != null || na != null)
        {
            result.add(tree);
        }
        else
        {
            for (int i = 0; i < tree.getChildCount(); ++i)
            {
                result.addAll(this.getQualifiedNames(tree.getChild(i)));
            }
        }
        return result;
    }

    protected ArrayList<ParseTree> getNames(ParseTree tree)
    {
        ArrayList<ParseTree> result = new ArrayList<ParseTree>();
        if (tree == null) return result;
        NameAnnotation ia = this.getAnnotationFor(tree, NameAnnotation.class);
        if (ia != null)
        {
            result.add(tree);
        }
        else
        {
            for (int i = 0; i < tree.getChildCount(); ++i)
            {
                result.addAll(this.getNames(tree.getChild(i)));
            }
        }
        return result;
    }

    protected ArrayList<ParseTree> getPreDefSymbol(ParseTree tree)
    {
        ArrayList<ParseTree> result = new ArrayList<ParseTree>();
        if (tree == null) return result;
        PreDefSymbolAnnotation pdsa = this.getAnnotationFor(tree, PreDefSymbolAnnotation.class);
        if (pdsa != null)
        {
            result.add(tree);
        }
        else
        {
            for (int i = 0; i < tree.getChildCount(); ++i)
            {
                result.addAll(this.getPreDefSymbol(tree.getChild(i)));
            }
        }
        return result;
    }

    protected String getName(ParseTree node)
    {
        return this.compiler.getNameProvider().getName(node);
    }

    protected boolean setProperty(ParseTree node, ModelObject symbol, PropertyAnnotation propertyAnnotation, Object value)
    {
        if (symbol == null) return false;
        if (propertyAnnotation == null) return false;
        boolean symbolOK = false;
        if (propertyAnnotation.getSymbolTypes().size() == 0)
        {
            symbolOK = true;
        }
        else
        {
            for (Class<?> symbolType: propertyAnnotation.getSymbolTypes())
            {
                if (symbolType.isAssignableFrom(symbol.getClass()))
                {
                    symbolOK = true;
                    break;
                }
            }
        }
        if (symbolOK)
        {
            ModelObject mo = symbol;
            Optional<ModelProperty> propOpt = mo.mFindProperties(propertyAnnotation.getName()).stream().findFirst();
            if (propOpt.isPresent())
            {
            	ModelProperty prop = propOpt.get();
                if (value != null)
                {
                    if (prop.isAssignableFrom(value.getClass()))
                    {
                        if (!mo.mIsDefault(prop))
                        {
                            Object oldValue = mo.mGet(prop);
                            if (!value.equals(oldValue))
                            {
                                this.compiler.getDiagnostics().addWarning("Reassigning '" + mo + "." + prop.getName() + "'.", this.compiler.getFileName(), node, true);
                            }
                        }
                        mo.mAdd(prop, value);
                        return true;
                    }
                    else
                    {
                        this.compiler.getDiagnostics().addError("Value '" + value + "' cannot be assigned to '" + mo + "." + prop.getName() + "'.", this.compiler.getFileName(), node, true);
                    }
                }
                else if (!prop.getType().isPrimitive() && !prop.getType().isEnum())
                {
                    if (!mo.mIsDefault(prop) && mo.mGet(prop) != null)
                    {
                        this.compiler.getDiagnostics().addWarning("Reassigning '" + mo + "." + prop.getName() + "'.", this.compiler.getFileName(), node, true);
                    }
                    mo.mAdd(prop, value);
                    return true;
                }
                else
                {
                    this.compiler.getDiagnostics().addError("Value '" + value + "' cannot be assigned to '" + mo + "." + prop.getName() + "'.", this.compiler.getFileName(), node, true);
                }
            }
            else
            {
                this.compiler.getDiagnostics().addError("Property '" + propertyAnnotation.getName() + "' cannot be found in '" + mo + "'.", this.compiler.getFileName(), node, true);
            }
        }
        else
        {
            this.compiler.getDiagnostics().addError("Symbol '" + symbol + "' cannot be assigned to '" + propertyAnnotation.getSymbolTypes() + "'.", this.compiler.getFileName(), node, true);
        }
        return false;
    }

    protected boolean setLazyProperty(ParseTree node, ModelObject symbol, PropertyAnnotation propertyAnnotation, Lazy<Object> value)
    {
        if (symbol == null) return false;
        if (propertyAnnotation == null) return false;
        if (value == null) return false;
        boolean symbolOK = false;
        if (propertyAnnotation.getSymbolTypes().size() == 0)
        {
            symbolOK = true;
        }
        else
        {
            for (Class<?> symbolType: propertyAnnotation.getSymbolTypes())
            {
                if (symbolType.isAssignableFrom(symbol.getClass()))
                {
                    symbolOK = true;
                    break;
                }
            }
        }
        if (symbolOK)
        {
            ModelObject mo = symbol;
            ModelProperty prop = mo.mFindProperty(propertyAnnotation.getName());
            if (prop != null)
            {
                mo.mLazyAdd(prop, value);
                return true;
            }
        }
        return false;
    }

    protected boolean setNameProperty(ParseTree node, ModelObject symbol, Object value)
    {
        if (symbol == null) return false;
        boolean success = false;
        for (ModelProperty prop: symbol.mGetProperties())
        {
            if (MetaExtensions.isMetaName(prop))
            {
                symbol.mAdd(prop, value);
                success = true;
            }
        }
        if (!success)
        {
            this.compiler.getDiagnostics().addError("Could not find property with @Name annotation in '" + symbol + "'.", this.compiler.getFileName(), node, true);
        }
        return success;
    }

    protected Object getNameProperty(ParseTree node, ModelObject symbol)
    {
        if (symbol == null) return false;
        int counter = 0;
        Object result = null;
        for (ModelProperty prop: symbol.mGetProperties())
        {
            if (MetaExtensions.isMetaName(prop))
            {
                Object value = symbol.mGet(prop);
                if (result == null && value != result)
                {
                    result = value;
                    ++counter;
                }
            }
        }
        if (counter == 0)
        {
            this.compiler.getDiagnostics().addError("Could not find property with @Name annotation in '" + symbol + "'.", this.compiler.getFileName(), node, true);
        }
        else if (counter > 1)
        {
            this.compiler.getDiagnostics().addError("There are multiple properties with @Name annotation having different values in '" + symbol + "'.", this.compiler.getFileName(), node, true);
        }
        return result;
    }

    protected boolean isNameProperty(ModelObject symbol, PropertyAnnotation propertyAnnotation)
    {
        if (symbol == null) return false;
        if (propertyAnnotation == null) return false;
        ModelProperty prop = symbol.mFindProperty(propertyAnnotation.getName());
        if (prop == null) return false;
        return MetaExtensions.isMetaName(prop);
    }

}
