package Revision;

public class star_pattern5 {


	//    *
	//   ***
	//  *****
    // *******
	
	public static void main(String[] args) {
		int space=5;
		int star=1;
		
		for (int i = 1; i<=5; i++) {
		
		
		for (int j = 1; j <=space; i++) {
			System.out.print(" ");	
		}
		for (int j = 1; j <=star; i++) {
			System.out.print("*");	
		}
		System.out.println();
		space--;
		star=star+2;
	}
		
	}

}