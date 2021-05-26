import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n= sc.nextInt();
		boolean b=((n/2)*2 ==n );//without using bitwise operator
		boolean c=((n & 1)==0);//with bitwise and
		System.out.println(b);
		System.out.println(c);
		sc.close();

	}

}
