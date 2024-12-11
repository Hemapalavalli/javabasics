package fundamentals;

public class TypeConversions {

	public static void main(String[] args) {
		//implicit conversion
		int a=100;
		float b=a;
		System.out.println(b);
		
		//explicit conversion
		float f=53.6f;
		int i=(int) f;
		System.out.println(i);

		//type casting by ascii code
		char ch= '!';
		int aa=ch;
		System.out.println(aa);
		
		
		int aa1=126;
		char ch1=(char) aa1;
		System.out.println(ch1);
		
		
	}

}
