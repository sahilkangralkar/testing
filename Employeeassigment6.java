package simpleprogram;

public class Employeeassigment6 
{
	Employeeassigment6(String a,int b)
	{
		
		System.out.println(a+b  );
	}
	Employeeassigment6(String d, String e, long s)
	{
		String employee_company=d;
		String designation=e;
		long salary=s;
	}
	public static void main(String[] args) {
		Employeeassigment6 a1=new Employeeassigment6("sahil",11);
		Employeeassigment6 a2=new Employeeassigment6("Qualimatrix","QA",25000);
	}
	

}
