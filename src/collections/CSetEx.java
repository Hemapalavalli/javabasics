package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class CSetEx {
	
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(20);
		
		System.out.println(s);
				
		Iterator<Integer> i=s.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);
		}
		
		Set<Integer> s1=new TreeSet<Integer>(Collections.reverseOrder());
		s1.addAll(s);
		System.out.println(s1);
	
		Set<Integer> s2=new LinkedHashSet<Integer>(s);
		System.out.println(s2);
		
	}

}
