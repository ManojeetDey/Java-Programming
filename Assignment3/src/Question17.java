import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n=sc.nextInt();
		boolean a=(n%5==0&&n%6==0);
		boolean b=(n%5==0||n%6==0);
		boolean c=!(a&&b);//(a^b)
		System.out.println("Is 10 divisible by 5 and 6? "+a);
		System.out.println("Is 10 divisible by 5 or 6? "+b);
		System.out.println("Is 10 divisible by 5 or 6, but not both? "+c);
		sc.close();
	}

}
