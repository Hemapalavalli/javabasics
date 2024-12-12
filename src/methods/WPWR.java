package methods;

public class WPWR {
	
	public String details(String name, int age) {
//		System.out.println(name+" "+age);
		return age+" "+name;
	}
	public static void main(String[] args) {
		WPWR w=new WPWR();
		System.out.println(w.details("Hema",22));
		
		
	}
}
