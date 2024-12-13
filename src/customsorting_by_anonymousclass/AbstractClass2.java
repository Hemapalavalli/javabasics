package customsorting_by_anonymousclass;

public class AbstractClass2 extends main2{
	
	@Override
	void show() {
		System.out.println("Show");
	}
	public static void main(String[] args) {
		
		AbstractClass2 ac=new AbstractClass2();
		ac.show();
	}

}
	
abstract class main2{
	abstract void show();
}

