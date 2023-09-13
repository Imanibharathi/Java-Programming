package Level1;
import java.util.Scanner;

public class Area_Tri {
	private static void Tria_info(double b,double h) {
		double area = 0.5*b*h;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base = ");
		double b = sc.nextDouble();
		System.out.print("Enter the height = ");
		double h = sc.nextDouble();
		Tria_info(b,h);
		Tria_info(23.4,55.6);
		Tria_info(25,50);

	}

}
