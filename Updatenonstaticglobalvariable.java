package simpleprogram;

public class Updatenonstaticglobalvariable {
	int a=52;
	int b=56;
	void mul()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	void div()
	{
		double div=a/b;
		System.out.println(div);
	}
	public static void main(String[] args) {
		Updatenonstaticglobalvariable s1=new Updatenonstaticglobalvariable();
		s1.b=40;
		s1.mul();
		s1.div();
	}

}
