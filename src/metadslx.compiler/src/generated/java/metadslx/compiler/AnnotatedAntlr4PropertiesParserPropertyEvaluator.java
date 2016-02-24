package metadslx.compiler;

import metadslx.core.Lazy;


class AnnotatedAntlr4PropertiesParserPropertyEvaluator extends MetaCompilerPropertyEvaluator implements AnnotatedAntlr4PropertiesParserVisitor<Object>
{
    public AnnotatedAntlr4PropertiesParserPropertyEvaluator(MetaCompiler compiler)
    {
            super(compiler);
    }
    
    public Object visitPropertiesBlock(AnnotatedAntlr4PropertiesParser.PropertiesBlockContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPropertyAssignment(AnnotatedAntlr4PropertiesParser.PropertyAssignmentContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitQualifiedProperty(AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitPropertySelector(AnnotatedAntlr4PropertiesParser.PropertySelectorContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpressionList(AnnotatedAntlr4PropertiesParser.ExpressionListContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitExpression(AnnotatedAntlr4PropertiesParser.ExpressionContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitFunctionCall(AnnotatedAntlr4PropertiesParser.FunctionCallContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitLiteral(AnnotatedAntlr4PropertiesParser.LiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitIdentifier(AnnotatedAntlr4PropertiesParser.IdentifierContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitBooleanLiteral(AnnotatedAntlr4PropertiesParser.BooleanLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
    
    public Object visitNullLiteral(AnnotatedAntlr4PropertiesParser.NullLiteralContext ctx)
    {
        return this.visitChildren(ctx);
    }
}

