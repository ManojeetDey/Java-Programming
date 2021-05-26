import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter today's date :");
		int date=sc.nextInt();
		System.out.println("enter the number days elapsed since today ");
		int elapsed=sc.nextInt();
		int future=(date+elapsed)%7;
		String dayoftheweek="";
		switch(date)
		{
			case 0:
				dayoftheweek="SUNDAY";
				break;
			case 1:
				dayoftheweek="MONDAY";
			case 2:
				dayoftheweek="TUESDAY";
				break;
			case 3:
				dayoftheweek="WEDNESDAY";
				break;
			case 4:
				dayoftheweek="THURSDAY";
				break;
			case 5:
				dayoftheweek="FRIDAY";
			case 6:
				dayoftheweek="SATURDAY";
				break;
		}
		System.out.print("Today is "+dayoftheweek);
		switch(future)
		{
			case 0:
				dayoftheweek="SUNDAY";
				break;
			case 1:
				dayoftheweek="MONDAY";
			case 2:
				dayoftheweek="TUESDAY";
				break;
			case 3:
				dayoftheweek="WEDNESDAY";
				break;
			case 4:
				dayoftheweek="THURSDAY";
				break;
			case 5:
				dayoftheweek="FRIDAY";
			case 6:
				dayoftheweek="SATURDAY";
				break;

	}
		System.out.print(" and the future day is "+dayoftheweek);
		sc.close();
	}

}
