package Level1;
import java.util.Scanner;

public class ProductofDigits {
	public static void main(String[] args) {
		//Product of its digit : eg : 23 = 2*3 = 6
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int product =1;
		do {
			int d= n%10;
			product*=d;
			n=n/10;
		}while(n!=0);
		System.out.println(product);

	}

}
