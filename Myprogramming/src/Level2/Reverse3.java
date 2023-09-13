package Level2;

import java.util.Scanner;

public class Reverse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : " );
		int n = sc.nextInt();
		StringBuilder sbl = new StringBuilder();
		sbl.append(n);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);

	}

}
