import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int i=1;
		System.out.println("with using while loop");
		while(i<=n)
		{
			System.out.println("* * * * *");
			i++;
		}
		sc.close();
		System.out.println("with using for loop: ");
		for(i=1;i<=n;i++)
		{
			System.out.println("* * * * *");
		}
		sc.close();
	}

}
