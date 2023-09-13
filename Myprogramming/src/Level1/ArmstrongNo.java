package Level1;
import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		int temp =n;
		do {
			int d = n%10;
			sum=sum+(d*d*d);// 153 = (1*1*1)+(5*5*5)+(3*3*3) = 1+125+27 = 153
			n=n/10;
		}while(n!=0);
		System.out.println();
		if(sum==temp)
			System.out.println("Armstrong no");
		else
			System.out.println("Not a Armstrong no");
	}

}
