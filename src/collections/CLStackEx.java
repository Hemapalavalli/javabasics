package collections;

import java.util.Enumeration;
import java.util.Stack;

public class CLStackEx {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		System.out.println(s.capacity());
		s.add(20);
		s.push(30);
		s.push(10);
		
		System.out.println(s);
		s.addElement(50);
		s.addFirst(10);
		s.addLast(100);
		System.out.println(s);
		
		CListEx c=new CListEx();
		
		Enumeration<Integer> e=s.elements();
		while (e.hasMoreElements()) {
			Integer integer = e.nextElement();
			System.out.println(integer);
		}
	}
}
