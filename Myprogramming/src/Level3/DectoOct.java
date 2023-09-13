package Level3;

import java.util.Scanner;

public class DectoOct {

		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		String oct = DectoOct(n);
		System.out.println(oct);

	}

	private static String DectoOct(int n) {
		String oct="";
		do {
			int d = n%8;
			oct=oct+d;
			n=n/8;
		}while(n!=0);
		return oct;
	}

	

}
