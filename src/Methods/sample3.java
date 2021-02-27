package Methods;

public class sample3 {
	
	//static+ non static method with parameter
	
	public static void main(String[] args) {
		
		sample3 s3=new sample3();
		
		
		s3.addition(40,30);
		studentname("abd");
		studentgrade('A');
		
		
		
	}
		
		public static void addition(int a, int b)
		{
		
		int c=a+b;
		System.out.println(c);
		}
	
		public static void studentname(String sname)
		{
			System.out.println("student name:"+sname);
		
		}
		
		public static void studentgrade(char sgrade)
		{
			System.out.println("student grade:"+sgrade);
		
		}
		
		
}
