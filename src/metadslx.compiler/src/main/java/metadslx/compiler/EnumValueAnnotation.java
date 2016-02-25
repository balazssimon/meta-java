package metadslx.compiler;

public class EnumValueAnnotation
{
    private Class<?> enumType;
    private EnumValueCase enumValueCase;

    public EnumValueAnnotation() {
        this.enumValueCase = EnumValueCase.Exact;
    }

	public Class<?> getEnumType() {
		return enumType;
	}

	public void setEnumType(Class<?> enumType) {
		this.enumType = enumType;
	}

	public EnumValueCase getCase() {
		return enumValueCase;
	}

	public void setCase(EnumValueCase enumValueCase) {
		this.enumValueCase = enumValueCase;
	}
    
}
