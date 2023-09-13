package Level2;
import java.util.*;
public class Happyornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num = ");
		int n = sc.nextInt();
		boolean rs = ishappy(n);
		if(rs==true)
			System.out.println(n+" is a happy no");
		else
			System.out.println(n+" is not a happy no");
		

	}

	private static boolean ishappy(int n) {
		
		while(n>9) {
			int sum=0;
			do {
				int d=n%10;
				sum+=d*d;
				n/=10;
			}while(n!=0);
			n=sum;	
		}
		 if(n==1 || n==7)
			 return true;
		 else
			 return false;
	 
	}

}
