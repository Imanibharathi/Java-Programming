package Level2;

import java.util.*;

public class Smallest3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 1st value : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value : ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd value : ");
		int c = sc.nextInt();
		int small = isSmallest(a,b,c);
		System.out.println("Smallest number is "+small);

	}

	private static int isSmallest(int a, int b, int c) {
		if(a<b && a<c)
		return a;
		else if (b<c)
		return b;
		else
		return c;
	}

}
