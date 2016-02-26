package metadslx.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import metadslx.core.ModelObject;
import metadslx.core.TextSpan;

import metadslx.core.*;


@SuppressWarnings("unused")
public abstract class MetaModelCompilerBase extends MetaCompiler
{
    public MetaModelCompilerBase(String source, String fileName)
    {
        super(source, fileName);
    }
    
    @Override
    protected void doCompile()
    {
        ANTLRInputStream inputStream = new ANTLRInputStream(this.getSource());
        this.lexer = new MetaModelLexer(inputStream);
        this.lexer.addErrorListener(this);
        this.setCommonTokenStream(new CommonTokenStream(this.lexer));
        this.parser = new MetaModelParser(this.getCommonTokenStream());
        this.parser.addErrorListener(this);
        this.parseTree = this.parser.main();
        MetaModelParserAnnotator annotator = new MetaModelParserAnnotator();
        annotator.visit(this.parseTree);
        this.setLexerAnnotations(annotator.getLexerAnnotations());
        this.setParserAnnotations(annotator.getParserAnnotations());
        this.setModeAnnotations(annotator.getModeAnnotations());
        this.setTokenAnnotations(annotator.getTokenAnnotations());
        this.setRuleAnnotations(annotator.getRuleAnnotations());
        this.setTreeAnnotations(annotator.getTreeAnnotations());
        MetaCompilerDefinitionPhase definitionPhase = new MetaCompilerDefinitionPhase(this);
        definitionPhase.visitNode(this.parseTree);
        MetaCompilerMergePhase mergePhase = new MetaCompilerMergePhase(this);
        mergePhase.visitNode(this.parseTree);
        MetaCompilerReferencePhase referencePhase = new MetaCompilerReferencePhase(this);
        referencePhase.visitNode(this.parseTree);
        MetaModelParserPropertyEvaluator propertyEvaluator = new MetaModelParserPropertyEvaluator(this);
        propertyEvaluator.visit(this.parseTree);
        
        this.getModel().evalLazyValues();
        for (ModelObject symbol: this.getData().getSymbols())
        {
            if (symbol.mHasUninitializedValue())
            {
                this.getDiagnostics().addError("The symbol '" + symbol + "' has uninitialized lazy values.", this.getFileName(), this.getNameProvider().getSymbolTextSpans(symbol), true);
            }
        }
    }
    
    private MetaModelParser.MainContext parseTree;
    private MetaModelLexer lexer;
    private MetaModelParser parser;
    public MetaModelParser.MainContext getParseTree() { return this.parseTree; }
    public MetaModelLexer getLexer() { return this.lexer; }
    public MetaModelParser getParser() { return this.parser; }
}

