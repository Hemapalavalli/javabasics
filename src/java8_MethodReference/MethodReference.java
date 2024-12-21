package java8_MethodReference;

public class MethodReference {
	
	public static void main(String[] args) {
		//without methodreference without parameter
		College c = () -> System.out.println("VEC");
		c.Name();
		
		//without methodreference and with parameter
		College1<String> c1= t -> System.out.println("Branches: "+t);
		c1.branches("CSE, ECE, MEC, CIVIL, EEE");
		
		//with non static methodreference
		College1Ex<String> ce = new College1Ex<String>();
		College1<String> c11 = ce::Show;
		c11.branches("CSE, ECE, CIVIL");
		
		//with non static methodreference
		College2 c12= College1Ex::Showing;
		c12.showBranches(100);
	}
}

class College1Ex<T>{
	public void Show(T t) {
		System.out.println("Branches are: "+t);
	}
	
	public static void Showing(int a) {
		System.out.println("It is a static method "+a);
	}
}


@FunctionalInterface
interface College{
	void Name();
}

@FunctionalInterface
interface College1<T> {
	void branches(T t);
}

@FunctionalInterface
interface College2{
	void showBranches(int a);
}