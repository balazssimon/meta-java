package metadslx.compiler;

import metadslx.core.Lazy;


@SuppressWarnings("unused")
class AnnotatedAntlr4ParserPropertyEvaluator extends MetaCompilerPropertyEvaluator implements AnnotatedAntlr4ParserVisitor<Object>
{
    public AnnotatedAntlr4ParserPropertyEvaluator(MetaCompiler compiler)
    {
            super(compiler);
    }
    
    public Object visitGrammarSpec(AnnotatedAntlr4Parser.GrammarSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitGrammarType(AnnotatedAntlr4Parser.GrammarTypeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPrequelConstruct(AnnotatedAntlr4Parser.PrequelConstructContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOptionsSpec(AnnotatedAntlr4Parser.OptionsSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOption(AnnotatedAntlr4Parser.OptionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitOptionValue(AnnotatedAntlr4Parser.OptionValueContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDelegateGrammars(AnnotatedAntlr4Parser.DelegateGrammarsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitDelegateGrammar(AnnotatedAntlr4Parser.DelegateGrammarContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTokensSpec(AnnotatedAntlr4Parser.TokensSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotatedId(AnnotatedAntlr4Parser.AnnotatedIdContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAction(AnnotatedAntlr4Parser.ActionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitActionScopeName(AnnotatedAntlr4Parser.ActionScopeNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitModeSpec(AnnotatedAntlr4Parser.ModeSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRules(AnnotatedAntlr4Parser.RulesContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleSpec(AnnotatedAntlr4Parser.RuleSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitParserRuleSpec(AnnotatedAntlr4Parser.ParserRuleSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExceptionGroup(AnnotatedAntlr4Parser.ExceptionGroupContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExceptionHandler(AnnotatedAntlr4Parser.ExceptionHandlerContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFinallyClause(AnnotatedAntlr4Parser.FinallyClauseContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRulePrequel(AnnotatedAntlr4Parser.RulePrequelContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleReturns(AnnotatedAntlr4Parser.RuleReturnsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitThrowsSpec(AnnotatedAntlr4Parser.ThrowsSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLocalsSpec(AnnotatedAntlr4Parser.LocalsSpecContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleAction(AnnotatedAntlr4Parser.RuleActionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleModifiers(AnnotatedAntlr4Parser.RuleModifiersContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleModifier(AnnotatedAntlr4Parser.RuleModifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleBlock(AnnotatedAntlr4Parser.RuleBlockContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleAltList(AnnotatedAntlr4Parser.RuleAltListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLabeledAlt(AnnotatedAntlr4Parser.LabeledAltContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPropertiesBlock(AnnotatedAntlr4Parser.PropertiesBlockContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerRule(AnnotatedAntlr4Parser.LexerRuleContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerRuleBlock(AnnotatedAntlr4Parser.LexerRuleBlockContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerAltList(AnnotatedAntlr4Parser.LexerAltListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerAlt(AnnotatedAntlr4Parser.LexerAltContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerElements(AnnotatedAntlr4Parser.LexerElementsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerElement(AnnotatedAntlr4Parser.LexerElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLabeledLexerElement(AnnotatedAntlr4Parser.LabeledLexerElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerBlock(AnnotatedAntlr4Parser.LexerBlockContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerCommands(AnnotatedAntlr4Parser.LexerCommandsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerCommand(AnnotatedAntlr4Parser.LexerCommandContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerCommandName(AnnotatedAntlr4Parser.LexerCommandNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerCommandExpr(AnnotatedAntlr4Parser.LexerCommandExprContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAltList(AnnotatedAntlr4Parser.AltListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAlternative(AnnotatedAntlr4Parser.AlternativeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitElement(AnnotatedAntlr4Parser.ElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLabeledElement(AnnotatedAntlr4Parser.LabeledElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEbnf(AnnotatedAntlr4Parser.EbnfContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBlockSuffix(AnnotatedAntlr4Parser.BlockSuffixContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitEbnfSuffix(AnnotatedAntlr4Parser.EbnfSuffixContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLexerAtom(AnnotatedAntlr4Parser.LexerAtomContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAtom(AnnotatedAntlr4Parser.AtomContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNotSet(AnnotatedAntlr4Parser.NotSetContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBlockSet(AnnotatedAntlr4Parser.BlockSetContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitSetElement(AnnotatedAntlr4Parser.SetElementContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBlock(AnnotatedAntlr4Parser.BlockContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRuleref(AnnotatedAntlr4Parser.RulerefContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitRange(AnnotatedAntlr4Parser.RangeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitTerminal(AnnotatedAntlr4Parser.TerminalContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitElementOptions(AnnotatedAntlr4Parser.ElementOptionsContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitElementOption(AnnotatedAntlr4Parser.ElementOptionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitId(AnnotatedAntlr4Parser.IdContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotation(AnnotatedAntlr4Parser.AnnotationContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationBody(AnnotatedAntlr4Parser.AnnotationBodyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationAttributeList(AnnotatedAntlr4Parser.AnnotationAttributeListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitAnnotationAttribute(AnnotatedAntlr4Parser.AnnotationAttributeContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionList(AnnotatedAntlr4Parser.ExpressionListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedName(AnnotatedAntlr4Parser.QualifiedNameContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpression(AnnotatedAntlr4Parser.ExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteral(AnnotatedAntlr4Parser.LiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifier(AnnotatedAntlr4Parser.IdentifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBoolLiteral(AnnotatedAntlr4Parser.BoolLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullLiteral(AnnotatedAntlr4Parser.NullLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
}

