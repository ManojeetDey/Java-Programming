class employee
{
	String name;
	int Eid;
	employee(String n, int id)
	{
		name =n;
		Eid=id;
	}
	void showdata()
	{
		System.out.println("Employee name is "+name);
		System.out.println("EMployee id is "+Eid);
	}
}
public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee E1= new employee("Manojeet",394);
		E1.showdata();

	}

}
