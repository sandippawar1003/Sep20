package Variable;

public class Variable_types {
	
	// variable types-1) Global  a)static  b)Non static or instance 
	          //      2) Local
	
	int a=10;                  //non static global variable
	static int b=20;           // static globle variable
	
	public static void main(String[] args) {
		int c=30;
System.out.println(c);
m1();

Variable_types obj2=new Variable_types();
obj2.m2();			}

	
	public static void m1() {               //static method declaration
		int d=40;
		System.out.println("--running static m1---");
		Variable_types obj=new Variable_types();   //obj creation for non static var
		System.out.println(obj.a);                 //call non static var
		 System.out.println(d);                    //call local var
		System.out.println(b);                     //call static var
		//Variable_types obj1=new Variable_types(); 
		//System.out.println(obj1.c);		       //can't call c as it is local var of main
	}
	  
	
	public void m2() {          //non static method
		System.out.println("----running non static m2----");
		Variable_types obj1=new Variable_types();
		System.out.println(obj1.a);
		System.out.println(b);

	}
}
