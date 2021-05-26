import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n= sc.nextInt();
		int c=0,a=0,b=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}

}
