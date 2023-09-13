package Level1;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// Product of Natural no : eg:( 3! = 1*2*3 = 6)
		// 3! is Factorial = 1*2*3 =6 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) // 1 to n 
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);
		

	}

}
