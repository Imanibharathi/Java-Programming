package Level1;
import java.util.Scanner;
public class SumofEvnOddinNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum1=0;
		int sum2=0;
		do {
			int d = n%10;
			if(n%2==0)
				sum1+=d;
			else
				sum2+=d;
			n=n/10;
		}while(n!=0);
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
