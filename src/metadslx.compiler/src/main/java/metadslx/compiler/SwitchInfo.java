package metadslx.compiler;

class SwitchInfo {
	private String tmpName;
	private int caseCount;
	private String identifierName;
	private boolean allowTypeAs;
	private MetaGeneratorParser.TypeReferenceContext typeAsContext;

	public String getTmpName() {
		return tmpName;
	}
	public void setTmpName(String tmpName) {
		this.tmpName = tmpName;
	}
	public int getCaseCount() {
		return caseCount;
	}
	public void setCaseCount(int caseCount) {
		this.caseCount = caseCount;
	}
	public String getIdentifierName() {
		return identifierName;
	}
	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	public boolean getAllowTypeAs() {
		return allowTypeAs;
	}
	public void setAllowTypeAs(boolean allowTypeAs) {
		this.allowTypeAs = allowTypeAs;
	}
	public MetaGeneratorParser.TypeReferenceContext getTypeAsContext() {
		return typeAsContext;
	}
	public void setTypeAsContext(MetaGeneratorParser.TypeReferenceContext typeAsContext) {
		this.typeAsContext = typeAsContext;
	}
}
