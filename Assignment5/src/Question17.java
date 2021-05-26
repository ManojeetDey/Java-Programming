import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		double n1=n/2;
		double nm;
		do{
			nm=n1;
			n1=(nm+(n/nm))/2;
		}while((nm-n1)!=0);
		System.out.println("The square root of "+n+" by newton's method is "+n1);
		sc.close();
	}

}
