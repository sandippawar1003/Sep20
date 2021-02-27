package Array;

public class sample3 {
public static void main(String[] args) {
	
	int ar[][]= new int[2][2];
 ar[0][0]=10;
 ar[0][1]=20;
 ar[1][0]=30;
 ar[1][1]=40;
 
 System.out.println(ar.length);
 for (int i = 0; i < ar.length; i++) {
	 for (int j = 0; j < ar.length; j++) {
		 System.out.print(ar[i][j]+" ");
		
	}
	System.out.println();
}
	
	
}
}
