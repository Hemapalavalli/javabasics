package java8_Features_Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(50,23,40,45,12,10);
		
		Stream<Integer> L1= l.stream().filter(v->v<50);
		Stream<Integer> L2= L1.filter(v->v<40);
		
//		System.out.println(L1.toList());
		System.out.println(L2.toList());

	}

}
