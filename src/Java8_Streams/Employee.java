package java8_Streams;

public class Employee{
	
	private String name;
	private String designation;
	private Integer salary;
	private String Company;
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public String getCompany() {
		return Company;
	}

	public Employee(String name, String designation, Integer salary, String company) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.Company = company;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Designation=" + designation + ", salary=" + salary + ", Company=" + Company
				+ "]";
	}
}
