package constructors;


public class ConstructorChaining {
	public ConstructorChaining() {
		System.out.println("Constructorchain class");
		
	}
	public ConstructorChaining(int a) {
		System.out.println("A: "+a);	
	}

	public static void main(String[] args) {
		CONSTRUCTOR2 c=new CONSTRUCTOR2();
	}
}

class CONSTRUCTOR1 extends ConstructorChaining{
	int b;
	public CONSTRUCTOR1() {
		super();
		System.out.println("constuctor1 class");
	}
}

class CONSTRUCTOR2 extends CONSTRUCTOR1 {
	public CONSTRUCTOR2() {
		super();
		System.out.println("constuctor2 class");
	}
}