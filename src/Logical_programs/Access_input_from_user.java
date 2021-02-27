package Logical_programs;

import java.util.Scanner;

public class Access_input_from_user {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter A");
		int a=scan.nextInt();
	
		System.out.println("Enter B");
	int b=scan.nextInt();
	int c=a+b;
	System.out.println(c);
	}

}
