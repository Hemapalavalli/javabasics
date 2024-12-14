package customsorting_by_anonymousclass;

//public interface AnonymousInterface {
//	void method();
//
//	public static void main(String[] args) {
//
//		AnonymousInterface a = new AnonymousInterface() {
//			@Override
//			public void method() {
//				System.out.println("Anonymous interface method");
//
//			}
//		};
//
//		a.method();
//	}
//}

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