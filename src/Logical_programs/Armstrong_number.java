package Logical_programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scan=new Scanner(System.in);
		
		int orgnum=scan.nextInt();      //145
		int sum=0;    //125
		
		for (int i = orgnum; i >0; i=i/10) {
			int rem=i%10;      //1%10=1
			sum=sum+(rem*rem*rem);    //125+64=190
			
		}
		
		if (orgnum==sum) {
			System.out.println("Given number"+orgnum+"it is an Armstrong number");
		} else {
            System.out.println("Given number"+orgnum+"It is not an Armstrong number");
		}
		
	}
	
}
