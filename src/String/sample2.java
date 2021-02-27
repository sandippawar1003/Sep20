package String;

public class sample2 {
public static void main(String[] args) {
	

	String s="abcde";
	String s1="abcdefg";
	System.out.print("Original string:"+s);
	System.out.println(s.length());
	
	for (int i= s.length()-1; i >=0 ; i--) {
		
		System.out.print(s.charAt(i));
	}
		
		System.out.println(s.toUpperCase());
	
		System.out.println("---------");
		System.out.println(s.compareTo("abc"));
		System.out.println(s==s1);
		System.out.println(s1.isEmpty());
		System.out.println(s.indexOf("e"));
		System.out.println(s.contains("abc"));
		System.out.println(s.contains("adc"));
		System.out.println(s.replace("de","xy"));
		System.out.println(s.substring(2));
		System.out.println(s.substring(1, 4));
	
}	
}

