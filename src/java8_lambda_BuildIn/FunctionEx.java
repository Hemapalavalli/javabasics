package java8_lambda_BuildIn;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx {

	public static void main(String[] args) {

	//functional
		Function<Integer, Integer> fun=(i)->{
			System.out.println(i);
			return i;
		};
		fun.apply(10);
		
		
	//Bifunctional
		BiFunction<Integer, String, String> fun1=(i,j)->{
//			System.out.println(i+j);
//			String l=i+j;
//			return l;
			return i+j;
//			return i+" "+j;
		};
		
		String s=fun1.apply(10, "Hema");
		System.out.println(s);
		
	//tointfunction
		ToIntFunction<Character> f=(c)->{
			return c;
		};
		int i=f.applyAsInt('a');
		System.out.println(i);
	}
}
