package Level1;
import java.util.Scanner;

public class SumofNatural {
	public static void main(String[] args) {
		// Sum of Natural numbers : eg( 5 = 1+2+3+4+5 = 15)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) // 1 to n 
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}
