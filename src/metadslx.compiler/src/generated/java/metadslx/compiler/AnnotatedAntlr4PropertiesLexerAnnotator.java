package metadslx.compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import metadslx.core.IModelCompiler;
import metadslx.core.ModelCompilerContext;
import metadslx.compiler.*;

@SuppressWarnings("unused")
public class AnnotatedAntlr4PropertiesLexerAnnotator
{
    private List<Object> grammarAnnotations = new ArrayList<>();
    private Map<Integer, List<Object>> tokenAnnotations = new HashMap<>();
    private Map<Integer, List<Object>> modeAnnotations = new HashMap<>();
    
    public List<Object> getLexerAnnotations() { return this.grammarAnnotations; }
    public Map<Integer, List<Object>> getTokenAnnotations() { return this.tokenAnnotations; }
    public Map<Integer, List<Object>> getModeAnnotations() { return this.modeAnnotations; }
    
    
    public AnnotatedAntlr4PropertiesLexerAnnotator()
    {
        List<Object> annotList = null;
    }
    
    public Object visitTerminal(TerminalNode node, Map<Object, List<Object>> treeAnnotations)
    {
        Token token = node.getSymbol();
        if (token != null)
        {
            List<Object> annotList = this.tokenAnnotations.get(token.getType());
            if (annotList != null)
            {
                List<Object> treeAnnotList = treeAnnotations.get(node);
                if (treeAnnotList == null)
                {
                    treeAnnotList = new ArrayList<>();
                    treeAnnotations.put(node, treeAnnotList);
                }
                treeAnnotList.addAll(annotList);
            }
        }
        return null;
    }
}

