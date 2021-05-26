import java.util.*;
public class code3 {
	public static double sum_Major_Diagonal(double M[][] )
	{
		double sum=0;
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				if(i==j)
					sum+=M[i][j];
		return sum;
	}
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	double arr[][]=new double [4][4];
	System.out.println("Enter the elements of the matrix");
	for(int i=0;i<4;i++)
		for(int j=0;j<4;j++)
		arr[i][j]=sc.nextDouble();
	
	double sum=sum_Major_Diagonal(arr);
	System.out.println("Elements of the matrix are");
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++)
			System.out.print(arr[i][j]+" ");
	System.out.println();}
	System.out.println("The sum of the elements of the major diagonal is "+sum);
	sc.close();
	}

}
