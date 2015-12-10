package metadlsx.core;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public final class MetaScopeEntryProperties {
    public static final ModelProperty SymbolTreeNodesProperty =
            ModelProperty.register("SymbolTreeNodes", List.class, Object.class, MetaScopeEntryProperties.class);

    public static final ModelProperty NameTreeNodesProperty =
        ModelProperty.register("NameTreeNodes", List.class, Object.class, MetaScopeEntryProperties.class);

    public static final ModelProperty CanMergeProperty =
        ModelProperty.register("CanMerge", Boolean.class, null, MetaScopeEntryProperties.class);

}
