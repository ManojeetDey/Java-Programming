import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of x in radians");
		double x=sc.nextDouble();
		x=(x/180)*3.14;
		int c=0;
		double sum=0;
		int i=1;
			while(sum<0.0000001)
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
			i=i+2;
			c++;
		}
		System.out.println(sum);
		sc.close();		
	}

}
