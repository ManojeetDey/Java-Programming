package practise_2;
import java.util.Scanner;
public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nationality of the customer ");
		String a= sc.next();
		if(a.equalsIgnoreCase("INDIAN"))
		{
			System.out.println("Gramya Bank will give housing loan");
		}
		System.out.println("Enter Nationality of the customer ");
		String b= sc.next();
		if(b.equalsIgnoreCase("INDIAN"))
		{
			System.out.println("Gramya Bank will give housing loan");
		}		
		sc.close();

	}

}
