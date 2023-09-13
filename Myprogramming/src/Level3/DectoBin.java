package Level3;
import java.util.*;
public class DectoBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		String bin = DectoBin(n);
		System.out.println(bin);

	}

	private static String DectoBin(int n) {
		String bin="";
		do {
			int d = n%2;
			bin=bin+d;
			n=n/2;
		}while(n!=0);
		return bin;
	}

}
