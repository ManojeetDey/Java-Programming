
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		double sum=0;
		double a=0;
		for(int i=1;i<=n;i++)
		{
			a=Math.random();
			System.out.println(a);
			sum+=a;
		}
		sum/=n;
		System.out.println("Their average is "+sum);

	}

}
