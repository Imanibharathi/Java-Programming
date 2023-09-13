package Level2;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int  n = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);

	}

}
