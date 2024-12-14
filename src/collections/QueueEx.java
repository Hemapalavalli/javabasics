package collections;

import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.offer(30);
		q.offer(40);
		q.add(60);
		q.add(20);
		
		System.out.println(q);
//		System.out.println(q.remove(60));
//
//		System.out.println(q.peek());
//		
//		q.poll();
//		System.out.println(q);
//		
//		System.out.println(q.element());
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q);
//		
////		q.removeAll(q);
//		q.clear();
//		System.out.println(q);
//
		System.out.println("--------------------");
//		
//		while(!q.isEmpty()) {
//			System.out.println(q.peek());
//			System.out.println(q.poll());
//			System.out.println(q.element());
//			System.out.println(q.remove());
//		}
		
//		System.out.println(q);
		
		Queue<Integer> q1=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		q1.addAll(q);
		System.out.println(q1);
//		q1.remove();
//		System.out.println(q1.containsAll(q));
//		
		Iterator<Integer> it=q1.iterator();
//		while (it.hasNext()) {
//			Integer integer = it.next();
//			System.out.println(integer);
//		}
		for (; it.hasNext();) {
			Integer i = it.next();
			System.out.println(i);
		}
		System.out.println();
		q1.add(70);
		System.out.println(q1);
		System.out.println(q1.peek());
//		q1.forEach(t ->System.out.println(t));
//		System.out.println(q1);
		
		
		Queue<Integer> q3=new ArrayDeque<Integer>();
		q3.add(45);
		q3.add(20);
		q3.add(100);
		q3.add(36);
		System.out.println(q3);
		Iterator<Integer> li= q3.iterator();
		while (li.hasNext()) {
			Integer integer = (Integer) li.next();
			System.out.println(integer);
		}
	}
}
