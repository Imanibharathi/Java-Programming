package Level1;
import java.util.Scanner;

public class HowPrimeDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count=0;
		do {
			int d=n%10;
			n=n/10;
			if(d==2 || d==3 || d==5 || d==7)
				count++;
		}while(n!=0);
		System.out.println(count);
		
		

	}

}
