import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String str="",str1="",s="";
       System.out.println("Enter a Large number :");
       String n1=sc.next();
       StringBuffer n = new StringBuffer(n1);
       for(int i=0;i<n.length();i++)
       {
    	   for(int j=i+1;j<n.length();j++)
    	   {
    	      if(n.charAt(i)==n.charAt(j))
    	      {
    	    	  n.setCharAt(j,'*');
     	      }
    	   }
       }
       for(int i=0;i<n.length();i++)
       {
    	   for(int j=i;j<n.length();j++)
    	   {
    		   if(n.charAt(j==)
    	   }
       }
    	 /*  if(n.charAt(i) != '*')
    	   {
          	 str=str+n.charAt(i);
          	 str1 = str1 + s + n.charAt(i);
          	 s=",";
    	   }
       }
        System.out.println("The unique digits present in "+ n1 + " are " + str1 + ".");
        int p=0;
        StringBuffer str2 = new StringBuffer(str);
        StringBuffer lrg = new StringBuffer();
        for(int i=0;i<str2.length();i++)
        {  
           char max = 0;p = 0;
     	   for(int j=0;j<str2.length();j++)
     	   {
     	      if(max < str2.charAt(j))
     	      {
     	    	 max = str2.charAt(j);
     	    	 p = j;
      	      }
     	   }
          lrg.append(max);
  	      str2.setCharAt(p,'#');
        }
	     long l = Long.parseLong(lrg.toString());
        System.out.println("The largest number possible out of these unique digits is " + l + ".");*/
    	   
       sc.close();
	}

}