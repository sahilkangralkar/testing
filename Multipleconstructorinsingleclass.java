package simpleprogram;

public class Multipleconstructorinsingleclass {
	Multipleconstructorinsingleclass()
	{
		System.out.println("fast and fourious");
	}
	Multipleconstructorinsingleclass(int a , boolean b, double c)
	{
		System.out.println("testing accedmy");
	}
	Multipleconstructorinsingleclass(char s, String f, float d)
	{
		System.out.println("very much good ");
		
	}
	Multipleconstructorinsingleclass(int student, int rollno )
	{
		System.out.println("automation tester");
	}
	public static void main(String[] args) {
		Multipleconstructorinsingleclass a1= new Multipleconstructorinsingleclass(8,18);
		Multipleconstructorinsingleclass a2= new Multipleconstructorinsingleclass('a',"sahil",5.211f);
		Multipleconstructorinsingleclass a3=new Multipleconstructorinsingleclass(8522, true,2.412);
		Multipleconstructorinsingleclass a4=new Multipleconstructorinsingleclass();
	}
}
