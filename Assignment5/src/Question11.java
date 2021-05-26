import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of x in radians");
		double x=sc.nextDouble();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int c=0;
		double sum=0;
		for(int i=1;i<=n;i=i+2)
		{
			int fac=1;
			for(int j=1;j<=i;j++)
			{
				fac*=i;
			}
			if(c%2==0)
				sum+=(Math.pow(x,i))/fac;
			else
				sum-=(Math.pow(x,i))/fac;
			c++;
			if(sum>=0.000001)
				break;
		}
		System.out.println(sum);
		sc.close();		
	}

}
