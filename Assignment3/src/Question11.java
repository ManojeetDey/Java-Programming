import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the weight in kg and height in meters");
		double weight=sc.nextDouble();
		double height=sc.nextDouble();
		double bmi=weight/(height*height);
		if(bmi<18.5)
		{
			System.out.println("underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("normalweight");
		}
		else if(bmi>=25 && bmi<=29.9)
		{
			System.out.println("overweight");
		}
		else if(bmi>=30)
		{
			System.out.println("obese");
		}
		sc.close();

	}

}
