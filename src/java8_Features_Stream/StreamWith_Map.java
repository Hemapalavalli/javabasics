package java8_Features_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamWith_Map {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("Java", "DotNet", "SQL", "MongoDB", "ReactJs");

//		System.out.println(l.stream().map(lm->lm.toUpperCase()).toList());
		System.out.println(l.stream().map(m -> m.toUpperCase()).filter(m->m.startsWith("S")).map(m1->m1.toLowerCase()).map(m1 ->"My "+ m1).toList());
		System.out.println(l.stream().map(ml -> ml.toLowerCase()).filter(m->m.startsWith("j")).map(m1->m1.toUpperCase()).map(m -> m + " Full Stack").toList());
		System.out.println(l.stream().map(s->s+" course").toList());
		
		List<Integer> l1=Arrays.asList(40,20,30,15,2,50);
		System.out.println(l1.stream().map(v->v+8).toList());
		System.out.println(l1.stream().filter(v->v<30).map(v->v+5).limit(2).toList());
		System.out.println(l1.stream().map(v->v%4).filter(v->v<50).toList());
	}
}
