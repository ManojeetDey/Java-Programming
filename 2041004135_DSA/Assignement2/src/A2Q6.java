import java.util.*;
abstract class Shape{
	public abstract double area();
}
class Square extends Shape{
	public double area()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of the square");
		double a=sc.nextDouble();
		double ar=a*a;
		return ar;
	}
}
	class Triangle extends Shape{
		public double area()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the height and base of the triange");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double ar=0.5*b*a;
			return ar;
		}
	}
	
class Circle extends Shape{
	public double area()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	double r=sc.nextDouble();
	double ar=Math.PI*r*r;
	return ar;
	}
}


public class A2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Square();
		System.out.println("The area of the square is "+s.area());
		s= new Triangle();
		System.out.println("The area of the triangle is "+s.area());
		s=new Circle();
		System.out.println("The area of the circle is "+s.area());

	}

}
