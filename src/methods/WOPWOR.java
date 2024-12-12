package methods;

import java.util.Scanner;

public class WOPWOR {
	
	String name;
	String Awards;
	int noofAwards;
	
	public String getAwards() {
		System.out.println(Awards);
		return Awards;
	}
	public void setAwards(String awards) {
		Awards = awards;
		noofAwards++;
	}
	
	public void Count(){
		System.out.println(noofAwards);
	}

	public void Stars() {
		name="Savitri";
		System.out.println(name);
		setAwards("Mahanati");
		getAwards();
		Count();
	}

	public static void main(String[] args) {
		WOPWOR w=new WOPWOR();
		w.Stars();

	}

}
