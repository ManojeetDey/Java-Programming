import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number between 0 and 1000 ");
     int a=sc.nextInt();
     int sum=0;
     sum+=a%10 ;
     a=a/10;
     sum+=a%10 ;
     a=a/10;
     sum+=a%10 ;
     a=a/10;
     sum+=a ;
     System.out.println("the sum of the digits :" +sum);
     sc.close();
	}

}
