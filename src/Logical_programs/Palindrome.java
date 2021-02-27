package Logical_programs;

public class Palindrome {
public static void main(String[] args) {
	

	String name="abcba";
	String Reverse = "";

	for (int i = name.length()-1; i >=0; i--) {
		Reverse=Reverse+name.charAt(i);
		
	}
	System.out.println("Original string is:"+name);
    System.out.println("Reverse string is:"+Reverse);

if(name.equals(Reverse))
{
System.out.println("GIven number is palindrome");	
}
else {
	System.out.println("Given number is not palindrome");
}
}

}

	

