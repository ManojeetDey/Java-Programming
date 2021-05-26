import java.util.*;
public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i<=20)
		{
			System.out.println("Enter the lab attendance and theory attendance");
			int lbat=sc.nextInt();
			int that=sc.nextInt();
			if(lbat>=75 && that>=75)
			{
				System.out.println("allowed");
			}
			else
			{
				System.out.println("not allowed");
			}
			i++;
		}
		sc.close();
	}
}

