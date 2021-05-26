import java.util.*;
public class A8q1 {
	public static void Matrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of the matrix");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns of the matrix");
		int n= sc.nextInt();
		System.out.println("Enter the elements of the matrix");
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix();
	}

}
