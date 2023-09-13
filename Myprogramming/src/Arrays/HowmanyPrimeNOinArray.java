package Arrays;

import java.util.Scanner;

public class HowmanyPrimeNOinArray {

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
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]"+" => "+ar[i]);
		}
		int prime = isPrimeno(ar);
		System.out.println("Number of prime no's are "+prime);

	}

	private static int isPrimeno(int[] ar) {
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			boolean rs = isPrime(ar[i]);
			if(rs==true)
				count++;
		}
		return count;
	}

	private static boolean isPrime(int n) {
		for (int j = 2; j <n/2 ; j++) {
			if(n%j==0)
				return false;
		}
		return true;
	}

}
