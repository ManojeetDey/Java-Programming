import java.util.*;
public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		double x=sc.nextDouble();
		double sum=1,term=1;
		for(int i=1;sum!=sum+term;i++)
		{
			sum=sum+term;
			term*=x/i;
		}
		System.out.println("e("+x+") = "+sum);
		sc.close();
	}

}
