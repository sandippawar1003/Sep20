package Logical_programs;

public class Reverse_String {

	public static void main(String[] args) {
		String name="Minakshi";
		String Reverse = "";
	
		for (int i = name.length()-1; i >=0; i--) {
			Reverse=Reverse+name.charAt(i);
			
		}
		System.out.println(Reverse);
	}
	
}
