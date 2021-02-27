package control_statement;

public class nested_if {
public static void main(String[] args) {
	
	String UN="minu";
	String PWD="xyz123";
	
	if(UN=="minu")
	{
		System.out.println("Correct UN");
		
		if(PWD=="xyz123") {
			System.out.println("Correct password");
			System.out.println("--------------");
			System.out.println("Login successfully");
		}
		else {
			System.out.println("Wrong password");
			System.out.println("-----------------");
			System.out.println("Login failed");
		}
		
	}
	else {
		System.out.println("Wrong UN");
		System.out.println("------------");
		System.out.println("Login fail");
	}
	
	
	
}
}
