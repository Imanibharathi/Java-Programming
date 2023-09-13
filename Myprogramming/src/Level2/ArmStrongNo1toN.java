package Level2;

public class ArmStrongNo1toN {
	public static void main(String[] args) 
	{
		int sum=0;int d;int t;
		for (int i = 1; i <= 5000; i++) 
		{
			t = i;
			while(t>0) {
				d= t%10;
				sum=sum+d*d*d;
				t=t/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			sum=0;
		}
	}

}
