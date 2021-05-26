import java.util.*;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		double m= sc.nextDouble();
		if(m>=40)
		{
			System.out.println("Congratulations! you have passed the exam");
		}
		else
		{
			System.out.print("sorry you have failed");
		}
		sc.close();

	}

}
