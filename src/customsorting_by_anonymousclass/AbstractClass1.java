package customsorting_by_anonymousclass;

public abstract class AbstractClass1 {
	
	abstract void show();

	public static void main(String[] args) {
		main1 m1=new main1();
		m1.show();		
	}
}

class main1 extends AbstractClass1{

	@Override
	void show() {
		System.out.println("Show");
		
	}
}