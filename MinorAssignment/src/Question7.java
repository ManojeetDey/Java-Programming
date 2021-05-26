import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the year");
         int y = sc.nextInt();
         boolean b=(y%4 == 0 || y%100 == 0);
         System.out.println(b);
         sc.close();
	}

}
