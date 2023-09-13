package Arrays;

public class HowmanyElmentsinArray {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50,60,70,80,90,100,180,200};
		int count = doCount(ar,10,200);
		System.out.println("Elements are "+count);

	}

	private static int doCount(int[] ar, int start, int end) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>=start && ar[i]<=end)
				count++;
		}
		return count;
	}

}
