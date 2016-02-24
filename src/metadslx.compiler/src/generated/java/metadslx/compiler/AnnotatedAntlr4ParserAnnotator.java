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

public class AnnotatedAntlr4ParserAnnotator extends AnnotatedAntlr4ParserBaseVisitor<Object>
{
    private AnnotatedAntlr4LexerAnnotator lexerAnnotator = new AnnotatedAntlr4LexerAnnotator();
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Class, List<Object>> ruleAnnotations = new HashMap<>();
    private Map<Object, List<Object>> treeAnnotations = new HashMap<>();
    
    public List<Object> getParserAnnotations() { return this.grammarAnnotations; }
    public List<Object> getLexerAnnotations() { return this.lexerAnnotator.getLexerAnnotations(); }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.lexerAnnotator.getTokenAnnotations(); }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.lexerAnnotator.getModeAnnotations(); }
    public Map<Class, List<Object>> getRuleAnnotations() { return this.ruleAnnotations; }
    public Map<Object, List<Object>> getTreeAnnotations() { return this.treeAnnotations; }
    
    
    public AnnotatedAntlr4ParserAnnotator()
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
    
    private void overrideSymbolType(ParseTree node, Class symbolType)
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
    public Object visitGrammarSpec(AnnotatedAntlr4Parser.GrammarSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitGrammarSpec(ctx);
    }
    
    @Override
    public Object visitGrammarType(AnnotatedAntlr4Parser.GrammarTypeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitGrammarType(ctx);
    }
    
    @Override
    public Object visitPrequelConstruct(AnnotatedAntlr4Parser.PrequelConstructContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPrequelConstruct(ctx);
    }
    
    @Override
    public Object visitOptionsSpec(AnnotatedAntlr4Parser.OptionsSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitOptionsSpec(ctx);
    }
    
    @Override
    public Object visitOption(AnnotatedAntlr4Parser.OptionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitOption(ctx);
    }
    
    @Override
    public Object visitOptionValue(AnnotatedAntlr4Parser.OptionValueContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitOptionValue(ctx);
    }
    
    @Override
    public Object visitDelegateGrammars(AnnotatedAntlr4Parser.DelegateGrammarsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDelegateGrammars(ctx);
    }
    
    @Override
    public Object visitDelegateGrammar(AnnotatedAntlr4Parser.DelegateGrammarContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitDelegateGrammar(ctx);
    }
    
    @Override
    public Object visitTokensSpec(AnnotatedAntlr4Parser.TokensSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTokensSpec(ctx);
    }
    
    @Override
    public Object visitAnnotatedId(AnnotatedAntlr4Parser.AnnotatedIdContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotatedId(ctx);
    }
    
    @Override
    public Object visitAction(AnnotatedAntlr4Parser.ActionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAction(ctx);
    }
    
    @Override
    public Object visitActionScopeName(AnnotatedAntlr4Parser.ActionScopeNameContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitActionScopeName(ctx);
    }
    
    @Override
    public Object visitModeSpec(AnnotatedAntlr4Parser.ModeSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitModeSpec(ctx);
    }
    
    @Override
    public Object visitRules(AnnotatedAntlr4Parser.RulesContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRules(ctx);
    }
    
    @Override
    public Object visitRuleSpec(AnnotatedAntlr4Parser.RuleSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleSpec(ctx);
    }
    
    @Override
    public Object visitParserRuleSpec(AnnotatedAntlr4Parser.ParserRuleSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitParserRuleSpec(ctx);
    }
    
    @Override
    public Object visitExceptionGroup(AnnotatedAntlr4Parser.ExceptionGroupContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExceptionGroup(ctx);
    }
    
    @Override
    public Object visitExceptionHandler(AnnotatedAntlr4Parser.ExceptionHandlerContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExceptionHandler(ctx);
    }
    
    @Override
    public Object visitFinallyClause(AnnotatedAntlr4Parser.FinallyClauseContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitFinallyClause(ctx);
    }
    
    @Override
    public Object visitRulePrequel(AnnotatedAntlr4Parser.RulePrequelContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRulePrequel(ctx);
    }
    
    @Override
    public Object visitRuleReturns(AnnotatedAntlr4Parser.RuleReturnsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleReturns(ctx);
    }
    
    @Override
    public Object visitThrowsSpec(AnnotatedAntlr4Parser.ThrowsSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitThrowsSpec(ctx);
    }
    
    @Override
    public Object visitLocalsSpec(AnnotatedAntlr4Parser.LocalsSpecContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLocalsSpec(ctx);
    }
    
    @Override
    public Object visitRuleAction(AnnotatedAntlr4Parser.RuleActionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleAction(ctx);
    }
    
    @Override
    public Object visitRuleModifiers(AnnotatedAntlr4Parser.RuleModifiersContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleModifiers(ctx);
    }
    
    @Override
    public Object visitRuleModifier(AnnotatedAntlr4Parser.RuleModifierContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleModifier(ctx);
    }
    
    @Override
    public Object visitRuleBlock(AnnotatedAntlr4Parser.RuleBlockContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleBlock(ctx);
    }
    
    @Override
    public Object visitRuleAltList(AnnotatedAntlr4Parser.RuleAltListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleAltList(ctx);
    }
    
    @Override
    public Object visitLabeledAlt(AnnotatedAntlr4Parser.LabeledAltContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLabeledAlt(ctx);
    }
    
    @Override
    public Object visitPropertiesBlock(AnnotatedAntlr4Parser.PropertiesBlockContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitPropertiesBlock(ctx);
    }
    
    @Override
    public Object visitLexerRule(AnnotatedAntlr4Parser.LexerRuleContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerRule(ctx);
    }
    
    @Override
    public Object visitLexerRuleBlock(AnnotatedAntlr4Parser.LexerRuleBlockContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerRuleBlock(ctx);
    }
    
    @Override
    public Object visitLexerAltList(AnnotatedAntlr4Parser.LexerAltListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerAltList(ctx);
    }
    
    @Override
    public Object visitLexerAlt(AnnotatedAntlr4Parser.LexerAltContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerAlt(ctx);
    }
    
    @Override
    public Object visitLexerElements(AnnotatedAntlr4Parser.LexerElementsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerElements(ctx);
    }
    
    @Override
    public Object visitLexerElement(AnnotatedAntlr4Parser.LexerElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerElement(ctx);
    }
    
    @Override
    public Object visitLabeledLexerElement(AnnotatedAntlr4Parser.LabeledLexerElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLabeledLexerElement(ctx);
    }
    
    @Override
    public Object visitLexerBlock(AnnotatedAntlr4Parser.LexerBlockContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerBlock(ctx);
    }
    
    @Override
    public Object visitLexerCommands(AnnotatedAntlr4Parser.LexerCommandsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerCommands(ctx);
    }
    
    @Override
    public Object visitLexerCommand(AnnotatedAntlr4Parser.LexerCommandContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerCommand(ctx);
    }
    
    @Override
    public Object visitLexerCommandName(AnnotatedAntlr4Parser.LexerCommandNameContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerCommandName(ctx);
    }
    
    @Override
    public Object visitLexerCommandExpr(AnnotatedAntlr4Parser.LexerCommandExprContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerCommandExpr(ctx);
    }
    
    @Override
    public Object visitAltList(AnnotatedAntlr4Parser.AltListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAltList(ctx);
    }
    
    @Override
    public Object visitAlternative(AnnotatedAntlr4Parser.AlternativeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAlternative(ctx);
    }
    
    @Override
    public Object visitElement(AnnotatedAntlr4Parser.ElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitElement(ctx);
    }
    
    @Override
    public Object visitLabeledElement(AnnotatedAntlr4Parser.LabeledElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLabeledElement(ctx);
    }
    
    @Override
    public Object visitEbnf(AnnotatedAntlr4Parser.EbnfContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEbnf(ctx);
    }
    
    @Override
    public Object visitBlockSuffix(AnnotatedAntlr4Parser.BlockSuffixContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBlockSuffix(ctx);
    }
    
    @Override
    public Object visitEbnfSuffix(AnnotatedAntlr4Parser.EbnfSuffixContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitEbnfSuffix(ctx);
    }
    
    @Override
    public Object visitLexerAtom(AnnotatedAntlr4Parser.LexerAtomContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLexerAtom(ctx);
    }
    
    @Override
    public Object visitAtom(AnnotatedAntlr4Parser.AtomContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAtom(ctx);
    }
    
    @Override
    public Object visitNotSet(AnnotatedAntlr4Parser.NotSetContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNotSet(ctx);
    }
    
    @Override
    public Object visitBlockSet(AnnotatedAntlr4Parser.BlockSetContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBlockSet(ctx);
    }
    
    @Override
    public Object visitSetElement(AnnotatedAntlr4Parser.SetElementContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitSetElement(ctx);
    }
    
    @Override
    public Object visitBlock(AnnotatedAntlr4Parser.BlockContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBlock(ctx);
    }
    
    @Override
    public Object visitRuleref(AnnotatedAntlr4Parser.RulerefContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRuleref(ctx);
    }
    
    @Override
    public Object visitRange(AnnotatedAntlr4Parser.RangeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitRange(ctx);
    }
    
    @Override
    public Object visitTerminal(AnnotatedAntlr4Parser.TerminalContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitTerminal(ctx);
    }
    
    @Override
    public Object visitElementOptions(AnnotatedAntlr4Parser.ElementOptionsContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitElementOptions(ctx);
    }
    
    @Override
    public Object visitElementOption(AnnotatedAntlr4Parser.ElementOptionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitElementOption(ctx);
    }
    
    @Override
    public Object visitId(AnnotatedAntlr4Parser.IdContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitId(ctx);
    }
    
    @Override
    public Object visitAnnotation(AnnotatedAntlr4Parser.AnnotationContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotation(ctx);
    }
    
    @Override
    public Object visitAnnotationBody(AnnotatedAntlr4Parser.AnnotationBodyContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationBody(ctx);
    }
    
    @Override
    public Object visitAnnotationAttributeList(AnnotatedAntlr4Parser.AnnotationAttributeListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationAttributeList(ctx);
    }
    
    @Override
    public Object visitAnnotationAttribute(AnnotatedAntlr4Parser.AnnotationAttributeContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitAnnotationAttribute(ctx);
    }
    
    @Override
    public Object visitExpressionList(AnnotatedAntlr4Parser.ExpressionListContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpressionList(ctx);
    }
    
    @Override
    public Object visitQualifiedName(AnnotatedAntlr4Parser.QualifiedNameContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitQualifiedName(ctx);
    }
    
    @Override
    public Object visitExpression(AnnotatedAntlr4Parser.ExpressionContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitExpression(ctx);
    }
    
    @Override
    public Object visitLiteral(AnnotatedAntlr4Parser.LiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitLiteral(ctx);
    }
    
    @Override
    public Object visitIdentifier(AnnotatedAntlr4Parser.IdentifierContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitIdentifier(ctx);
    }
    
    @Override
    public Object visitBoolLiteral(AnnotatedAntlr4Parser.BoolLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitBoolLiteral(ctx);
    }
    
    @Override
    public Object visitNullLiteral(AnnotatedAntlr4Parser.NullLiteralContext ctx)
    {
        this.handleSymbolType(ctx);
        return super.visitNullLiteral(ctx);
    }
}

