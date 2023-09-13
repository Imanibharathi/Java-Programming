package Arrays;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int x[ ] = new int[n];
		System.out.println("enter "+n+" values");
		for (int i = 0; i < n; i++) {
		int x1[ ] = new int[n];
		}
		System.out.println("user entered array : ");
		for (int i = 0; i < n; i++) {
			System.out.println(x[i]+" "+i);
		}
	}

}
