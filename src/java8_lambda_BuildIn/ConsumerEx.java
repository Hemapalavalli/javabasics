package java8_lambda_BuildIn;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
	
	//consumer
		Consumer<Integer> c=i->{
			System.out.println(i);
		};
		c.accept(20);
		
	//biconsumer
		BiConsumer<String, Integer>bc=(i,j)->{
			String sum=i+j;
			System.out.println(sum);
		};
		bc.accept("Hema ",22);
		
	//doubleconsumer
		DoubleConsumer dc=(d)->{
			System.out.println(d);
		};
		dc.accept(3.5423f);
	}

}
