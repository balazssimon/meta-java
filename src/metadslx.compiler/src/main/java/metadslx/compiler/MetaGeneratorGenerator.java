package metadslx.compiler;

public class MetaGeneratorGenerator {
	private boolean generated = false;
	private String generatedSource = null;
	private MetaGeneratorParser.MainContext parseTree;

	public MetaGeneratorGenerator(MetaGeneratorParser.MainContext parseTree) {
		this.parseTree = parseTree;
	}
	
	public MetaGeneratorParser.MainContext getParseTree() {
		return parseTree;
	}
	
	public String getGeneratedSource() {
        if (!this.generated)
        {
            this.generatedSource = this.generate();
            this.generated = true;
        }
        return this.generatedSource;
	}
	
	public String generate() {
        StringBuilder sb = new StringBuilder();
        MetaGenJavaUsingVisitor ul = new MetaGenJavaUsingVisitor(sb);
        ul.visit(this.parseTree);
        ul.close();
        MetaGenJavaClassVisitor cl = new MetaGenJavaClassVisitor(sb);
        cl.setLoops(ul.getLoops());
        cl.setHasLoops(ul.getHasLoops());
        cl.visit(this.parseTree);
        cl.close();
        return sb.toString();
	}
	
}
