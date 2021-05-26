import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of x  and n: ");
		int x=sc.nextInt(),n=sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac*=i;
		}
		double ans=(Math.pow(x,n))/fac;
		System.out.println(ans);
		sc.close();
	}

}
