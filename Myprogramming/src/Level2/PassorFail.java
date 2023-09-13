package Level2;
import java.util.*;
public class PassorFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter the mark : ");
		int n = sc.nextInt();
		String c = (n>0&&n<=35)?"Fail":(n>35 && n<=100)?"Pass":"Invalid no";
		System.out.println(n+" => "+c);
		
	}

}
