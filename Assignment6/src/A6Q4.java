
public class A6Q4 {

	public static int numberOfDaysInAyear(int year)
	{
		if(year%4==0&&year%100!=0)
			return 366;
		else
			return 365;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int year=2000;year<=2020;year++)
		{
			System.out.println(year+"    "+numberOfDaysInAyear(year));
		}

	}

}
