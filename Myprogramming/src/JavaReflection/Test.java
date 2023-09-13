package JavaReflection;
//By Using Java Reflection we can access the private properties and behaviour outside the class as well
// But it is not a good standard practise
public class Test {
	private int x=10;
	private void test1()
	{
		System.out.println("I'm Test1");
	}
	public void test2()
	{
		System.out.println("I'm Test2");
	}

}
