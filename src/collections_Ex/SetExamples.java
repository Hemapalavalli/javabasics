package collections_Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();  //Why this is preferred way 
		
		set.add(20);
		set.add(50);
		set.add(60);
		set.add(10);
		set.add(90);
		set.add(10);
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(60);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(90);
		list.add(20);
		//list.add(null);
		
		System.out.println(list);
		
		Set<Integer> hashset = new HashSet<Integer>(list);
		System.out.println("hash set:"+hashset);
		
		
		Set<Integer> sets = new LinkedHashSet<Integer>(list);
		System.out.println("linked hashset: "+sets);
		
		
		Set<Integer> setsorted = new TreeSet<Integer>(list);
		System.out.println(setsorted);
		
		Set<Integer> tSet = new TreeSet<Integer>(Collections.reverseOrder());
		tSet.add(80);
		tSet.add(02);
		tSet.add(20);
		tSet.add(50);
		System.out.println(tSet);
		
	}
}
