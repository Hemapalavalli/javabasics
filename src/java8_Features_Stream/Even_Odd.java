package java8_Features_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Even_Odd {
	
	public static List<Integer> geteven(List<Integer> i) {
		return i.stream().filter(v-> v%2==0).toList() ;
	}
	
	public static List<Integer> getodd(List<Integer> i) {
		return i.stream().filter(v-> v%2 != 0).toList() ;
	}

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(50,43,30,25,40);
		
		System.out.println(l.stream().filter(v->v%2==0).toList());
		System.out.println(l.stream().filter(v->v%2!=0).toList());
		
	//or
		
		Even_Odd e=new Even_Odd();
		System.out.println(e.geteven(l));
		System.out.println(e.getodd(l));
		      //or
		System.out.println(geteven(l)+"\n"+getodd(l));
		
		//terminal
		l.stream().forEach(v->System.out.println(v));		
		
	//or
		
//		List<Integer> even=new ArrayList<Integer>();
//		List<Integer> odd=new ArrayList<Integer>();
//		
//		for(Integer i : l) {
//			if(i % 2==0) {
//				even.add(i);
//			}
//			else {
//				odd.add(i);
//			}
//		}
//		System.out.println(even+" "+odd);
	}
}
