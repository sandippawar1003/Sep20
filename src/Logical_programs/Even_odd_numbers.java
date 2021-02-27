package Logical_programs;

import java.util.Scanner;

public class Even_odd_numbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
System.out.println("Enter a number");	
int num=s.nextInt();
if(num%2==0) {
	System.out.println("Given number is even");
}
else {
	System.out.println("Given is odd");
}

}
}
