package Arrays;

import java.util.Scanner;

public class SmallestelementinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("User entered array");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]"+" => "+ar[i]);
		}
		int small = isSmallest(ar);
		System.out.println("Smallest element is "+small);
	}

	private static int isSmallest(int[] ar) {
		int small = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}

}
