import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your gender (M or F):");
		char g=sc.next().charAt(0);
		System.out.println("Enter your First Name :");
		String fn=sc.next();
		System.out.println("Enter your Last Name: ");
		String ln=sc.next();
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		if(g=='F')
		{
			if(age>=20)
			{
				System.out.println("Are you married "+fn+" Y/N");
				char m=sc.next().charAt(0);
				if(m=='Y')
				{
					System.out.println("Then I shall call you Mrs. "+fn+" "+ln);
				}
				else
				{
					System.out.println("Then I shall call you Ms. "+fn+" "+ln);
				}
			}
			else
			{
				System.out.println("I shall call you "+fn+" "+ln);
			}
		}
		else
		{
			if(g=='M')
			{
				if(age>=20)
				{
					System.out.println("Then I shall call you Mr. "+fn+" "+ln);
				}
				else
				{
					System.out.println("Then I shall call you "+fn+" "+ln);
				}
			}
		}
		sc.close();

	}

}
