import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month and the year ");
		int m=sc.nextInt();
		int y=sc.nextInt();
		int d=0;
		String s="";
		switch(m)
		{
		case 1:
			d=31;
			s="January";
			break;
		case 2:
			if((y%4==0 && y%100!=0)||(y%400==0) )
			{
				d=29;
				break;
			}
			else
			{
				d=28;
			}
			s="February";
			break;
		case 3:
			d=31;
			s="March";
			break;
		case 4:
			d=30;
			s="April";
			break;
		case 5:
			d=31;
			s="May";
			break;
		case 6:
			d=30;
			s="June";
			break;
		case 7:
			d=31;
			s="July";
			break;
		case 8:
			d=31;
			s="August";
			break;
		case 9:
			d=30;
			s="September";
			break;
		case 10:
			d=31;
			s="October";
			break;
		case 11:
			d=30;
			s="November";
			break;
		case 12:
			d=31;
			s="December";
			break;
		}
		System.out.println(s+" "+y+" "+"had "+d+" days.");
        sc.close();
	}

}
