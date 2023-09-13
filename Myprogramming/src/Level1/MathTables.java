package Level1;
import java.util.Scanner;

public class MathTables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number : ");
		int n = sc.nextInt(); 
		
		for(int i=1;i<=10;i++)  //  1 to 10
		{
			System.out.println(i+"*"+n+"="+i*n);
		}
	
	}

}
