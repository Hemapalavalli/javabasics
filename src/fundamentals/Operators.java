package fundamentals;

public class Operators {

	public static void main(String[] args) {
		int a=100;
		float b=4.536f;
		System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
		
		System.out.println((a>b)+" "+(a<b)+" "+(a>=b)+" "+(a<=b)+" "+(a==b)+" "+(a!=b));
		
		Boolean c= a>b;
		Boolean c1= a>=b;
		System.out.println((c&&c1)+" "+(c||c1)+" "+(!c)+" "+(!c1));

		int a1=10;
		int b1=3;
		a1%=b1;
		System.out.println(a1);
		
		int a2=8;
		System.out.println(a2++);
		System.out.println(++a2);
		
		int marks=50;
		boolean results=marks>=35?true:false;
		System.out.println(results);
		
		int a3=12;
		int b3=10;
		int c3=a3&b3;
		int c4=a3|b3;
		int c5=a3^b3;
		System.out.println(c3+" "+c4+" "+c5);
		
		int a4=10;
		int a5;
		System.out.println(a4=a4<<2);
		System.out.println(a5=a4>>3);
	}

}
