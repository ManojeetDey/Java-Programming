import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");
		int p=0,n=0;double sum=0;
		for(int i=1;i<2;)
		{
			double a=sc.nextDouble();
			sum+=a;
			if(a>0)
			{
				p++;
			}
			else if(a<0)
			{
			n++;
			}
			else if(a==0)
			break;
		}
		if(p>0||n>0)
		{
		System.out.println("The number of positives is "+p);
		System.out.println("The number of negatives is "+n);
		System.out.println("The total is "+sum);
		System.out.println("The average is "+(sum/(p+n)));
		}
		else
			System.out.println("No numbers are entered except 0");
		sc.close();
		
	}

}
