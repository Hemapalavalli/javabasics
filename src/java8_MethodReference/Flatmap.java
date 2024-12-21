package java8_MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Flatmap {
	public static void main(String[] args) {
		
//		List<List<Integer>> l=new ArrayList<List<Integer>>();		
//		l.add(List.of(10,50,20,25,15,3));
////		System.out.println(l);
//		l.add(new ArrayList<Integer>(List.of(30,45,22,63,32,56)));
////		System.out.println(l);
//		l.add(List.of(33,23,75,53,21,3));
//		System.out.println(l);
//		
//		List<Integer> l1 =Arrays.asList(10,50,20,15,60);
//		l.add(0, l1);
//		System.out.println(l);
		
		List<List<String>> list = new ArrayList<List<String>>();
		list.add(new ArrayList<String>(List.of("Hema","Vyshu","Pradeep","Chandu","Netra","Nitya")));
		list.add(List.of("Padma","Chenchuramireddy","Lakshmi","Sravani","Subbareddy"));
		System.out.println(list);
		
		Iterator<List<String>> it= list.iterator();
		while (it.hasNext()) {
			List<String> l2 =  it.next();
			System.out.println(l2);
			Iterator<String> it1=l2.iterator();
			while (it1.hasNext()) {
				String string =  it1.next();
				System.out.println(string);
			}
		}
	}
}
