package customsorting_by_anonymousclass;

public class AnonymousInterface {

	public static void main(String[] args) {
		
		Anonymous a=new Anonymous() {
			@Override
			public void method() {
				System.out.println("Anonymous interface method");
				
			}
		};
		
		a.method();
	}

}
