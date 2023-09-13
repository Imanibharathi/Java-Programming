package Level3;

import java.util.Scanner;

public class DectoHexa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		String hexa = DectoHexa(n);
		System.out.println(hexa);

	}

	private static String DectoHexa(int n) {
		String hexa="";
		do {
			int d = n%16;
			if(d<10)
				hexa=hexa+d;
			else
				hexa=(char)(d+55)+hexa;
			n=n/16;
		}while(n!=0);
		return hexa;
	}


}
