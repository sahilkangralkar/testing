package simpleprogram;

import java.util.Scanner;

public class Scannerclas {
	public static void main(String[] args) {
		Scanner b1= new Scanner (System.in);
		System.out.println("please enter value of radius");
		int r=b1.nextInt();
		double circle=2*Math.PI*r*r;
		System.out.println("Area of circle " + circle);
		
	}

}
