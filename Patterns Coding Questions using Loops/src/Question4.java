
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; 
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=(n-1);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--)
			{
				//System.out.print();
			}
			System.out.println();
		}

	}

}
