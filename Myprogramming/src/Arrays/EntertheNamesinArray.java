package Arrays;

import java.util.Scanner;

public class EntertheNamesinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		String names[] = new String[n];
		System.out.println("Enter "+n+" names");
		sc.nextLine();
		for (int i = 0; i <names.length; i++) {
			names[i] = sc.nextLine();
		}
		System.out.println("User entered array : ");
		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"]"+" => "+names[i]);
		}

	}

}
