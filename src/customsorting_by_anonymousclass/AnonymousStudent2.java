package customsorting_by_anonymousclass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AnonymousStudent2 {
	int id;
	String name;
	
	public AnonymousStudent2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	public static void main(String[] args) {

		List<AnonymousStudent2> l=Arrays.asList(
				new AnonymousStudent2(5, "Hema"),
				new AnonymousStudent2(2, "Mounika"),
				new AnonymousStudent2(1, "Pavan"),
				new AnonymousStudent2(3, "Jagadesh"));
		
		Comparator<AnonymousStudent2> cid=new Comparator<AnonymousStudent2>() {	
			@Override
			public int compare(AnonymousStudent2 o1, AnonymousStudent2 o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
		};
		Comparator<AnonymousStudent2> cname=new Comparator<AnonymousStudent2>() {	
			@Override
			public int compare(AnonymousStudent2 o1, AnonymousStudent2 o2) {
				return o1.name.compareTo(o2.name);				
			}
		};
		
		System.out.println(l);
		l.sort(cid);
		System.out.println(l);
		Collections.sort(l, cname);
		System.out.println(l);
		
	}
}
class STest_Using_Anonymous {

}