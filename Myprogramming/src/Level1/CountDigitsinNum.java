package Level1;
import java.util.Scanner;

public class CountDigitsinNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		System.out.println(count);

	}

}