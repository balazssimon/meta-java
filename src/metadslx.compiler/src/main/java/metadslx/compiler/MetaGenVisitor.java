package metadslx.compiler;

import java.text.MessageFormat;
import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

class MetaGenVisitor extends MetaGeneratorParserBaseVisitor<Object> {
    private StringBuilder sb;
    private String indent;
    private int loopCounter;
    private HashMap<MetaGeneratorParser.LoopStatementBeginContext, LoopInfo> loops;
    private HashMap<MetaGeneratorParser.HasLoopExpressionContext, LoopInfo> hasLoops;
    
    public MetaGenVisitor(StringBuilder sb) {
        this.sb = sb;
        this.indent = "";
        this.loopCounter = 0;
        this.loops = new HashMap<>();
        this.hasLoops = new HashMap<>();
    }

	public HashMap<MetaGeneratorParser.LoopStatementBeginContext, LoopInfo> getLoops() {
		return loops;
	}

	public void setLoops(HashMap<MetaGeneratorParser.LoopStatementBeginContext, LoopInfo> loops) {
		this.loops = loops;
	}

	public HashMap<MetaGeneratorParser.HasLoopExpressionContext, LoopInfo> getHasLoops() {
		return hasLoops;
	}

	public void setHasLoops(HashMap<MetaGeneratorParser.HasLoopExpressionContext, LoopInfo> hasLoops) {
		this.hasLoops = hasLoops;
	}
    
	protected String toComment(ParserRuleContext prc) {
		if (prc == null || prc.start == null) return "";
        return MessageFormat.format("//{0}:{1}", prc.start.getLine(), prc.start.getCharPositionInLine()+1);
	}
	
	protected void incIndent() {
		indent += "    ";
	}
	
	protected void decIndent() {
		indent = indent.substring(4);
	}
	
	protected void writeIndent() {
		sb.append(indent);
	}

	protected void write(String text) {
		sb.append(text);
	}
	
	protected void write(String format, Object... args) {
		sb.append(MessageFormat.format(format, args));
	}
	
	protected void appendLine() {
		sb.append("\n");
	}

	protected void writeLine(String text) {
		this.writeIndent();
		this.write(text);
		this.appendLine();
	}
	
	protected void writeLine(String format, Object... args) {
		this.writeIndent();
		this.write(MessageFormat.format(format, args));
		this.appendLine();
	}
	
	public void close() {
		
	}
	
	protected String getLoopChainItemName(MetaGeneratorParser.LoopChainExpressionContext context) {
		if (context instanceof MetaGeneratorParser.LoopChainIdentifierExpressionContext)
        {
            return ((MetaGeneratorParser.LoopChainIdentifierExpressionContext)context).identifier().getText();
        }
        if (context instanceof MetaGeneratorParser.LoopChainMemberAccessExpressionContext)
        {
            return ((MetaGeneratorParser.LoopChainMemberAccessExpressionContext)context).identifier().getText();
        }
        if (context instanceof MetaGeneratorParser.LoopChainMethodCallExpressionContext)
        {
            return getLoopChainItemName(((MetaGeneratorParser.LoopChainMethodCallExpressionContext)context).loopChainExpression());
        }
        return null;
	}
	
	@Override
	public Object visitLoopStatementBegin(MetaGeneratorParser.LoopStatementBeginContext context) {
        ++this.loopCounter;
        LoopInfo li = new LoopInfo();
        li.setName("__loop" + this.loopCounter);
        li.setLoop(context);
        int varCounter = 0;
        for (ParseTree child: context.loopChain().children)
        {
            if (child instanceof MetaGeneratorParser.LoopChainItemContext)
            {
            	MetaGeneratorParser.LoopChainItemContext item = (MetaGeneratorParser.LoopChainItemContext)child;
                LoopItemInfo lii = new LoopItemInfo();
                String name = this.getLoopChainItemName(item.loopChainExpression());
                if (item.identifier() != null) name = item.identifier().getText();
                else if (li.getItems().size() == 0)
                {
                    ++varCounter;
                    name = li.getName() + "_var" + varCounter;
                }
                if (name == null)
                {
                    ++varCounter;
                    name = li.getName() + "_var" + varCounter;
                }
                lii.setName(name);
                String type = "Object";
                if (item.typeReference() != null) type = item.typeReference().getText();
                lii.setType(type);
                lii.setChainItem(item);
                li.getItems().add(lii);
            }
        }
        this.getLoops().put(context, li);
        return null;
	}
	
	@Override
	public Object visitHasLoopExpression(MetaGeneratorParser.HasLoopExpressionContext context) {
        ++this.loopCounter;
        LoopInfo li = new LoopInfo();
        li.setName("__loop" + this.loopCounter);
        li.setHasLoop(context);
        int varCounter = 0;
        for (ParseTree child: context.loopChain().children)
        {
            if (child instanceof MetaGeneratorParser.LoopChainItemContext)
            {
            	MetaGeneratorParser.LoopChainItemContext item = (MetaGeneratorParser.LoopChainItemContext)child;
                LoopItemInfo lii = new LoopItemInfo();
                String name = this.getLoopChainItemName(item.loopChainExpression());
                if (item.identifier() != null) name = item.identifier().getText();
                else if (li.getItems().size() == 0)
                {
                    ++varCounter;
                    name = li.getName() + "_var" + varCounter;
                }
                if (name == null)
                {
                    ++varCounter;
                    name = li.getName() + "_var" + varCounter;
                }
                lii.setName(name);
                String type = "Object";
                if (item.typeReference() != null) type = item.typeReference().getText();
                lii.setType(type);
                lii.setChainItem(item);
                li.getItems().add(lii);
            }
        }
        this.getHasLoops().put(context, li);
        return null;
	}
}
