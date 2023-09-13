package Level2;

import java.util.Scanner;
public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp =n;
		int rev=0;
		do{
			int d=n%10;
			rev =rev*10+d;
			n=n/10;
		}while(n!=0);
		if(temp==rev)
			System.out.println(temp+" is a Palindrome number");
		else
			System.out.println(temp+" is not a Palindrome number ");

	}

}
