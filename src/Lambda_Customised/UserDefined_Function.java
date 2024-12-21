package lambda_Customised;


public class UserDefined_Function {
	
	public static void main(String[] args) {
		
	//function
		LFunction<Character, String> lf=(i)->{
			return ""+i;
		};
		
		String r=lf.apply('H');
		System.out.println(r);
		
	//Bifunctional
		LBiFunction<Double, Character, Double> lb=(i,j)->{
			return i+j;
		};
		double d=lb.sum(20.536f, 'A');
		System.out.println(d);
		
	//trifunctional
		LTriFunction lt=()->{
//		LTriFunction lt=(f,b,c)->{
			float f=25.36f;
			byte b=1;
			char c='A';

			return f+b+c;
//			Float l=f+b+c;
//			System.out.println(l);
//			return l;
		};
//		float l=lt.all(25.36f,(byte) 1, 'a');
		float l=lt.all();
		System.out.println(l);
	}
}

interface LFunction<F, R>{
	String apply(char i);
}

interface LBiFunction<F, S, R>{
	double sum(double i, char j);
}

interface LTriFunction<F,S,T,R>{
//	float all(float f,byte b,char c);
	float all();
}