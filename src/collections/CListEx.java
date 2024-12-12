package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CListEx {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		for (int i = 0; i <6; i++) {
			l.add(i);			
		}
//		System.out.println(l);
		
		//iterator
		Iterator<Integer> i=l.iterator();
		System.out.println(i.hasNext());
		
		while (i.hasNext()) {
			Integer integer =i.next();
			System.out.println(integer);
		}
		System.out.println(i.hasNext());
		System.out.println();
		
	
		//listIterator
		ListIterator<Integer> li=l.listIterator();
		
		System.out.println(li.hasNext());
		while (li.hasNext()) {
			Integer integer = (Integer) li.next();
			System.out.println(integer);
		}
		System.out.println(li.hasNext());
		
		System.out.println(li.hasPrevious());
		while (li.hasPrevious()) {
			Integer integer = li.previous();
			System.out.println(integer);
		}
		System.out.println(li.hasPrevious());
		
		for(;li.hasNext();) {
			Integer in=li.next();
			System.out.println(in);
		}
	}

}
