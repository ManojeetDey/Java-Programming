import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks of the student ");
		int n=sc.nextInt();
		if(n>=40)
		{
			System.out.println("Congratulation! You have passed the exam .");
		}
		else
		{
			System.out.println("Sorry ! You have failed the exam.");
		}
		sc.close();
	}

}
