package practise;

public class integerliteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stuff
	
		int octnum=026;
		int hexnum=0x1a;
		int binnum=0b11010;
		System.out.println("Value of hexa decimal: "+hexnum);
		System.out.println("Value of octal number: "+octnum);
		System.out.println("Value of binary number: "+binnum);
		//this is the function to show the input directly what the user has given
		System.out.println((Integer.toHexString(hexnum)));
		System.out.println((Integer.toOctalString(octnum)));
		System.out.println((Integer.toBinaryString(binnum)));
		}

}
