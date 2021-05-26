import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		int a;
		String s="";
		do {
			a=n%2;
			s+=a;
			n=n/2;
		}while(n!=0);
		System.out.println("The binary representation is: "+s);
		sc.close();
	}

}
