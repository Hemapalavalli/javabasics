package customsorting_by_anonymousclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_Using_Anonymous1 {

	public static void main(String[] args) {

		List<Student1> l = Arrays.asList(
				new Student1(55, "Hema"), 
				new Student1(22, "Mounika"), 
				new Student1(11, "Pavan"),
				new Student1(33, "Jagadesh"));

		Comparator<Student1> cid = new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				// TODO Auto-generated method stub
				return o1.id - o2.id;
			}
		};
		Comparator<Student1> cname = new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
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

class Student1 {
	
	int id;
	String name;
	
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
