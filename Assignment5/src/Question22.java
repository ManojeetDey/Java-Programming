import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("the number is prime");
		}
		else 
		System.out.println("the number is not prime");
		sc.close();
	}

}
