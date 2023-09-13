package Level1;
import java.util.Scanner;
public class onetoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int i=1;
		while(i<=n)//1 to n
		{
			System.out.println(i);
			i++;
		}

	}

}
