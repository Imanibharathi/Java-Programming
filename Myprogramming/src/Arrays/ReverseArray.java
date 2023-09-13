package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int ar[] = readarr();
		System.out.println("Before reverse the array : ");
		display(ar);
		System.out.println("After reverse the array : ");
		reverse(ar);
		display(ar);

	}

	private static void reverse(int[] ar) {
		for (int i = 0; i < ar.length/2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length-i-1];
			ar[ar.length-i-1] = temp;
		}
		
	}

	private static void display(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]"+" => "+ar[i]);
		}
		
	}

	private static int[] readarr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

}
