public class A6Q10 {
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		int c=0;
		for(char ch=ch1;ch<=ch2;ch++)
		{
			if(c%10==9)
			{
				System.out.println(ch+" ");
			}
			else
				System.out.print(ch+" ");
			c++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printChars('1','Z',10);

	}

}
