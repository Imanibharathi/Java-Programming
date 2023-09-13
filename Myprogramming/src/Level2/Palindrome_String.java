package Level2;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		String rev = "";
		String temp = str;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(temp.equals(rev)) {
			System.out.println(temp+" is Palindrome String");
		}
		else {
			System.out.println(temp+" is not a Palindrome String");
		}

	}

}
