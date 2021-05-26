import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Degree in Celsius: ");
		double celsius=sc.nextDouble();
		double fahrenheit=(9/5)* celsius +32;
		System.out.println(celsius + " is "+fahrenheit + " Fahrenheit.");
		sc.close();
	}

}
