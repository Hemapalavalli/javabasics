package collectionsex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(90);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		List<String> l= new ArrayList<String>();
		l.add("Pavan");
		l.add("Hema");
		l.add("Purna");
		l.add("Mounika");
		l.add("Jagadeesh");
		l.add("Sunil");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
