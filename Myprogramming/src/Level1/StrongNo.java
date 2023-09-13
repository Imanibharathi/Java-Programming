package Level1;
import java.util.Scanner;
public class StrongNo {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		do{
			int d = n%10;
			int fact =1;
			int i=1;
			while(i<=d) {
				fact*=i;
				i++;
			}
			sum+=fact;
			n=n/10;
		}while(n!=0);
		if(sum==temp)
		System.out.println("Strong no");
		else 
		System.out.println("Not a Strong no");
	}

}
