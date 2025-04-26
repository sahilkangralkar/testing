package simpleprogram;

public class Nonstaticcalling {
	void add () {
		int a=100;
		int b=50;
		int sum=a+b;
		System.out.println("addition of two number " + sum);
		
	}
	public static void main (String [] args ) {
		Nonstaticcalling a1= new Nonstaticcalling();
		a1.add();
	}
}
