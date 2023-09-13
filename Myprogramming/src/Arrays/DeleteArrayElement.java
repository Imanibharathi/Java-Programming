package Arrays;

public class DeleteArrayElement {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		ar=deletearr(ar,2);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}

	}

	private static int[] deletearr(int[] ar, int n) {
		if(n<0 || n>ar.length)
		{
			System.err.println("index not in range");
			return ar;
		}
		int y[] = new int[ar.length-1];
		for (int i = 0; i < y.length; i++) {
			if(i<n)
				y[i]=ar[i];
			else
				y[i]=ar[i+1];
		}
return y;
	}

}
