package simpleprogram;

public class constructoroverloading {
	constructoroverloading()
	{
		System.out.println("i am champion");
	}
	constructoroverloading(char a)
	{
		System.out.println("topper");
	}
	
public static void main(String[] args) {
	constructoroverloading a1=new constructoroverloading();
	constructoroverloading a2=new constructoroverloading('a');
	
}
}
