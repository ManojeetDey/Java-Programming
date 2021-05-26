import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("inout the datatype you want to know the size in bytes");
           String s=sc.next();
           if(s.equalsIgnoreCase("int"))
           {
        	   System.out.println("4 bytes");
           }
           else if(s.equalsIgnoreCase("char"))
           {
        	   System.out.println("1 byte");
           }
           else if(s.equalsIgnoreCase("float"))
           {
        	   System.out.println("4 bytes");
           }
           else if(s.equalsIgnoreCase("double"))
           {
        	   System.out.println("8 bytes");
           }
           else if(s.equalsIgnoreCase("long"))
           {
        	   System.out.println("4 bytes");
           }
           else if(s.equalsIgnoreCase("boolean"))
           {
        	   System.out.println("1 byte");
           }
           else 
           {
        	   System.out.println("2 bytes");
           }
           sc.close();
	}

}
