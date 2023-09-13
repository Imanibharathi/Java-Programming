package Level2;
import java.util.*;
public class XylemOrphloem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum1=0,sum2=0;
		do {
			int d = n%10;
			if(temp==n || n<10)
				sum1+=d;
			else
				sum2+=d;
			n=n/10;
		}while(n!=0);
		if(sum1==sum2)
			System.out.println("Xylem no");
		else
			System.out.println("Phloem no");

	}

}
