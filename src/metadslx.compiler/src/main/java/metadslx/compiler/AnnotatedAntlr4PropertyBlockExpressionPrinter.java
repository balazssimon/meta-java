package metadslx.compiler;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.compiler.AnnotatedAntlr4PropertiesParser.ExpressionContext;
import metadslx.compiler.AnnotatedAntlr4PropertiesParser.FunctionCallContext;
import metadslx.compiler.AnnotatedAntlr4PropertiesParser.LiteralContext;
import metadslx.compiler.AnnotatedAntlr4PropertiesParser.PropertyAssignmentContext;
import metadslx.compiler.AnnotatedAntlr4PropertiesParser.PropertySelectorContext;
import metadslx.compiler.AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext;
import metadslx.compiler.Antlr4AnnotationVisitor.ParserRuleElement;

class AnnotatedAntlr4PropertyBlockExpressionPrinter extends AnnotatedAntlr4PropertiesParserBaseVisitor<Object> {
	private Antlr4AnnotationVisitor output;
	private Antlr4AnnotationVisitor.ParserRule parserRule;
	private int startLine;
	private int startPos;
	
	public AnnotatedAntlr4PropertyBlockExpressionPrinter(Antlr4AnnotationVisitor output) {
		this.output = output;
	}

	public Antlr4AnnotationVisitor.ParserRule getParserRule() {
		return parserRule;
	}

	public void setParserRule(Antlr4AnnotationVisitor.ParserRule parserRule) {
		this.parserRule = parserRule;
	}

	public int getStartLine() {
		return startLine;
	}

	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public Antlr4AnnotationVisitor getOutput() {
		return output;
	}
	
    private Antlr4TextSpan getAntlr4TextSpan(ParseTree node)
    {
        Antlr4TextSpan antlr4TextSpan = new Antlr4TextSpan(node);
        antlr4TextSpan = new Antlr4TextSpan(
            this.startLine + antlr4TextSpan.getStartLine() - 1,
            antlr4TextSpan.getStartLine() == 1 ? this.startPos + antlr4TextSpan.getStartPosition() - 1 : antlr4TextSpan.getStartPosition(),
            this.startLine + antlr4TextSpan.getEndLine() - 1,
            antlr4TextSpan.getEndLine() == 1 ? this.startPos + antlr4TextSpan.getEndPosition() - 1 : antlr4TextSpan.getEndPosition()
            );
        return antlr4TextSpan;
    }

    private ParserRuleElement getElement(String name)
    {
        for (ParserRuleElement elem: this.parserRule.getElements())
        {
            if (name.equals(elem.getName()))
            {
                return elem;
            }
        }
        return null;
    }
    
