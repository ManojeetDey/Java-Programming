
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j%i==0 || i%j==0)
					System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println(i);
		}
	}

}
