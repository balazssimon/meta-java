package metadslx.core;

final class MetaImplementationProvider {
    // If there is a compile error at this line, create a new class called MetaImplementation
	// which is a subclass of MetaImplementationBase:
    private static MetaImplementation implementation = new MetaImplementation();

    public static MetaImplementation implementation() {
        return MetaImplementationProvider.implementation;
    }
}

