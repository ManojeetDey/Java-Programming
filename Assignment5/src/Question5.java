import java.util.*;
public class Question5 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int n=sc.nextInt();
		double sum=0;
		System.out.println("Enter the numbers");
	
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
			sum+=a;
		}
		
		System.out.println("The sum of the numbers is "+sum);
		System.out.println("The average of the numbers is "+(sum/n));
		sc.close();
	}

}
