
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		double t=Double.parseDouble(args[2]);
        double res= p * Math.exp(r * t);
        System.out.println("principal = "+p );
        System.out.println("Rate = "+r );
        System.out.println("Time = "+t );
        System.out.println("Interest "+ res);
	}

}
