package Level2;
import java.util.*;
public class Sppecial2digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value : ");
		int n = sc.nextInt();
		boolean rs = isSpecial(n);
		if(rs==true)
			System.out.println(n+" is a special two digit");
		else
			System.out.println(n+" is not a special two digit");

	}

	private static boolean isSpecial(int n) {
		int sum=0,temp=n,mul=1;
		do {
			int d=n%10;
			sum+=d;
			mul*=d;
			n=n/10;
		}while(n!=0);
		if(temp==(sum+mul))
		    return true;
		else
			return false;
	}

}
