package java8_MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeHomeWork {

	public static void main(String[] args) {
		List<Employee1> l = Arrays.asList(new Employee1(10, "Hema", 300000.0, "Banglore"),
				new Employee1(20, "Mounika", 320000.0, "Hyderabad"), new Employee1(50, "Pavan", 330000.0, "Pune"));
		
		List<Employee1> l1 = Arrays.asList(new Employee1(100, "Hema", 300000.0, "Banglore"),
				new Employee1(200, "Mounika", 320000.0, "Hyderabad"), new Employee1(500, "Pavan", 330000.0, "Pune"));

		List<List<List<Employee1>>> empList = new ArrayList();
//		empList.add(l);
		empList.add(List.of(l));
//		empList.add(List.of(l1));
//		System.out.println(empList);
		empList.add(new ArrayList<List<Employee1>>(List.of(l1)));
//		System.out.println(empList);

		Iterator<List<List<Employee1>>> eit = empList.iterator();
		while (eit.hasNext()) {
			List<List<Employee1>> list = eit.next();
//			System.out.println(list);

			Iterator<List<Employee1>> eit1 = list.iterator();
			while (eit1.hasNext()) {
				List<Employee1> list2 = eit1.next();
//				System.out.println(list2);

				Iterator<Employee1> eit2 = list2.iterator();
				while (eit2.hasNext()) {
					Employee1 employee1 = eit2.next();
					System.out.println(employee1.getName() + "   " + employee1.getPlace());
				}
			}
		}

		Map<Integer, List<List<Employee1>>> empMap = new HashMap<Integer, List<List<Employee1>>>();
		empMap.put(0, List.of(l));
		empMap.put(1, List.of(l1));
		
		System.out.println(empMap.keySet());
		
		Iterator<Integer> emit = empMap.keySet().iterator();
		while (emit.hasNext()) {
			Integer i = emit.next();
			System.out.println(i +" "+empMap.get(i));
		}
		
	}

}

