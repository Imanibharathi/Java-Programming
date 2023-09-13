package Level1;

import java.util.*;
public class Area_Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		double rad = sc.nextDouble();
		Circleinfo(rad);
		Circleinfo(5.6);
		Circleinfo(6.2);
	}
	private static void Circleinfo(double rad) {
		double area =3.14*rad*rad;
		double circum =2*3.14*rad;
		System.out.println("radius = "+rad);
		System.out.println("Area = "+area);
		System.out.println("Cirum = "+circum);
		System.out.println();
	}

}
