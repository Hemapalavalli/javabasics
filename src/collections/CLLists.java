package collections;

import java.util.ArrayList;
import java.util.List;

public class CLLists {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(20);
		
		List<Integer> nl=new ArrayList<Integer>();
		System.out.println(l);
		System.out.println(nl);
		
//		nl.addAll(l);
//		System.out.println(nl);
		
		for (Integer val : l) {
			if(!nl.contains(val)) {
				nl.add(val);
			}
		}
		System.out.println(nl);
	}

}
