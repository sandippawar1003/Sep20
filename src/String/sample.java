 package String;

public class sample {
public static void main(String[] args) {
	
	// without new keyword
	String s="abc";
	String s1="abc";
	
	
	//using new keyword
	String s2=new String("xyz");
	String s3=new String("xyz");
	
			System.out.println(s==s1);
			System.out.println(s2==s3);
			System.out.println(s==s3 );
}
}
