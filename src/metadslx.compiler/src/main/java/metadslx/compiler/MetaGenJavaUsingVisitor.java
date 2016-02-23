package metadslx.compiler;

import metadslx.compiler.MetaGeneratorParser.MainContext;
import metadslx.compiler.MetaGeneratorParser.UsingNamespaceDeclarationContext;

class MetaGenJavaUsingVisitor extends MetaGenVisitor {
	public MetaGenJavaUsingVisitor(StringBuilder sb) {
		super(sb);
	}
	
	@Override
	public void close() {
		this.writeLine();
	}
	
	@Override
	public Object visitMain(MainContext ctx) {
		writeLine("import java.text.MessageFormat;");
		writeLine("import java.io.BufferedReader;");
		writeLine("import java.io.ByteArrayInputStream;");
		writeLine("import java.io.InputStreamReader;");
		writeLine("import java.io.UnsupportedEncodingException;");
		writeLine("import java.util.ArrayList;");
		writeLine("import java.util.stream.Stream;");
		this.visitChildren(ctx);
		return null;
	}
	
	@Override
	public Object visitUsingNamespaceDeclaration(UsingNamespaceDeclarationContext ctx) {
		writeLine("import {0}; {1}", ctx.qualifiedName().getText(), this.toComment(ctx));
		return null;
	}
}
