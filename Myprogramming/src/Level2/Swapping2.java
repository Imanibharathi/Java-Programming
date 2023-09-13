package Level2;
public class Swapping2 {
	public static void main(String[] args) {
		//Swapping without third variable
		int a = 10;int b = 15;
		System.out.println("Before Swapping \n a="+a+"and b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping \n a="+a+"and b="+b);

	}

}
