package metadslx.compiler;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.core.MetaExtensions;
import metadslx.core.MetaScopeEntryProperties;
import metadslx.core.ModelList;
import metadslx.core.ModelObject;

public class MetaCompilerDefinitionPhase extends MetaCompilerPhase {
    public MetaCompilerDefinitionPhase(MetaCompiler compiler)
    {
        super(compiler);
    }
    
    protected void handleNode(ParseTree node)
    {
        this.handleNames(node);
        super.handleNode(node);
    }

    protected void handleSymbols(ParseTree node)
    {
        int counter = 0;
        for (Object annot: this.getAnnotationsFor(node))
        {
            if (MetaCompilerPhase.SymbolBoundaryAnnotations.contains(annot.getClass()))
            {
                ++counter;
            }
        }
        if (counter == 0) return;
        if (counter > 1)
        {
            this.getCompiler().getDiagnostics().addError("A node can have at most one of the following annotations: @TypeDef, @NameDef, @TypeCtr, @NameCtr, @Scope, @Symbol, @PreDefSymbol.", this.getCompiler().getFileName(), node, true);
        }
        TypeCtrAnnotation tca = this.getAnnotationFor(node, TypeCtrAnnotation.class);
        if (tca != null)
        {
            this.createSymbol(node, tca.getSymbolType());
        }
        NameCtrAnnotation nca = this.getAnnotationFor(node, NameCtrAnnotation.class);
        if (nca != null)
        {
            this.createSymbol(node, nca.getSymbolType());
        }
        ScopeAnnotation sa = this.getAnnotationFor(node, ScopeAnnotation.class);
        if (sa != null)
        {
            this.createSymbol(node, sa.getSymbolType());
        }
        SymbolAnnotation sya = this.getAnnotationFor(node, SymbolAnnotation.class);
        if (sya != null)
        {
            this.createSymbol(node, sya.getSymbolType());
        }
        PreDefSymbolAnnotation pdsa = this.getAnnotationFor(node, PreDefSymbolAnnotation.class);
        if (pdsa != null && pdsa.hasValue())
        {
            if (pdsa.hasName())
            {
                String name = this.getCompiler().getNameProvider().getName(node);
                if (MetaExtensions.sameString(pdsa.getName(), name))
                {
                    if (pdsa.getValue() instanceof ModelObject)
                    {
                        this.registerSymbol(node, (ModelObject)pdsa.getValue());
                    }
                    else
                    {
                        this.getCompiler().getDiagnostics().addError("The predefined symbol must be a ModelObject.", this.getCompiler().getFileName(), node, true);
                    }
                }
            }
            else
            {
                if (pdsa.getValue() instanceof ModelObject)
                {
                    this.registerSymbol(node, (ModelObject)pdsa.getValue());
                }
                else
                {
                    this.getCompiler().getDiagnostics().addError("The predefined symbol must be a ModelObject.", this.getCompiler().getFileName(), node, true);
                }
            }
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
        if (counter > 1)
        {
            this.getCompiler().getDiagnostics().addError("A node can have at most one of the following annotations: @TypeDef, @NameDef, @TypeUse, @NameUse, @Scope, @Expression and unnaped @Property.", this.getCompiler().getFileName(), node, true);
        }
        TypeDefAnnotation tda = this.getAnnotationFor(node, TypeDefAnnotation.class);
        NameDefAnnotation nda = this.getAnnotationFor(node, NameDefAnnotation.class);
        if (tda != null)
        {
            if (tda.getSymbolType() == null)
            {
                this.getCompiler().getDiagnostics().addError("The symbol type cannot be determined for the type definition.", this.getCompiler().getFileName(), node, true);
            }
        }
        if (nda != null)
        {
            if (nda.getSymbolType() == null)
            {
                this.getCompiler().getDiagnostics().addError("The symbol type cannot be determined for the name definition.", this.getCompiler().getFileName(), node, true);
            }
        }
        this.getNameKindStack().add(node);
    }

    protected void handleNames(ParseTree node)
    {
        if (this.currentNameKind() != this.currentScopeKind()) return;
        NameAnnotation na = this.getAnnotationFor(node, NameAnnotation.class);
        QualifiedNameAnnotation qna = this.getAnnotationFor(node, QualifiedNameAnnotation.class);
        if (na == null && qna == null) return;
        TypeDefAnnotation tda = this.getAnnotationFor(this.currentNameKind(), TypeDefAnnotation.class);
        NameDefAnnotation nda = this.getAnnotationFor(this.currentNameKind(), NameDefAnnotation.class);
        TypeUseAnnotation tua = this.getAnnotationFor(this.currentNameKind(), TypeUseAnnotation.class);
        NameUseAnnotation nua = this.getAnnotationFor(this.currentNameKind(), NameUseAnnotation.class);
        PropertyAnnotation pa = this.getAnnotationFor(this.currentNameKind(), PropertyAnnotation.class);
        if (tda != null)
        {
            if (qna != null)
            {
                this.getCompiler().getDiagnostics().addError("The type name cannot be a @QualifiedName.", this.getCompiler().getFileName(), node, true);
            }
            String name = this.getName(node);
            if (name != null)
            {
                ModelObject typeDef = this.typeDef(name, tda, this.currentNameKind(), node, true);
                if (typeDef != null)
                {
                    if (!this.isNameProperty(typeDef, this.activeProperty()) || !this.setProperty(node, typeDef, this.activeProperty(), name))
                    {
                        this.setNameProperty(node, typeDef, name);
                    }
                }
            }
            else
            {
                this.getCompiler().getDiagnostics().addError("Could not get a name from the node.", this.getCompiler().getFileName(), node, true);
            }
        }
        if (nda != null)
        {
            if (MetaExtensions.isMetaScope(nda.getSymbolType()))
            {
                List<ParseTree> names = this.getNames(node);
                for (int i = 0; i < names.size(); ++i)
                {
                    String currentName = this.getName(names.get(i));
                    if (currentName != null)
                    {
                        ModelObject nameDef = this.nameDef(currentName, nda, this.currentNameKind(), names.get(i), i == names.size() - 1);
                        if (nameDef != null)
                        {
                            if (!this.isNameProperty(nameDef, this.activeProperty()) || !this.setProperty(node, nameDef, this.activeProperty(), currentName))
                            {
                                this.setNameProperty(node, nameDef, currentName);
                            }
                        }
                    }
                    else
                    {
                        this.getCompiler().getDiagnostics().addError("Could not get a name from the node.", this.getCompiler().getFileName(), node, true);
                        break;
                    }
                }
            }
            else
            {
                if (qna != null)
                {
                    this.getCompiler().getDiagnostics().addError("A qualified name must define a scope.", this.getCompiler().getFileName(), node, true);
                }
                String name = this.getName(node);
                if (name != null)
                {
                    ModelObject nameDef = this.nameDef(name, nda, this.currentNameKind(), node, true);
                    if (nameDef != null)
                    {
                        if (!this.isNameProperty(nameDef, this.activeProperty()) || !this.setProperty(node, nameDef, this.activeProperty(), name))
                        {
                            this.setNameProperty(node, nameDef, name);
                        }
                    }
                }
            }
        }
        if (pa != null && MetaExtensions.isNullOrEmpty(pa.getName()))
        {
            if (qna != null)
            {
                this.getCompiler().getDiagnostics().addError("A @Property cannot have a qualified name.", this.getCompiler().getFileName(), node, true);
            }
            String name = this.getName(node);
            if (name != null)
            {
                pa.setName(name);
            }
        }
    }

    protected ModelObject typeDef(String name, TypeDefAnnotation typeDefAnnotation, ParseTree typeDefNode, ParseTree nameNode, boolean registerSymbol)
    {
        ModelObject typeDef = this.createSymbol(nameNode, typeDefAnnotation.getSymbolType());
        typeDef.mSet(MetaScopeEntryProperties.CanMergeProperty, typeDefAnnotation.merge() && !typeDefAnnotation.overload());
        if (registerSymbol)
        {
            this.registerSymbol(typeDefNode, typeDef);
        }
        return typeDef;
    }

    protected ModelObject nameDef(String name, NameDefAnnotation nameDefAnnotation, ParseTree nameDefNode, ParseTree nameNode, boolean registerSymbol)
    {
        ModelObject nameDef = this.createSymbol(nameNode, nameDefAnnotation.getSymbolType());
        nameDef.mSet(MetaScopeEntryProperties.CanMergeProperty, nameDefAnnotation.merge() && !nameDefAnnotation.overload());
        if (registerSymbol)
        {
            this.registerSymbol(nameDefNode, nameDef);
        }
        return nameDef;
    }

    protected ModelObject createSymbol(ParseTree node, Class symbolType)
    {
        if (symbolType == null) return null;
        ModelObject symbol = (ModelObject)this.getModelFactory().create(symbolType);
        if (symbol != null)
        {
            symbol.mSet(MetaScopeEntryProperties.NameTreeNodesProperty, new ModelList<Object>(symbol, MetaScopeEntryProperties.NameTreeNodesProperty));
            symbol.mSet(MetaScopeEntryProperties.SymbolTreeNodesProperty, new ModelList<Object>(symbol, MetaScopeEntryProperties.SymbolTreeNodesProperty));
            this.registerSymbol(node, symbol);
            return symbol;
        }
        else
        {
            this.getCompiler().getDiagnostics().addError("Could not create symbol: " + symbolType, this.getCompiler().getFileName(), node, true);
        }
        return null;
    }

    protected void registerSymbol(ParseTree node, ModelObject symbol)
    {
        if (symbol == null) return;
        this.getCompiler().getData().registerSymbol(node, symbol);
        NameAnnotation na = this.getAnnotationFor(node, NameAnnotation.class);
        QualifiedNameAnnotation qna = this.getAnnotationFor(node, QualifiedNameAnnotation.class);
        if (na == null && qna == null)
        {
            symbol.mAdd(MetaScopeEntryProperties.SymbolTreeNodesProperty, node);
        }
        else
        {
            symbol.mAdd(MetaScopeEntryProperties.NameTreeNodesProperty, node);
        }
    }

}
