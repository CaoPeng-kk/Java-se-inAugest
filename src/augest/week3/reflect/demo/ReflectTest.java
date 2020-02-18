package augest.week3.reflect.demo;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
//		反射练习
//		将配置文件路径封装成file对象
		File f = new File(".\\xml.txt");
//		创建properties对象
		Properties p = new Properties();
		FileInputStream fin = new FileInputStream(f);
		p.load(fin);
		System.out.println(p.getProperty("p1"));
		for(int x=0;x<p.size();x++) {
			
			Class c = Class.forName(p.getProperty("p"+(x+1)));
//			Class c = Class.forName();
			Object obj = c.getConstructor().newInstance();
			Method[] m = c.getMethods();
			for(Method s :m) {
				System.out.println(s);
				
			}
				
			
			
		}
		
		
		
		
	}

}
