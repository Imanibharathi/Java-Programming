package Level1;
import java.util.Scanner;

public class SumofAvgnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int i =1;
		double sum = 0;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum/n);

	}

}
