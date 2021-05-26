import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double feet= sc.nextDouble();
		double meter= feet * 0.305;
		System.out.println( feet +"feet is "+meter + "meters.");
		sc.close();
	}

}
