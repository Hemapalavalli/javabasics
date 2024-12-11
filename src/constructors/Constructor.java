package constructors;

public class Constructor {
	Constructor(int a, int b) {
		System.out.println(a + "  " + b);
	}
	
	private void constructors() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(a + "  " + b + "  " + c);
	}

	public static void main(String args[]) {
		Constructor c = new Constructor(10, 20);
		c.constructors();

	}

}
