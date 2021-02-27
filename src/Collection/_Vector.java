package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class _Vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("abc");
		v.add(100);
		v.add(null);
		v.add("xyz");
		v.add(200);
		
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(1));
		System.out.println(v.contains("abc"));
		System.out.println(v.set(1,'A'));
		System.out.println(v);
		
		System.out.println("-----------------");
		
		Enumeration en=v.elements();
		
	
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
			
		}
	}

}
