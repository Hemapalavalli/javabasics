package fundamentals;

import constructors.AcessSpeciferTest2;

public class AccessSpeciferTest1 extends AcessSpeciferTest2{
	
	private static int a;
//	protected static int put(){
//		return a;
//	}
	public int put(){
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}	

	public static void main(String[] args) {
		
		AcessSpeciferTest2 a2=new AcessSpeciferTest2();
		
		System.out.println(a2.a);
//		System.out.println(AcessSpeciferTest2.b);
		System.out.println(a2.getD());
	}
}
