package Pattern;

public class Practise {

	public static void main(String[] args) {
		int n=5;
		//R1
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
		//R2
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		//L1
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if(i+j<=n+1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		System.out.println();
		//L2
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i<=j)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
	}

}
