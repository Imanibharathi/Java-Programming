package Pattern;

public class PatternsPrinting1 {

	public static void main(String[] args) {
		int n=5;
		method1(n);System.out.println();
		method2(n);System.out.println();
		method3(n);System.out.println();
		method4(n);System.out.println();
		method5(n);System.out.println();
		method6(n);System.out.println();
		method7(n);System.out.println();
		method8(n);System.out.println();
		method9(n);System.out.println();
		method10(n);System.out.println();
		method11(n);System.out.println();
		method12(n);System.out.println();
		method13(n);System.out.println();
		method14(n);System.out.println();
		method15(n);System.out.println();
		method16(n);System.out.println();
		method17(n);System.out.println();
		method18(n);System.out.println();
		method19(n);System.out.println();
		method20(n);System.out.println();
		method21(n);System.out.println();
		method22(n);System.out.println();
		method23(n);System.out.println();
		method24(n);System.out.println();
		method25(n);System.out.println();
		method26(n);System.out.println();
		method27(n);System.out.println();
		method28(n);System.out.println();
		method29(n);System.out.println();
		method30(n);System.out.println();
		method31(n);System.out.println();
		method32(n);System.out.println();
		method33(n);System.out.println();
		method34(n);System.out.println();
		method35(n);System.out.println();
		method36(n);System.out.println();
		method37(n);System.out.println();
		method38(n);System.out.println();
		method39(n);System.out.println();
		method40(n);System.out.println();
		method41(n);System.out.println();
		method42(n);System.out.println();
		method43(n);System.out.println();
		method44(n);System.out.println();
		method45(n);System.out.println();
		method46(n);System.out.println();
		method47(n);System.out.println();
		method48(n);System.out.println();
		method49(n);System.out.println();
		method50(n);System.out.println();
		method51(n);System.out.println();
		method52(n);System.out.println();
		method53(n);System.out.println();
		method54(n);System.out.println();
		method55(n);System.out.println();
		method56(7);System.out.println();
		method57(7);System.out.println();
		method58(7);System.out.println();
		method59(7);System.out.println();
		method60(7);System.out.println();
		method61(7);System.out.println();
		method62(7);System.out.println();
		method63(7);System.out.println();
		method64(7);System.out.println();
		method65(7);System.out.println();
		method66(7);System.out.println();
		method67(7);System.out.println();
		method68(7);System.out.println();
		method69(7);System.out.println();
		method70(7);System.out.println();
		method71(7);System.out.println();
		method72(7);System.out.println();
		method73(11);System.out.println();
		method74(7);System.out.println();
		method75(7);System.out.println();
		method76(n);System.out.println();
		method77(n);System.out.println();
		method78(n);System.out.println();
		method79(n);System.out.println();
		method80(n);System.out.println();
		
	}
	private static void method80(int n) {
		System.out.println("Method-80");
		for (int i = 1; i <= n; i++)   
		{  
		for (int j = n; j >= i; j--)  
		{  
		System.out.print(" ");  
		}  
		for (int k = 1; k <= i; k++)  
		{  
		System.out.print("*"+ " ");  
		}  
		System.out.println();  
		}  
		
	}
	private static void method79(int n) {
		System.out.println("Method-79");
		for (int i = n; i >=1; i--) {
			for (int j = n; j >= 1; j--) {
				if(i+j<=n+1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i<j)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
	private static void method78(int n) {
		System.out.println("Method-78");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n-1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	private static void method77(int n) {
		System.out.println("Method-77");
		int x = 6;
		for (int i = 0; i < x; i++) {
		int num = 1;
		System.out.printf("%" + (x - i) * 2 + "s", ""); //Pascals triangle logic
		for (int j = 0; j <= i; j++) {
		System.out.printf("%4d", num);
		num = num * (i - j) / (j + 1);
		}
		System.out.println();
		}
	}
		
	
	private static void method76(int n) {
		System.out.println("Method-76");
		for (int i = 1; i <=2*n; i++) {
			int totalColsInRows = i>n? 2*n-i:i;
			for (int j = 1; j <= totalColsInRows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	private static void method75(int n) {
		System.out.println("Method-75");
		int k = n*2-1;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= k; j++) {
				if(j==i || j ==k-i+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private static void method74(int n) {
		System.out.println("Method-74");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==j || i+j==n+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}
	private static void method73(int n) {
		System.out.println("Method-73");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 || j==1 || i==n || j==n || i==n/2+1 || j==n/2+1 || i==j || i+j==n+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}
	private static void method72(int n) {
		System.out.println("Method-72");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=star/2+1;
			for (int j = 1; j <= star; j++) {
				System.out.print((char)(64+k)+" ");
				if(j<=star/2) {
					k--;
				}else {
					k++;
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}
	private static void method71(int n) {
		System.out.println("Method-71");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=star/2+1;
			for (int j = 1; j <= star; j++) {
				System.out.print((char)(96+k)+" ");
				if(j<=star/2) {
					k--;
				}else {
					k++;
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}		
	}
	private static void method70(int n) {
		System.out.println("Method-70");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=star/2+1;
			for (int j = 1; j <= star; j++) {
				System.out.print(k+" ");
				if(j<=star/2) {
					k--;
				}else {
					k++;
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}
	private static void method69(int n) {
		System.out.println("Method-69");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=1;
			for (int j = 1; j <= star; j++) {
				System.out.print((char)(64+k)+" ");
				if(j<=star/2) {
					k++;
				}else {
					k--;
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}
	private static void method68(int n) {
		System.out.println("Method-68");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=1;
			for (int j = 1; j <= star; j++) {
				System.out.print((char)(96+k)+" ");
				if(j<=star/2) {
					k++;
				}else {
					k--;
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}
	private static void method67(int n) {
		System.out.println("Method-67");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=1;
			for (int j = 1; j <= star; j++) {
				System.out.print(k+" ");
				if(j<=star/2) {
					k++;
				}else {
					k--;
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
	}
	private static void method66(int n) {
		System.out.println("Method-66");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				if(j==1 || j==star) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
	}
	private static void method65(int n) {
		System.out.println("Method-65");
		int star=n;
		int space = 0;
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j <=space ; j++) {
				System.out.print(" "+" ");
			}
			int k=1;
			for (int j = 1; j <=star ; j++) {
				System.out.print((char)(64+k)+" ");
				if(j<=star/2) {
					k++;
				}else {
					k--;
				}
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
	private static void method64(int n) {
		System.out.println("Method-64");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=star/2+1;
			for (int j = 1; j <= star; j++) {
				System.out.print((char)(64+k)+" ");
				if(j<=star/2) {
					k--;
				}else {
					k++;
				}
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
	private static void method63(int n) {
		System.out.println("Method-63");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=star/2+1;
			for (int j = 1; j <= star; j++) {
				System.out.print(k+" ");
				if(j<=star/2) {
					k--;
				}else {
					k++;
				}
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
	private static void method62(int n) {
		System.out.println("Method-62");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			int k=1;
			for (int j = 1; j <= star; j++) {
				System.out.print(k+" ");
				if(j<=star/2) {
					k++;
				}else {
					k--;
				}
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
		
	}
	private static void method61(int n) {
		System.out.println("Method-61");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(i%2+" ");
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
	private static void method60(int n) {
		System.out.println("Method-60");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(j%2+" ");
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
	private static void method59(int n) {
		System.out.println("Method-59");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(i+" ");
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
		
	}
	private static void method58(int n) {
		System.out.println("Method-58");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(j+" ");
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}


	private static void method57(int n) {
		System.out.println("Method-57");
		int star=n;
		int space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*"+" ");
			}
			if(i<=n/2) {
				space++;
				star=star-2;
			}else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
		
	}


	private static void method56(int n) {
		System.out.println("Method-56");
		int star=1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*"+" ");
			}
			if(i<=n/2) {
				space--;
				star=star+2;
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}


	private static void method55(int n) {
		System.out.println("Method-55");
		for (int i = n; i >=1; i--) {
			for (int j = n; j >i; j--) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+96)+" ");
			}
			for (int j = i-1; j >=1; j--) {
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
		
	}


	private static void method54(int n) {
		System.out.println("Method-54");
		for (int i = n; i >=1; i--) {
			for (int j = n; j >i; j--) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+64)+" ");
			}
			for (int j = i-1; j >=1; j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
	}


	private static void method53(int n) {
		System.out.println("Method-53");
		for (int i = n; i >=1; i--) {
			for (int j = n; j >i; j--) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			for (int j = i-1; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}


	private static void method52(int n) {
		System.out.println("Method-52");
		for (int i = 1; i <=n; i++) {
			for (int j = n; j >i; j--) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+96)+" ");
			}
			for (int j = i-1; j >=1; j--) {
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
		
	}


	private static void method51(int n) {
		System.out.println("Method-51");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j>i; j--) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+64)+" ");
			}
			for (int j = i-1; j>=1; j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
	}


	private static void method50(int n) {
		System.out.println("Method-50");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j>i; j--) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int j = i-1; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}


	private static void method49(int n) {
		System.out.println("Method-49");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
		
		
	}


	private static void method48(int n) {
		System.out.println("Method-48");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
	}


	private static void method47(int n) {
		System.out.println("Method-47");
		for (int i = n; i >= 1; i--) {
			int k=1;
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}
		
		
	}


	private static void method46(int n) {
		System.out.println("Method-46");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		
		
	}


	private static void method45(int n) {
		System.out.println("Method-45");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
				
	}


	private static void method44(int n) {
		System.out.println("Method-43");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}


	private static void method43(int n) {
		System.out.println("Method-43");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}


	private static void method42(int n) {
		System.out.println("Method-42");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}


	private static void method41(int n) {
		System.out.println("Method-41");
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}
		}

	private static void method40(int n) {
		System.out.println("Method-40");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		
	}


	private static void method39(int n) {
		System.out.println("Method-39");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		
	}


	private static void method38(int n) {
		System.out.println("Method-38");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
		
	}


	private static void method37(int n) {
		System.out.println("Method-37");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
	}


	private static void method36(int n) {
		System.out.println("Method-36");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}


	private static void method35(int n) {
		System.out.println("Method-35");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}


	private static void method34(int n) {
		System.out.println("Method-34");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}


	private static void method33(int n) {
		System.out.println("Method-33");
		for (int i = 1; i <= n; i++) {
			int num=i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num+" ");
				num=num+n-j;
			}
			System.out.println();
		}
	}


	private static void method32(int n) {
		System.out.println("Method-32");
		for (int i = 1; i <= n; i++) {
			int num;
			if(i%2==0) {
				num=0;
				for (int j = 1; j <= n; j++) {
					System.out.print(num+" ");
					num=num==0?1:0;
				}
			}else {
				num=1;
				for (int j = 1; j <= n; j++) {
					System.out.print(num+" ");
					num=num==0?1:0;
				}
			}
			System.out.println();
		}
		
	}


	private static void method31(int n) {
		System.out.println("Method-31");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}


	private static void method30(int n) {
		System.out.println("Method-30");
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}


	private static void method29(int n) {
		System.out.println("Method-29");
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}


	private static void method28(int n) {
		System.out.println("Method-28");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j<=n+1) {
					System.out.print(j+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}


	private static void method27(int n) {
		System.out.println("Method-27");
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j) {
					System.out.print(k%2+" ");
					k++;
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}


	private static void method26(int n) {
		System.out.println("Method-26");
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j) {
					System.out.print(k+" ");
					k++;
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}


	private static void method25(int n) {
		System.out.println("Method-25");
		int k=65;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j) {
					System.out.print((char)k+" ");
					k++;
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}


	private static void method24(int n) {
		System.out.println("Method-24");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		
	}


	private static void method23(int n) {
		System.out.println("Method-23");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}


	private static void method22(int n) {
		System.out.println("Method-22");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}


	private static void method21(int n) {
		System.out.println("Method-21");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}


	private static void method20(int n) {
		System.out.println("Method-20");
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}


	private static void method19(int n) {
		System.out.println("Method-19");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j==n+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}


	private static void method18(int n) {
		System.out.println("Method-18");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==j) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}


	private static void method17(int n) {
		System.out.println("Method-17");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i<=j) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}


	private static void method16(int n) {
		System.out.println("Method-16");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i<=j) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
		
	}


	private static void method15(int n) {
		System.out.println("Method-15");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println(" ");
		}
		
	}




	private static void method14(int n) {
		System.out.println("Method-14");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j%2+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method13(int n) {
		System.out.println("Method-13");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method12(int n) {
		System.out.println("Method-12");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j%2+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method11(int n) {
		System.out.println("Method-11");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method10(int n) {
		System.out.println("Method-10");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method9(int n) {
		System.out.println("Method-9");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(64+i)+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method8(int n) {
		System.out.println("Method-8");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method7(int n) {
		System.out.println("Method-7");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method6(int n) {
		System.out.println("Method-6");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method5(int n) {
		System.out.println("Method-5");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method4(int n) {
		System.out.println("Method-4");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(64+i)+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method3(int n) {
		System.out.println("Method-3");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method2(int n) {
		System.out.println("Method-2");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
	}

	private static void method1(int n) {
		System.out.println("Method-1");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		
	}

}
