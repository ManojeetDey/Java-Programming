import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the distance to drive ");
		int d=sc.nextInt();
		System.out.println("the fuel efficiency of the car in miles per gallon ");
		int f=sc.nextInt();
		System.out.println("the price per gallonn ");
		int p=sc.nextInt();
		double c=(d/f)*p;
		System.out.println("the cost of the trip = "+ c);
		
		

	}

}
