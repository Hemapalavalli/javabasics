package methods;

public class WOPWR {
	
	private String Accno;
	String Accname;
	
	public String Acc() {
		return Accname+" "+Accno;
	}

	public static void main(String[] args) {
		WOPWR w=new WOPWR();
		w.Accname="hema";
		w.Accno="Hema@123";
		System.out.println(w.Acc());
	}

}
