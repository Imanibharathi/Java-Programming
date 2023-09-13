package Level1;
import java.util.Scanner;

public class PrimeorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println("Not a Prime no");
		else
			System.out.println("Prime no");

	}

}
