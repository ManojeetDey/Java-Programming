
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		boolean d= a >= (b+c) || b >= (a+c) || c >= (a+b);
		System.out.println(d);
	}
}
