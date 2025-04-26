package simpleprogram;
 class Parentclass {
	 static void add ()
	 {
		 System.out.println("Addition");
	 }
	 static void sub()
	 {
		 System.out.println("substraction");
	 }
}
public class Childclass extends  Parentclass  {
	static void div ()
	 {
		 System.out.println("division");
	 }
	static void mul ()
	 {
		 System.out.println("multiplication");
	 }
	
	public static void main(String[] args) {
		div();
		mul();
		add();
		sub();
		
	}

}
