package Arrays;

import java.util.Scanner;

public class AvgofDoubleTypeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of  an array : ");
		int n = sc.nextInt();
		double ar[] =new double[n];
		System.out.println("Enter "+n+" values" );
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("User entered array : ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]"+ "=> "+ar[i]);
		}
		System.out.println();
		double sum=0.0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		System.out.println("The avg of array is "+sum/ar.length);
		

	}

}
