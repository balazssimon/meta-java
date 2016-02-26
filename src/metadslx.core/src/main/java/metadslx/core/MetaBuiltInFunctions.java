package metadslx.core;

import java.util.ArrayList;

public class MetaBuiltInFunctions {
    private static ArrayList<MetaFunction> functions;

    public static Iterable<MetaFunction> getFunctions()
    {
        if (MetaBuiltInFunctions.functions == null)
        {
            MetaBuiltInFunctions.functions = new ArrayList<MetaFunction>();
            if (MetaBuiltInFunctions.functions.size() == 0 && MetaInstance.TypeOf != null)
            {
                MetaBuiltInFunctions.functions.add(MetaInstance.TypeOf);
                MetaBuiltInFunctions.functions.add(MetaInstance.GetValueType);
                MetaBuiltInFunctions.functions.add(MetaInstance.GetReturnType);
                MetaBuiltInFunctions.functions.add(MetaInstance.CurrentType);
                MetaBuiltInFunctions.functions.add(MetaInstance.TypeCheck);
                MetaBuiltInFunctions.functions.add(MetaInstance.Balance);
                MetaBuiltInFunctions.functions.add(MetaInstance.Resolve1);
                MetaBuiltInFunctions.functions.add(MetaInstance.Resolve2);
                MetaBuiltInFunctions.functions.add(MetaInstance.ResolveName1);
                MetaBuiltInFunctions.functions.add(MetaInstance.ResolveName2);
                MetaBuiltInFunctions.functions.add(MetaInstance.ResolveType1);
                MetaBuiltInFunctions.functions.add(MetaInstance.ResolveType2);
                MetaBuiltInFunctions.functions.add(MetaInstance.ToDefinitionList);
                MetaBuiltInFunctions.functions.add(MetaInstance.Bind1);
                MetaBuiltInFunctions.functions.add(MetaInstance.Bind2);
            }
        }
        return MetaBuiltInFunctions.functions;
    }
}
