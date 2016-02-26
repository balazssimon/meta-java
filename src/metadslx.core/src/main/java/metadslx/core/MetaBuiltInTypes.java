package metadslx.core;

import java.util.ArrayList;

public class MetaBuiltInTypes {
    private static ArrayList<MetaType> types;

    public static Iterable<MetaType> getTypes()
    {
        if (MetaBuiltInTypes.types == null)
        {
            MetaBuiltInTypes.types = new ArrayList<MetaType>();
            if (MetaBuiltInTypes.types.size() == 0 && MetaInstance.Object != null)
            {
                MetaBuiltInTypes.types.add(MetaInstance.Object);
                MetaBuiltInTypes.types.add(MetaInstance.String);
                MetaBuiltInTypes.types.add(MetaInstance.Int);
                MetaBuiltInTypes.types.add(MetaInstance.Long);
                MetaBuiltInTypes.types.add(MetaInstance.Float);
                MetaBuiltInTypes.types.add(MetaInstance.Double);
                MetaBuiltInTypes.types.add(MetaInstance.Byte);
                MetaBuiltInTypes.types.add(MetaInstance.Bool);
                MetaBuiltInTypes.types.add(MetaInstance.Void);
                MetaBuiltInTypes.types.add(MetaInstance.ModelObject);
                MetaBuiltInTypes.types.add(MetaInstance.DefinitionList);
                MetaBuiltInTypes.types.add(MetaInstance.ModelObjectList);
            }
        }
        return MetaBuiltInTypes.types;
    }
}
