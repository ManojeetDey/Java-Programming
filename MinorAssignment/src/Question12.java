import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to check weather it is even or not ");
		int n=sc.nextInt();
		boolean b=((n/2)*2 == n);
		System.out.println(b);
		sc.close();

	}

}
