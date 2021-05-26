import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of eggs ");
		int eggs=sc.nextInt();
		int gross= eggs/144;
		int left=gross%144;
		int dozen=left/12;
		left=left%12;
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, and "+left+".");
		sc.close();
		

	}

}
