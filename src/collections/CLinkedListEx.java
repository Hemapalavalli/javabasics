package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CLinkedListEx {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		for (int i = 0; i < 11; i++) {
			l.add(i);
		}
		System.out.println(l);
		
		Iterator<Integer> it=l.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		ListIterator<Integer> li=l.listIterator();
		for (;li.hasNext();) {
			Integer integer = li.next();
			System.out.println(integer);
		}
		System.out.println(li.hasNext());
		System.out.println(li.hasPrevious());
		while (li.hasPrevious()) {
			Integer integer = li.previous();
			System.out.println(integer);
		}
		System.out.println(li.hasPrevious());
		System.out.println(li.hasNext());
	}

}
