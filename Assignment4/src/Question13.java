import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		int a,s=0;
		if(n%9==0)
		{
			System.out.println("The number "+n+" is divisible by 9");
		}
		else
		{
			System.out.println("The number "+n+" is not divisible by 9");	
		}	
		do { 
			a=n%10;
			System.out.println(a);
			n=n/10;
			s+=a;
		   }
	   while(n!=0);	
	   if(s%9==0)
			{
				System.out.println("The sum of the digits of  is divisible by 9");
			}
			else
				System.out.println("The sum of the digits of  is divisible by 9");
			sc.close();
		
	}

}
