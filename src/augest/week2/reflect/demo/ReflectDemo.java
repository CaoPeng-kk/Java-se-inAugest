package augest.week2.reflect.demo;

import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class p = Class.forName("augest.week2.gui.demo.GuiDemo");
		Object obj = p.getConstructor().newInstance();
		Method[] me = p.getMethods();
		for(Method s :me) {
			System.out.println(s);
		}
		
		
		
	}

}
