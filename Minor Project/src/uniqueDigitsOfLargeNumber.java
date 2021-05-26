import java.util.*;
public class uniqueDigitsOfLargeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		String n=sc.next();
		StringBuffer str=new StringBuffer(n);
		String str1="",comma="",str2="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
    		  	{
    			  str.setCharAt(j, '*');
    		  	}
			}
			
				if(str.charAt(i)!='*')
				{
					str1+=str.charAt(i);
					str2=str2+comma+str.charAt(i);
					comma=",";
				}
			}
		
			System.out.println("The unique digits present in "+n+" are "+str2+".");
			StringBuffer str3=new StringBuffer(str1);
			StringBuffer lrg=new StringBuffer();
			int c;
			for(int i=0;i<str3.length();i++)
			{
				 char maximum = 0;c = 0;
		     	   for(int j=0;j<str3.length();j++)
		     	   {
		     	      if(maximum < str3.charAt(j))
		     	      {
		     	    	 maximum = str3.charAt(j);
		     	    	 c = j;
		      	      }
		     	   }
		          lrg.append(maximum);
		  	      str3.setCharAt(c ,'#');
		        }
			String lrgnew=lrg.toString();
			     long l = Long.parseLong(lrgnew);
		        System.out.println("The largest number possible out of these unique digits is " + l + ".");
		       sc.close();
	
			
	}
}



