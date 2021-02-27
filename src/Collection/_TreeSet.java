package Collection;

import java.util.TreeSet;

public class _TreeSet {
	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		tr.add(123);
		tr.add(100);
		tr.add(50);
		
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		java.util.Iterator itr=tr.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
