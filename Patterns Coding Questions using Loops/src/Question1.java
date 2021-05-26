public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,a=0;
		for(int i=1;i<=5;i++)
		{
		  if(i%2!=0)
		  {
			for(j=a+1;j<a+i;j++)
			  System.out.print(j+"*");
		      System.out.println(j++);
		      a=j;
		
		  }
		  else
		  {
			  a=a+i-1;
			  for(j=a;j>a-i+1;j--)
				  System.out.print(j+"*");
			  System.out.println(j);
		  }
		}
		
	}
}


