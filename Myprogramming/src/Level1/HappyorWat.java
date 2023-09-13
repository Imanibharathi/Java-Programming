package Level1;
import java.util.Scanner;

public class HappyorWat{
	private static int ishappy(int n) {
		int sum=0;
		while(n!=0){
			int d= n%10;
			sum=sum+(d*d);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int res =n;
		while(res!=1 && res!=4) {
			res=ishappy(res);
		}
		if(res==1)
			System.out.println("Happy");
		else
			System.out.println("Not Happy");
	}
}