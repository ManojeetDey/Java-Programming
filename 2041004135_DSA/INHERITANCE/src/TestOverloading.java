
public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main with string[]");
		String a[]= {"a","b"};
		main(a);
	}

	public static void main(String args)
	{
		System.out.println("main with String");
	}
	public static void main() {
		System.out.println("main with no arguments");
	}
}
