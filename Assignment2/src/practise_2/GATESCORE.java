package practise_2;
import java.util.Scanner;
public class GATESCORE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("whether Gate Score is VALID");
		boolean a= sc.nextBoolean();
		if(a== true)
		{
			System.out.println("Candidate can apply for the oil company");
		}
		sc.close();
	}

}
