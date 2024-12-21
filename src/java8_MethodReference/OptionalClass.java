package java8_MethodReference;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		OptionalClass op = new OptionalClass();
		Optional<Employee1> optional= op.getEmployee1();
		Employee1 e = optional.isPresent() ? optional.get() : new Employee1(null, null, null, null);
		System.out.println(e.getName());
	}
	
	public Optional<Employee1> getEmployee1() {
		
		Employee1 emp = new Employee1(300, "Purna", 600000d, "California");
//		Department dep = new Department(2012, "Product Management");
//		emp.setDepartment(dep);
		Optional<Employee1> op = Optional.ofNullable(emp);
		return op;

	}

}
