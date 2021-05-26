import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n=sc.nextInt();
		int pass=0,fail=0;
		while(n-- > 0)
		{
			System.out.println("Enter the marks ");
			double marks=sc.nextDouble();
			if(marks>=40)
			pass++;
			else
				fail++;
		}
		System.out.println("Number of students passed "+pass);
		System.out.println("Number of students failed "+fail);
		sc.close();
	}

}
