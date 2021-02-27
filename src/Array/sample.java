package Array;

import java.util.Arrays;

public class sample {

	public static void main(String[] args) {
		
		
		//single dimentional array
		int ar[]= new int[5];
		
		ar[0]=3;
		ar[1]=4;
		ar[2]=2;
		ar[3]=6;
		ar[4]=1;
		
		//System.out.println(ar[0]);
		
		System.out.println("-------before sorting----------");
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("----------after sorting----------");
		Arrays.sort(ar);
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("---Descending sort---");
	

		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		
		
	}
	
}
