import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=2;
		while(n!=0)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
			else
				i++;
		}
		sc.close();
	}

}
