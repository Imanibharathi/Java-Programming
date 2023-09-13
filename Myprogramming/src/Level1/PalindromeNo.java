package Level1;
import java.util.Scanner;
public class PalindromeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		int rev=0;
		int temp = n;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		if(rev==temp)
			System.out.println("Palindrome no");
		else
			System.out.println("Not a Palindrome no");
	}

}
