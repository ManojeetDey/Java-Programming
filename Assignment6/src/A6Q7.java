
public class A6Q7 {
public static boolean isTwinPrime(int n)
{
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=1000;i++)
		{
			if(isTwinPrime(i)&&(isTwinPrime(i+2)))
					{
				System.out.println("("+i+", "+(i+2)+")");
					}
		}

	}

}
