package Level2;
public class Swapping1 {
	public static void main(String[] args) {
		//Swapping with third variable
		int a=10;int b=20;
		System.out.println("Before Swapping \n a = "+a+" and b = "+b);
		int t = a;//using third variable
		a = b;
		b = t;
		System.out.println("After Swapping \n a = "+a+" and b = "+b);

	}

}
