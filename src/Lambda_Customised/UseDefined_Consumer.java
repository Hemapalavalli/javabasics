package lambda_Customised;

public class UseDefined_Consumer {

	public static void main(String[] args) {
	//consumer
		LConsumer<Double> lc=()->{
			double d=20.536f;
			System.out.println(d);
		};
		lc.accept();
	
	//biconsumer
		LBiConsumer lb=(i,c)->{
			System.out.println(i+c);
		};
		lb.accept(10,"f");
		
	//Triconsumer
		LTriConsumer lt=(s,c,ch)->{
			String str=s+c+ch;
//			System.out.println(str);
			return str;
		};
		String s=lt.all("P ", 'H', 'R');
		System.out.println(s);
	}

}

interface LConsumer<F> {
	void accept();
}

interface LBiConsumer<F,S> {
	void accept(int i, String c);
}

interface LTriConsumer<F,S,T>{
	String all(String s,char c,char ch);
}

