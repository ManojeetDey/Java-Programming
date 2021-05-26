import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();int a;
		double s=0,h=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the value of a["+i+"]");
			a=sc.nextInt();
			s+=(1/a);
		}
		h=n/s;
		System.out.println("The harmonic mean is "+h);
		sc.close();
	}

}
