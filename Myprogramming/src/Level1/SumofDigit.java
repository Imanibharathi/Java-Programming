package Level1;
import java.util.Scanner;

public class SumofDigit {
	public static void main(String[] args) {
		//Sum of  its digit : eg : 23 = 2+3 = 5 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		do {
			int d=n%10;
			sum+=d;
			n=n/10;
		}while(n!=0);
		System.out.println(sum);

	}

}
