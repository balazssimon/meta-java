package metadslx.tempconsole;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import metadslx.compiler.AnnotatedAntlr4Compiler;
import metadslx.compiler.MetaGeneratorCompiler;
import metadslx.compiler.MetaGeneratorGenerator;
import metadslx.compiler.MetaModelCompiler;
import metadslx.core.DiagnosticMessage;
import metadslx.core.MetaEnumLiteral;
import metadslx.core.MetaExtensions;
import metadslx.core.Model;
import metadslx.core.ModelObject;
import metadslx.core.ModelProperty;

public class Program {

	public static void main(String[] args) {
		try {
			/*
			 * Model model = new Model(); try (ModelContextScope scope = new
			 * ModelContextScope(model)) { MetaFactory factory =
			 * MetaFactory.instance(); MetaClass cls =
			 * factory.createMetaClass(); cls.setName("Hello"); MetaProperty
			 * prop = factory.createMetaProperty(); prop.setName("Name");
			 * prop.setClass(cls); System.out.println(prop.getClass_());
			 * System.out.println(cls.getProperties().get(0)); } for
			 * (ModelObject mo: model.instances()) { ModelProperty nameProp =
			 * mo.mFindProperty("Name"); Object value = mo.mGet(nameProp);
			 * System.out.println(mo+": "+value); }
			 */
			// compileGenerator("src/main/java/metadslx/tempconsole/GenTest.mgen",
			// "src/main/java/metadslx/tempconsole/GenTest.java");
			/*
			 * compileGenerator(
			 * "src/main/java/metadslx/tempconsole/GenTest.mgen",
			 * "src/main/java/metadslx/tempconsole/GenTest.java");
			 * ArrayList<String> sl = new ArrayList<>(); sl.add("AAA");
			 * sl.add("BBB"); sl.add("CCC"); ArrayList<Person> pl = new
			 * ArrayList<>(); pl.add(new Person("XXX", 25)); pl.add(new
			 * Person("YYY", 40)); pl.add(new Student("TTT", "PQR123", 35));
			 * pl.add(new Person("YYY", 40)); pl.add(new Student("UUU",
			 * "RST456", 50)); GenTest gt = new GenTest(pl);
			 * System.out.println(gt.generate());
			 */
			/*
			 * compileAG4("../metadslx.compiler/src/main",
			 * "../metadslx.compiler/src/generated", "AnnotatedAntlr4Lexer");
			 * compileAG4("../metadslx.compiler/src/main",
			 * "../metadslx.compiler/src/generated", "AnnotatedAntlr4Parser");
			 * compileAG4("../metadslx.compiler/src/main",
			 * "../metadslx.compiler/src/generated",
			 * "AnnotatedAntlr4PropertiesLexer");
			 * compileAG4("../metadslx.compiler/src/main",
			 * "../metadslx.compiler/src/generated",
			 * "AnnotatedAntlr4PropertiesParser");
			 * compileAG4("../metadslx.compiler/src/main",
			 * "../metadslx.compiler/src/generated", "MetaGeneratorLexer");
			 * compileAG4("../metadslx.compiler/src/main",
			 * "../metadslx.compiler/src/generated", "MetaGeneratorParser");
			 */
			 //compileAG4("../metadslx.compiler/src/main", "../metadslx.compiler/src/generated", "MetaModelLexer");
			 //compileAG4("../metadslx.compiler/src/main", "../metadslx.compiler/src/generated", "MetaModelParser");
			 compileMeta("../metadslx.core/src/main", "../metadslx.core/src/generated", "MetaModel", false);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void compileAG4(String inputDirectory, String outputDirectory, String antlr4FileName) {
		try {
			String fileName = new File(inputDirectory + "/resources", antlr4FileName + ".ag4").getAbsolutePath();
			String source = readFile(fileName);

			AnnotatedAntlr4Compiler compiler = new AnnotatedAntlr4Compiler(source, outputDirectory, fileName);
			compiler.setDefaultPackage("metadslx.compiler");
			compiler.compile();
			String outputFileName = new File(
					outputDirectory + "/java/" + compiler.getDefaultPackage().replace('.', '/'),
					compiler.getGeneratedAnnotatorName() + ".java").getAbsolutePath();
			try (PrintWriter writer = new PrintWriter(outputFileName)) {
				writer.println(compiler.getGeneratedAnnotatorSource());
			}
			String propEvalSrc = compiler.getGeneratedPropertyEvaluatorSource();
			if (propEvalSrc != null) {
				outputFileName = new File(outputDirectory + "/java/" + compiler.getDefaultPackage().replace('.', '/'),
						compiler.getGeneratedPropertyEvaluatorName() + ".java").getAbsolutePath();
				try (PrintWriter writer = new PrintWriter(outputFileName)) {
					writer.println(propEvalSrc);
				}
			}
			String compSrc = compiler.getGeneratedCompilerSource();
			if (compSrc != null) {
				outputFileName = new File(outputDirectory + "/java/" + compiler.getDefaultPackage().replace('.', '/'),
						compiler.getGeneratedCompilerName() + ".java").getAbsolutePath();
				try (PrintWriter writer = new PrintWriter(outputFileName)) {
					writer.println(compSrc);
				}
			}
			String g4outputFileName = new File(outputDirectory + "/resources", antlr4FileName + ".g4")
					.getAbsolutePath();
			try (PrintWriter writer = new PrintWriter(g4outputFileName)) {
				writer.println(compiler.getGeneratedAntlr4Source());
			}
			try (PrintWriter writer = new PrintWriter("messages_a4.txt")) {
				for (DiagnosticMessage msg : compiler.getDiagnostics().getMessages(true)) {
					writer.println(msg);
					System.out.println(msg);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void compileGenerator(String fileName, String outputFileName) {
		try {
			String source = readFile(fileName);
			MetaGeneratorCompiler mgc = new MetaGeneratorCompiler(source, fileName);
			mgc.compile();
			if (!mgc.getDiagnostics().hasErrors()) {
				MetaGeneratorGenerator mgg = new MetaGeneratorGenerator(mgc.getParseTree());
				String generated = mgg.getGeneratedSource();
				try (PrintWriter writer = new PrintWriter(outputFileName)) {
					writer.println(generated);
				}
			} else {
				for (DiagnosticMessage msg : mgc.getDiagnostics().getMessages()) {
					System.out.println(msg);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void compileMeta(String inputDirectory, String outputDirectory, String inputFileName,
			boolean csharpOutput) {
		try {
			String fileName = new File(inputDirectory + "/resources", inputFileName + ".mm").getAbsolutePath();
			String source = readFile(fileName);
			MetaModelCompiler compiler = new MetaModelCompiler(source, inputFileName+".mm");
			compiler.compile();
			Model model = compiler.getModel();
			// PrintScope("", compiler.GlobalScope);
			System.out.println("=");

			try (PrintWriter writer = new PrintWriter("symbols.txt")) {
				for (ModelObject symbol : model.instances()) {
					ModelObject mo = MetaExtensions.typeAs(symbol, ModelObject.class);
					if (mo != null) {
						writer.println(mo);
						System.out.println(mo);
						String leading = compiler.getTriviaProvider().getLeadingTrivia(mo);
						String trailing = compiler.getTriviaProvider().getTrailingTrivia(mo);
						if (!MetaExtensions.isNullOrWhiteSpace(leading)) {
							writer.println("  Leading trivia: " + leading);
							System.out.println("  Leading trivia: " + leading);
						}
						if (!MetaExtensions.isNullOrWhiteSpace(trailing)) {
							writer.println("  Trailing trivia: " + trailing);
							System.out.println("  Trailing trivia: " + trailing);
						}
						writer.println("  Parent=" + mo.mGetParent());
						System.out.println("  Parent=" + mo.mGetParent());
						ModelProperty mp;
						mp = mo.mFindProperty("Documentation");
						if (mp != null) {
							writer.println("  Documentation=" + mo.mGet(mp));
							System.out.println("  Documentation=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Name");
						if (mp != null) {
							writer.println("  Name=" + mo.mGet(mp));
							System.out.println("  Name=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Uri");
						if (mp != null) {
							writer.println("  Uri=" + mo.mGet(mp));
							System.out.println("  Uri=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("IsAbstract");
						if (mp != null) {
							writer.println("  IsAbstract=" + mo.mGet(mp));
							System.out.println("  IsAbstract=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("NoTypeError");
						if (mp != null) {
							writer.println("  NoTypeError=" + mo.mGet(mp));
							System.out.println("  NoTypeError=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("ExpectedType");
						if (mp != null) {
							writer.println("  ExpectedType=" + mo.mGet(mp));
							System.out.println("  ExpectedType=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Type");
						if (mp != null) {
							writer.println("  Type=" + mo.mGet(mp));
							System.out.println("  Type=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("InnerType");
						if (mp != null) {
							writer.println("  InnerType=" + mo.mGet(mp));
							System.out.println("  InnerType=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("ReturnType");
						if (mp != null) {
							writer.println("  ReturnType=" + mo.mGet(mp));
							System.out.println("  ReturnType=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Object");
						if (mp != null) {
							writer.println("  Object=" + mo.mGet(mp));
							System.out.println("  Object=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Property");
						if (mp != null) {
							writer.println("  Property=" + mo.mGet(mp));
							System.out.println("  Property=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Value");
						if (mp != null) {
							writer.println("  Value=" + mo.mGet(mp));
							System.out.println("  Value=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("Definition");
						if (mp != null) {
							writer.println("  Definition=" + mo.mGet(mp));
							System.out.println("  Definition=" + mo.mGet(mp));
						}
						mp = mo.mFindProperty("EnumLiterals");
						if (mp != null) {
							writer.println("  EnumLiterals:");
							System.out.println("  EnumLiterals:");
							for (MetaEnumLiteral el : (List<MetaEnumLiteral>) mo.mGet(mp)) {
								writer.println("    " + el);
								System.out.println("    " + el);
							}
						}
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			try (PrintWriter writer = new PrintWriter("messages_meta.txt")) {
				for (DiagnosticMessage msg : compiler.getDiagnostics().getMessages(true)) {
					writer.println(msg);
					System.out.println(msg);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static String readFile(String path) throws IOException {
		return readFile(path, StandardCharsets.UTF_8);
	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	public static class Student extends Person {
		private String neptun;

		public Student(String name, String neptun, int age) {
			super(name, age);
			this.neptun = neptun;
		}

		public String getNeptun() {
			return neptun;
		}

		public void setNeptun(String neptun) {
			this.neptun = neptun;
		}
	}

}
