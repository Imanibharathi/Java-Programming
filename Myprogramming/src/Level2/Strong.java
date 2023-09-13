package Level2;
import java.util.*;
public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp=n;
		int strong = isStrong(n);
		if(strong==temp) {
			System.out.println(temp+" is a Strong number");
		}
		else {
			System.out.println(temp+" is not a Strong number");
		}
			

	}

	private static int isStrong(int n) {
		int sum=0;
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
		return sum;
	}

}
