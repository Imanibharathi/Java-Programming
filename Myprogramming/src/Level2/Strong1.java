package Level2;
import java.util.*;

public class Strong1 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int n = sc.nextInt();
			boolean rs = isStrong(n);
			if(rs==true)
				System.out.println(n+" is a Strong number");
			else
				System.out.println(n+" is not a Strong number");
				

		}

		private static boolean isStrong(int n) {
			int sum=0;int temp=n;
			do {
				int d=n%10;
				int fact=1;
				while(d>0) {
					fact*=d;
					d--;
				}
				sum+=fact;
				n=n/10;
			}while(n!=0);
			if(sum==temp)
				return true;
			else
				return false;
		}

	}


