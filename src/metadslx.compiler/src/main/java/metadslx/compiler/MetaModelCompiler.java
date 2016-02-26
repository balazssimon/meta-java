package metadslx.compiler;

public class MetaModelCompiler extends MetaModelCompilerBase {
    public MetaModelCompiler(String source, String fileName)
    {
    	super(source, fileName);
    	this.getGlobalScope().addMetaBuiltInEntries();
    }
}
