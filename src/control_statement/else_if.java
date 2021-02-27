package control_statement;

public class else_if {

	public static void main(String[] args) {
		int marks=80;
		if(marks>=65)
		{
			System.out.println("distinction");
		}
		
		else if(marks>=60)
		{
			System.out.println("First class");
		}
		
		else if(marks>=55)
		{
			System.out.println("2nd class");
		}
		else if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	
}
