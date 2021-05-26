public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int k=0;
		for(int i=1;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			k++;
		}
		System.out.println("The number of primes less than or equal to n are "+k);
	}

}
