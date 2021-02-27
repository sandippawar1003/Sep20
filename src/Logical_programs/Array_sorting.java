package Logical_programs;

import java.util.Arrays;

public class Array_sorting {

	
public static void main(String[] args) {
	int ar[]= {20,50,40,30,20};
	
	System.out.println("---- Before sorting----");
	
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);            //sorting
	System.out.println("----After sorting----");
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
}	
}
