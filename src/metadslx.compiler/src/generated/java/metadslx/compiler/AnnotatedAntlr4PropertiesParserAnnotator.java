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

@SuppressWarnings("unused")
public class AnnotatedAntlr4PropertiesParserAnnotator extends AnnotatedAntlr4PropertiesParserBaseVisitor<Object>
{
    private AnnotatedAntlr4PropertiesLexerAnnotator lexerAnnotator = new AnnotatedAntlr4PropertiesLexerAnnotator();
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Class<?>, List<Object>> ruleAnnotations = new HashMap<>();
    private Map<Object, List<Object>> treeAnnotations = new HashMap<>();
    
    public List<Object> getParserAnnotations() { return this.grammarAnnotations; }
    public List<Object> getLexerAnnotations() { return this.lexerAnnotator.getLexerAnnotations(); }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.lexerAnnotator.getTokenAnnotations(); }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.lexerAnnotator.getModeAnnotations(); }
    public Map<Class<?>, List<Object>> getRuleAnnotations() { return this.ruleAnnotations; }
    public Map<Object, List<Object>> getTreeAnnotations() { return this.treeAnnotations; }
    
    
    public AnnotatedAntlr4PropertiesParserAnnotator()
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
    public Object visitPropertiesBlock(AnnotatedAntlr4PropertiesParser.PropertiesBlockContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPropertiesBlock(ctx);
    }
    
    @Override
    public Object visitPropertyAssignment(AnnotatedAntlr4PropertiesParser.PropertyAssignmentContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPropertyAssignment(ctx);
    }
    
    @Override
    public Object visitQualifiedProperty(AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitQualifiedProperty(ctx);
    }
    
    @Override
    public Object visitPropertySelector(AnnotatedAntlr4PropertiesParser.PropertySelectorContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPropertySelector(ctx);
    }
    
    @Override
    public Object visitExpressionList(AnnotatedAntlr4PropertiesParser.ExpressionListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionList(ctx);
    }
    
    @Override
    public Object visitExpression(AnnotatedAntlr4PropertiesParser.ExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpression(ctx);
    }
    
    @Override
    public Object visitFunctionCall(AnnotatedAntlr4PropertiesParser.FunctionCallContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitFunctionCall(ctx);
    }
    
    @Override
    public Object visitLiteral(AnnotatedAntlr4PropertiesParser.LiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLiteral(ctx);
    }
    
    @Override
    public Object visitIdentifier(AnnotatedAntlr4PropertiesParser.IdentifierContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifier(ctx);
    }
    
    @Override
    public Object visitBooleanLiteral(AnnotatedAntlr4PropertiesParser.BooleanLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBooleanLiteral(ctx);
    }
    
    @Override
    public Object visitNullLiteral(AnnotatedAntlr4PropertiesParser.NullLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNullLiteral(ctx);
    }
}

