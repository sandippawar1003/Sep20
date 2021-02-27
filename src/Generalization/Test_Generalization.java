package Generalization;

public class Test_Generalization {

	public static void main(String[] args) {
		System.out.println("-------- Feature of JIO-------");
		Jio J=new Jio();
		J.sms();
		J.calling();
		J.internet();
		J.newfeatureA();
		
		System.out.println("------- Feature of Idea-----------");
		Idea I=new Idea();
		I.sms();
		I.calling();
		I.internet();
		I.newfeatureB();
	}
	
	
	
}
