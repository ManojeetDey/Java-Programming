import java.util.*;
public class MultiDimmensionalArray {
	public static void main(String args[])
	{
		int row,col,i,j;
		int arr[][]=new int[10][10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of row (max 10)");
		row=sc.nextInt();
		System.out.println("Enter the number of columns (max 10)");
		col=sc.nextInt();
		System.out.println("Enter elements of 2d array");
		//entering the elements of the array
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		//Printing the array 
			for(i=0;i<row;i++)
			{for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
		sc.close();
	}

}
