import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double invamt=sc.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double rate=sc.nextDouble();
		rate/=1200;
		System.out.println("Enter number of years: ");
		double years=sc.nextDouble();
		years*=12;
		double futureInvestmentValue= invamt* (Math.pow((1+rate),(years)));
		System.out.println("Accumulated value is "+futureInvestmentValue);
		sc.close();

	}

}
