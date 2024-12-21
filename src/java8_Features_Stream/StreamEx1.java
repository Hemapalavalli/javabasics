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

		
		List<String> sl=Arrays.asList("Hema","Vyshu","Pradeep","Chandu","Netra","Nitya");
		
//		System.out.println(sl.stream().filter(val -> val.length() < 6).toList());
		
		Stream<String> s1 = sl.stream().filter(val -> val.length() < 7);
		
		Stream<String> s2 = s1.filter(val-> val.length() <6);
		
		System.out.println(s1+ " \n" +s2.toList());
		
	}

}
