package String;

public class sample1 {
	public static void main(String[] args) {
		String s1="minakshi";
		String s2="";
		String s3="ARNAV";
		String s4="arnav";
		String s5="nav";
		String s6="abc def ghi jkl";
		
		
		System.out.println(s1.length());
		System.out.println(s3==s4);
		System.out.println(s2.isEmpty());
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
	System.out.println(s4.contains(s5));
	
	
    String ar[]=s6.split(" ");
    System.out.println(ar[0]);  //abc
	
    for (int i = 0; i < ar.length; i++) {
    	System.out.print(ar[i]+" ");         //abc def ghi jkl
    }	
    
    
    	System.out.println(s1.substring(4));     //kshi
    	System.out.println(s1.substring(0,4));    //mina
    	System.out.println(s4.substring(2,5));    //nav  2-start of index, 5-length
		
    	
    	System.out.println(s1.replace("i","ee"));
    	
    	System.out.println(s1.startsWith("Mi"));   //false
    	System.out.println(s1.startsWith("mi"));   //true
    	System.out.println(s1.endsWith("hi"));     //true
    	
    	s1=s1.replace("i","ee");
    	System.out.println(s1);
    	
    	System.out.println(s3.concat(s4));
    	System.out.println(s4.concat(":- The Super Hero"));
    	
    	
    	System.out.println(s1.toUpperCase());
    	System.out.println(s1.toLowerCase());
    	
    	System.out.println(s1.indexOf('e'));       //1
    	System.out.println(s1.lastIndexOf('e'));   //9
	}
	

}
