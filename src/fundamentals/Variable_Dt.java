package fundamentals;

public class Variable_Dt {
	
	// static variables
	static int i1 = 100;
	static float f1 = 53.60f;
	static char c1 = 'H';
	static String s1 = "Palavalli";
	static Boolean b1 = false;
	final static String fs="Hemalatha";
	
	// instance variables
	int i2 = 1000;
	float f2 = 20.536f;
	char c2 = 'P';
	String s2 = "Hemalatha";
	Boolean b2 = true;
	
	public static void main(String[] args) {
		// local variables
		int i = 10;
		float f = 53.6f;
		char c = 'h';
		String s = "Hema";
		Boolean b = true;
		System.out.println(i + " " + f + " " + c + " " + s + " " + b);
		System.out.println();
		
		// instance variables
		Variable_Dt v = new Variable_Dt();
		System.out.println(v.i2 + " " + v.f2 + " " + v.c2 + " " + v.s2 + " " + v.b2);
		Variable_Dt v1 = new Variable_Dt();
		v1.i2=204;
		System.out.println(v.i2+" "+v1.i2);
		System.out.println();

		// static variables
		System.out.println(i1 + " " + f1 + " " + c1 + " " + s1 + " " + b1);
		v1.i1=536;
		System.out.println(Variable_Dt.i1);
		i1 = 919;
		System.out.println(v.i1+"  "+v1.i1);
		System.out.println(fs);
	}
}
