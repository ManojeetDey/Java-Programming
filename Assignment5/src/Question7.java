import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n= sc.nextInt();
		int a=1,c=0; double sum=0;
		for(int i=1;i<=n;i++)
		{
			if(c%2==0||c==0)
				sum+=a;
			else
				sum-=a;
			a=a+2;
			c++;
		}
		System.out.println("The sum of "+n+" terms of the serie is "+sum);
		sc.close();
	}

}
