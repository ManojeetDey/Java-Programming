import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount of water in kilograms ");
		int wt=sc.nextInt();
		System.out.println("enter the initial and final temperatures of the water");
		int inttemp=sc.nextInt();
		int fintemp=sc.nextInt();
		int q=wt*(inttemp - fintemp)*4184;
		System.out.println("The energy in joules is "+q);
		sc.close();

	}

}
