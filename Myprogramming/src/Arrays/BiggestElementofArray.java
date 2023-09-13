package Arrays;

import java.util.Scanner;

public class BiggestElementofArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("User entered array : ");
		int big = ar[0];
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" => "+i);
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println("The Biggest element in the array is "+big);

	}

}
