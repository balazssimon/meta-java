package metadslx.compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import metadslx.core.DefaultNameProvider;
import metadslx.core.TextSpan;

public class Antlr4DefaultNameProvider extends DefaultNameProvider {
    @Override
    public String getName(Object node)
    {
        if (!(node instanceof ParseTree)) return null;
        ParseTree parseTree = (ParseTree)node;
        String name = parseTree.getText();
        if (name != null && name.startsWith("@")) name = name.substring(1);
        return name;
    }

    @Override
    public Object getValue(Object node, Class<?> type)
    {
        if (!(node instanceof ParseTree)) return null;
        ParseTree parseTree = (ParseTree)node;
        String text = parseTree.getText();
        if (text.length() >= 3 && text.startsWith("@\'") && text.endsWith("\'"))
        {
            return text.substring(2, text.length() - 1).replace("\'\'", "\'");
        }
        else if (text.length() >= 2 && text.startsWith("\'") && text.endsWith("\'"))
        {
        	//TODO
            //return Regex.Unescape(text.substring(1, text.length() - 1));
        	return text;
        }
        else if (text.length() >= 3 && text.startsWith("@\"") && text.endsWith("\""))
        {
            return text.substring(2, text.length() - 1).replace("\"\"", "\"");
        }
        else if (text.length() >= 2 && text.startsWith("\"") && text.endsWith("\""))
        {
        	//TODO
            //return Regex.Unescape(text.substring(1, text.length() - 1));
        	return text;
        }
        return super.getValue(text, type);
    }

    @Override
    public TextSpan getTreeNodeTextSpan(Object node)
    {
        return new Antlr4TextSpan(node);
    }

}
