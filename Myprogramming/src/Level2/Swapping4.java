package Level2;

public class Swapping4 {

	public static void main(String[] args) {
		int a = 10;int b = 20;
		System.out.println("Before Swapping \n a="+a+"and b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping \n a="+a+"and b="+b);


	}

}
