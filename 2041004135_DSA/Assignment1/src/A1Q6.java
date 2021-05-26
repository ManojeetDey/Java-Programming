import java.util.*;

public class A1Q6 {
	public static int[] getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int mat[]=new int[size];
		System.out.println("Enter the elements of the matrix");
		for (int i = 0; i < size; i++) {
			mat[i] = sc.nextInt();
		}
		return mat;
	}

	public static void Max_Min(int mat[]) {
		int max = mat[0], min = mat[0];
		for (int i = 1; i < mat.length; i++) {
			if (max < mat[i])
				max = mat[i];
			if (min > mat[i])
				min = mat[i];
		}
		System.out.println("The largest number in the array is " + max);
		System.out.println("The smallest number in the array is " + min);
	}
	public static void predefined(int mat[]) {
		int max = mat[0], min = mat[0];
		for (int i = 1; i < mat.length; i++) {
			max=Math.max(max, mat[i]);
			min=Math.min(min, mat[i]);
		}
		System.out.println("PRedefined java Method");
		System.out.println("The largest number in the array is " + max);
		System.out.println("The smallest number in the array is " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []mat=getdata();
		Max_Min(mat);
		predefined(mat);
	}

}
