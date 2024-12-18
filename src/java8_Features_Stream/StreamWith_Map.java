package java8_Features_Stream;

import java.util.Arrays;
import java.util.List;

public class StreamWith_Map {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Java","DotNet","SQL","MongoDB","ReactJs");
		
//		System.out.println(l.stream().map(lm->lm.toUpperCase()).toList());
		
		
		System.out.println(l.stream().map(ml -> ml.toLowerCase()).
				filter(m1->m1.startsWith("D"))
				.map(m1 -> {
					m1 = m1.toUpperCase();
					m1=m1+" Full Stack";
					return m1;
				}).toList());

	}

}
