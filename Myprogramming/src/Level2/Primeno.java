package Level2;
import java.util.*;
public class Primeno {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		boolean rs = isprime(n);
		if(rs==true)
			System.out.println(n+" is a prime no");
		else
			System.out.println(n+" is not a prime no");

	}

	private static boolean isprime(int n) {
		int count=0;
		if(n>1) {
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					count++;
			}
			
		}
		if(count==2)
			return true;
		else
			return false;
	}

}
