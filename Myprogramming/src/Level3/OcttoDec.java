package Level3;

import java.util.Scanner;

public class OcttoDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int oct = sc.nextInt();
		int dec = OcttoDec(oct);
		System.out.println(dec);
	}

	private static int OcttoDec(int oct) {
		int dec=0,pw=1,n=oct;
		do {
			int d=n%10;
			dec=dec+d*pw;
			pw=pw*8;
			n=n/10;
		}while(n!=0);
		return dec;
	}

	
	

	

}
