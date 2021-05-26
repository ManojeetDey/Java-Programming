import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight=sc.nextDouble();
		weight=weight*0.45359237;
		System.out.println( "Enter height in inches: ");
		double height=sc.nextDouble();
		height*=0.0254;
		double bmi=weight/(height*height);
		System.out.println("BMI is "+bmi );
		sc.close();

	}

}
