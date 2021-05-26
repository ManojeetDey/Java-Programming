import java.util.*;

public class A1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		System.out.println("Enter the "+n+" sentences");
		String input[] = new String[n];
		sc.nextLine();// this is to clear the buffer memory!!
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextLine();
		}
		System.out.println("Printing in reverse order");
		for (int i = n - 1; i >=0; i--) {
			System.out.println(input[i]);
		}
		sc.close();
	}

}
