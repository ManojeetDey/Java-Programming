import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side= sc.nextDouble();
		double area=((3*Math.sqrt(3))/2)*Math.pow(side,2);
		System.out.println("The area of the hexagon is "+area);
		sc.close();
		

	}

}
