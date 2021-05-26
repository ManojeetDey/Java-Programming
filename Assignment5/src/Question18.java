public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int k=Integer.parseInt(args[1]);
		double n1=n/2;
		double nm;
		do {
			nm=n1;
			n1=(nm+(n/nm))/k;
		}while((n1-nm)>0.000001);
		System.out.println("The "+k+"th root of "+n+" is "+n1);
	}

}
