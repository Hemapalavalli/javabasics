package java8_MethodReference;

public class Employee1 {
	private Integer id;
	private String name;
	private Double Salary;
	private String place;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return Salary;
	}

	public String getPlace() {
		return place;
	}

	public Employee1(Integer id, String name, Double salary, String place) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", Salary=" + Salary + ", place=" + place + "]";
	}

}
