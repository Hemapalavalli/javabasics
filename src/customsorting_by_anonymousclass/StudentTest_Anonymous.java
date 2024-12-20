package customsorting_by_anonymousclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest_Anonymous {
	public static void main(String[] args) {

		List<Student> l = Arrays.asList(new Student(555, "Hema"), new Student(222, "Mounika"), new Student(111, "Pavan"),
				new Student(333, "Jagadesh"));

		Comparator<Student> cid = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.id - o2.id;
			}
		};
		Comparator<Student> cname = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		};

		System.out.println(l);
		l.sort(cid);
		System.out.println(l);
		Collections.sort(l, cname);
		System.out.println(l);

	}

}
