package Logical_programs;

import java.util.Scanner;

public class Accept_input_from_user1 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter student name");
		String name=s.next();          //to get string data
		System.out.println("Student name:"+name);
		
		
		System.out.println("Enter student roll no");
		int rollno=s.nextInt();         //to enter numeric data
		System.out.println("Roll no:"+rollno);
		
		System.out.println("Enter grade of strudent");
		boolean grade=s.hasNext();       //to enter boolean value
		System.out.println("Student grade:"+grade);
		
		
		
	}
	
}
