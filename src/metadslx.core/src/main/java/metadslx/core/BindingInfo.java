package metadslx.core;

import java.util.ArrayList;
import java.util.List;

public class BindingInfo {
	private ResolutionInfo resolutionInfo;
	private ArrayList<ModelObject> resolvedObjects;
	private String name;
	private Object node;
	private boolean resolutionError;
	
	public BindingInfo(ResolutionInfo resolutionInfo, String name, Object node, boolean resolutionError) {
		this.resolutionInfo = resolutionInfo;
		this.resolutionError = resolutionError;
		this.name = name;
		this.node = node;
		this.resolvedObjects = new ArrayList<>();
	}

	public static BindingInfo createFromDefinitions(ModelObject... definitions) {
		BindingInfo result = new BindingInfo(new ResolutionInfo(), null, null, false);
		for (ModelObject def: definitions) {
			result.resolvedObjects.add(def);
		}
		return result;
	}
		
	public ResolutionInfo getResolutionInfo() {
		return resolutionInfo;
	}

	public List<ModelObject> getResolvedObjects() {
		return resolvedObjects;
	}

	public String getName() {
		return name;
	}

	public Object getNode() {
		return node;
	}

	public boolean isResolutionError() {
		return resolutionError;
	}
}
