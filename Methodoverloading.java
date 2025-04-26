package simpleprogram;

public class Methodoverloading {
	static void add()
	{
		System.out.println("performing addition operation");	
		}
	static void add (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void add (double a,int b)
	{
		double c= a+b;
		System.out.println(c);
	}
	void add (double a,float b)
	{
		double c=a+b;
		System.out.println(c);
		
	}
	void add (float a,float b)
	{
		float c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		add();
		add(34,35);
		add(34.58555,52);
		 Methodoverloading a1=new  Methodoverloading();
		 a1.add(20.10120, 21.514f);
		 a1.add(32.141f, 21.411f);
		
		
		
	}
			
	}


