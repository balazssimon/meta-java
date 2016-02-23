package metadslx.compiler;

import java.util.ArrayList;

class LoopInfo {
	private String name;
	private ArrayList<LoopItemInfo> items = new ArrayList<>();
	private MetaGeneratorParser.LoopStatementBeginContext loop;
	private MetaGeneratorParser.HasLoopExpressionContext hasLoop;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<LoopItemInfo> getItems() {
		return items;
	}
	public MetaGeneratorParser.LoopStatementBeginContext getLoop() {
		return loop;
	}
	public void setLoop(MetaGeneratorParser.LoopStatementBeginContext loop) {
		this.loop = loop;
	}
	public MetaGeneratorParser.HasLoopExpressionContext getHasLoop() {
		return hasLoop;
	}
	public void setHasLoop(MetaGeneratorParser.HasLoopExpressionContext hasLoop) {
		this.hasLoop = hasLoop;
	}
}
