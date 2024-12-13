package customsorting_by_anonymousclass;

public class Anonymous_AbstractClass {
	
	public static void main(String[] args) {
		
		Ano_Abs a=new Ano_Abs() {
			@Override
			void Ab_Method() {
				System.out.println("Anonymous function on abstract method");
			}
		};
		
		a.Ab_Method();
		a.No_Method();
	}
}

abstract class Ano_Abs{
	abstract void Ab_Method();
	void No_Method() {
		System.out.println("normal method in abstract class");
	}
}