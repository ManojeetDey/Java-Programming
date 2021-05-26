
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		for(int n=16;n<=2048;n=n*2)
		{
			a=Math.log(n);
			System.out.println(a + "\t" + n + "\t" + (n*a) + "\t" + (n*n) + "\t" + (n*n*n) + "\t" + Math.pow(2,n));
		}

	}

}
