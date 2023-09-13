package Level1;
import java.util.Scanner;

public class AvgofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int sum =0;
		int count =0;
		do {
			int d = n%10;
			sum+=d;
			n=n/10;
			count++;
		}while(n!=0);
		System.out.println("The avg of digits is "+sum/count);

	}

}
