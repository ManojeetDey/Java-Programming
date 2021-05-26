
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   double a = Math.random();
		   double b= Math.random();
		   double c = Math.random();
		   double d= Math.random();
		   double e = Math.random();
		   double max =Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
		   double avg = (a+b+c+d+e)/5;
		   double min=Math.min(a, Math.min(b,Math.min(c,Math.min(d, e))));
		   System.out.println("Maximum = "+ max);
		   System.out.println("Minimum = "+ min);
		   System.out.println("Average = "+ avg);
		   
		   
	       
	       
	}

}
