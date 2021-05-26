import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three points of the triangle");
		double x1= sc.nextDouble();
		double y1=sc.nextDouble();
		double x2= sc.nextDouble();
		double y2=sc.nextDouble();
		double x3= sc.nextDouble();
		double y3=sc.nextDouble();
		double s1=Math.pow((Math.pow((x2-x1),2))+(Math.pow((y2-y1), 2)),0.5);
		double s2=Math.pow((Math.pow((x3-x2),2))+(Math.pow((y3-y2), 2)),0.5);
		double s3=Math.pow((Math.pow((x3-x1),2))+(Math.pow((y3-y1), 2)),0.5);
		double s= (s1+s2+s3)/2;
		double area=Math.pow((s*(s-s1)*(s-s2)*(s-s3)), 0.5);
		System.out.println("The area of the triangle is "+area);
		sc.close();

	}

}
