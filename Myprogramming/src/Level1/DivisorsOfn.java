package Level1;
import java.util.Scanner;

public class DivisorsOfn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		System.out.println();
		System.out.println("Total = "+count);
	

	}

}
