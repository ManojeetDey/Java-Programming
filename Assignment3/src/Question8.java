import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the age of Rahul , Ayush and Ajay ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a>b)
       {
    	   if(a>c)
    	   {
    		   System.out.println("Rahul is elder");
    	   }
    	   else
    	   {
    		   System.out.println("Ajay is elder");
    	   }
       }
       else
       {
    	   if(b>c)
    	   {
    		   System.out.println("Ayush is elder");
    	   }
    	   else
    	   {
    		   System.out.println("Ajay is else");
    	   }
       }
       sc.close();
       }

}
