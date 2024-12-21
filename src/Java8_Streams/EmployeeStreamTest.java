package java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamTest {

	public static void main(String[] args) {

		List<Employee> l = Arrays.asList(new Employee("Hema", "Banglore", 50000, "Hitache"),
				new Employee("Mounika", "Hydrebad", 45000, "abc PvtLimited"),
				new Employee("Pavan", "Pune", 55000, "Xyz Company"),
				new Employee("PurnaChari", "Chennai", 40000, "efg comany"));

//		System.out.println(l.stream().sorted((s1,s2) -> s2.getSalary().compareTo(s1.getSalary())).findFirst().get());
//		System.out.println(l.stream().sorted((s1,s2) -> s1.getSalary().compareTo(s2.getSalary())).findFirst().get());
//		System.out.println(l.stream().max((s1,s2) -> s2.getSalary().compareTo(s1.getSalary())).get());
//		System.out.println(l.stream().min((s1,s2) -> s2.getSalary().compareTo(s1.getSalary())).get());

//		System.out.println(l.stream().sorted((s1,s2) -> s2.getSalary().compareTo(s1.getSalary())).skip(1).findFirst().get());
//		System.out.println(l.stream().sorted((s1,s2) -> s2.getSalary().compareTo(s1.getSalary())).limit(2).toList());

		// gives descending order an gives the to value means max
//		System.out.println(l.stream().max((v1,v2) -> v2.getName().compareTo(v1.getName())).get());

		// gives ascending order an gives the to value means max
//		System.out.println(l.stream().max((v1,v2) -> v1.getName().compareTo(v2.getName())).get());

//		System.out.println(l.stream().min((v1,v2) -> v1.getName().compareTo(v2 .getName())).get());
//		System.out.println(l.stream().min((v1,v2) -> v2.getName().compareTo(v1.getName())).get());

		System.out.println(l.stream().filter(v -> v.getSalary() < 50000).collect(Collectors.toSet()));

		EmployeeStreamTest e = new EmployeeStreamTest();
//		System.out.println(e.Salary(l));
//		System.out.println(e.MaxSalary(l));
//		System.out.println(e.SSorted(l));
		System.out.println(e.LSorted(l));
	}

	public Set<Employee> Salary(List<Employee> sl) {
		return sl.stream().filter(v -> v.getSalary() < 50000).collect(Collectors.toSet());
	}
	

	public Employee MaxSalary(List<Employee> ml) {
		return ml.stream().max((v1, v2) -> v2.getSalary().compareTo(v1.getSalary())).get();
	}
	public Employee MinSalary(List<Employee> ml) {
		return ml.stream().min( (s1,s2) -> s2.getSalary().compareTo(s1.getSalary())).get();
	}
	
	public Employee SSorted(List<Employee> sl) {
		return sl.stream().sorted((v1,v2) -> v2.getSalary().compareTo(v1.getSalary())).skip(1).findFirst().get();
	}
	
	public List<Employee> LSorted(List<Employee> LL) {
		return LL.stream().sorted((v1,v2) -> v2.getSalary().compareTo(v1.getSalary())).limit(2).toList();
	}
}
