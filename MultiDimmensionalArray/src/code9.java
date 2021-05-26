import java.util.*;

public class code9 {
	public static double[][] getMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int col = sc.nextInt();
		double a[][] = new double[row][col];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		return a;
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] m = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					m[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return m;
	}

	public static void displayMatrix(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mat1[][] = getMatrix();
		double mat2[][] = getMatrix();
		System.out.println("The elements of the 1st matrix are:");
		displayMatrix(mat1);
		System.out.println("The elements of the 2nd matrix are:");
		displayMatrix(mat2);
		if(mat1[0].length== mat2.length)
		{
		double[][] mat3 = multiplyMatrix(mat1, mat2);
		System.out.println("The multiplied matrix is:");
		displayMatrix(mat3);
		}
		else
			System.out.println("Matrix multiplication is not possible");

	}

}
