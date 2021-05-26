import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amt=sc.nextInt();
		System.out.println("Enter the annual rate:");
		double rt=sc.nextDouble();
		System.out.println("Enter the number of months:");
		int mn=sc.nextInt();
		rt=(rt/1200);
		double s=0;
		for(int i=1;i<=mn;i++)
		{
			s=(amt+s)*(1+rt);
		}
		System.out.println("the amount in the savings account after the "+mn+" month= "+s);
		sc.close();
	}

}
