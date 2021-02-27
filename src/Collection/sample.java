package Collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class sample {

	public static void main(String[] args) {
		
	
	ArrayList a1=new ArrayList();
	a1.add("abc");
	a1.add(100);
	a1.add('A');
	a1.add("def");
	a1.add(null);
	a1.add(null);
	
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	System.out.println(a1.get(1));
	System.out.println(a1.contains('B'));
	
	System.out.println("--------------");
	a1.add(3,"xyz");
	System.out.println(a1);
	a1.remove(4);
	System.out.println(a1);
	a1.set(1, 'B');
	System.out.println(a1);
	
	System.out.println("--------------");
	
	
	java.util.Iterator itr=a1.iterator();
	while (itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
System.out.println("--------------");
	
	
	java.util.ListIterator litr=a1.listIterator();
	while (litr.hasNext())
	{
		System.out.println(litr.next());
	}
}}