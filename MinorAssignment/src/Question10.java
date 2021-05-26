import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start of the series ");
		int n= sc.nextInt();
		int c=1;
		int sum=n;
		do
		{
			sum+=++n;
			
			c++;
		}while(c!=9);
		System.out.println(sum);
		sc.close();

	}

}
