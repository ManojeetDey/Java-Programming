import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a character");
       char a= sc.next().charAt(0);
       if(a>=65&&a<=90)
       {
    	   System.out.println("The Character "+ a+" is UpperCase");
       }
       else if(a>=91&&a<=116)
       {
    	   System.out.println("The Character "+ a+" is LowerCase");
       }
       else if((a>=0 && a<=47)|| (a>=58 && a<=64)||(a>=91 && a<=96)||(a>=123 && a<=127))
       {
    	   System.out.println("The Character "+ a+" is Special Character");
       }
      
    		   sc.close();
	}

}
