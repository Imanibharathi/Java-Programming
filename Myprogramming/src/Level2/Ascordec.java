package Level2;
import java.util.*;
public class Ascordec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd no : ");
		int y = sc.nextInt();
		System.out.println("Enter 3rd no : ");
		int z = sc.nextInt();
		if((z>y && z>x) && (y>x && y<z) )
			System.out.println(x+","+y+","+z);
		else if((z<y && z<x) && (y>z && y<x))
			System.out.println(z+","+y+","+x);
		else if((y<z && y<x) && (z>y && z<x))
			System.out.println(y+","+z+","+x);
		else if((x<z && x<y) && (y>x && y>z))
			System.out.println(x+","+z+","+y);
		else if((y<x && y<z) && (z>y && z>x))
			System.out.println(y+","+x+","+z);
		else
			System.out.println(z+","+x+","+y);
		
		
		
		
		

	}

}
