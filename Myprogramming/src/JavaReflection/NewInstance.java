package JavaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
//Accessing private property and behaviour of test class here by using java reflection
public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class c = Class.forName("JavaReflection.Test");
		Test t1 = (Test) c.newInstance();
		System.out.println(t1);
		Method m1 = c.getDeclaredMethod("test1", null);
		m1.setAccessible(true);
		m1.invoke(t1, null);
		Field m2 = c.getDeclaredField("x");
		m2.setAccessible(true);
		System.out.println(m2.getInt(t1));
		
		
		

	}

}
