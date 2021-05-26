import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2):");
		int user=sc.nextInt();
		int comp=(int)(Math.random()*3);
		switch(comp)
		{
		 case 0:
			 System.out.print("Computer is SCISSOR. ");
			break;
		 case 1:
			 System.out.print("Computer is ROCK. ");
			 break;
		 case 2:
			 System.out.print("Computer is PAPER. ");
			 break;
		}
		switch(user)
		{
		 case 0:
			 System.out.print(" User is SCISSOR. ");
			break;
		 case 1:
			 System.out.print(" User is ROCK. ");
			 break;
		 case 2:
			 System.out.print(" Use is PAPER. ");
			 break;
		}
		if(comp==user)
		{
			System.out.print(" Its a Draw");
		}
		else if(comp==2&&user==1||comp==0&&user==2||comp==1&&user==0)
		{
			System.out.print(" Computer has won");
		}
		else 
		{
			System.out.print(" You has won");
		}
       sc.close();
	}

}
