import java.util.*;
public class RaggedArray {
	public static int[][] create_ragged_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int row=sc.nextInt();
		int arr[][]= new int[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter the number of column in row "+i);
			arr[i]=new int[sc.nextInt()];
		}
		System.out.println("Enter the elements of the array ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void display(int a[][])
	{
		System.out.println("Elements of the matrix are");
		for(int i=0;i<a.length;i++)
		{
		  for(int j=0;j<a[i].length;j++)
		  {
			  System.out.print(a[i][j]+" ");
		  }
		  System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][]=create_ragged_array();
		display(mat1);
	}

}
