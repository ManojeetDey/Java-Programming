import java.util.*;
public class attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the theory attendance and lab attendance");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		if(a1>=75 && a2>=75)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
		sc.close();

	}

}
