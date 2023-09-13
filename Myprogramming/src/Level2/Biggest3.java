package Level2;

import java.util.Scanner;

public class Biggest3 {
	static int isbiggest(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value : ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd value : ");
		int c = sc.nextInt();
		int big = isbiggest(a,b,c);
		System.out.println("Biggest is "+big);
		

	}

}
