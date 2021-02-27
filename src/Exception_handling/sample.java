package Exception_handling;

public class sample {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		try {
			c=a/b;
		}
		catch (Exception e) {
			e.printStackTrace();
		System.out.println("Exception handled");
		c=a/1;
        System.out.println(c);
		}
		finally {
		System.out.println("Good morning");
		}
	}

}


