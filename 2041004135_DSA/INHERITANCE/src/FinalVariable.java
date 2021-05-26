class FVar{
	final int MIN;
	public FVar()
	{
		MIN=-1;
	}
	//final
	static final double X=3.141592653589793;
	// a blank final static variable
	static final double EC;
	static {
		EC=2.3;
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final variable initialised at the time of declaration
		final int T=5;
		//a blank final variable 
		final int CAPACITY;
		//instance intialising block for
		//initialising CAPACITY
		{
			CAPACITY=25;
		}
		
	}

}
