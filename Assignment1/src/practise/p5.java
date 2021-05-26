package practise;
//arithematic operators
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5,b=3;
int res1=a+b;
int res2=a-b;
int res3=a*b;
int res4=a/b;
int res5=a%b;
int res6=a-b * (int)(a/b);
//res6 is the same as res5 it is a different form of modulo division
System.out.println(a+ " + " + b +" = " + res1);
System.out.println(a+ " - " + b +" = " + res2);
System.out.println(a+ " * " + b +" = " + res3);
System.out.println(a+ " / " + b +" = " + res4);
System.out.println(a+ " % " + b +" = " + res5);
System.out.println(a+ " - " + b +"*"+"(int)(a/b)"+" = " + res6);
}

}
