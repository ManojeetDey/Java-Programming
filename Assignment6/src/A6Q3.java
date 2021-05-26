import java.util.*;
public class A6Q3 {

	public static int reverse(int n)
	{
		int rem;
		int n1=0;
		while(n!=0)
		{
			rem=n%10;
			n1=(n1*10)+rem;
			n=n/10;
		}
		return n1;
	}
	public static boolean isPalindrome(int n)
	{
		if(n==reverse(n))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int n=sc.nextInt();
		boolean p=isPalindrome(n);
		if(p==true)
			System.out.println("The number is palindrome number");
		else
			System.out.println("The number is not palindrome number");
		sc.close();
	}

}
