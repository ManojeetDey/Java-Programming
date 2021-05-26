 
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int d= Integer.parseInt(args[0]);
      int m= Integer.parseInt(args[1]);
      boolean res = ((m == 3 && d >= 20 && d <=31) || (m == 4 && d >= 1 && d<= 30) || (m==5 && d >= 1 && d <=31) || (m ==6 && d >=1 && d <= 20));
      System.out.println(res);
         
	}

}
