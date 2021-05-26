package classandobject;

import java.util.*;

class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;

	BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	BMI(String name, double weight, double height) {
		this.name = name;
		this.age = 20;
		this.weight = weight;
		this.height = height;
	}

	public static double getBMI(double weight, double height) {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}

	public static void getstatus(double v) {
		if (v < 18.5)
			System.out.println("Underweight");
		else if (v >= 18.5 && v < 25)
			System.out.println("Normal");
		else if (v >= 25.0 && v < 30)
			System.out.println("Overweight");
		else if (v >= 30.0)
			System.out.println("Obese");
		else
			System.out.println("not the correct BMI");
	}
}

public class BMI_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String n = sc.next();
		System.out.println("Enter age");
		int a = sc.nextInt();
		System.out.println("Enter Weight");
		double w = sc.nextDouble();
		System.out.println("Enter height");
		double h = sc.nextDouble();
		BMI ob = new BMI(n, a, w, h);
		double res = BMI.getBMI(w, h);
		BMI.getstatus(res);

	}

}
