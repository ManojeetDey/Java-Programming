public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		for(int i=1;i<=100;i++)
		{
			a+=i*i;
			b+=i;
		}
		b=b*b;
		System.out.println("The sum of the squares of the first hundred natural numbers is: "+a);
		System.out.println("The square of the sum of the first hundred natural numbers is: "+(b));
		System.out.println("Hence the difference between the sum of the squares of the first hundred natural numbers and the square of the sum is "+b +" - "+a+" ="+(b-a));
	}
}
