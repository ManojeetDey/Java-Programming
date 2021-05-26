import java.util.*;
public class A7Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] value=new int[100];
		int input;
		int count=0;
		System.out.println("Enter the integers between 1 and 100:");
		do {
			input=sc.nextInt();
			value[count]=input;
			count+=1;
		}while(input != 0);
			sc.close();
		countOccurence(value);

	}
	public static void countOccurence(int[] list)
	{
		
	}

}
