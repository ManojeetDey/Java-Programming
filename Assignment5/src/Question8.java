import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int fac=1;
		for(int i=n;i>=1;i--)
		{
			fac*=i;
		}
		System.out.println("THe factorial of "+n+" is = "+fac);
		sc.close();
	}

}
