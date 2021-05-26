import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a ,b c ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d;
		double r1,r2;
		if(a!=0)
		{
			d=(b*b) - (4*a*c);
			if(d > 0)
			{
				 r1= (-b +(Math.pow(d, 0.5)))/2*a;
				 r2= (-b -(Math.pow(d, 0.5)))/2*a;
				System.out.println("The Equation has 2 roots r1= "+r1+ " r2= "+r2);
			}
			else if(d==0)
			{
				r1=(-b)/2*a;
				System.out.println("The Equation has 1 root r1= "+r1);
			}
			else 
			{
				System.out.println("The Equation has no real roots ");
			}
		}
		else
		{
			System.out.println("not a quadratic equation");
		}
		sc.close();

	}

}
