package Arrays;

public class OddorEveninArray {

	public static void main(String[] args) {
		int ar[] = {1,3,2,4,5,6,7,8,9,12};
		int c[]=isoddoreven(ar);
		System.out.println(c[1]+" odd no");
		System.out.println(c[0]+" even no");

	}

	private static int[] isoddoreven(int[] ar) {
		int ec =0; int oc=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
		int count[]= {ec,oc};
		return count;
	}

}
