package metadslx.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.core.BindingInfo;
import metadslx.core.Lazy;
import metadslx.core.MetaExtensions;
import metadslx.core.ModelObject;
import metadslx.core.ModelProperty;
import metadslx.core.ResolutionInfo;
import metadslx.core.ResolveKind;

public class MetaCompilerReferencePhase extends MetaCompilerPhase {
	public MetaCompilerReferencePhase(MetaCompiler compiler) {
		super(compiler);
	}

	@Override
    protected void handleNode(ParseTree node)
    {
        this.handleNames(node);
        this.handlePropertyValues(node);
        this.handleTrivia(node);
        super.handleNode(node);
    }

    protected void handleNames(ParseTree node)
    {
        if (this.currentNameKind() != this.currentScopeKind()) return;
        NameAnnotation na = this.getAnnotationFor(node, NameAnnotation.class);
        QualifiedNameAnnotation qna = this.getAnnotationFor(node, QualifiedNameAnnotation.class);
        if (na == null && qna == null) return;
        TypeUseAnnotation tua = this.getAnnotationFor(this.currentNameKind(), TypeUseAnnotation.class);
        NameUseAnnotation nua = this.getAnnotationFor(this.currentNameKind(), NameUseAnnotation.class);
        ModelObject symbol = this.currentSymbol();
        if (symbol != null)
        {
            if (tua != null || nua != null)
            {
                ModelObject parentSymbol = this.parentSymbol();
                PropertyAnnotation activeProperty = this.activeProperty();
                this.setProperty(node, parentSymbol, activeProperty, symbol);
            }
        }
        else
        {
            if (tua != null)
            {
                List<ParseTree> names = this.getNames(node);
                List<String> nameStrings = names.stream().map(n -> this.getName(n)).collect(Collectors.toList());
                ModelObject activeScopeSymbol = this.activeScopeSymbol();
                ModelObject activeSymbol = this.activeSymbol();
                PropertyAnnotation activeProperty = this.activeProperty();
                ResolutionInfo ri = new ResolutionInfo();
                ri.setNode(node);
                BindingInfo bi = new BindingInfo();
                bi.setNode(node);
                ArrayList<ModelObject> scopeList = new ArrayList<>();
                scopeList.add(activeScopeSymbol);
                Lazy<Object> lazySymbol = Lazy.create(
                    () ->
                        this.getCompiler().getBindingProvider().bind(null,
                        this.filterByTypes(
                            this.getCompiler().getResolutionProvider().resolve(scopeList, ResolveKind.Type, nameStrings, ri, tua.getResolveFlags()),
                            tua.getSymbolTypes()),
                        bi)
                    );
                this.setLazyProperty(node, activeSymbol, activeProperty, lazySymbol);
                this.getData().registerLazySymbol(node, lazySymbol);
            }
            if (nua != null)
            {
                List<ParseTree> names = this.getNames(node);
                List<String> nameStrings = names.stream().map(n -> this.getName(n)).collect(Collectors.toList());
                ModelObject activeScopeSymbol = this.activeScopeSymbol();
                ModelObject activeSymbol = this.activeSymbol();
                PropertyAnnotation activeProperty = this.activeProperty();
                ResolutionInfo ri = new ResolutionInfo();
                ri.setNode(node);
                BindingInfo bi = new BindingInfo();
                bi.setNode(node);
                ArrayList<ModelObject> scopeList = new ArrayList<>();
                scopeList.add(activeScopeSymbol);
                Lazy<Object> lazySymbol = Lazy.create(
                    () ->
                        this.getCompiler().getBindingProvider().bind(null,
                        this.filterByTypes(
                            this.getCompiler().getResolutionProvider().resolve(scopeList, ResolveKind.Name, nameStrings, ri, nua.getResolveFlags()),
                            nua.getSymbolTypes()),
                        bi)
                    );
                this.setLazyProperty(node, activeSymbol, activeProperty, lazySymbol);
                this.getData().registerLazySymbol(node, lazySymbol);
            }
        }
    }

