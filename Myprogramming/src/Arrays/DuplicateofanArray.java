package Arrays;

import java.util.Scanner;

public class DuplicateofanArray {

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
	System.out.println();
	System.out.println("Duplicate of an array : ");
	int br[] = new int[ar.length];
	for (int i = 0; i < br.length; i++) {
		br[i]=ar[i];
		System.out.println("br["+i+"]"+" => "+br[i]);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	int a[]= {10,20,30,40};
		System.out.print("a[] = ");
		System.out.print("{");
		for (int i : a) {
			System.out.print(i+",");
		}
		System.out.print("}");
		int b[] = a;
		System.out.println();
		System.out.print("b[] = ");
		System.out.print("{");
		for (int i : b) {
			System.out.print(i+",");
		}
		System.out.print("}");
		*/

	}

}
