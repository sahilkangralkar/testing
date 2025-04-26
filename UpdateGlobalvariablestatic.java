package simpleprogram;

public class UpdateGlobalvariablestatic {
	static int a=10;
	static int b=45;
	void add()
	{
		int sum =a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		UpdateGlobalvariablestatic s1=new UpdateGlobalvariablestatic();
		//a=50;// direct update a value of the global variable
		s1.add();
		s1.sub();
		a=50;// direct update a value of the global variable
		
	}

}
