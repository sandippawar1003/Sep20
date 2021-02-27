package Collection;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class _Hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(10);
	hs.add("abc");
	hs.add('A');
	
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains("abc"));
	System.out.println(hs);
	
	System.out.println("-----------------");
	
	
	java.util.Iterator itr=(java.util.Iterator) hs.iterator();
	
		
	while (itr.hasNext()) {
		System.out.println(itr.next()); 
		
	}
		

	
}
	
	
}
