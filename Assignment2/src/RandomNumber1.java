/*
 * Name:- Manojeet Dey
 * Registration no.- 2041004135
 */
public class RandomNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int min= Integer.parseInt(args[0]);
		int max=Integer.parseInt(args[1]);*/
		int min =10 , max=49;
		double num1= Math.random();		
	       int num2 =min + (int)((num1)*(max-min));
	       System.out.println(num2);
	       
		}

	}


