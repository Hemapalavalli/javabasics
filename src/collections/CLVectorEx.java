package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CLVectorEx{
	public static void main(String[] args) {
		Vector v=new Vector();
//		System.out.println(v.capacity());
		for(int i=0;i<12;i++) {
			v.add(i);
		}
//		System.out.println(v);
//		System.out.println(v.capacity());
		
		//enumerator
		Enumeration<Integer> enu=v.elements();
		System.out.println(enu.hasMoreElements());
		while (enu.hasMoreElements()) {
//			Integer integer = enu.nextElement();
			System.out.println(enu.nextElement());
		}
		System.out.println(enu.hasMoreElements());
		
		//iterator
		Iterator<Integer> it=v.iterator();
		System.out.println();
		System.out.println(it.hasNext());
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
		}
		System.out.println(it.hasNext());
		
		//listiterator
		ListIterator<Integer> li=v.listIterator();
		
		//hasnext in li
		System.out.println();
		System.out.println(li.hasNext());
		while (li.hasNext()) {
			Integer integer =li.next();
			System.out.println(integer);
		}
		System.out.println(li.hasNext());
		
		//hasprevious in li
		System.out.println(li.hasPrevious());
		while (li.hasPrevious()) {
			Integer integer = (Integer) li.previous();
			System.out.println(integer);
		}
	}
}
