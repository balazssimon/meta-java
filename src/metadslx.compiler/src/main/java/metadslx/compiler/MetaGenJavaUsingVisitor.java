package metadslx.compiler;

import metadslx.compiler.MetaGeneratorParser.NamespaceDeclarationContext;
import metadslx.compiler.MetaGeneratorParser.UsingNamespaceDeclarationContext;

class MetaGenJavaUsingVisitor extends MetaGenVisitor {
	public MetaGenJavaUsingVisitor(StringBuilder sb) {
		super(sb);
	}

	@Override
	public Object visitNamespaceDeclaration(NamespaceDeclarationContext ctx) {
		String name = ctx.qualifiedName().getText();
		writeLine("package {0}; {1}", name, toComment(ctx));
		appendLine();
		writeLine("import java.io.BufferedReader;");
		writeLine("import java.io.ByteArrayInputStream;");
		writeLine("import java.io.IOException;");
		writeLine("import java.io.InputStreamReader;");
		writeLine("import java.io.UnsupportedEncodingException;");
		writeLine("import java.util.concurrent.atomic.AtomicInteger;");
		writeLine("import java.util.ArrayList;");
		writeLine("import java.util.stream.Stream;");
		visitChildren(ctx);
		return null;
	}

	@Override
	public Object visitUsingNamespaceDeclaration(UsingNamespaceDeclarationContext ctx) {
		writeLine("import {0}; {1}", ctx.qualifiedName().getText(), this.toComment(ctx));
		return null;
	}

}
