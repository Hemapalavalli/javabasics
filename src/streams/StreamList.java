package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamList {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Hydreabad","Banglore","Ongole","Bangkok","AndhraPradesh","Bangladesh","Mumbai","Pune");
//		Stream<String> s=l.stream();
//		s.forEach(s1->System.out.println(s1));
		System.out.println(l.stream().filter(val->(val.startsWith("B"))).toList());
		System.out.println(l.stream().filter(val->(val.length()>=7&&val.length()<=10)).toList());
		System.out.println(l.stream().filter(val->(val.endsWith("e"))).toList());
		
		System.out.println();
		
		String arr[]= {"Hydreabad","Banglore","Ongole","Bangkok","AndhraPradesh","Bangladesh","Mumbai","Pune"};
		Stream<String> S=Arrays.stream(arr);
		
		System.out.println(S.filter(val->(val.startsWith("B"))).toList());
		System.out.println(Arrays.stream(arr).filter(val->(val.length()>=7&&val.length()<=10)).toList());
		System.out.println(Arrays.stream(arr).filter(val->(val.endsWith("e"))).toList());
		
		
	}

}
