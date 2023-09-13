package Level1;
import java.util.Scanner;
public class Leap_not {
	public static void main(String[] args) {
		// Leap year or not 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		// n can divisible by 4,400 but not by 100
		if(n%4==0 || n%400==0 && n%100!=0) {
			System.out.println(n+" is a Leap year");
		}
		else {
			System.out.println(n+" is not a Leap year");
		}

	}

}
