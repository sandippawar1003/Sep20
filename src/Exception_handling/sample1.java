package Exception_handling;
public class sample1 {
	public static void main(String[] args) {
		
		int ar[]=new int[3];
		ar[0]=10;
		ar[1]=20;
		try {
			ar[4]=40;
			//ar[2]=30;
			
		} catch (Exception e) {
			System.out.println("Array exception handled");
		}
		System.out.println("Good morning");
	}

}