    @Override
    public Object visitPropertyAssignment(PropertyAssignmentContext ctx) {
        AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext qprop = ctx.qualifiedProperty();
        int selectorCount = 0;
        List<AnnotatedAntlr4PropertiesParser.PropertySelectorContext> propSels = qprop.propertySelector();
        for (PropertySelectorContext propSel: propSels)
        {
            if (propSel.selector != null)
            {
                ++selectorCount;
            }
        }
        if (selectorCount > 1)
        {
            output.getCompiler().getDiagnostics().addError("The property reference cannot have multiple indexers.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(qprop), false);
            return null;
        }
        boolean started = false;
        boolean closeFunction = false;
        int closeScopes = 0;
        if (qprop.scope != null)
        {
            String scopeName = qprop.scope.getText();
            if (scopeName == "global")
            {
                String text = qprop.getText();
                output.write(text.substring(8));
                output.write(" = ");
                started = true;
            }
            else
            {
                output.getCompiler().getDiagnostics().addError("Unknown scope.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(propSels.get(0).name), false);
            }
        }
        else if (propSels.size() == 2)
        {
            String elemName = propSels.get(0).name.getText();
            String propName = propSels.get(1).name.getText();
            ParserRuleElement elem = this.getElement(elemName);
            if (elem != null)
            {
                if (selectorCount == 1)
                {
                    if (propSels.get(0).selector != null)
                    {
                        String selName = propSels.get(0).selector.getText();
                        output.writeLine("for (int curr = 0; curr < ctx.{0}.Length; ++curr)", elem.getAccessorName());
                        output.writeLine("{");
                        output.incIndent();
                        output.writeLine("int first = 0;");
                        output.writeLine("int last = ctx.{0}.Length - 1;", elem.getAccessorName());
                        output.writeLine("int prev = curr - 1;");
                        output.writeLine("int next = curr + 1;");
                        output.writeLine("if ({0} >= first && {0} <= last)", selName);
                        output.writeLine("{");
                        output.incIndent();
                        output.writeIndent();
                        output.write("this.SetValue(ctx.{0}[{2}], \"{1}\", new Lazy<object>(() => ", elem.getAccessorName(), propName, selName);
                        closeScopes = 2;
                    }
                    else if (propSels.get(1).selector != null)
                    {
                        output.getCompiler().getDiagnostics().addError("Invalid selector.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(propSels.get(1).selector), true);
                    }
                    else
                    {
                        output.getCompiler().getDiagnostics().addError("Invalid selector.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(qprop), true);
                    }
                }
                else
                {
                    output.writeIndent();
                    output.write("this.SetValue(ctx.{0}, \"{1}\", new Lazy<object>(() => ", elem.getAccessorName(), propName);
                }
                started = true;
                closeFunction = true;
            }
            else if (elemName == "this")
            {
                if (propSels.get(1).selector != null)
                {
                    output.getCompiler().getDiagnostics().addError("Invalid selector.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(propSels.get(1).selector), true);
                }
                else
                {
                    output.writeIndent();
                    output.write("this.SetValue(ctx, \"{0}\", new Lazy<object>(() => ", propName);
                }
                started = true;
                closeFunction = true;
            }
            else
            {
                output.getCompiler().getDiagnostics().addError("Unknown property ctx.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(propSels.get(0).name), false);
            }
        }
        else if (propSels.size() == 1)
        {
            String elemName = propSels.get(0).name.getText();
            ParserRuleElement elem = this.getElement(elemName);
            if (elem != null)
            {
                output.getCompiler().getDiagnostics().addError("Cannot assign a value to an element.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(propSels.get(0).name), false);
            }
            else
            {
                String propName = elemName;
                if (propSels.get(0).selector != null)
                {
                    String selName = propSels.get(0).selector.getText();
                    output.writeIndent();
                    output.write("this.SetValue(ctx, \"{0}\", {1}, new Lazy<object>(() => ", propName, selName);
                }
                else
                {
                    output.writeIndent();
                    output.write("this.SetValue(ctx, \"{0}\", new Lazy<object>(() => ", propName);
                }
            }
            started = true;
            closeFunction = true;
        }
        else
        {
            output.getCompiler().getDiagnostics().addError("Cannot assign a property indirectly.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(qprop), false);
        }
        super.visitExpression(ctx.expression());
        if (closeFunction)
        {
            output.write("))");
        }
        if (started)
        {
            output.write(";");
            output.appendLine();
        }
        for (int i = 0; i < closeScopes; ++i)
        {
            output.decIndent();
            output.writeLine("}");
        }
        return null;
    }
    
    @Override
    public Object visitLiteral(LiteralContext ctx) {
        String value = ctx.getText();
        output.write(output.toValue(value, false));
        return null;
    }
    
    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {
        String name = output.toPascalCase(ctx.identifier().getText());
        output.write("this.{0}(", name);
        if (ctx.expressionList() != null)
        {
            String delim = "";
            for (ExpressionContext expr: ctx.expressionList().expression())
            {
                output.write(delim);
                super.visit(expr);
                delim = ", ";
            }
        }
        output.write(")");
        return null;
    }
    
    @Override
    public Object visitQualifiedProperty(QualifiedPropertyContext ctx) {
        AnnotatedAntlr4PropertiesParser.QualifiedPropertyContext qprop = ctx;
        int selectorCount = 0;
        List<AnnotatedAntlr4PropertiesParser.PropertySelectorContext> propSels = qprop.propertySelector();
        for (PropertySelectorContext propSel: propSels)
        {
            if (propSel.selector != null)
            {
                ++selectorCount;
            }
        }
        if (selectorCount > 1)
        {
            output.getCompiler().getDiagnostics().addError("The property reference cannot have multiple indexers.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(qprop), false);
            return null;
        }
        if (qprop.scope != null)
        {
            String scopeName = qprop.scope.getText();
            if (scopeName == "global")
            {
                String text = qprop.getText();
                output.write(text.substring(8));
            }
            else
            {
                output.getCompiler().getDiagnostics().addError("Unknown scope.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(propSels.get(0).name), false);
            }
        }
        else if (propSels.size() > 0)
        {
            String elemName = propSels.get(0).name.getText();
            ParserRuleElement elem = this.getElement(elemName);
            int minI = 0;
            if (elem != null)
            {
                minI = 1;
            }
            else if (elemName == "this")
            {
                minI = 1;
            }
            else
            {
                minI = 0;
            }
            for (int i = minI; i < propSels.size(); ++i)
            {
                String propName = propSels.get(i).name.getText();
                output.write("this.GetValue(");
            }
            if (minI >= propSels.size())
            {
                // TODO
                output.write("this.Symbol(");
            }
            if (elem != null)
            {
                if (propSels.get(0).selector != null)
                {
                    String selName = propSels.get(0).selector.getText();
                    output.write("ctx.{0}[{1}]", elem.getAccessorName(), selName);
                }
                else
                {
                    output.write("ctx.{0}", elem.getAccessorName());
                }
            }
            else
            {
                output.write("ctx");
            }
            if (minI >= propSels.size())
            {
                output.write(")");
            }
            for (int i = minI; i < propSels.size(); ++i)
            {
                String propName = propSels.get(i).name.getText();
                if (propSels.get(i).selector != null)
                {
                    String selName = propSels.get(i).selector.getText();
                    output.write(", \"{0}\", {1})", propName, selName);
                }
                else
                {
                    output.write(", \"{0}\")", propName);
                }
            }
        }
        else
        {
            output.getCompiler().getDiagnostics().addError("Unknown property context.", output.getCompiler().getFileName(), this.getAntlr4TextSpan(qprop), false);
        }
        return null;
    }
}
