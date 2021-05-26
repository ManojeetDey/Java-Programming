import java.util.*;

class Commission {
	double sale, x;

	Commission(double a) {
		sale = a;
	}

	double get_Commisson() {
		if (sale < 500)
			x = 0.02 * sale;
		else if (sale >= 500 && sale < 5000)
			x = 0.05 * sale;
		else if (sale >= 5000)
			x = 0.08 * sale;
		return x;

	}
}

public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sale amount");
		double s = sc.nextDouble();
		if (s < 0)
			System.out.println("Invalid Input");
		else {
			Commission obj = new Commission(s);
			double res = obj.get_Commisson();
			System.out.println("The commission value is " + res);
		}
	}

}
