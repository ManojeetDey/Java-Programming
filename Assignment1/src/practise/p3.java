package practise;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numi= Integer.parseInt(args[0]);
		System.out.println(numi);
		//valueOf tells us the value of the string arguments in integer form
		int numii=Integer.valueOf(args[0]);
				System.out.println(numii);
		double numd=Double.parseDouble(args[1]);
		System.out.println(numd);
		double numdd=Double.valueOf(args[1]);
		System.out.println(numdd);
		float numf=Float.parseFloat(args[2]);
		System.out.println(numf);
		float numff=Float.valueOf(args[2]);
		System.out.println(numff);
		
		int num3=Integer.valueOf("AA",16);
		System.out.println(num3);
		int num4=Integer.parseInt("AA",16);
		System.out.println(num4);
		

	}

}
