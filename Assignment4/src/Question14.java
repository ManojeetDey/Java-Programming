import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		int a=0;
		for(int i=1;i<=n;i++)
		{
			if((int)((Math.pow(2, i)))<=n &&((int) (Math.pow(2,(i+1))))>n)
			{
				a=(int)(Math.pow(2, i));
				break;
			}
		}
		System.out.println(a);
		sc.close();
	}

}
