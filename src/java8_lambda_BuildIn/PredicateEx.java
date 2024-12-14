package java8_lambda_BuildIn;

import java.util.function.BiPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		
	//predicate
		Predicate<Integer> p=(i)->{
			int it=i;
			System.out.println(it);
			return true;
		};
		boolean b=p.test(20);
		System.out.println(b);
		
	//bipredicate
		BiPredicate<Integer, Short> bp=(i,j)->{
			return b;
		};
		
		boolean v1=bp.test(10, (short) 1);
		System.out.println(v1);
	
	//longpredicate
		LongPredicate lp=(i)->{
			System.out.println(i);
			return true;
		};
		
	}

}
