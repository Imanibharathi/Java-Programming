package Level1;
import java.util.Scanner;

public class NtoPower {
	public static void main(String[] args) {
		// Power of any number : 
		// 2 to power of 3 = 2*2*2 = 8
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of m : ");
		int m = sc.nextInt();// m=2 this is number
		System.out.println("enter the value of n : ");
		int n = sc.nextInt(); // n=3 this is Power
		int i=1;
		int p=1;
		while(i<=n) // 1 to n
		{
			p*=m;
			i++;
		}
		System.out.println(p);
	}

}
