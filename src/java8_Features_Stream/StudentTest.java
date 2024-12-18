package java8_Features_Stream;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<StudentStream> l=Arrays.asList(
				new StudentStream(501, "Hema", "CSE", 22),
				new StudentStream(502, "Vyshu", "Bcom", 27),
				new StudentStream(503, "Pradeep", "ECE", 25),
				new StudentStream(504, "Chandu", "MCA", 23));
		
		List<StudentStream> csestudents = l.stream().filter(v->v.getBranch().equals("CSE")).toList();
		System.out.println(csestudents);
		
		List<StudentStream> NameEndWithU = l.stream().filter(v->v.getName().endsWith("u")).toList();
		System.out.println(NameEndWithU);
		
		List<StudentStream> age24 = l.stream().filter(s->s.getAge()>24).toList();
		System.out.println(age24);
		
		

	}

}
