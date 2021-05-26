import java.util.*;
public class code4 {

	public static int[][] create_array()
	{Scanner sc = new Scanner(System.in);
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
	for(int i=0;i<a.length;i++)
	{
	  for(int j=0;j<a[i].length;j++)
	  {
		  System.out.print(a[i][j]+" ");
	  }
	  System.out.println();
	}
}
	public static int[][] copy_array(int a[][])
	{
		int b[][]=new int[a.length][];
		for(int i=0;i<a.length;i++)
		{
			b[i]=new int[a[i].length];
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[i][j];
			}
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][]=create_array();
		int dupmat[][]=copy_array(mat1);
		System.out.println("Elements of the original matrix");
		display(mat1);
		System.out.println("Elements of duplicate matrix");
		display(dupmat);
	}

}
