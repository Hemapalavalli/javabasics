package constructors;

public abstract class ConstusingAbstract {
	ConstusingAbstract(){
		System.out.println("call Super class from child using super key");
	}
	public static void main(String[] args) {
		Abstract a=new Abstract();
	}

}
class Abstract extends ConstusingAbstract{
	Abstract(){
		super();
		System.out.println(toString());
	}
}
 