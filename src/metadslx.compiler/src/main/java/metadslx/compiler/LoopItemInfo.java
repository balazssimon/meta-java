package metadslx.compiler;

class LoopItemInfo {
	private String name;
	private String type;
	private MetaGeneratorParser.LoopChainItemContext chainItem;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MetaGeneratorParser.LoopChainItemContext getChainItem() {
		return chainItem;
	}
	public void setChainItem(MetaGeneratorParser.LoopChainItemContext chainItem) {
		this.chainItem = chainItem;
	}
	
}
