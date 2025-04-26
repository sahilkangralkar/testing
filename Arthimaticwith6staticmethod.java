package simpleprogram;

public class Arthimaticwith6staticmethod {
	
	static void add()
	{
		int a=100;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
		
	}
	static void sub() 
	{
		int a=100;
		int b=50;
		int sub=a-b;
		System.out.println(sub);
	}
	static void multi() 
	{
		int a=100;
		int b=50;
		int mul=a*b;
		System.out.println(mul);
	}
	static void div() 
	{
		int a=100;
		int b=50;
		int div=a/b;
		System.out.println(div);
	}
	static void modulus() 
		{
		int a=100;
		int b=50;
		int mod=a%b;
		System.out.println(mod);
		}
	public static void main (String [] args) {
		
		add();
		sub();
		multi();
		div();
		modulus();
		
		
		
	
	}
	}
