package simpleprogram;

public class Nonstatic3and2static {
	void add()
	{
		int a=100;
		int b=50;
		int c=a+b;
		System.out.println(c);
	}
	
	void sub()
	{
		int a=100;
		int b=50;
		int c=a-b;
		System.out.println(c);
	}
	void mul()
	{
		int a=100;
		int b=50;
		int c=a*b;
		System.out.println(c);
	}
	static void div()
	{
		int a=100;
		int b=50;
		int c=a/b;
		System.out.println(c);
	}
	static void mod()
	{
		int a=100;
		int b=50;
		int c=a%b;
		System.out.println(c);
	}
	public static void main (String [] args)
	{
		 Nonstatic3and2static a1=new  Nonstatic3and2static();
		 a1.add();
		 a1.sub();
		 a1.mul();
		 div();
		 mod();
	}
}
