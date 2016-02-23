package metadslx.compiler;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.compiler.MetaGeneratorParser.ConfigDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.ConfigPropertyGroupDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.DefaultValueExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ElseIfStatementContext;
import metadslx.compiler.MetaGeneratorParser.ExpressionListContext;
import metadslx.compiler.MetaGeneratorParser.ExpressionStatementContext;
import metadslx.compiler.MetaGeneratorParser.FunctionDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.FunctionSignatureContext;
import metadslx.compiler.MetaGeneratorParser.GeneratorDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.IfStatementBeginContext;
import metadslx.compiler.MetaGeneratorParser.IfStatementElseContext;
import metadslx.compiler.MetaGeneratorParser.IfStatementEndContext;
import metadslx.compiler.MetaGeneratorParser.LiteralContext;
import metadslx.compiler.MetaGeneratorParser.NewObjectOrCollectionWithConstructorExpressionContext;
import metadslx.compiler.MetaGeneratorParser.ParamListContext;
import metadslx.compiler.MetaGeneratorParser.ParameterContext;
import metadslx.compiler.MetaGeneratorParser.QualifiedNameContext;
import metadslx.compiler.MetaGeneratorParser.ReturnStatementContext;
import metadslx.compiler.MetaGeneratorParser.TemplateDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.TemplateSignatureContext;
import metadslx.compiler.MetaGeneratorParser.ThisExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeofTypeExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeofUnboundTypeExpressionContext;
import metadslx.compiler.MetaGeneratorParser.TypeofVoidExpressionContext;
import metadslx.compiler.MetaGeneratorParser.UsingGeneratorDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.VariableDeclarationStatementContext;

class MetaGenJavaClassVisitor extends MetaGenVisitor {
	private int tmpCounter = 0;
	private ArrayList<SwitchInfo> switchStack = new ArrayList<>();
	
	public MetaGenJavaClassVisitor(StringBuilder sb) {
		super(sb);
	}
	
