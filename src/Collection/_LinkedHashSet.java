package Collection;

import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class _LinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
lhs.add("abcd");
lhs.add('A');
lhs.add(100);


System.out.println(lhs.size());
System.out.println(lhs.isEmpty());
System.out.println(lhs.contains("abcd"));


java.util.Iterator itr=lhs.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
	
}
}
}
