package simpleprogram;

import java.util.Scanner;

public class Switchwithscanner {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
	int uservalue	=s1.nextInt();
	switch (uservalue) {
		case 1:System.out.println("launch brower opera mini");
		break;
		case 2:System.out.println("launch brower chrome");
		break;
		case 3:System.out.println("launch brower Edge");
		break;
		case 4:System.out.println("launch brower Firefox");
		break;
		case 5:System.out.println("launch brower safari");
		break;
		default:
			System.out.println("please enter value between 1 to 5 to lauch your browser");
		
	}
	}

}
