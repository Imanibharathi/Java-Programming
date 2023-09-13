package Level3;
import java.util.*;
public class BintoDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int bin = sc.nextInt();
		int dec = BintoDec(bin);
		System.out.println(dec);
	}

	private static int BintoDec(int bin) {
		int dec=0,pw=1,n=bin;
		do {
			int d=n%10;
			dec=dec+d*pw;
			pw=pw*2;
			n=n/10;
		}while(n!=0);
		return dec;
	}

}
