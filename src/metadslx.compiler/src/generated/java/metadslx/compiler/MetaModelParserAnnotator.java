package metadslx.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.IModelCompiler;
import metadslx.core.ModelCompilerContext;
import metadslx.compiler.*;


import metadslx.core.*;

@SuppressWarnings("unused")
public class MetaModelParserAnnotator extends MetaModelParserBaseVisitor<Object>
{
    private MetaModelLexerAnnotator lexerAnnotator = new MetaModelLexerAnnotator();
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Class<?>, List<Object>> ruleAnnotations = new HashMap<>();
    private Map<Object, List<Object>> treeAnnotations = new HashMap<>();
    
    public List<Object> getParserAnnotations() { return this.grammarAnnotations; }
    public List<Object> getLexerAnnotations() { return this.lexerAnnotator.getLexerAnnotations(); }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.lexerAnnotator.getTokenAnnotations(); }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.lexerAnnotator.getModeAnnotations(); }
    public Map<Class<?>, List<Object>> getRuleAnnotations() { return this.ruleAnnotations; }
    public Map<Object, List<Object>> getTreeAnnotations() { return this.treeAnnotations; }
    
    
    public MetaModelParserAnnotator()
    {
        List<Object> annotList = null;
    }
    
    public Object visitTerminal(TerminalNode node)
    {
        this.lexerAnnotator.visitTerminal(node, treeAnnotations);
        this.handleSymbolType(node);
        return null;
    }
    
    private void handleSymbolType(ParseTree node)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(node);
        if (treeAnnotList != null)
        {
            for (Object treeAnnot: treeAnnotList)
            {
                if (treeAnnot instanceof SymbolTypeAnnotation)
                {
                    SymbolTypeAnnotation sta = (SymbolTypeAnnotation)treeAnnot;
                    if (sta.hasName())
                    {
                        ModelCompilerContext.requireContext();
                        IModelCompiler compiler = ModelCompilerContext.current();
                        String name = compiler.getNameProvider().getName(node);
                        if (sta.getName() == name)
                        {
                            this.overrideSymbolType(node, sta.getSymbolType());
                        }
                    }
                    else
                    {
                        this.overrideSymbolType(node, sta.getSymbolType());
                    }
                }
            }
            treeAnnotList.removeIf(a -> a instanceof SymbolTypeAnnotation);
        }
    }
    
    private void overrideSymbolType(ParseTree node, Class<?> symbolType)
    {
        if (node == null) return;
        if (symbolType == null) return;
        boolean set = false;
        while(!set && node != null)
        {
            List<Object> treeAnnotList = this.treeAnnotations.get(node);
            if (treeAnnotList != null)
            {
                for (Object treeAnnot: treeAnnotList)
                {
                    if (treeAnnot instanceof SymbolBasedAnnotation)
                    {
                        SymbolBasedAnnotation sta = (SymbolBasedAnnotation)treeAnnot;
                        set = true;
                        if (sta.getSymbolType() == null)
                        {
                            sta.setSymbolType(symbolType);
                        }
                        else if (sta.overrideSymbolType())
                        {
                            sta.setSymbolType(symbolType);
                        }
                        else
                        {
                            throw new IllegalStateException("Cannot change symbol type from '"+sta.getSymbolType()+"' to '"+symbolType+"'");
                        }
                    }
                }
            }
            node = node.getParent();
        }
    }
    
    @Override
    public Object visitMain(MetaModelParser.MainContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMain(ctx);
    }
    
    @Override
    public Object visitQualifiedName(MetaModelParser.QualifiedNameContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        QualifiedNameAnnotation __tmp1 = new QualifiedNameAnnotation();
        treeAnnotList.add(__tmp1);
        this.handleSymbolType(ctx);
        return super.visitQualifiedName(ctx);
    }
    
    @Override
    public Object visitIdentifierList(MetaModelParser.IdentifierListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifierList(ctx);
    }
    
    @Override
    public Object visitQualifiedNameList(MetaModelParser.QualifiedNameListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitQualifiedNameList(ctx);
    }
    
    @Override
    public Object visitAnnotation(MetaModelParser.AnnotationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp2 = new PropertyAnnotation();
        __tmp2.setName("Annotations");
        treeAnnotList.add(__tmp2);
        SymbolAnnotation __tmp3 = new SymbolAnnotation();
        __tmp3.setSymbolType(MetaAnnotation.class);
        treeAnnotList.add(__tmp3);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp4 = new PropertyAnnotation();
            __tmp4.setName("Name");
            elemAnnotList.add(__tmp4);
            ValueAnnotation __tmp5 = new ValueAnnotation();
            elemAnnotList.add(__tmp5);
        }
        this.handleSymbolType(ctx);
        return super.visitAnnotation(ctx);
    }
    
    @Override
    public Object visitAnnotationParams(MetaModelParser.AnnotationParamsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationParams(ctx);
    }
    
    @Override
    public Object visitAnnotationParamList(MetaModelParser.AnnotationParamListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationParamList(ctx);
    }
    
    @Override
    public Object visitAnnotationParam(MetaModelParser.AnnotationParamContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp6 = new PropertyAnnotation();
        __tmp6.setName("Properties");
        treeAnnotList.add(__tmp6);
        SymbolAnnotation __tmp7 = new SymbolAnnotation();
        __tmp7.setSymbolType(MetaAnnotationProperty.class);
        treeAnnotList.add(__tmp7);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp8 = new PropertyAnnotation();
            __tmp8.setName("Name");
            elemAnnotList.add(__tmp8);
            ValueAnnotation __tmp9 = new ValueAnnotation();
            elemAnnotList.add(__tmp9);
        }
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp10 = new PropertyAnnotation();
            __tmp10.setName("Value");
            elemAnnotList.add(__tmp10);
        }
        this.handleSymbolType(ctx);
        return super.visitAnnotationParam(ctx);
    }
    
    @Override
    public Object visitNamespaceDeclaration(MetaModelParser.NamespaceDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp11 = new NameDefAnnotation();
        __tmp11.setSymbolType(MetaNamespace.class);
        __tmp11.setNestingProperty("Namespaces");
        __tmp11.setMerge(true);
        treeAnnotList.add(__tmp11);
        TriviaAnnotation __tmp12 = new TriviaAnnotation();
        __tmp12.setProperty("Documentation");
        treeAnnotList.add(__tmp12);
        this.handleSymbolType(ctx);
        return super.visitNamespaceDeclaration(ctx);
    }
    
    @Override
    public Object visitMetamodelDeclaration(MetaModelParser.MetamodelDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp13 = new PropertyAnnotation();
        __tmp13.setName("MetaModel");
        treeAnnotList.add(__tmp13);
        NameDefAnnotation __tmp14 = new NameDefAnnotation();
        __tmp14.setSymbolType(MetaModel.class);
        treeAnnotList.add(__tmp14);
        TriviaAnnotation __tmp15 = new TriviaAnnotation();
        __tmp15.setProperty("Documentation");
        treeAnnotList.add(__tmp15);
        this.handleSymbolType(ctx);
        return super.visitMetamodelDeclaration(ctx);
    }
    
    @Override
    public Object visitMetamodelPropertyList(MetaModelParser.MetamodelPropertyListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitMetamodelPropertyList(ctx);
    }
    
    @Override
    public Object visitMetamodelProperty(MetaModelParser.MetamodelPropertyContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp16 = new PropertyAnnotation();
        treeAnnotList.add(__tmp16);
        List<Object> elemAnnotList = null;
        if (ctx.stringLiteral() != null)
        {
            Object elem = ctx.stringLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp17 = new ValueAnnotation();
            elemAnnotList.add(__tmp17);
        }
        this.handleSymbolType(ctx);
        return super.visitMetamodelProperty(ctx);
    }
    
    @Override
    public Object visitDeclaration(MetaModelParser.DeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDeclaration(ctx);
    }
    
    @Override
    public Object visitEnumDeclaration(MetaModelParser.EnumDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp18 = new PropertyAnnotation();
        __tmp18.setName("Declarations");
        treeAnnotList.add(__tmp18);
        TypeDefAnnotation __tmp19 = new TypeDefAnnotation();
        __tmp19.setSymbolType(MetaEnum.class);
        treeAnnotList.add(__tmp19);
        TriviaAnnotation __tmp20 = new TriviaAnnotation();
        __tmp20.setProperty("Documentation");
        treeAnnotList.add(__tmp20);
        List<Object> elemAnnotList = null;
        if (ctx.enumValues() != null)
        {
            Object elem = ctx.enumValues();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp21 = new PropertyAnnotation();
            __tmp21.setName("EnumLiterals");
            elemAnnotList.add(__tmp21);
        }
        this.handleSymbolType(ctx);
        return super.visitEnumDeclaration(ctx);
    }
    
    @Override
    public Object visitEnumValues(MetaModelParser.EnumValuesContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEnumValues(ctx);
    }
    
    @Override
    public Object visitEnumValue(MetaModelParser.EnumValueContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp22 = new NameDefAnnotation();
        __tmp22.setSymbolType(MetaEnumLiteral.class);
        treeAnnotList.add(__tmp22);
        TriviaAnnotation __tmp23 = new TriviaAnnotation();
        __tmp23.setProperty("Documentation");
        treeAnnotList.add(__tmp23);
        this.handleSymbolType(ctx);
        return super.visitEnumValue(ctx);
    }
    
    @Override
    public Object visitEnumMemberDeclaration(MetaModelParser.EnumMemberDeclarationContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.operationDeclaration() != null)
        {
            Object elem = ctx.operationDeclaration();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp24 = new PropertyAnnotation();
            __tmp24.setName("Operations");
            elemAnnotList.add(__tmp24);
        }
        this.handleSymbolType(ctx);
        return super.visitEnumMemberDeclaration(ctx);
    }
    
    @Override
    public Object visitClassDeclaration(MetaModelParser.ClassDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp25 = new PropertyAnnotation();
        __tmp25.setName("Declarations");
        treeAnnotList.add(__tmp25);
        TypeDefAnnotation __tmp26 = new TypeDefAnnotation();
        __tmp26.setSymbolType(MetaClass.class);
        treeAnnotList.add(__tmp26);
        TriviaAnnotation __tmp27 = new TriviaAnnotation();
        __tmp27.setProperty("Documentation");
        treeAnnotList.add(__tmp27);
        List<Object> elemAnnotList = null;
        if (ctx.KAbstract() != null)
        {
            Object elem = ctx.KAbstract();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp28 = new PropertyAnnotation();
            __tmp28.setName("IsAbstract");
            __tmp28.setValue(true);
            elemAnnotList.add(__tmp28);
        }
        if (ctx.classAncestors() != null)
        {
            Object elem = ctx.classAncestors();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp29 = new PropertyAnnotation();
            __tmp29.setName("SuperClasses");
            elemAnnotList.add(__tmp29);
        }
        this.handleSymbolType(ctx);
        return super.visitClassDeclaration(ctx);
    }
    
    @Override
    public Object visitClassAncestors(MetaModelParser.ClassAncestorsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitClassAncestors(ctx);
    }
    
    @Override
    public Object visitClassAncestor(MetaModelParser.ClassAncestorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            TypeUseAnnotation __tmp30 = new TypeUseAnnotation();
            __tmp30.getSymbolTypes().add(MetaClass.class);
            __tmp30.setResolveFlags(ResolveFlags.Parent);
            elemAnnotList.add(__tmp30);
        }
        this.handleSymbolType(ctx);
        return super.visitClassAncestor(ctx);
    }
    
    @Override
    public Object visitClassMemberDeclaration(MetaModelParser.ClassMemberDeclarationContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.fieldDeclaration() != null)
        {
            Object elem = ctx.fieldDeclaration();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp31 = new PropertyAnnotation();
            __tmp31.setName("Properties");
            elemAnnotList.add(__tmp31);
        }
        if (ctx.operationDeclaration() != null)
        {
            Object elem = ctx.operationDeclaration();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp32 = new PropertyAnnotation();
            __tmp32.setName("Operations");
            elemAnnotList.add(__tmp32);
        }
        if (ctx.constructorDeclaration() != null)
        {
            Object elem = ctx.constructorDeclaration();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp33 = new PropertyAnnotation();
            __tmp33.setName("Constructor");
            elemAnnotList.add(__tmp33);
        }
        this.handleSymbolType(ctx);
        return super.visitClassMemberDeclaration(ctx);
    }
    
    @Override
    public Object visitFieldDeclaration(MetaModelParser.FieldDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp34 = new NameDefAnnotation();
        __tmp34.setSymbolType(MetaProperty.class);
        treeAnnotList.add(__tmp34);
        TriviaAnnotation __tmp35 = new TriviaAnnotation();
        __tmp35.setProperty("Documentation");
        treeAnnotList.add(__tmp35);
        List<Object> elemAnnotList = null;
        if (ctx.fieldModifier() != null)
        {
            Object elem = ctx.fieldModifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp36 = new PropertyAnnotation();
            __tmp36.setName("Kind");
            elemAnnotList.add(__tmp36);
        }
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp37 = new PropertyAnnotation();
            __tmp37.setName("Type");
            elemAnnotList.add(__tmp37);
        }
        this.handleSymbolType(ctx);
        return super.visitFieldDeclaration(ctx);
    }
    
    @Override
    public Object visitFieldModifier(MetaModelParser.FieldModifierContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.KContainment() != null)
        {
            Object elem = ctx.KContainment();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp38 = new ValueAnnotation();
            __tmp38.setValue(MetaPropertyKind.Containment);
            elemAnnotList.add(__tmp38);
        }
        if (ctx.KReadonly() != null)
        {
            Object elem = ctx.KReadonly();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp39 = new ValueAnnotation();
            __tmp39.setValue(MetaPropertyKind.Readonly);
            elemAnnotList.add(__tmp39);
        }
        if (ctx.KLazy() != null)
        {
            Object elem = ctx.KLazy();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp40 = new ValueAnnotation();
            __tmp40.setValue(MetaPropertyKind.Lazy);
            elemAnnotList.add(__tmp40);
        }
        if (ctx.KDerived() != null)
        {
            Object elem = ctx.KDerived();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp41 = new ValueAnnotation();
            __tmp41.setValue(MetaPropertyKind.Derived);
            elemAnnotList.add(__tmp41);
        }
        if (ctx.KSynthetized() != null)
        {
            Object elem = ctx.KSynthetized();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp42 = new ValueAnnotation();
            __tmp42.setValue(MetaPropertyKind.Synthetized);
            elemAnnotList.add(__tmp42);
        }
        if (ctx.KInherited() != null)
        {
            Object elem = ctx.KInherited();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp43 = new ValueAnnotation();
            __tmp43.setValue(MetaPropertyKind.Inherited);
            elemAnnotList.add(__tmp43);
        }
        this.handleSymbolType(ctx);
        return super.visitFieldModifier(ctx);
    }
    
    @Override
    public Object visitRedefinitions(MetaModelParser.RedefinitionsContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.nameUseList() != null)
        {
            Object elem = ctx.nameUseList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp44 = new PropertyAnnotation();
            __tmp44.setName("RedefinedProperties");
            elemAnnotList.add(__tmp44);
        }
        this.handleSymbolType(ctx);
        return super.visitRedefinitions(ctx);
    }
    
    @Override
    public Object visitSubsettings(MetaModelParser.SubsettingsContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.nameUseList() != null)
        {
            Object elem = ctx.nameUseList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp45 = new PropertyAnnotation();
            __tmp45.setName("SubsettedProperties");
            elemAnnotList.add(__tmp45);
        }
        this.handleSymbolType(ctx);
        return super.visitSubsettings(ctx);
    }
    
    @Override
    public Object visitNameUseList(MetaModelParser.NameUseListContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            for(Object elem: ctx.qualifiedName())
            {
                elemAnnotList = this.treeAnnotations.get(elem);
                if (elemAnnotList == null)
                {
                    elemAnnotList = new ArrayList<>();
                    this.treeAnnotations.put(elem, elemAnnotList);
                }
                NameUseAnnotation __tmp46 = new NameUseAnnotation();
                __tmp46.getSymbolTypes().add(MetaProperty.class);
                elemAnnotList.add(__tmp46);
            }
        }
        this.handleSymbolType(ctx);
        return super.visitNameUseList(ctx);
    }
    
    @Override
    public Object visitConstDeclaration(MetaModelParser.ConstDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp47 = new PropertyAnnotation();
        __tmp47.setName("Declarations");
        treeAnnotList.add(__tmp47);
        NameDefAnnotation __tmp48 = new NameDefAnnotation();
        __tmp48.setSymbolType(MetaConstant.class);
        treeAnnotList.add(__tmp48);
        TriviaAnnotation __tmp49 = new TriviaAnnotation();
        __tmp49.setProperty("Documentation");
        treeAnnotList.add(__tmp49);
        List<Object> elemAnnotList = null;
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp50 = new PropertyAnnotation();
            __tmp50.setName("Type");
            elemAnnotList.add(__tmp50);
        }
        if (ctx.expressionOrNewExpression() != null)
        {
            Object elem = ctx.expressionOrNewExpression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp51 = new PropertyAnnotation();
            __tmp51.setName("Value");
            elemAnnotList.add(__tmp51);
        }
        this.handleSymbolType(ctx);
        return super.visitConstDeclaration(ctx);
    }
    
    @Override
    public Object visitFunctionDeclaration(MetaModelParser.FunctionDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp52 = new PropertyAnnotation();
        __tmp52.setName("Declarations");
        treeAnnotList.add(__tmp52);
        NameDefAnnotation __tmp53 = new NameDefAnnotation();
        __tmp53.setSymbolType(MetaGlobalFunction.class);
        __tmp53.setOverload(true);
        treeAnnotList.add(__tmp53);
        TriviaAnnotation __tmp54 = new TriviaAnnotation();
        __tmp54.setProperty("Documentation");
        treeAnnotList.add(__tmp54);
        List<Object> elemAnnotList = null;
        if (ctx.returnType() != null)
        {
            Object elem = ctx.returnType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp55 = new PropertyAnnotation();
            __tmp55.setName("ReturnType");
            elemAnnotList.add(__tmp55);
        }
        if (ctx.parameterList() != null)
        {
            Object elem = ctx.parameterList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp56 = new PropertyAnnotation();
            __tmp56.setName("Parameters");
            elemAnnotList.add(__tmp56);
        }
        this.handleSymbolType(ctx);
        return super.visitFunctionDeclaration(ctx);
    }
    
    @Override
    public Object visitReturnType(MetaModelParser.ReturnTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeUseAnnotation __tmp57 = new TypeUseAnnotation();
        treeAnnotList.add(__tmp57);
        this.handleSymbolType(ctx);
        return super.visitReturnType(ctx);
    }
    
    @Override
    public Object visitTypeOfReference(MetaModelParser.TypeOfReferenceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeUseAnnotation __tmp58 = new TypeUseAnnotation();
        treeAnnotList.add(__tmp58);
        this.handleSymbolType(ctx);
        return super.visitTypeOfReference(ctx);
    }
    
    @Override
    public Object visitTypeReference(MetaModelParser.TypeReferenceContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeUseAnnotation __tmp59 = new TypeUseAnnotation();
        treeAnnotList.add(__tmp59);
        this.handleSymbolType(ctx);
        return super.visitTypeReference(ctx);
    }
    
    @Override
    public Object visitSimpleType(MetaModelParser.SimpleTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeUseAnnotation __tmp60 = new TypeUseAnnotation();
        treeAnnotList.add(__tmp60);
        this.handleSymbolType(ctx);
        return super.visitSimpleType(ctx);
    }
    
    @Override
    public Object visitClassType(MetaModelParser.ClassTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeUseAnnotation __tmp61 = new TypeUseAnnotation();
        __tmp61.getSymbolTypes().add(MetaClass.class);
        treeAnnotList.add(__tmp61);
        this.handleSymbolType(ctx);
        return super.visitClassType(ctx);
    }
    
    @Override
    public Object visitObjectType(MetaModelParser.ObjectTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp62 = new NameAnnotation();
        treeAnnotList.add(__tmp62);
        this.handleSymbolType(ctx);
        return super.visitObjectType(ctx);
    }
    
    @Override
    public Object visitPrimitiveType(MetaModelParser.PrimitiveTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp63 = new NameAnnotation();
        treeAnnotList.add(__tmp63);
        this.handleSymbolType(ctx);
        return super.visitPrimitiveType(ctx);
    }
    
    @Override
    public Object visitVoidType(MetaModelParser.VoidTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp64 = new NameAnnotation();
        treeAnnotList.add(__tmp64);
        this.handleSymbolType(ctx);
        return super.visitVoidType(ctx);
    }
    
    @Override
    public Object visitInvisibleType(MetaModelParser.InvisibleTypeContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.KAny() != null)
        {
            Object elem = ctx.KAny();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PreDefSymbolAnnotation __tmp65 = new PreDefSymbolAnnotation();
            __tmp65.setValue(MetaInstance.Any);
            elemAnnotList.add(__tmp65);
        }
        if (ctx.KNone() != null)
        {
            Object elem = ctx.KNone();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PreDefSymbolAnnotation __tmp66 = new PreDefSymbolAnnotation();
            __tmp66.setValue(MetaInstance.None);
            elemAnnotList.add(__tmp66);
        }
        if (ctx.KError() != null)
        {
            Object elem = ctx.KError();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PreDefSymbolAnnotation __tmp67 = new PreDefSymbolAnnotation();
            __tmp67.setValue(MetaInstance.Error);
            elemAnnotList.add(__tmp67);
        }
        this.handleSymbolType(ctx);
        return super.visitInvisibleType(ctx);
    }
    
    @Override
    public Object visitNullableType(MetaModelParser.NullableTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp68 = new TypeCtrAnnotation();
        __tmp68.setSymbolType(MetaNullableType.class);
        treeAnnotList.add(__tmp68);
        List<Object> elemAnnotList = null;
        if (ctx.primitiveType() != null)
        {
            Object elem = ctx.primitiveType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp69 = new PropertyAnnotation();
            __tmp69.setName("InnerType");
            elemAnnotList.add(__tmp69);
        }
        this.handleSymbolType(ctx);
        return super.visitNullableType(ctx);
    }
    
    @Override
    public Object visitCollectionType(MetaModelParser.CollectionTypeContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        TypeCtrAnnotation __tmp70 = new TypeCtrAnnotation();
        __tmp70.setSymbolType(MetaCollectionType.class);
        treeAnnotList.add(__tmp70);
        List<Object> elemAnnotList = null;
        if (ctx.collectionKind() != null)
        {
            Object elem = ctx.collectionKind();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp71 = new PropertyAnnotation();
            __tmp71.setName("Kind");
            elemAnnotList.add(__tmp71);
        }
        if (ctx.simpleType() != null)
        {
            Object elem = ctx.simpleType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp72 = new PropertyAnnotation();
            __tmp72.setName("InnerType");
            elemAnnotList.add(__tmp72);
        }
        this.handleSymbolType(ctx);
        return super.visitCollectionType(ctx);
    }
    
    @Override
    public Object visitCollectionKind(MetaModelParser.CollectionKindContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.KSet() != null)
        {
            Object elem = ctx.KSet();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp73 = new ValueAnnotation();
            __tmp73.setValue(MetaCollectionKind.Set);
            elemAnnotList.add(__tmp73);
        }
        if (ctx.KList() != null)
        {
            Object elem = ctx.KList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp74 = new ValueAnnotation();
            __tmp74.setValue(MetaCollectionKind.List);
            elemAnnotList.add(__tmp74);
        }
        if (ctx.KMultiSet() != null)
        {
            Object elem = ctx.KMultiSet();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp75 = new ValueAnnotation();
            __tmp75.setValue(MetaCollectionKind.MultiSet);
            elemAnnotList.add(__tmp75);
        }
        if (ctx.KMultiList() != null)
        {
            Object elem = ctx.KMultiList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp76 = new ValueAnnotation();
            __tmp76.setValue(MetaCollectionKind.MultiList);
            elemAnnotList.add(__tmp76);
        }
        this.handleSymbolType(ctx);
        return super.visitCollectionKind(ctx);
    }
    
    @Override
    public Object visitOperationDeclaration(MetaModelParser.OperationDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp77 = new NameDefAnnotation();
        __tmp77.setSymbolType(MetaOperation.class);
        treeAnnotList.add(__tmp77);
        TriviaAnnotation __tmp78 = new TriviaAnnotation();
        __tmp78.setProperty("Documentation");
        treeAnnotList.add(__tmp78);
        List<Object> elemAnnotList = null;
        if (ctx.returnType() != null)
        {
            Object elem = ctx.returnType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp79 = new PropertyAnnotation();
            __tmp79.setName("ReturnType");
            elemAnnotList.add(__tmp79);
        }
        if (ctx.parameterList() != null)
        {
            Object elem = ctx.parameterList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp80 = new PropertyAnnotation();
            __tmp80.setName("Parameters");
            elemAnnotList.add(__tmp80);
        }
        this.handleSymbolType(ctx);
        return super.visitOperationDeclaration(ctx);
    }
    
    @Override
    public Object visitParameterList(MetaModelParser.ParameterListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitParameterList(ctx);
    }
    
    @Override
    public Object visitParameter(MetaModelParser.ParameterContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp81 = new NameDefAnnotation();
        __tmp81.setSymbolType(MetaParameter.class);
        treeAnnotList.add(__tmp81);
        TriviaAnnotation __tmp82 = new TriviaAnnotation();
        __tmp82.setProperty("Documentation");
        treeAnnotList.add(__tmp82);
        List<Object> elemAnnotList = null;
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp83 = new PropertyAnnotation();
            __tmp83.setName("Type");
            elemAnnotList.add(__tmp83);
        }
        this.handleSymbolType(ctx);
        return super.visitParameter(ctx);
    }
    
    @Override
    public Object visitConstructorDeclaration(MetaModelParser.ConstructorDeclarationContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameDefAnnotation __tmp84 = new NameDefAnnotation();
        __tmp84.setSymbolType(MetaConstructor.class);
        treeAnnotList.add(__tmp84);
        TriviaAnnotation __tmp85 = new TriviaAnnotation();
        __tmp85.setProperty("Documentation");
        treeAnnotList.add(__tmp85);
        List<Object> elemAnnotList = null;
        if (ctx.initializerDeclaration() != null)
        {
            for(Object elem: ctx.initializerDeclaration())
            {
                elemAnnotList = this.treeAnnotations.get(elem);
                if (elemAnnotList == null)
                {
                    elemAnnotList = new ArrayList<>();
                    this.treeAnnotations.put(elem, elemAnnotList);
                }
                PropertyAnnotation __tmp86 = new PropertyAnnotation();
                __tmp86.setName("Initializers");
                elemAnnotList.add(__tmp86);
            }
        }
        this.handleSymbolType(ctx);
        return super.visitConstructorDeclaration(ctx);
    }
    
    @Override
    public Object visitInitializerDeclaration(MetaModelParser.InitializerDeclarationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitInitializerDeclaration(ctx);
    }
    
    @Override
    public Object visitSynthetizedPropertyInitializer(MetaModelParser.SynthetizedPropertyInitializerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp87 = new SymbolAnnotation();
        __tmp87.setSymbolType(MetaSynthetizedPropertyInitializer.class);
        treeAnnotList.add(__tmp87);
        List<Object> elemAnnotList = null;
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp88 = new PropertyAnnotation();
            __tmp88.setName("PropertyContext");
            elemAnnotList.add(__tmp88);
            TypeUseAnnotation __tmp89 = new TypeUseAnnotation();
            __tmp89.getSymbolTypes().add(MetaClass.class);
            elemAnnotList.add(__tmp89);
        }
        if (ctx.property != null)
        {
            Object elem = ctx.property;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp90 = new PropertyAnnotation();
            __tmp90.setName("PropertyName");
            elemAnnotList.add(__tmp90);
            ValueAnnotation __tmp91 = new ValueAnnotation();
            elemAnnotList.add(__tmp91);
        }
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp92 = new PropertyAnnotation();
            __tmp92.setName("Value");
            elemAnnotList.add(__tmp92);
        }
        this.handleSymbolType(ctx);
        return super.visitSynthetizedPropertyInitializer(ctx);
    }
    
    @Override
    public Object visitInheritedPropertyInitializer(MetaModelParser.InheritedPropertyInitializerContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp93 = new SymbolAnnotation();
        __tmp93.setSymbolType(MetaInheritedPropertyInitializer.class);
        treeAnnotList.add(__tmp93);
        List<Object> elemAnnotList = null;
        if (ctx.object != null)
        {
            Object elem = ctx.object;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp94 = new PropertyAnnotation();
            __tmp94.setName("ObjectName");
            elemAnnotList.add(__tmp94);
            ValueAnnotation __tmp95 = new ValueAnnotation();
            elemAnnotList.add(__tmp95);
        }
        if (ctx.qualifiedName() != null)
        {
            Object elem = ctx.qualifiedName();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp96 = new PropertyAnnotation();
            __tmp96.setName("PropertyContext");
            elemAnnotList.add(__tmp96);
            TypeUseAnnotation __tmp97 = new TypeUseAnnotation();
            __tmp97.getSymbolTypes().add(MetaClass.class);
            elemAnnotList.add(__tmp97);
        }
        if (ctx.property != null)
        {
            Object elem = ctx.property;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp98 = new PropertyAnnotation();
            __tmp98.setName("PropertyName");
            elemAnnotList.add(__tmp98);
            ValueAnnotation __tmp99 = new ValueAnnotation();
            elemAnnotList.add(__tmp99);
        }
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp100 = new PropertyAnnotation();
            __tmp100.setName("Value");
            elemAnnotList.add(__tmp100);
        }
        this.handleSymbolType(ctx);
        return super.visitInheritedPropertyInitializer(ctx);
    }
    
    @Override
    public Object visitExpressionList(MetaModelParser.ExpressionListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionList(ctx);
    }
    
    @Override
    public Object visitExpressionOrNewExpressionList(MetaModelParser.ExpressionOrNewExpressionListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionOrNewExpressionList(ctx);
    }
    
    @Override
    public Object visitExpressionOrNewExpression(MetaModelParser.ExpressionOrNewExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionOrNewExpression(ctx);
    }
    
    @Override
    public Object visitCastExpression(MetaModelParser.CastExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp101 = new SymbolAnnotation();
        treeAnnotList.add(__tmp101);
        ExpressionAnnotation __tmp102 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp102);
        SymbolTypeAnnotation __tmp103 = new SymbolTypeAnnotation();
        __tmp103.setSymbolType(MetaTypeCastExpression.class);
        treeAnnotList.add(__tmp103);
        List<Object> elemAnnotList = null;
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp104 = new PropertyAnnotation();
            __tmp104.setName("TypeReference");
            elemAnnotList.add(__tmp104);
        }
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp105 = new PropertyAnnotation();
            __tmp105.setName("Expression");
            elemAnnotList.add(__tmp105);
        }
        this.handleSymbolType(ctx);
        return super.visitCastExpression(ctx);
    }
    
    @Override
    public Object visitTypeofExpression(MetaModelParser.TypeofExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp106 = new SymbolAnnotation();
        treeAnnotList.add(__tmp106);
        ExpressionAnnotation __tmp107 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp107);
        SymbolTypeAnnotation __tmp108 = new SymbolTypeAnnotation();
        __tmp108.setSymbolType(MetaTypeOfExpression.class);
        treeAnnotList.add(__tmp108);
        List<Object> elemAnnotList = null;
        if (ctx.typeOfReference() != null)
        {
            Object elem = ctx.typeOfReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp109 = new PropertyAnnotation();
            __tmp109.setName("TypeReference");
            elemAnnotList.add(__tmp109);
        }
        this.handleSymbolType(ctx);
        return super.visitTypeofExpression(ctx);
    }
    
    @Override
    public Object visitBracketExpression(MetaModelParser.BracketExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp110 = new SymbolAnnotation();
        treeAnnotList.add(__tmp110);
        ExpressionAnnotation __tmp111 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp111);
        SymbolTypeAnnotation __tmp112 = new SymbolTypeAnnotation();
        __tmp112.setSymbolType(MetaBracketExpression.class);
        treeAnnotList.add(__tmp112);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp113 = new PropertyAnnotation();
            __tmp113.setName("Expression");
            elemAnnotList.add(__tmp113);
        }
        this.handleSymbolType(ctx);
        return super.visitBracketExpression(ctx);
    }
    
    @Override
    public Object visitThisExpression(MetaModelParser.ThisExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp114 = new SymbolAnnotation();
        treeAnnotList.add(__tmp114);
        ExpressionAnnotation __tmp115 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp115);
        SymbolTypeAnnotation __tmp116 = new SymbolTypeAnnotation();
        __tmp116.setSymbolType(MetaThisExpression.class);
        treeAnnotList.add(__tmp116);
        this.handleSymbolType(ctx);
        return super.visitThisExpression(ctx);
    }
    
    @Override
    public Object visitConstantExpression(MetaModelParser.ConstantExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp117 = new SymbolAnnotation();
        treeAnnotList.add(__tmp117);
        ExpressionAnnotation __tmp118 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp118);
        SymbolTypeAnnotation __tmp119 = new SymbolTypeAnnotation();
        __tmp119.setSymbolType(MetaConstantExpression.class);
        treeAnnotList.add(__tmp119);
        List<Object> elemAnnotList = null;
        if (ctx.value != null)
        {
            Object elem = ctx.value;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp120 = new PropertyAnnotation();
            __tmp120.setName("Value");
            elemAnnotList.add(__tmp120);
        }
        this.handleSymbolType(ctx);
        return super.visitConstantExpression(ctx);
    }
    
    @Override
    public Object visitIdentifierExpression(MetaModelParser.IdentifierExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp121 = new SymbolAnnotation();
        treeAnnotList.add(__tmp121);
        ExpressionAnnotation __tmp122 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp122);
        SymbolTypeAnnotation __tmp123 = new SymbolTypeAnnotation();
        __tmp123.setSymbolType(MetaIdentifierExpression.class);
        treeAnnotList.add(__tmp123);
        List<Object> elemAnnotList = null;
        if (ctx.name != null)
        {
            Object elem = ctx.name;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp124 = new ValueAnnotation();
            elemAnnotList.add(__tmp124);
            PropertyAnnotation __tmp125 = new PropertyAnnotation();
            __tmp125.setName("Name");
            elemAnnotList.add(__tmp125);
        }
        this.handleSymbolType(ctx);
        return super.visitIdentifierExpression(ctx);
    }
    
    @Override
    public Object visitIndexerExpression(MetaModelParser.IndexerExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp126 = new SymbolAnnotation();
        treeAnnotList.add(__tmp126);
        ExpressionAnnotation __tmp127 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp127);
        SymbolTypeAnnotation __tmp128 = new SymbolTypeAnnotation();
        __tmp128.setSymbolType(MetaIndexerExpression.class);
        treeAnnotList.add(__tmp128);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp129 = new PropertyAnnotation();
            __tmp129.setName("Expression");
            elemAnnotList.add(__tmp129);
        }
        if (ctx.expressionList() != null)
        {
            Object elem = ctx.expressionList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp130 = new PropertyAnnotation();
            __tmp130.setName("Arguments");
            elemAnnotList.add(__tmp130);
        }
        this.handleSymbolType(ctx);
        return super.visitIndexerExpression(ctx);
    }
    
    @Override
    public Object visitFunctionCallExpression(MetaModelParser.FunctionCallExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp131 = new SymbolAnnotation();
        treeAnnotList.add(__tmp131);
        ExpressionAnnotation __tmp132 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp132);
        SymbolTypeAnnotation __tmp133 = new SymbolTypeAnnotation();
        __tmp133.setSymbolType(MetaFunctionCallExpression.class);
        treeAnnotList.add(__tmp133);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp134 = new PropertyAnnotation();
            __tmp134.setName("Expression");
            elemAnnotList.add(__tmp134);
        }
        if (ctx.expressionList() != null)
        {
            Object elem = ctx.expressionList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp135 = new PropertyAnnotation();
            __tmp135.setName("Arguments");
            elemAnnotList.add(__tmp135);
        }
        this.handleSymbolType(ctx);
        return super.visitFunctionCallExpression(ctx);
    }
    
    @Override
    public Object visitMemberAccessExpression(MetaModelParser.MemberAccessExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp136 = new SymbolAnnotation();
        treeAnnotList.add(__tmp136);
        ExpressionAnnotation __tmp137 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp137);
        SymbolTypeAnnotation __tmp138 = new SymbolTypeAnnotation();
        __tmp138.setSymbolType(MetaMemberAccessExpression.class);
        treeAnnotList.add(__tmp138);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp139 = new PropertyAnnotation();
            __tmp139.setName("Expression");
            elemAnnotList.add(__tmp139);
        }
        if (ctx.name != null)
        {
            Object elem = ctx.name;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp140 = new ValueAnnotation();
            elemAnnotList.add(__tmp140);
            PropertyAnnotation __tmp141 = new PropertyAnnotation();
            __tmp141.setName("Name");
            elemAnnotList.add(__tmp141);
        }
        this.handleSymbolType(ctx);
        return super.visitMemberAccessExpression(ctx);
    }
    
    @Override
    public Object visitPostExpression(MetaModelParser.PostExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp142 = new SymbolAnnotation();
        treeAnnotList.add(__tmp142);
        ExpressionAnnotation __tmp143 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp143);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp144 = new PropertyAnnotation();
            __tmp144.setName("Expression");
            elemAnnotList.add(__tmp144);
        }
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp145 = new PropertyAnnotation();
            __tmp145.setName("Kind");
            elemAnnotList.add(__tmp145);
        }
        this.handleSymbolType(ctx);
        return super.visitPostExpression(ctx);
    }
    
    @Override
    public Object visitPreExpression(MetaModelParser.PreExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp146 = new SymbolAnnotation();
        treeAnnotList.add(__tmp146);
        ExpressionAnnotation __tmp147 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp147);
        List<Object> elemAnnotList = null;
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp148 = new PropertyAnnotation();
            __tmp148.setName("Kind");
            elemAnnotList.add(__tmp148);
        }
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp149 = new PropertyAnnotation();
            __tmp149.setName("Expression");
            elemAnnotList.add(__tmp149);
        }
        this.handleSymbolType(ctx);
        return super.visitPreExpression(ctx);
    }
    
    @Override
    public Object visitUnaryExpression(MetaModelParser.UnaryExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp150 = new SymbolAnnotation();
        treeAnnotList.add(__tmp150);
        ExpressionAnnotation __tmp151 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp151);
        List<Object> elemAnnotList = null;
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp152 = new PropertyAnnotation();
            __tmp152.setName("Kind");
            elemAnnotList.add(__tmp152);
        }
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp153 = new PropertyAnnotation();
            __tmp153.setName("Expression");
            elemAnnotList.add(__tmp153);
        }
        this.handleSymbolType(ctx);
        return super.visitUnaryExpression(ctx);
    }
    
    @Override
    public Object visitTypeConversionExpression(MetaModelParser.TypeConversionExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp154 = new SymbolAnnotation();
        treeAnnotList.add(__tmp154);
        ExpressionAnnotation __tmp155 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp155);
        SymbolTypeAnnotation __tmp156 = new SymbolTypeAnnotation();
        __tmp156.setSymbolType(MetaTypeAsExpression.class);
        treeAnnotList.add(__tmp156);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp157 = new PropertyAnnotation();
            __tmp157.setName("Expression");
            elemAnnotList.add(__tmp157);
        }
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp158 = new PropertyAnnotation();
            __tmp158.setName("TypeReference");
            elemAnnotList.add(__tmp158);
        }
        this.handleSymbolType(ctx);
        return super.visitTypeConversionExpression(ctx);
    }
    
    @Override
    public Object visitTypeCheckExpression(MetaModelParser.TypeCheckExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp159 = new SymbolAnnotation();
        treeAnnotList.add(__tmp159);
        ExpressionAnnotation __tmp160 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp160);
        SymbolTypeAnnotation __tmp161 = new SymbolTypeAnnotation();
        __tmp161.setSymbolType(MetaTypeCheckExpression.class);
        treeAnnotList.add(__tmp161);
        List<Object> elemAnnotList = null;
        if (ctx.expression() != null)
        {
            Object elem = ctx.expression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp162 = new PropertyAnnotation();
            __tmp162.setName("Expression");
            elemAnnotList.add(__tmp162);
        }
        if (ctx.typeReference() != null)
        {
            Object elem = ctx.typeReference();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp163 = new PropertyAnnotation();
            __tmp163.setName("TypeReference");
            elemAnnotList.add(__tmp163);
        }
        this.handleSymbolType(ctx);
        return super.visitTypeCheckExpression(ctx);
    }
    
    @Override
    public Object visitMultiplicativeExpression(MetaModelParser.MultiplicativeExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp164 = new SymbolAnnotation();
        treeAnnotList.add(__tmp164);
        ExpressionAnnotation __tmp165 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp165);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp166 = new PropertyAnnotation();
            __tmp166.setName("Left");
            elemAnnotList.add(__tmp166);
        }
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp167 = new PropertyAnnotation();
            __tmp167.setName("Kind");
            elemAnnotList.add(__tmp167);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp168 = new PropertyAnnotation();
            __tmp168.setName("Right");
            elemAnnotList.add(__tmp168);
        }
        this.handleSymbolType(ctx);
        return super.visitMultiplicativeExpression(ctx);
    }
    
    @Override
    public Object visitAdditiveExpression(MetaModelParser.AdditiveExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp169 = new SymbolAnnotation();
        treeAnnotList.add(__tmp169);
        ExpressionAnnotation __tmp170 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp170);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp171 = new PropertyAnnotation();
            __tmp171.setName("Left");
            elemAnnotList.add(__tmp171);
        }
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp172 = new PropertyAnnotation();
            __tmp172.setName("Kind");
            elemAnnotList.add(__tmp172);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp173 = new PropertyAnnotation();
            __tmp173.setName("Right");
            elemAnnotList.add(__tmp173);
        }
        this.handleSymbolType(ctx);
        return super.visitAdditiveExpression(ctx);
    }
    
    @Override
    public Object visitShiftExpression(MetaModelParser.ShiftExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp174 = new SymbolAnnotation();
        treeAnnotList.add(__tmp174);
        ExpressionAnnotation __tmp175 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp175);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp176 = new PropertyAnnotation();
            __tmp176.setName("Left");
            elemAnnotList.add(__tmp176);
        }
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp177 = new PropertyAnnotation();
            __tmp177.setName("Kind");
            elemAnnotList.add(__tmp177);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp178 = new PropertyAnnotation();
            __tmp178.setName("Right");
            elemAnnotList.add(__tmp178);
        }
        this.handleSymbolType(ctx);
        return super.visitShiftExpression(ctx);
    }
    
    @Override
    public Object visitComparisonExpression(MetaModelParser.ComparisonExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp179 = new SymbolAnnotation();
        treeAnnotList.add(__tmp179);
        ExpressionAnnotation __tmp180 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp180);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp181 = new PropertyAnnotation();
            __tmp181.setName("Left");
            elemAnnotList.add(__tmp181);
        }
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp182 = new PropertyAnnotation();
            __tmp182.setName("Kind");
            elemAnnotList.add(__tmp182);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp183 = new PropertyAnnotation();
            __tmp183.setName("Right");
            elemAnnotList.add(__tmp183);
        }
        this.handleSymbolType(ctx);
        return super.visitComparisonExpression(ctx);
    }
    
    @Override
    public Object visitEqualityExpression(MetaModelParser.EqualityExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp184 = new SymbolAnnotation();
        treeAnnotList.add(__tmp184);
        ExpressionAnnotation __tmp185 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp185);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp186 = new PropertyAnnotation();
            __tmp186.setName("Left");
            elemAnnotList.add(__tmp186);
        }
        if (ctx.kind != null)
        {
            Object elem = ctx.kind;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp187 = new PropertyAnnotation();
            __tmp187.setName("Kind");
            elemAnnotList.add(__tmp187);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp188 = new PropertyAnnotation();
            __tmp188.setName("Right");
            elemAnnotList.add(__tmp188);
        }
        this.handleSymbolType(ctx);
        return super.visitEqualityExpression(ctx);
    }
    
    @Override
    public Object visitBitwiseAndExpression(MetaModelParser.BitwiseAndExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp189 = new SymbolAnnotation();
        treeAnnotList.add(__tmp189);
        ExpressionAnnotation __tmp190 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp190);
        SymbolTypeAnnotation __tmp191 = new SymbolTypeAnnotation();
        __tmp191.setSymbolType(MetaAndExpression.class);
        treeAnnotList.add(__tmp191);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp192 = new PropertyAnnotation();
            __tmp192.setName("Left");
            elemAnnotList.add(__tmp192);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp193 = new PropertyAnnotation();
            __tmp193.setName("Right");
            elemAnnotList.add(__tmp193);
        }
        this.handleSymbolType(ctx);
        return super.visitBitwiseAndExpression(ctx);
    }
    
    @Override
    public Object visitBitwiseXorExpression(MetaModelParser.BitwiseXorExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp194 = new SymbolAnnotation();
        treeAnnotList.add(__tmp194);
        ExpressionAnnotation __tmp195 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp195);
        SymbolTypeAnnotation __tmp196 = new SymbolTypeAnnotation();
        __tmp196.setSymbolType(MetaExclusiveOrExpression.class);
        treeAnnotList.add(__tmp196);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp197 = new PropertyAnnotation();
            __tmp197.setName("Left");
            elemAnnotList.add(__tmp197);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp198 = new PropertyAnnotation();
            __tmp198.setName("Right");
            elemAnnotList.add(__tmp198);
        }
        this.handleSymbolType(ctx);
        return super.visitBitwiseXorExpression(ctx);
    }
    
    @Override
    public Object visitBitwiseOrExpression(MetaModelParser.BitwiseOrExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp199 = new SymbolAnnotation();
        treeAnnotList.add(__tmp199);
        ExpressionAnnotation __tmp200 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp200);
        SymbolTypeAnnotation __tmp201 = new SymbolTypeAnnotation();
        __tmp201.setSymbolType(MetaOrExpression.class);
        treeAnnotList.add(__tmp201);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp202 = new PropertyAnnotation();
            __tmp202.setName("Left");
            elemAnnotList.add(__tmp202);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp203 = new PropertyAnnotation();
            __tmp203.setName("Right");
            elemAnnotList.add(__tmp203);
        }
        this.handleSymbolType(ctx);
        return super.visitBitwiseOrExpression(ctx);
    }
    
    @Override
    public Object visitLogicalAndExpression(MetaModelParser.LogicalAndExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp204 = new SymbolAnnotation();
        treeAnnotList.add(__tmp204);
        ExpressionAnnotation __tmp205 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp205);
        SymbolTypeAnnotation __tmp206 = new SymbolTypeAnnotation();
        __tmp206.setSymbolType(MetaAndAlsoExpression.class);
        treeAnnotList.add(__tmp206);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp207 = new PropertyAnnotation();
            __tmp207.setName("Left");
            elemAnnotList.add(__tmp207);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp208 = new PropertyAnnotation();
            __tmp208.setName("Right");
            elemAnnotList.add(__tmp208);
        }
        this.handleSymbolType(ctx);
        return super.visitLogicalAndExpression(ctx);
    }
    
    @Override
    public Object visitLogicalOrExpression(MetaModelParser.LogicalOrExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp209 = new SymbolAnnotation();
        treeAnnotList.add(__tmp209);
        ExpressionAnnotation __tmp210 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp210);
        SymbolTypeAnnotation __tmp211 = new SymbolTypeAnnotation();
        __tmp211.setSymbolType(MetaOrElseExpression.class);
        treeAnnotList.add(__tmp211);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp212 = new PropertyAnnotation();
            __tmp212.setName("Left");
            elemAnnotList.add(__tmp212);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp213 = new PropertyAnnotation();
            __tmp213.setName("Right");
            elemAnnotList.add(__tmp213);
        }
        this.handleSymbolType(ctx);
        return super.visitLogicalOrExpression(ctx);
    }
    
    @Override
    public Object visitNullCoalescingExpression(MetaModelParser.NullCoalescingExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp214 = new SymbolAnnotation();
        treeAnnotList.add(__tmp214);
        ExpressionAnnotation __tmp215 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp215);
        SymbolTypeAnnotation __tmp216 = new SymbolTypeAnnotation();
        __tmp216.setSymbolType(MetaNullCoalescingExpression.class);
        treeAnnotList.add(__tmp216);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp217 = new PropertyAnnotation();
            __tmp217.setName("Left");
            elemAnnotList.add(__tmp217);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp218 = new PropertyAnnotation();
            __tmp218.setName("Right");
            elemAnnotList.add(__tmp218);
        }
        this.handleSymbolType(ctx);
        return super.visitNullCoalescingExpression(ctx);
    }
    
    @Override
    public Object visitConditionalExpression(MetaModelParser.ConditionalExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp219 = new SymbolAnnotation();
        treeAnnotList.add(__tmp219);
        ExpressionAnnotation __tmp220 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp220);
        SymbolTypeAnnotation __tmp221 = new SymbolTypeAnnotation();
        __tmp221.setSymbolType(MetaConditionalExpression.class);
        treeAnnotList.add(__tmp221);
        List<Object> elemAnnotList = null;
        if (ctx.condition != null)
        {
            Object elem = ctx.condition;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp222 = new PropertyAnnotation();
            __tmp222.setName("Condition");
            elemAnnotList.add(__tmp222);
        }
        if (ctx.thenExpr != null)
        {
            Object elem = ctx.thenExpr;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp223 = new PropertyAnnotation();
            __tmp223.setName("ThenExpr");
            elemAnnotList.add(__tmp223);
        }
        if (ctx.elseExpr != null)
        {
            Object elem = ctx.elseExpr;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp224 = new PropertyAnnotation();
            __tmp224.setName("ElseExpr");
            elemAnnotList.add(__tmp224);
        }
        this.handleSymbolType(ctx);
        return super.visitConditionalExpression(ctx);
    }
    
    @Override
    public Object visitAssignmentExpression(MetaModelParser.AssignmentExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp225 = new SymbolAnnotation();
        treeAnnotList.add(__tmp225);
        ExpressionAnnotation __tmp226 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp226);
        List<Object> elemAnnotList = null;
        if (ctx.left != null)
        {
            Object elem = ctx.left;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp227 = new PropertyAnnotation();
            __tmp227.setName("Left");
            elemAnnotList.add(__tmp227);
        }
        if (ctx.operator != null)
        {
            Object elem = ctx.operator;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp228 = new PropertyAnnotation();
            __tmp228.setName("Operator");
            elemAnnotList.add(__tmp228);
        }
        if (ctx.right != null)
        {
            Object elem = ctx.right;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp229 = new PropertyAnnotation();
            __tmp229.setName("Right");
            elemAnnotList.add(__tmp229);
        }
        this.handleSymbolType(ctx);
        return super.visitAssignmentExpression(ctx);
    }
    
    @Override
    public Object visitLiteralExpression(MetaModelParser.LiteralExpressionContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.nullLiteral() != null)
        {
            Object elem = ctx.nullLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolAnnotation __tmp230 = new SymbolAnnotation();
            __tmp230.setSymbolType(MetaNullExpression.class);
            elemAnnotList.add(__tmp230);
        }
        if (ctx.booleanLiteral() != null)
        {
            Object elem = ctx.booleanLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp231 = new ValueAnnotation();
            elemAnnotList.add(__tmp231);
        }
        if (ctx.integerLiteral() != null)
        {
            Object elem = ctx.integerLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp232 = new ValueAnnotation();
            elemAnnotList.add(__tmp232);
        }
        if (ctx.decimalLiteral() != null)
        {
            Object elem = ctx.decimalLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp233 = new ValueAnnotation();
            elemAnnotList.add(__tmp233);
        }
        if (ctx.scientificLiteral() != null)
        {
            Object elem = ctx.scientificLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp234 = new ValueAnnotation();
            elemAnnotList.add(__tmp234);
        }
        if (ctx.stringLiteral() != null)
        {
            Object elem = ctx.stringLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp235 = new ValueAnnotation();
            elemAnnotList.add(__tmp235);
        }
        this.handleSymbolType(ctx);
        return super.visitLiteralExpression(ctx);
    }
    
    @Override
    public Object visitNewObjectExpression(MetaModelParser.NewObjectExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp236 = new SymbolAnnotation();
        treeAnnotList.add(__tmp236);
        ExpressionAnnotation __tmp237 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp237);
        SymbolTypeAnnotation __tmp238 = new SymbolTypeAnnotation();
        __tmp238.setSymbolType(MetaNewExpression.class);
        treeAnnotList.add(__tmp238);
        List<Object> elemAnnotList = null;
        if (ctx.classType() != null)
        {
            Object elem = ctx.classType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp239 = new PropertyAnnotation();
            __tmp239.setName("TypeReference");
            elemAnnotList.add(__tmp239);
        }
        if (ctx.newPropertyInitList() != null)
        {
            Object elem = ctx.newPropertyInitList();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp240 = new PropertyAnnotation();
            __tmp240.setName("NewPropertyInitList");
            elemAnnotList.add(__tmp240);
        }
        this.handleSymbolType(ctx);
        return super.visitNewObjectExpression(ctx);
    }
    
    @Override
    public Object visitNewCollectionExpression(MetaModelParser.NewCollectionExpressionContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        SymbolAnnotation __tmp241 = new SymbolAnnotation();
        treeAnnotList.add(__tmp241);
        ExpressionAnnotation __tmp242 = new ExpressionAnnotation();
        treeAnnotList.add(__tmp242);
        SymbolTypeAnnotation __tmp243 = new SymbolTypeAnnotation();
        __tmp243.setSymbolType(MetaNewCollectionExpression.class);
        treeAnnotList.add(__tmp243);
        List<Object> elemAnnotList = null;
        if (ctx.collectionType() != null)
        {
            Object elem = ctx.collectionType();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp244 = new PropertyAnnotation();
            __tmp244.setName("TypeReference");
            elemAnnotList.add(__tmp244);
        }
        if (ctx.expressionOrNewExpression() != null)
        {
            Object elem = ctx.expressionOrNewExpression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp245 = new PropertyAnnotation();
            __tmp245.setName("Values");
            elemAnnotList.add(__tmp245);
        }
        this.handleSymbolType(ctx);
        return super.visitNewCollectionExpression(ctx);
    }
    
    @Override
    public Object visitNewPropertyInitList(MetaModelParser.NewPropertyInitListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNewPropertyInitList(ctx);
    }
    
    @Override
    public Object visitNewPropertyInit(MetaModelParser.NewPropertyInitContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        PropertyAnnotation __tmp246 = new PropertyAnnotation();
        __tmp246.setName("PropertyInitializers");
        treeAnnotList.add(__tmp246);
        SymbolAnnotation __tmp247 = new SymbolAnnotation();
        __tmp247.setSymbolType(MetaNewPropertyInitializer.class);
        treeAnnotList.add(__tmp247);
        List<Object> elemAnnotList = null;
        if (ctx.identifier() != null)
        {
            Object elem = ctx.identifier();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp248 = new PropertyAnnotation();
            __tmp248.setName("PropertyName");
            elemAnnotList.add(__tmp248);
            ValueAnnotation __tmp249 = new ValueAnnotation();
            elemAnnotList.add(__tmp249);
        }
        if (ctx.expressionOrNewExpression() != null)
        {
            Object elem = ctx.expressionOrNewExpression();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            PropertyAnnotation __tmp250 = new PropertyAnnotation();
            __tmp250.setName("Value");
            elemAnnotList.add(__tmp250);
        }
        this.handleSymbolType(ctx);
        return super.visitNewPropertyInit(ctx);
    }
    
    @Override
    public Object visitPostOperator(MetaModelParser.PostOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TPlusPlus() != null)
        {
            Object elem = ctx.TPlusPlus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp251 = new SymbolTypeAnnotation();
            __tmp251.setSymbolType(MetaPostIncrementAssignExpression.class);
            elemAnnotList.add(__tmp251);
        }
        if (ctx.TMinusMinus() != null)
        {
            Object elem = ctx.TMinusMinus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp252 = new SymbolTypeAnnotation();
            __tmp252.setSymbolType(MetaPostDecrementAssignExpression.class);
            elemAnnotList.add(__tmp252);
        }
        this.handleSymbolType(ctx);
        return super.visitPostOperator(ctx);
    }
    
    @Override
    public Object visitPreOperator(MetaModelParser.PreOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TPlusPlus() != null)
        {
            Object elem = ctx.TPlusPlus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp253 = new SymbolTypeAnnotation();
            __tmp253.setSymbolType(MetaPreIncrementAssignExpression.class);
            elemAnnotList.add(__tmp253);
        }
        if (ctx.TMinusMinus() != null)
        {
            Object elem = ctx.TMinusMinus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp254 = new SymbolTypeAnnotation();
            __tmp254.setSymbolType(MetaPreDecrementAssignExpression.class);
            elemAnnotList.add(__tmp254);
        }
        this.handleSymbolType(ctx);
        return super.visitPreOperator(ctx);
    }
    
    @Override
    public Object visitUnaryOperator(MetaModelParser.UnaryOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TPlus() != null)
        {
            Object elem = ctx.TPlus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp255 = new SymbolTypeAnnotation();
            __tmp255.setSymbolType(MetaUnaryPlusExpression.class);
            elemAnnotList.add(__tmp255);
        }
        if (ctx.TMinus() != null)
        {
            Object elem = ctx.TMinus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp256 = new SymbolTypeAnnotation();
            __tmp256.setSymbolType(MetaNegateExpression.class);
            elemAnnotList.add(__tmp256);
        }
        if (ctx.TTilde() != null)
        {
            Object elem = ctx.TTilde();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp257 = new SymbolTypeAnnotation();
            __tmp257.setSymbolType(MetaOnesComplementExpression.class);
            elemAnnotList.add(__tmp257);
        }
        if (ctx.TExclamation() != null)
        {
            Object elem = ctx.TExclamation();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp258 = new SymbolTypeAnnotation();
            __tmp258.setSymbolType(MetaNotExpression.class);
            elemAnnotList.add(__tmp258);
        }
        this.handleSymbolType(ctx);
        return super.visitUnaryOperator(ctx);
    }
    
    @Override
    public Object visitMultiplicativeOperator(MetaModelParser.MultiplicativeOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TAsterisk() != null)
        {
            Object elem = ctx.TAsterisk();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp259 = new SymbolTypeAnnotation();
            __tmp259.setSymbolType(MetaMultiplyExpression.class);
            elemAnnotList.add(__tmp259);
        }
        if (ctx.TSlash() != null)
        {
            Object elem = ctx.TSlash();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp260 = new SymbolTypeAnnotation();
            __tmp260.setSymbolType(MetaDivideExpression.class);
            elemAnnotList.add(__tmp260);
        }
        if (ctx.TPercent() != null)
        {
            Object elem = ctx.TPercent();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp261 = new SymbolTypeAnnotation();
            __tmp261.setSymbolType(MetaModuloExpression.class);
            elemAnnotList.add(__tmp261);
        }
        this.handleSymbolType(ctx);
        return super.visitMultiplicativeOperator(ctx);
    }
    
    @Override
    public Object visitAdditiveOperator(MetaModelParser.AdditiveOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TPlus() != null)
        {
            Object elem = ctx.TPlus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp262 = new SymbolTypeAnnotation();
            __tmp262.setSymbolType(MetaAddExpression.class);
            elemAnnotList.add(__tmp262);
        }
        if (ctx.TMinus() != null)
        {
            Object elem = ctx.TMinus();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp263 = new SymbolTypeAnnotation();
            __tmp263.setSymbolType(MetaSubtractExpression.class);
            elemAnnotList.add(__tmp263);
        }
        this.handleSymbolType(ctx);
        return super.visitAdditiveOperator(ctx);
    }
    
    @Override
    public Object visitShiftOperator(MetaModelParser.ShiftOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TLessThan() != null)
        {
            for(Object elem: ctx.TLessThan())
            {
                elemAnnotList = this.treeAnnotations.get(elem);
                if (elemAnnotList == null)
                {
                    elemAnnotList = new ArrayList<>();
                    this.treeAnnotations.put(elem, elemAnnotList);
                }
                SymbolTypeAnnotation __tmp264 = new SymbolTypeAnnotation();
                __tmp264.setSymbolType(MetaLeftShiftExpression.class);
                elemAnnotList.add(__tmp264);
            }
        }
        if (ctx.TGreaterThan() != null)
        {
            for(Object elem: ctx.TGreaterThan())
            {
                elemAnnotList = this.treeAnnotations.get(elem);
                if (elemAnnotList == null)
                {
                    elemAnnotList = new ArrayList<>();
                    this.treeAnnotations.put(elem, elemAnnotList);
                }
                SymbolTypeAnnotation __tmp265 = new SymbolTypeAnnotation();
                __tmp265.setSymbolType(MetaRightShiftExpression.class);
                elemAnnotList.add(__tmp265);
            }
        }
        this.handleSymbolType(ctx);
        return super.visitShiftOperator(ctx);
    }
    
    @Override
    public Object visitComparisonOperator(MetaModelParser.ComparisonOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TLessThan() != null)
        {
            Object elem = ctx.TLessThan();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp266 = new SymbolTypeAnnotation();
            __tmp266.setSymbolType(MetaLessThanExpression.class);
            elemAnnotList.add(__tmp266);
        }
        if (ctx.TGreaterThan() != null)
        {
            Object elem = ctx.TGreaterThan();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp267 = new SymbolTypeAnnotation();
            __tmp267.setSymbolType(MetaGreaterThanExpression.class);
            elemAnnotList.add(__tmp267);
        }
        if (ctx.TLessThanOrEqual() != null)
        {
            Object elem = ctx.TLessThanOrEqual();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp268 = new SymbolTypeAnnotation();
            __tmp268.setSymbolType(MetaLessThanOrEqualExpression.class);
            elemAnnotList.add(__tmp268);
        }
        if (ctx.TGreaterThanOrEqual() != null)
        {
            Object elem = ctx.TGreaterThanOrEqual();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp269 = new SymbolTypeAnnotation();
            __tmp269.setSymbolType(MetaGreaterThanOrEqualExpression.class);
            elemAnnotList.add(__tmp269);
        }
        this.handleSymbolType(ctx);
        return super.visitComparisonOperator(ctx);
    }
    
    @Override
    public Object visitEqualityOperator(MetaModelParser.EqualityOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TEqual() != null)
        {
            Object elem = ctx.TEqual();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp270 = new SymbolTypeAnnotation();
            __tmp270.setSymbolType(MetaEqualExpression.class);
            elemAnnotList.add(__tmp270);
        }
        if (ctx.TNotEqual() != null)
        {
            Object elem = ctx.TNotEqual();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp271 = new SymbolTypeAnnotation();
            __tmp271.setSymbolType(MetaNotEqualExpression.class);
            elemAnnotList.add(__tmp271);
        }
        this.handleSymbolType(ctx);
        return super.visitEqualityOperator(ctx);
    }
    
    @Override
    public Object visitAssignmentOperator(MetaModelParser.AssignmentOperatorContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.TAssign() != null)
        {
            Object elem = ctx.TAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp272 = new SymbolTypeAnnotation();
            __tmp272.setSymbolType(MetaAssignExpression.class);
            elemAnnotList.add(__tmp272);
        }
        if (ctx.TAsteriskAssign() != null)
        {
            Object elem = ctx.TAsteriskAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp273 = new SymbolTypeAnnotation();
            __tmp273.setSymbolType(MetaMultiplyAssignExpression.class);
            elemAnnotList.add(__tmp273);
        }
        if (ctx.TSlashAssign() != null)
        {
            Object elem = ctx.TSlashAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp274 = new SymbolTypeAnnotation();
            __tmp274.setSymbolType(MetaDivideAssignExpression.class);
            elemAnnotList.add(__tmp274);
        }
        if (ctx.TPercentAssign() != null)
        {
            Object elem = ctx.TPercentAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp275 = new SymbolTypeAnnotation();
            __tmp275.setSymbolType(MetaModuloAssignExpression.class);
            elemAnnotList.add(__tmp275);
        }
        if (ctx.TPlusAssign() != null)
        {
            Object elem = ctx.TPlusAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp276 = new SymbolTypeAnnotation();
            __tmp276.setSymbolType(MetaAddAssignExpression.class);
            elemAnnotList.add(__tmp276);
        }
        if (ctx.TMinusAssign() != null)
        {
            Object elem = ctx.TMinusAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp277 = new SymbolTypeAnnotation();
            __tmp277.setSymbolType(MetaSubtractAssignExpression.class);
            elemAnnotList.add(__tmp277);
        }
        if (ctx.TLeftShiftAssign() != null)
        {
            Object elem = ctx.TLeftShiftAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp278 = new SymbolTypeAnnotation();
            __tmp278.setSymbolType(MetaLeftShiftAssignExpression.class);
            elemAnnotList.add(__tmp278);
        }
        if (ctx.TRightShiftAssign() != null)
        {
            Object elem = ctx.TRightShiftAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp279 = new SymbolTypeAnnotation();
            __tmp279.setSymbolType(MetaRightShiftAssignExpression.class);
            elemAnnotList.add(__tmp279);
        }
        if (ctx.TAmpersandAssign() != null)
        {
            Object elem = ctx.TAmpersandAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp280 = new SymbolTypeAnnotation();
            __tmp280.setSymbolType(MetaAndAssignExpression.class);
            elemAnnotList.add(__tmp280);
        }
        if (ctx.THatAssign() != null)
        {
            Object elem = ctx.THatAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp281 = new SymbolTypeAnnotation();
            __tmp281.setSymbolType(MetaExclusiveOrAssignExpression.class);
            elemAnnotList.add(__tmp281);
        }
        if (ctx.TBarAssign() != null)
        {
            Object elem = ctx.TBarAssign();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            SymbolTypeAnnotation __tmp282 = new SymbolTypeAnnotation();
            __tmp282.setSymbolType(MetaOrAssignExpression.class);
            elemAnnotList.add(__tmp282);
        }
        this.handleSymbolType(ctx);
        return super.visitAssignmentOperator(ctx);
    }
    
    @Override
    public Object visitAssociationDeclaration(MetaModelParser.AssociationDeclarationContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.source != null)
        {
            Object elem = ctx.source;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            NameUseAnnotation __tmp283 = new NameUseAnnotation();
            __tmp283.getSymbolTypes().add(MetaProperty.class);
            elemAnnotList.add(__tmp283);
        }
        if (ctx.target != null)
        {
            Object elem = ctx.target;
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            NameUseAnnotation __tmp284 = new NameUseAnnotation();
            __tmp284.getSymbolTypes().add(MetaProperty.class);
            elemAnnotList.add(__tmp284);
        }
        this.handleSymbolType(ctx);
        return super.visitAssociationDeclaration(ctx);
    }
    
    @Override
    public Object visitIdentifier(MetaModelParser.IdentifierContext ctx)
    {
        List<Object> treeAnnotList = this.treeAnnotations.get(ctx);
        if (treeAnnotList == null)
        {
            treeAnnotList = new ArrayList<>();
            this.treeAnnotations.put(ctx, treeAnnotList);
        }
        NameAnnotation __tmp285 = new NameAnnotation();
        treeAnnotList.add(__tmp285);
        IdentifierAnnotation __tmp286 = new IdentifierAnnotation();
        treeAnnotList.add(__tmp286);
        this.handleSymbolType(ctx);
        return super.visitIdentifier(ctx);
    }
    
    @Override
    public Object visitLiteral(MetaModelParser.LiteralContext ctx)
    {
        List<Object> elemAnnotList = null;
        if (ctx.nullLiteral() != null)
        {
            Object elem = ctx.nullLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp287 = new ValueAnnotation();
            elemAnnotList.add(__tmp287);
        }
        if (ctx.booleanLiteral() != null)
        {
            Object elem = ctx.booleanLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp288 = new ValueAnnotation();
            elemAnnotList.add(__tmp288);
        }
        if (ctx.integerLiteral() != null)
        {
            Object elem = ctx.integerLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp289 = new ValueAnnotation();
            elemAnnotList.add(__tmp289);
        }
        if (ctx.decimalLiteral() != null)
        {
            Object elem = ctx.decimalLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp290 = new ValueAnnotation();
            elemAnnotList.add(__tmp290);
        }
        if (ctx.scientificLiteral() != null)
        {
            Object elem = ctx.scientificLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp291 = new ValueAnnotation();
            elemAnnotList.add(__tmp291);
        }
        if (ctx.stringLiteral() != null)
        {
            Object elem = ctx.stringLiteral();
            elemAnnotList = this.treeAnnotations.get(elem);
            if (elemAnnotList == null)
            {
                elemAnnotList = new ArrayList<>();
                this.treeAnnotations.put(elem, elemAnnotList);
            }
            ValueAnnotation __tmp292 = new ValueAnnotation();
            elemAnnotList.add(__tmp292);
        }
        this.handleSymbolType(ctx);
        return super.visitLiteral(ctx);
    }
    
    @Override
    public Object visitNullLiteral(MetaModelParser.NullLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNullLiteral(ctx);
    }
    
    @Override
    public Object visitBooleanLiteral(MetaModelParser.BooleanLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBooleanLiteral(ctx);
    }
    
    @Override
    public Object visitIntegerLiteral(MetaModelParser.IntegerLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIntegerLiteral(ctx);
    }
    
    @Override
    public Object visitDecimalLiteral(MetaModelParser.DecimalLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDecimalLiteral(ctx);
    }
    
    @Override
    public Object visitScientificLiteral(MetaModelParser.ScientificLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitScientificLiteral(ctx);
    }
    
    @Override
    public Object visitStringLiteral(MetaModelParser.StringLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitStringLiteral(ctx);
    }
}

