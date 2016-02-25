package metadslx.compiler;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import metadslx.core.DefaultTriviaProvider;
import metadslx.core.MetaScopeEntryProperties;
import metadslx.core.ModelObject;

public class Antlr4DefaultTriviaProvider extends DefaultTriviaProvider
{
    private IAntlr4Compiler compiler;
    private int channel;

    public Antlr4DefaultTriviaProvider(IAntlr4Compiler compiler)
    {
    	this(compiler, -1);
    }
    
    public Antlr4DefaultTriviaProvider(IAntlr4Compiler compiler, int channel)
    {
        this.compiler = compiler;
        this.channel = channel;
        this.cleanTrivia = true;
        this.trimTriviaLines = true;
        this.concatTriviaLines = false;
        this.triviaStartTokens = new ArrayList<String>();
        this.triviaEndTokens = new ArrayList<String>();
        this.triviaLineStartTokens = new ArrayList<String>();
        this.triviaLineEndTokens = new ArrayList<String>();
        this.triviaStartTokens.add("///");
        this.triviaStartTokens.add("/**");
        this.triviaStartTokens.add("//");
        this.triviaStartTokens.add("/*");
        this.triviaEndTokens.add("*/");
        this.triviaLineStartTokens.add("*");
    }

    private boolean cleanTrivia;
    private boolean trimTriviaLines;
    private boolean concatTriviaLines;
    private ArrayList<String> triviaStartTokens;
    private ArrayList<String> triviaEndTokens;
    private ArrayList<String> triviaLineStartTokens;
    private ArrayList<String> triviaLineEndTokens;

    protected String cleanTriviaText(String text)
    {
        if (text == null) return text;
        text = text.trim();
        for (String token: this.triviaStartTokens)
        {
            if (text.startsWith(token))
            {
                text = text.substring(token.length());
                break;
            }
        }
        for (String token: this.triviaEndTokens)
        {
            if (text.endsWith(token))
            {
                text = text.substring(0, text.length() - token.length());
                break;
            }
        }
        if (this.trimTriviaLines)
        {
            text = text.trim();
        }
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(text.getBytes()))))
        {
            while(reader.ready())
            {
                String line = reader.readLine();
                if (line != null)
                {
                    for (String token: this.triviaLineStartTokens)
                    {
                        if (line.startsWith(token))
                        {
                            line = line.substring(token.length());
                            break;
                        }
                    }
                    for (String token: this.triviaLineEndTokens)
                    {
                        if (line.endsWith(token))
                        {
                            line = line.substring(0, line.length() - token.length());
                            break;
                        }
                    }
                    if (this.trimTriviaLines)
                    {
                        line = line.trim();
                    }
                    if (this.concatTriviaLines)
                    {
                        if (!"".equals(line.trim()))
                        {
                            if (sb.length() != 0)
                            {
                                sb.append(" ");
                            }
                            sb.append(line);
                        }
                    }
                    else
                    {
                        if (sb.length() != 0)
                        {
                            sb.append("\n");
                        }
                        sb.append(line);
                    }
                }
            }
        } catch (IOException e) {
        	// nop
		}
        String result = sb.toString();
        if ("".equals(result.trim())) return null;
        else return result;
    }

    protected String getTriviaText(List<Token> triviaTokens)
    {
        if (triviaTokens.size() == 0) return null;
        StringBuilder builder = new StringBuilder();
        for (Token token: triviaTokens)
        {
            builder.append(token.getText());
        }
        String triviaText = builder.toString();
        if (this.cleanTrivia)
        {
            triviaText = this.cleanTriviaText(triviaText);
        }
        return triviaText;
    }

    public String getLeadingTrivia(Object node)
    {
        if (node instanceof ParserRuleContext)
        {
            ParserRuleContext context = (ParserRuleContext)node;
            List<Token> triviaTokens = AnnotatedAntlr4Channels.getLeadingTriviaTokens(context.start, this.compiler.getCommonTokenStream(), this.channel);
            return this.getTriviaText(triviaTokens);
        }
        if (node instanceof Token)
        {
            Token token = (Token)node;
            List<Token> triviaTokens = AnnotatedAntlr4Channels.getLeadingTriviaTokens(token, this.compiler.getCommonTokenStream(), this.channel);
            return this.getTriviaText(triviaTokens);
        }
        if (node instanceof ModelObject)
        {
            ModelObject mo = (ModelObject)node;
            Object treeNodesObj = mo.mGet(MetaScopeEntryProperties.SymbolTreeNodesProperty);
            if (treeNodesObj instanceof List<?>) {
                List<?> treeNodes = (List<?>)treeNodesObj;
	            if (treeNodes.size() > 0)
	            {
	                StringBuilder builder = new StringBuilder();
	                for (Object treeNode: treeNodes)
	                {
	                    String trivia = this.getLeadingTrivia(treeNode);
	                    if (trivia != null && !"".equals(trivia.trim()))
	                    {
	                        builder.append(trivia);
	                    }
	                }
	                String result = builder.toString();
                    if (!"".equals(result.trim()))
	                {
	                    return result;
	                }
	            }
            }
        }
        return super.getLeadingTrivia(node);
    }

    public String getTrailingTrivia(Object node)
    {
        if (node instanceof ParserRuleContext)
        {
            ParserRuleContext context = (ParserRuleContext)node;
            List<Token> triviaTokens = AnnotatedAntlr4Channels.getTrailingTriviaTokens(context.stop, this.compiler.getCommonTokenStream(), this.channel);
            return this.getTriviaText(triviaTokens);
        }
        if (node instanceof Token)
        {
            Token token = (Token)node;
            List<Token> triviaTokens = AnnotatedAntlr4Channels.getTrailingTriviaTokens(token, this.compiler.getCommonTokenStream(), this.channel);
            return this.getTriviaText(triviaTokens);
        }
        if (node instanceof ModelObject)
        {
            ModelObject mo = (ModelObject)node;
            Object treeNodesObj = mo.mGet(MetaScopeEntryProperties.SymbolTreeNodesProperty);
            if (treeNodesObj instanceof List<?>) {
                List<?> treeNodes = (List<?>)treeNodesObj;
	            if (treeNodes.size() > 0)
	            {
	                StringBuilder builder = new StringBuilder();
	                for (Object treeNode: treeNodes)
	                {
	                    String trivia = this.getTrailingTrivia(treeNode);
	                    if (trivia != null && !"".equals(trivia.trim()))
	                    {
	                        builder.append(trivia);
	                    }
	                }
	                String result = builder.toString();
                    if (!"".equals(result.trim()))
	                {
	                    return result;
	                }
	            }
            }
        }
        return super.getTrailingTrivia(node);
    }
}

