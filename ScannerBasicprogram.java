package simpleprogram;

import java.util.Scanner;

public class ScannerBasicprogram {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		System.out.println(name);
		Scanner s2=new Scanner(System.in);
		int no=s2.nextInt();
		System.out.println(no);
		Scanner s3= new Scanner (System.in);
		System.out.println("please enter value of A");
		int A=s3.nextInt();
		System.out.println("Please Enter the value of B");
		int b=s3.nextInt();
		int sum=A+b;
		System.out.println("sum of two number is ");
		System.out.println(sum);
		int number=s1.nextInt();
		System.out.println(number);
		
		
	}

}
