
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stuff
        int n = Integer.parseInt(args[0]);
        int i = 1;
        String b="";
        while (i <= n)
        {        	
         if ((i%10==1)&& (i%100!=11))
                b = "st";
            else if ((i%10==2)&&(i%100!=12))
                b="nd";
            else if ((i%10==3)&&(i%100!=13))
                b="rd";
            else
                b="th";
            System.out.println(i + b + " Hello");
            i++;
        }
	}

}
