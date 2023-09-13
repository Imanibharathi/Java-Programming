package Arrays;

public class MainSearch {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		int search = isThere(ar,30);
		if(search==-1)
			System.out.println("Element is not there in");
		else
			System.out.println("Element is there in "+search);

	}

	private static int isThere(int[] ar, int n) {
	for (int i = 0; i < ar.length; i++) {
		if(ar[i]==n)
			return i;
	}	
	return -1;
	}

	
}
