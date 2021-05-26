import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double d=Math.sqrt((a*a)+(b*b));
		if(d<=10)
		{
			System.out.println("Point ("+a+", "+b+") is in the circle");
		}
		else
		{
			System.out.println("Point ("+a+", "+b+") is not in the circle");
		}
		sc.close();
	}

}
