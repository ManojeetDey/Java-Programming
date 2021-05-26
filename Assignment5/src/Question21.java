import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(y>0)
		{
			int rem=x%y;
			x=y;
			y=rem;
		}
		System.out.println("GCD is "+x);
		sc.close();
	}

}
