
public class A6Q6 {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			return false;
		}
		 return true;
	}
	public static boolean isPalindrome(int n) {
		int n1=n;
		int rem;
		int c=0;
		while(n>0)
		{
			rem=n%10;
			c=(c*10)+rem;
			n=n/10;
		}
		if(c==n1)
			return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num=2;
		while(count<=100)
		{
			if(isPrime(num)&&isPalindrome(num))
			{
				System.out.print(num+" ");
				if(count%10==9)
					System.out.println();
				count++;
			}
			num++;
			
		}

	}

}