    private Iterable<ModelObject> filterByTypes(Iterable<ModelObject> mobjs, List<Class<?>> types)
    {
        if (types.size() == 0) return mobjs;
        ArrayList<ModelObject> result = new ArrayList<ModelObject>();
        for (ModelObject mobj: mobjs)
        {
            boolean valid = false;
            for (Class<?> type: types)
            {
                if (type.isAssignableFrom(mobj.getClass()))
                {
                    valid = true;
                    break;
                }
            }
            if (valid)
            {
                result.add(mobj);
            }
        }
        return result;
    }

    protected void handlePropertyValues(ParseTree node)
    {
        TypeUseAnnotation tua = this.getAnnotationFor(node, TypeUseAnnotation.class);
        NameUseAnnotation nua = this.getAnnotationFor(node, NameUseAnnotation.class);
        TypeDefAnnotation tda = this.getAnnotationFor(node, TypeDefAnnotation.class);
        NameDefAnnotation nda = this.getAnnotationFor(node, NameDefAnnotation.class);
        NameAnnotation na = this.getAnnotationFor(node, NameAnnotation.class);
        QualifiedNameAnnotation qna = this.getAnnotationFor(node, QualifiedNameAnnotation.class);
        if (tda != null || nda != null || tua != null || nua != null) return;
        if ((na != null || qna != null) && this.currentSymbol() != null) return;
        TypeCtrAnnotation tca = this.getAnnotationFor(node, TypeCtrAnnotation.class);
        NameCtrAnnotation nca = this.getAnnotationFor(node, NameCtrAnnotation.class);
        if (tca != null || nca != null)
        {
            ModelObject symbol = this.currentSymbol();
            if (symbol != null)
            {
                ModelObject parent = this.parentSymbol();
                if (parent != null)
                {
                    symbol.mSetParent(parent);
                }
                else
                {
                    symbol.mSetParent(this.getCompiler().getGlobalScope());
                }
            }
        }
        List<PropertyAnnotation> pas = this.getAnnotationsFor(node, PropertyAnnotation.class).stream().filter(p -> p.hasValue()).collect(Collectors.toList());
        if (pas.size() > 0)
        {
            for (PropertyAnnotation pa: pas)
            {
                this.setProperty(node, this.activeSymbol(), pa, pa.getValue());
            }
        }
        else
        {
            PropertyAnnotation pa = this.currentProperty();
            if (pa != null)
            {
                if (pa.hasValue())
                {
                    this.setProperty(node, this.activeSymbol(), pa, pa.getValue());
                    pa = null;
                }
            }
            else
            {
                pa = this.activeProperty();
                if (pa != null && pa.hasValue())
                {
                    pa = null;
                }
            }
            if (pa != null)
            {
                EnumValueAnnotation eva = this.getAnnotationFor(node, EnumValueAnnotation.class);
                ValueAnnotation va = this.getAnnotationFor(node, ValueAnnotation.class);
                if (va != null)
                {
                    if (va.hasName())
                    {
                        String name = this.getCompiler().getNameProvider().getName(node);
                        if (MetaExtensions.sameString(va.getName(), name))
                        {
                            if (va.hasValue())
                            {
                                this.setProperty(node, this.activeSymbol(), pa, va.getValue());
                            }
                            else
                            {
                                Object value = this.getCompiler().getNameProvider().getValue(node, va.getType());
                                this.setProperty(node, this.activeSymbol(), pa, value);
                            }
                        }
                    }
                    else
                    {
                        if (va.hasValue())
                        {
                            this.setProperty(node, this.activeSymbol(), pa, va.getValue());
                        }
                        else
                        {
                            Object value = this.getCompiler().getNameProvider().getValue(node, va.getType());
                            this.setProperty(node, this.activeSymbol(), pa, value);
                        }
                    }
                }
                else if (eva != null)
                {
                    String name = this.getCompiler().getNameProvider().getName(node);
                    Object value = null;
                    if (name != null)
                    {
                        StringBuilder sb = new StringBuilder();
                        Object[] enumConstants = eva.getEnumType().getEnumConstants();
                        if (enumConstants != null) {
                            for (Object enumValue: enumConstants)
                            {
                                String enumName = enumValue.toString();
                                if (sb.length() > 0) sb.append(", ");
                                sb.append("'");
                                switch (eva.getCase())
                                {
                                    case Exact:
                                        if (MetaExtensions.sameString(name, enumName)) value = enumValue;
                                        sb.append(enumName);
                                        break;
                                    case Ignore:
                                        if (enumName.equalsIgnoreCase(name)) value = enumValue;
                                        sb.append(enumName);
                                        break;
                                    case Upper:
                                        String upperName = enumName.toUpperCase();
                                        if (name == upperName) value = enumValue;
                                        sb.append(upperName);
                                        break;
                                    case Lower:
                                        String lowerName = enumName.toLowerCase();
                                        if (name == lowerName) value = enumValue;
                                        sb.append(lowerName);
                                        break;
                                    case Pascal:
                                        String pascalName = enumName.substring(0, 1).toUpperCase() + enumName.substring(1);
                                        if (name == pascalName) value = enumValue;
                                        sb.append(pascalName);
                                        break;
                                    case Camel:
                                        String camelName = enumName.substring(0, 1).toLowerCase() + enumName.substring(1);
                                        if (name == camelName) value = enumValue;
                                        sb.append(camelName);
                                        break;
                                    default:
                                        break;
                                }
                                sb.append("'");
                                if (value != null)
                                {
                                    break;
                                }
                            }
                            if (value != null)
                            {
                                this.setProperty(node, this.activeSymbol(), pa, value);
                            }
                            else
                            {
                                this.getCompiler().getDiagnostics().addError("Invalid name '" + name + "'. Valid names are: " + sb.toString(), this.getCompiler().getFileName(), node, false);
                            }
                        } else {
                            this.getCompiler().getDiagnostics().addError("'" + eva.getEnumType() + "' is not an enum type.", this.getCompiler().getFileName(), node, false);
                        }
                    }
                }
                else
                {
                    ModelObject symbol = this.currentSymbol();
                    if (symbol != null)
                    {
                        this.setProperty(node, this.parentSymbol(), pa, symbol);
                    }
                }
            }
        }
    }

