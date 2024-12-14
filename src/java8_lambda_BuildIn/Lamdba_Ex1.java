package java8_lambda_BuildIn;

public class Lamdba_Ex1 {

	public static void main(String[] args) {

		Main m = i -> System.out.println(i);
		m.add(20);

//		Main m1=()->{
//			int a=10,b=20;
//			System.out.println("Adding: "+(a+b));
//		};
//		m1.add();

//		Main m2=(i,j)->{
//			System.out.println("Adding: "+i);
//			System.out.println("Adding: "+(i+j));
//			
//			int sum=i+j;
////			System.out.println("sum: "+sum);
//			return "sum: "+sum;
//		};
//		String s=m2.add(10, 20);
//		System.out.println(s);

		// Add class
		Add a = new Add();
		a.add(200);
		a.sum();
		
		Main.Do();
	}
}

class Add implements Main {
	@Override
	public void add(int i) {
		System.out.println("Adding: " + i);
	}
	
	@Override
	public void sum() {
		Main.super.sum();
		System.out.println("default Overridden sum method");
	}
}

@FunctionalInterface
interface Main {
	void add(int i);
//	void add();	
//	String add(int i,int j);
	
	static void Do() {
		System.out.println("Static method in interface");
	}

	default void sum() {
		System.out.println("default abstract method in interface");
	}
}
