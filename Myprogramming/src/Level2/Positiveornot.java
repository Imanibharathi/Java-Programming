package Level2;
import java.util.*;
public class Positiveornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n = sc.nextInt();
		if(n>0)
			System.out.println(n+" is a +ve no");
		else
			System.out.println(n+" is a -ve no");

	}

}
