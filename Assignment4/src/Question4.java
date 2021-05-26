import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Count from: ");
		int cf=sc.nextInt();
		System.out.println("Count to: ");
		int ct=sc.nextInt();
		System.out.println("Count by: ");
        int cb=sc.nextInt();
        for(int i=cf;i<=ct;i=i+cb)
        {
        	System.out.print(i+" ");
        }
        sc.close();
	}

}
