package metadslx.tempconsole;

import metadslx.core.MetaClass;
import metadslx.core.MetaFactory;
import metadslx.core.MetaProperty;
import metadslx.core.Model;
import metadslx.core.ModelContextScope;
import metadslx.core.ModelObject;
import metadslx.core.ModelProperty;

public class Program {

	public static void main(String[] args) {
		try {
			Model model = new Model();
			try (ModelContextScope scope = new ModelContextScope(model)) {
				MetaFactory factory = MetaFactory.instance();
				MetaClass cls = factory.createMetaClass();
				cls.setName("Hello");
				MetaProperty prop = factory.createMetaProperty();
				prop.setName("Name");
				prop.setClass(cls);
				System.out.println(prop.getClass_());
				System.out.println(cls.getProperties().get(0));
			}
			for (ModelObject mo: model.instances()) {
				ModelProperty nameProp = mo.mFindProperty("Name");
				Object value = mo.mGet(nameProp);
				System.out.println(mo+": "+value);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
