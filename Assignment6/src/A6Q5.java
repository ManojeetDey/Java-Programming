
public class A6Q5 {
public static boolean isPrime(int n)
{
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}

	}

}
