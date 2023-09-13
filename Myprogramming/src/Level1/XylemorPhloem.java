package Level1;
import java.util.Scanner;

public class XylemorPhloem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int outerdigits = 0;
		int innerdigits = 0;
		int temp = n;
		while(temp!=0) {
			if(temp==n || temp<10)
				outerdigits = outerdigits+temp%10;
			else 
				innerdigits = innerdigits+temp%10;
			temp = temp/10;
			}
		if(outerdigits==innerdigits) 
			System.out.println(n+" is a xylem number");
		else 
			System.out.println(n+" is a phloem number");
		
		
	}

}
