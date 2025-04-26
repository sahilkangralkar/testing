package simpleprogram;

public class Globalandlocalvariable {
	int a=30;//Not static global variable
	int b=90;//Not static global variable
	void add()
	{
		int sum= a+b;
		System.out.println(sum);
	}
	 void sub()
	{
		int sub =a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		Globalandlocalvariable s1=new Globalandlocalvariable();
		s1.add();
		s1.sub();
	}

}
