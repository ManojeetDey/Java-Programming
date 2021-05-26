
public class ToStringStudent {
	int rollno;
	String name;
	String city;
	ToStringStudent(int rollno,String name,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringStudent s1= new ToStringStudent(20, "biswa","Bhubaneswar");
		ToStringStudent s2= new ToStringStudent(69,"senapati","rourkela");
		System.out.println(s1);
		System.out.println(s2);
	}

}
