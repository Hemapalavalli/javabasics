package java8_MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee1> l = Arrays.asList(
				new Employee1(10, "Hema", 300000.0, "Banglore"),
				new Employee1(20, "Mounika", 320000.0, "Hyderabad"), 
				new Employee1(50, "Pavan", 330000.0, "Pune"));

		System.out.println(l.stream().collect(Collectors.toSet()));
		System.out.println(l.stream().collect(Collectors.toMap(Employee1::getName, e -> e.getSalary())));
		System.out.println(l.stream().collect(Collectors.toMap(Employee1 -> Employee1.getName(), Employee1::getSalary)));
		
		List<Integer> l1=Arrays.asList(20,10,50,15,50,25,15);
		TreeSet<Integer> s =l1.stream().collect(Collectors.toCollection(() -> new TreeSet<Integer>()));
		System.out.println(s);
		
		TreeSet<Integer> s1 =l1.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(s1);
		
	}
}
