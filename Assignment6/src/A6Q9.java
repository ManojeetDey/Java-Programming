import java.util.*;
public class A6Q9 {
public static void fraction(int a, int b,int c,int d)
{
	int lcm=0;
	if(b>d)
	{
	for(int i=1;i<=b;i++)
	{
		if(b%i==0&&d%i==0)
		  lcm=i;
	}
	}
	else 
		for(int i=1;i<=d;i++)
		{
			if(b%i==0&&d%i==0)
			  lcm=i;
		}
	int numerator=(a*(lcm/b))+(c*(lcm/d));
	System.out.println("The sum of "+a+"/"+b+" + "+c+"/"+d+" = "+numerator+"/"+lcm);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two fractional numbers (a/b) and (c/d)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		fraction(a,b,c,d);
		sc.close();
	}

}
