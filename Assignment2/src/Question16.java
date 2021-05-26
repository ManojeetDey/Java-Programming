
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int randnum1=a+(int)( Math.random() * (b-a+1) );
		int randnum2=a+(int)( Math.random() * (b-a+1) );
		System.out.println(randnum1 + randnum2);

	}

}
