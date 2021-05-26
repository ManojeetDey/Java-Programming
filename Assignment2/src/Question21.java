
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t= Double.parseDouble(args[0]);
		double a= Math.toRadians(2*t);
		double b= Math.toRadians(3*t);
		double res= Math.sin(a)  + Math.sin(b);
		System.out.println("sin(2*" +t+") + sin(3*"+ t+") = " +res);

	}

}
