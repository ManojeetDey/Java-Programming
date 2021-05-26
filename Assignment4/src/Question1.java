import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i=1;
       System.out.println("Enter a message: ");
       String s=sc.next();
       while(i<=10)
       {
    	   if(i==1)
    	   {
    	   System.out.println (i+"st "+s);
    	   }
    	   else if(i==2)
    	   {
    		   System.out.println (i+"nd "+s);
    	   }
    	   else if(i==3)
    	   {
    		   System.out.println (i+"rd "+s);
    	   }
    	   else
    	   {
    		   System.out.println (i+"th "+s);
    	   }
    	   i++;
       }
       sc.close();
}

}
