package Level1;
import java.util.Scanner;

public class SumofEven1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2==0)
				sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}
