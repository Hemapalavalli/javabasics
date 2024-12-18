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
	}
}
