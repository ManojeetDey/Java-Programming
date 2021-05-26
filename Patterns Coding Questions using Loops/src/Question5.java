import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int k=1;k<=6;k++)
				{
					System.out.print(i);
				}
				System.out.println(i+1);
			}
			else
			{
				System.out.print(i+1);
				for(int k=1;k<=6;k++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
		}
		sc.close();

	}

}
