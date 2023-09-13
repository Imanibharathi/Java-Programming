package Level2;

import java.util.Scanner;

public class Special2DigitNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int num = isSpecialnumber(a);
		System.out.println(num);
	}
	private static int isSpecialnumber(int a) {
		int sum=0;
		int mul=1;
		int temp=a;
		do {
			int d=a%10;
			sum+=d;
			mul*=d;
			a=a/10;
		}while(a!=0);
		if(temp==(sum+mul))
			System.out.println("Special two digit no");
		else
			System.out.println("Not a Special two digit no");
		return temp; 
	}

}
