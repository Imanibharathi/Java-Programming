package Level1;
import java.util.Scanner;
public class NtoOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int i=n;
		while(i>0) // n to 1
		{
			System.out.println(i);
			i--;
		}

	}

}
