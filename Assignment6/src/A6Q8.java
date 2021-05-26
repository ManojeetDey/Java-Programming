import java.util.*;
public class A6Q8 {
	public static double area(int n, double s)
	{
		double area=(n*s*s)/(4*Math.tan(Math.PI/n));
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of sides:");
		int n=sc.nextInt();
		System.out.println("Enter the side:");
		double s=sc.nextDouble();
		double area=area(n,s);
		System.out.println("The area of the polygon is "+area);
		sc.close();

	}

}
