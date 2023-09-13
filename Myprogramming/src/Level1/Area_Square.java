package Level1;
import java.util.Scanner;

public class Area_Square {
	private static void Area_sq(int side) {
		int area = side*side;
		System.out.println("The sides of Sq is "+side);
		System.out.println("Area of Square is "+area);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sides of sq : ");
		int side = sc.nextInt();
		Area_sq(side);
		Area_sq(45);
		Area_sq(100);

	}

}
