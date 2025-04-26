package simpleprogram;

public class Practicesprogram {
	int a=90;//global variable not static
	int b=30;// static global variable
	static void add()//add method
	{
		Practicesprogram a2=new Practicesprogram();
		int ax=a2.a;
		int ay=a2.b;
;		int sum=ax+ay;
		System.out.println(sum);
		System.out.println(ax);
		System.out.println(ay);
	}
	public static void main(String[] args) {
		Practicesprogram a1=new Practicesprogram();
		int b=a1.a;
		int d=a1.b;
		System.out.println(b);//printing global variable static
		//printing global not static variable with help of refrences variable 
	 
	System.out.println(d);
	add();
		
		
	}

}
