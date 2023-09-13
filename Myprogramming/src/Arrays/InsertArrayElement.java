package Arrays;

public class InsertArrayElement {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		ar = doInsert(ar,2,39);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}

	}

	private static int[] doInsert(int[] ar, int n, int ele) {
		if(n<0 || n>ar.length) {
			System.out.println("Index not in range ");
			return ar;
		}
		int y[] = new int[ar.length+1];
		y[n] = ele;
		for (int i = 0; i < y.length; i++) {
			if(i<n)
				y[i]=ar[i];
			else
				y[i+1]=ar[i];
		}
		return y;
	}

}
