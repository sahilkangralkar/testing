package simpleprogram;

public class Forloop100to150negative {
	public static void main(String[] args) throws InterruptedException {
		for(int i=-100; i>=-150; i--)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}

}
