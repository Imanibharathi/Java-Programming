package Level2;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal = ");
		double p=sc.nextDouble();
		System.out.println("Enter the rate of interest = ");
		double r=sc.nextDouble();
		System.out.println("Enter the time = ");
		double t=sc.nextDouble();
		interest(p,r,t);



	}

	private static void interest(double p, double r, double t) {
		double interest = (p*r*t)/100;
		System.out.println(interest);
		
	}


}
