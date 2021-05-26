import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the balance");
		int bal=sc.nextInt();
		System.out.println("enter the anual interest rate");
		int rate=sc.nextInt();
		double interest=bal * (rate/1200);
	   System.out.println("the interest for the next month is "+interest);
	   sc.close();

	}

}
