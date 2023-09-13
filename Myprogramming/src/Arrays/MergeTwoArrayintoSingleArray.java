package Arrays;

import java.util.Scanner;

public class MergeTwoArrayintoSingleArray {

	public static void main(String[] args) {
		System.out.println("Read the 1st Array : ");
		int x[] = Readarr();
		System.out.println("Read the 2nd Array : ");
		int y[] = Readarr();
		System.out.println("Merge into Single Array");
		int z[] = merge(x,y);
		System.out.println("user entered 1st Array : ");
		displayarr(x);
		System.out.println("user entered 2nd Array : ");
		displayarr(y);
		System.out.println("After merge two arrays : ");
		displayarr(z);

	}

	private static void displayarr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]"+" => "+ar[i]);
		}
		System.out.println();
	}

	private static int[] merge(int[] x, int[] y) {
		int z[] = new int[x.length+y.length];
		for (int i = 0; i < x.length; i++) {
			z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[x.length+i]=y[i];
		}
		return z;
	}

	private static int[] Readarr() {
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
