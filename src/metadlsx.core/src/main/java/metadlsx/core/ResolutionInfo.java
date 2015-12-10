package metadlsx.core;

import java.util.ArrayList;

public class ResolutionInfo {
	private Object node;
	private int position;
	private ArrayList<Class> symbolTypes;
	
	public ResolutionInfo() {
		this.position = -1;
	}

	public ResolutionInfo(Object node, int position, Iterable<Class> symbolTypes) {
		this.node = node;
		this.position = position;
		this.symbolTypes = new ArrayList<>();
		for (Class symbolType: symbolTypes) {
			this.symbolTypes.add(symbolType);
		}
	}

	public Object getNode() {
		return node;
	}

	public void setNode(Object node) {
		this.node = node;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ArrayList<Class> getSymbolTypes() {
		return symbolTypes;
	}
}
