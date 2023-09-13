package Level2;
import java.util.*;
public class PerfectorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
	    boolean rs = isPerfect(n);
	    if(rs==true)
	    	System.out.println(n+" is perfect no");
	    else
	    	System.out.println(n+" is not a perfect no ");

	}

	private static boolean isPerfect(int n) {
		int sum=0;int temp=n;
		for(int i =1;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==temp)
			return true;
		else
			return false;
		
		
	}

}
