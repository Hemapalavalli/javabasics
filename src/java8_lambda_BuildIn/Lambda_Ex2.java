package java8_lambda_BuildIn;

@FunctionalInterface
public interface Lambda_Ex2 {
	String Demo(String name,int id);
	
	public static void main(String[] args) {
		
		Lambda_Ex2 l=(name,id)->{
			return name +" " +id;
			
		};
		
		String s1=l.Demo("Hema", 536);
		System.out.println(s1);
	}

}

