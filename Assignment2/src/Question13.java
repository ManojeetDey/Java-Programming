import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of minutes ");
		int mins=sc.nextInt();
		int hrs=mins/60;
		int days=hrs/24;
		int yrs=days/365;
		int left= days%365;
		System.out.println(mins +" minutes is approximately "+yrs +" years and "+left +" days");
		sc.close();

	}

}
