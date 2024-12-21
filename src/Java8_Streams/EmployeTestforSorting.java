package java8_Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeTestforSorting {

	public static void main(String[] args) {
		List<Employee> elist = Arrays.asList(new Employee("HemaLatha", "Banglore", 50000, "Hitache"),
				new Employee("Mounika", "Hydrebad", 45000, "abc PvtLimited"),
				new Employee("Pavan", "Pune", 55000, "Xyz Company"),
				new Employee("PurnaChari", "Chennai", 40000, "efg comany"));

		System.out.println(highestsalarywithsortM(elist));
		highestsalarywithoutsortM(elist);

	}

	public static Employee highestsalarywithsortM(List<Employee> list) {

		Comparator<Employee> ec = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getSalary() - o1.getSalary();
			}
		};
		Collections.sort(list, ec);
		System.out.println(list);

		return list.get(0);
//		return list.get(list.size()-1);
	}

	public static void highestsalarywithoutsortM(List<Employee> l) {

		int Hsalary = 0;
		String name = "";

		for (Employee e : l) {
			if (Hsalary < e.getSalary()) {
				Hsalary = e.getSalary();
				name = e.getName();
			}
		}
		System.out.println(name + " " + Hsalary);
	}
}
