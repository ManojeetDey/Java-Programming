
public class A6Q2 {
	public static int getPentagonalNumber(int n)
	{
		int r=n*(3*n -1)/2;
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i++)
		{
			int num = getPentagonalNumber(i);
			System.out.print(num+"\t\t");
			count++;
			if(count==10)
			{
				count=0;
				System.out.println();
			}
		}

	}

}
