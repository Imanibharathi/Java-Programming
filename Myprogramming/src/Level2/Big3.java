package Level2;
import java.util.*;
public class Big3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		System.out.println("Enter c value : ");
		int c = sc.nextInt();
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest no is "+largest);

	}

}
