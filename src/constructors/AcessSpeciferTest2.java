package constructors;

import fundamentals.AccessSpeciferTest1;

public class AcessSpeciferTest2{
	
	public int a=10;
	protected static int b=50;
	
	String c="Hema";
	
	private float d=20.536f;
	public float getD() {
		return d;
	}
	public void setD(float d) {
		this.d = d;
	}

	public static void main(String[] args) {
		AccessSpeciferTest1 a1=new AccessSpeciferTest1();
		a1.setA(b);
		System.out.println(a1.put());

	}
}
