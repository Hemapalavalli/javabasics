package java8_lambda_BuildIn;

import java.util.function.BiPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		
	//1 predicate
		Predicate<Integer>P = val -> val>=20;;
		System.out.println(P.test(2));
		
	//2		
		Predicate<Integer> p=(i)->{
			int i1=10;
//			System.out.println(i1);
			return true;
		};
		boolean b=p.test(20);
		System.out.println(b);
		
	//bipredicate
		BiPredicate<String, String> BP=(s1,s2)->{
			return s1.equals(s2);
		};
		boolean b1=BP.test("Hema", "hema");
		System.out.println(b1);
		
	//2
		BiPredicate<Integer, Integer> bp=(i,j)->{
			if(i==j)
				return true;
			else
				return false;
		};
		boolean v1=bp.test(10, 10);
		System.out.println(v1);
		 
	//longpredicate
		LongPredicate lp=(i)->{
//			System.out.println("longpredicate");
			if(i==10)
				return true;
			else
				return false;
		};
		System.out.println(lp.test(100));
	}
}
