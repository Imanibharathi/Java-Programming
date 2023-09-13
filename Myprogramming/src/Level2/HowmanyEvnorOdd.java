package Level2;

import java.util.Scanner;

public class HowmanyEvnorOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum1=0;
		int sum2=0;
		do {
			int d= n%10;
			if(n%2==0)
				sum1++;
			else
				sum2++;
			n=n/10;
		}while(n!=0);
		System.out.println("No of Even num : "+sum1);
		System.out.println("No of Odd num : "+sum2);

	}

}