	private String escapeText(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch: text.toCharArray())
        {
            if (ch == '"' || ch == '\\') sb.append("\\" + ch);
            else sb.append(ch);
        }
        return sb.toString();
	}
	
	private String newTmp() {
		++tmpCounter;
		return "__tmp" + tmpCounter;
	}
	
	@Override
	public void close() {
        writeLine("private static class StringBuilder");
        writeLine("{");
        incIndent();
        writeLine("private boolean newLine;");
        writeLine("private java.lang.StringBuilder builder = new java.lang.StringBuilder();");
        writeLine("");
        writeLine("public StringBuilder()");
        writeLine("{");
        incIndent();
        writeLine("this.newLine = true;");
        decIndent();
        writeLine("}");
        writeLine("");
        writeLine("public void append(String str)");
        writeLine("{");
        incIndent();
        writeLine("if (str == null) return;");
        writeLine("if (!\"\".equals(str))");
        writeLine("{");
        incIndent();
        writeLine("this.newLine = false;");
        decIndent();
        writeLine("}");
        writeLine("builder.append(str);");
        decIndent();
        writeLine("}");
        writeLine("");
        writeLine("public void append(Object obj)");
        writeLine("{");
        incIndent();
        writeLine("if (obj == null) return;");
        writeLine("string text = obj.toString();");
        writeLine("this.append(text);");
        decIndent();
        writeLine("}");
        writeLine("");
        writeLine("public void appendLine()");
        writeLine("{");
        incIndent();
        writeLine("this.appendLine(false);");
        decIndent();
        writeLine("}");
        writeLine("");
        writeLine("public void appendLine(boolean force)");
        writeLine("{");
        incIndent();
        writeLine("if (force || !this.newLine)");
        writeLine("{");
        incIndent();
        writeLine("builder.append(\"\\n\");");
        writeLine("this.newLine = true;");
        decIndent();
        writeLine("}");
        decIndent();
        writeLine("}");
        writeLine("");
        writeLine("@Override");
        writeLine("public String toString()");
        writeLine("{");
        incIndent();
        writeLine("return builder.toString();");
        decIndent();
        writeLine("}");
        decIndent();
        writeLine("}");
        decIndent();
        writeLine("}");
        decIndent();
        writeLine("}");
	}
	
	@Override
	public Object visitGeneratorDeclaration(GeneratorDeclarationContext ctx) {
        String name = ctx.identifier().getText();
        writeLine("public class {0} {1}", name, toComment(ctx));
        writeLine("{");
        incIndent();
        String instancesType = "object";
        if (ctx.typeReference() != null)
        {
            instancesType = ctx.typeReference().getText();
        }
        writeLine("private {0} Instances; {1}", instancesType, toComment(ctx));
        appendLine();
        writeLine("public {0}() {1}", name, toComment(ctx));
        writeLine("{");
        incIndent();
        ConfigDeclarationContext config = ((MetaGeneratorParser.MainContext)ctx.parent).configDeclaration();
        if (config != null)
        {
            String propertiesName = "Properties";
            if (config.identifier() != null) propertiesName = config.identifier().getText();
            writeLine("this.{0} = new __{0}();", propertiesName);
        }
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("public {0}({1} instances) {2}", name, instancesType, toComment(ctx));
        writeLine("{");
        incIndent();
        writeLine("this();");
        writeLine("this.Instances = instances;");
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("private static BufferedReader __toReader(String text) {");
        incIndent();
        writeLine("String enc = \"UTF-8\";");
        writeLine("byte[] bytes = null;");
        writeLine("try {");
        incIndent();
        writeLine("if (text != null) {");
        incIndent();
        writeLine("bytes = text.getBytes(enc);");
        decIndent();
        writeLine("}");
        decIndent();
        writeLine("} catch (UnsupportedEncodingException e) {");
        incIndent();
        writeLine("bytes = null;");
        decIndent();
        writeLine("}");
        writeLine("if (bytes == null) {");
        incIndent();
        writeLine("bytes = new byte[0];");
        decIndent();
        writeLine("}");
        writeLine("try {");
        incIndent();
        writeLine("return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes), enc));");
        decIndent();
        writeLine("} catch (UnsupportedEncodingException e) {");
        incIndent();
        writeLine("return null;");
        decIndent();
        writeLine("}");
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("private static <T> Stream<T> __enumerate(T item) {");
        incIndent();
        writeLine("ArrayList<T> result = new ArrayList<>();");
        writeLine("result.add(item);");
        writeLine("return result.stream();");
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("private static <T> Stream<T> __enumerate(Iterable<T> items) {");
        incIndent();
        writeLine("ArrayList<T> result = new ArrayList<>();");
        writeLine("for (T item: items) {");
        incIndent();
        writeLine("result.add(item);");
        decIndent();
        writeLine("}");
        writeLine("return result.stream();");
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("private int counter = 0;");
        writeLine("private int nextCounter() {");
        incIndent();
        writeLine("return ++counter;");
        decIndent();
        writeLine("}");
        appendLine();
        return null;
	}
	
	@Override
	public Object visitUsingGeneratorDeclaration(UsingGeneratorDeclarationContext ctx) {
        QualifiedNameContext qn = ctx.qualifiedName();
        String type = qn.getText();
        String name = "";
        if (ctx.identifier() == null) {
            name = qn.children.get(qn.children.size() - 1).getText();
        }
        else {
            name = ctx.identifier().getText();
        }
        writeLine("private {0} {1} = new {0}(); {2}", type, name, toComment(ctx));
        appendLine();
        return null;
    }
	
	@Override
	public Object visitConfigDeclaration(ConfigDeclarationContext ctx) {
        String name = "Properties";
        if (ctx.identifier() != null) name = ctx.identifier().getText();
        writeLine("private __{0} {1}; {2}", name, toCamelCase(name), toComment(ctx));
        writeLine("public __{0} get{0}() {1} {2}", name, "{", toComment(ctx));
        incIndent();
        writeLine("return {0};", toCamelCase(name));
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("public static class __{0} {1} {2}", name, "{", toComment(ctx));
        incIndent();
        writeLine("private __{0}() {", name);
        incIndent();
        for (ParseTree child: ctx.children)
        {
            if (child instanceof MetaGeneratorParser.ConfigPropertyDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyDeclarationContext)child;
                if (prop.expression() != null)
                {
                    writeIndent();
                    write("this.{0} = ", prop.identifier().getText());
                    visit(prop.expression());
                    write("; {0}", toComment(prop.expression()));
                    appendLine();
                }
            }
            if (child instanceof MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyGroupDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)child;
                writeLine("this.{0} = new __{0}();", prop.identifier().getText());
            }
        }
        decIndent();
        writeLine("}");
        for (ParseTree child: ctx.children)
        {
            if (child instanceof MetaGeneratorParser.ConfigPropertyDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyDeclarationContext)child;
                writeLine("public {0} {1} {2} get; set; {3} {4}", prop.typeReference().getText(), prop.identifier().getText(), "{", "}", toComment(prop));
                writeLine("private {0} {1}; {2}", prop.typeReference().getText(), toCamelCase(prop.identifier().getText()), toComment(ctx));
                writeLine("public {0} get{1}() {2} {3}", prop.typeReference().getText(), prop.identifier().getText(), "{", toComment(ctx));
                incIndent();
                writeLine("return {0};", toCamelCase(prop.identifier().getText()));
                decIndent();
                writeLine("}");
                writeLine("public void set{1}({0} {2}) {3} {4}", prop.typeReference().getText(), prop.identifier().getText(), toCamelCase(prop.identifier().getText()), "{", toComment(ctx));
                incIndent();
                writeLine("this.{0} = {0};", toCamelCase(prop.identifier().getText()));
                decIndent();
                writeLine("}");
                appendLine();
            }
            if (child instanceof MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyGroupDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)child;
                writeLine("private __{0} {1}; {2}", prop.identifier().getText(), toCamelCase(prop.identifier().getText()), toComment(prop));
                writeLine("public __{0} get{0}() {1} {2}", prop.identifier().getText(), "{", toComment(prop));
                incIndent();
                writeLine("return {0};", toCamelCase(prop.identifier().getText()));
                decIndent();
                writeLine("}");
                appendLine();
            }
        }
        decIndent();
        writeLine("}");
        appendLine();
        for (ParseTree child: ctx.children)
        {
            if (child instanceof MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyGroupDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)child;
                visit(prop);
            }
        }
        return null;
	}
	
	@Override
	public Object visitConfigPropertyGroupDeclaration(ConfigPropertyGroupDeclarationContext ctx) {
        String name = ctx.identifier().getText();
        writeLine("private __{0} {1}; {2}", name, toCamelCase(name), toComment(ctx));
        writeLine("public __{0} get{0}() {1} {2}", name, "{", toComment(ctx));
        incIndent();
        writeLine("return {0};", toCamelCase(name));
        decIndent();
        writeLine("}");
        appendLine();
        writeLine("public static class __{0} {1} {2}", name, "{", toComment(ctx));
        incIndent();
        writeLine("private __{0}() {", name);
        incIndent();
        for (ParseTree child: ctx.children)
        {
            if (child instanceof MetaGeneratorParser.ConfigPropertyDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyDeclarationContext)child;
                if (prop.expression() != null)
                {
                    writeIndent();
                    write("this.{0} = ", prop.identifier().getText());
                    visit(prop.expression());
                    write("; {0}", toComment(prop.expression()));
                    appendLine();
                }
            }
            if (child instanceof MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyGroupDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)child;
                writeLine("this.{0} = new __{0}();", prop.identifier().getText());
            }
        }
        decIndent();
        writeLine("}");
        for (ParseTree child: ctx.children)
        {
            if (child instanceof MetaGeneratorParser.ConfigPropertyDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyDeclarationContext)child;
                writeLine("public {0} {1} {2} get; set; {3} {4}", prop.typeReference().getText(), prop.identifier().getText(), "{", "}", toComment(prop));
                writeLine("private {0} {1}; {2}", prop.typeReference().getText(), toCamelCase(prop.identifier().getText()), toComment(ctx));
                writeLine("public {0} get{1}() {2} {3}", prop.typeReference().getText(), prop.identifier().getText(), "{", toComment(ctx));
                incIndent();
                writeLine("return {0};", toCamelCase(prop.identifier().getText()));
                decIndent();
                writeLine("}");
                writeLine("public void set{1}({0} {2}) {3} {4}", prop.typeReference().getText(), prop.identifier().getText(), toCamelCase(prop.identifier().getText()), "{", toComment(ctx));
                incIndent();
                writeLine("this.{0} = {0};", toCamelCase(prop.identifier().getText()));
                decIndent();
                writeLine("}");
                appendLine();
            }
            if (child instanceof MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyGroupDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)child;
                writeLine("private __{0} {1}; {2}", prop.identifier().getText(), toCamelCase(prop.identifier().getText()), toComment(prop));
                writeLine("public __{0} get{0}() {1} {2}", prop.identifier().getText(), "{", toComment(prop));
                incIndent();
                writeLine("return {0};", toCamelCase(prop.identifier().getText()));
                decIndent();
                writeLine("}");
                appendLine();
            }
        }
        decIndent();
        writeLine("}");
        appendLine();
        for (ParseTree child: ctx.children)
        {
            if (child instanceof MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)
            {
                MetaGeneratorParser.ConfigPropertyGroupDeclarationContext prop = (MetaGeneratorParser.ConfigPropertyGroupDeclarationContext)child;
                visit(prop);
            }
        }
        return null;
	}
	
	@Override
	public Object visitFunctionDeclaration(FunctionDeclarationContext ctx) {
		visit(ctx.functionSignature());
        incIndent();
        tmpCounter = 0;
        visit(ctx.body());
        decIndent();
        writeLine("}");
        appendLine();
        return null;
	}
	
	@Override
	public Object visitFunctionSignature(FunctionSignatureContext ctx) {
        writeIndent();
        write("public {0} {1}(", ctx.returnType().getText(), ctx.identifier().getText());
        if (ctx.paramList() != null)
        {
            visit(ctx.paramList());
        }
        write(") {0} {1}", "{", toComment(ctx));
        return null;
    }
	
	@Override
	public Object visitTemplateDeclaration(TemplateDeclarationContext ctx) {
        visit(ctx.templateSignature());
        incIndent();
        writeLine("StringBuilder __out = new StringBuilder();");
        tmpCounter = 0;
        visit(ctx.templateBody());
        writeLine("return __out.ToString();");
        decIndent();
        writeLine("}");
        appendLine();
        return null;
    }
	
	@Override
	public Object visitTemplateSignature(TemplateSignatureContext ctx) {
        writeIndent();
        write("public string {0}(", ctx.identifier().getText());
        if (ctx.paramList() != null)
        {
            visit(ctx.paramList());
        }
        write(") {0}", toComment(ctx));
        appendLine();
        return null;
	}
	
	@Override
	public Object visitParamList(ParamListContext ctx) {
        String comma = "";
        for (ParameterContext param: ctx.parameter())
        {
            write(comma);
            visit(param);
            comma = ", ";
        }
        return null;
    }
	
	@Override
	public Object visitVariableDeclarationStatement(VariableDeclarationStatementContext ctx) {
        writeIndent();
        write("{0} {1}", ctx.typeReference().getText(), ctx.identifier().getText());
        if (ctx.expression() != null)
        {
            write(" = ");
            visit(ctx.expression());
        }
        write("; " + toComment(ctx));
        appendLine();
        return null;
    }
	
	@Override
	public Object visitReturnStatement(ReturnStatementContext ctx) {
        writeIndent();
        write("return ");
        visit(ctx.expression());
        write("; " + toComment(ctx));
        appendLine();
        return null;
    }
	
	@Override
	public Object visitExpressionStatement(ExpressionStatementContext ctx) {
        writeIndent();
        visit(ctx.expression());
        write("; " + toComment(ctx));
        appendLine();
        return null;
    }
	
	@Override
	public Object visitIfStatementBegin(IfStatementBeginContext ctx) {
        writeIndent();
        write("if (");
        visit(ctx.expression());
        write(") {" + toComment(ctx));
        appendLine();
        incIndent();
        return null;
	}
	
	@Override
	public Object visitElseIfStatement(ElseIfStatementContext ctx) {
        decIndent();
        writeIndent();
        write("} else if (");
        visit(ctx.expression());
        write(") { " + toComment(ctx));
        appendLine();
        incIndent();
        return null;
	}
	
	@Override
	public Object visitIfStatementElse(IfStatementElseContext ctx) {
        decIndent();
        writeLine("} else {" + toComment(ctx));
        incIndent();
        return null;
	}
	
	@Override
	public Object visitIfStatementEnd(IfStatementEndContext ctx) {
        decIndent();
        writeLine("}");
        return null;
	}
	
	@Override
	public Object visitExpressionList(ExpressionListContext ctx) {
        String comma = "";
        for (ParseTree expr: ctx.children)
        {
            if (expr instanceof MetaGeneratorParser.ExpressionContext)
            {
                write(comma);
                visit(expr);
                comma = ", ";
            }
        }
        return null;
	}
	
	@Override
	public Object visitThisExpression(ThisExpressionContext ctx) {
        write("this");
        return null;
	}
	
	@Override
	public Object visitLiteral(LiteralContext ctx) {
        write(ctx.getText());
        return null;
	}
	
	@Override
	public Object visitTypeofVoidExpression(TypeofVoidExpressionContext ctx) {
        write(ctx.getText());
        return null;
	}
	
	@Override
	public Object visitTypeofUnboundTypeExpression(TypeofUnboundTypeExpressionContext ctx) {
        write(ctx.getText());
        return null;
	}
	
	@Override
	public Object visitTypeofTypeExpression(TypeofTypeExpressionContext ctx) {
        write(ctx.getText());
        return null;
	}
	
	@Override
	public Object visitDefaultValueExpression(DefaultValueExpressionContext ctx) {
        write(ctx.getText());
        return null;
	}
	
	@Override
	public Object visitNewObjectOrCollectionWithConstructorExpression(
			NewObjectOrCollectionWithConstructorExpressionContext ctx) {
        write("new ");
        write(ctx.typeReference().getText());
        write("(");
        if (ctx.expressionList() != null)
        {
            visit(ctx.expressionList());
        }
        write(")");
        /*if (ctx.objectOrCollectionInitializer() != null)
        {
            throw new NotSupportedException();
        }*/
        return null;
	}
}
