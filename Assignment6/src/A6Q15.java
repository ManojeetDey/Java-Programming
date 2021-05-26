import java.util.*;
public class A6Q15 {
public static double area(int base,int height)
{
	return(0.5*base*height);
}
public static  double area(float side)
{
	return(side*side);
}
public static double area(double radius)
{
	return(Math.PI*radius*radius);
}
public static double area(double length ,double breadth)
{
	return (length*breadth);
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base and height of the tringle:");
		int base= sc.nextInt();
		int height=sc.nextInt();
		System.out.println("The area of the traingle is "+area(base,height));
		System.out.println("Enter the side of the square:");
		float side=sc.nextFloat();
		System.out.println("The area of the Square is "+area(side));
		System.out.println("Enter the radius of the circle:");
		double radius= sc.nextDouble();
		System.out.println("The area of the circle is "+area(radius));
		System.out.println("Enter the lenght and breadth of the rectangle:");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		System.out.println("The area of the traingle is "+area(length,breadth));
		sc.close();
	}

}
