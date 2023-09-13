package Level2;

import java.util.Scanner;

public class XylmorPhlom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		boolean rs = isValue(n);
		if(rs==true)
			System.out.println(n+" is Xylem no");
		else
			System.out.println(n+" is Phloem no");

	}

	private static boolean isValue(int n) {
		int sum1=0,sum2=0;int temp=n;
		while(temp!=0) {
			if(temp==n || temp<10)
				sum1=sum1+temp%10;
			else
				sum2=sum2+temp%10;
			temp=temp/10;
		}
		if(sum1==sum2)
			return true;
		else
			return false;
			
	}

}
