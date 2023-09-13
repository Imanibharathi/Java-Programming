package Level1;
import java.util.Scanner;

public class FNtoOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(int i=n;i>0;i--) // n to 1 
		{
			System.out.println(i);
		}

	}

}
