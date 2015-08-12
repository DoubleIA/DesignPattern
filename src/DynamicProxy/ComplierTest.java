package DynamicProxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class ComplierTest {
	public static void main(String[] args) throws Exception {
		String rt = "\r\n";
		String src = "package DynamicProxy;" + rt +

				     "public class TankTimeProxy implements Movable {" + rt + "\n" +

					 "    Movable t;" + rt + "\n" +
	
					 "    public TankTimeProxy(Movable t) {" + rt + 
					 "  		  super();" + rt +
					 "  		  this.t = t;" + rt +
					 "    }" + rt + "\n" +
	
					 "    @Override" + rt +
					 "    public void move() {" + rt +
					 "      long start = System.currentTimeMillis();" + rt +
					 "      System.out.println(\"Start time: \" + start);" + rt +
					 "      t.move();" + rt +
					 "      long end = System.currentTimeMillis();" + rt +
					 "      System.out.println(\"Time: \" + (end - start));" + rt +
					 "    }" + rt + "\n" +
	
					 "    @Override" + rt +
					 "    public void stop() {" + rt +
					 "      long start = System.currentTimeMillis();" + rt +
					 "      System.out.println(\"Start time: \" + start);" + rt +
					 "      t.stop();" + rt +
					 "      long end = System.currentTimeMillis();" + rt +
					 "      System.out.println(\"Time: \" + (end - start));" + rt +
					 "    }" + rt + "\n" +

			         "}";
		
		//Create new java file.
		String fileName = System.getProperty("user.dir") + "/src/DynamicProxy/TankTimeProxy.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
//		//Compiler.
//		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
//		StandardJavaFileManager fileMgr = complier.getStandardFileManager(null, null, null);
//		Iterable<? extends JavaFileObject> units = fileMgr.getJavaFileObjects(fileName);
//		CompilationTask task = complier.getTask(null, fileMgr, null, null, null, units);
//		task.call();
//		fileMgr.close();
//		
//		//Load into memory and create an instance.
//		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") + "/src")};
//		URLClassLoader url = new URLClassLoader(urls);
//		Class<?> c = url.loadClass("DynamicProxy.TankTimeProxy");
//		url.close();
//		
//		Constructor<?> ctr = c.getConstructor(Movable.class);
//		Movable m = (Movable) ctr.newInstance(new Tank());
//		m.move();
//		m.stop();
		
	}
}
