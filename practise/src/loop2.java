import java.util.*;
public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int count=1, pt=0,wt=0,na=0;
		int thryatd,labatd;double cgpa;
		while(count<=30)
		{
			System.out.println("Enter the attendances ");
			thryatd=sc.nextInt();
			labatd=sc.nextInt();
			cgpa=sc.nextDouble();
			if(thryatd>=75&&labatd>=75)
			{
				if(cgpa>=9)
					pt++;
				else
					wt++;
			}
			else
				na++;
			count++;
		}
		System.out.println(pt+" "+wt+" "+na);
		sc.close();
	}

}
