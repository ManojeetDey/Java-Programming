import java.util.*;

public class A1Q5 {

	public static boolean isOdd(int n) {
		int a=n&1;
		if (a== 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean ans=isOdd(n);
		if(ans==true)
		System.out.println("odd");
		sc.close();
	}

}
