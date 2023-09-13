package Level2;

import java.util.Scanner;

public class NoOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int count =0;
		do {
			count++;
			int d=n%10;
			n=n/10;
		}while(n!=0);
			System.out.println(count);

	}

}