    protected void handleTrivia(ParseTree node)
    {
        ModelObject symbol = this.currentSymbol();
        if (symbol != null)
        {
            boolean retrievedTrivia = false;
            String leadingTrivia = null;
            String trailingTrivia = null;
            Iterable<TriviaAnnotation> tas = this.getAnnotationsFor(node, TriviaAnnotation.class);
            for (TriviaAnnotation ta: tas)
            {
                if (ta.getProperty() != null)
                {
                    boolean symbolOK = false;
                    if (ta.getSymbolTypes().size() == 0)
                    {
                        symbolOK = true;
                    }
                    else
                    {
                        for (Class<?> symbolType: ta.getSymbolTypes())
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
                        ModelProperty prop = symbol.mFindProperty(ta.getProperty());
                        if (prop != null)
                        {

                            if (!retrievedTrivia)
                            {
                                leadingTrivia = this.getCompiler().getTriviaProvider().getLeadingTrivia(symbol);
                                trailingTrivia = this.getCompiler().getTriviaProvider().getTrailingTrivia(symbol);
                                retrievedTrivia = true;
                            }
                            String trivia = null;
                            switch (ta.getPosition())
                            {
                                case Any:
                                    trivia = leadingTrivia;
                                    if (trivia == null)
                                    {
                                        trivia = trailingTrivia;
                                    }
                                    break;
                                case Leading:
                                    trivia = leadingTrivia;
                                    break;
                                case Trailing:
                                    trivia = trailingTrivia;
                                    break;
                                default:
                                    break;
                            }
                            if (!MetaExtensions.isNullOrWhiteSpace(trivia))
                            {
                                symbol.mAdd(prop, trivia);
                            }
                        }
                    }
                }
            }
        }
    }

}