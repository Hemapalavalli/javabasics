package java8_Features_Stream;

public class StudentStream {
	private int id;
	private String name;
	private String branch;
	private int age;
	
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getBranch() {
		return branch;
	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public StudentStream(int id, String name, String branch, int age) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentStream [id=" + id + ", name=" + name + ", branch=" + branch + ", age=" + age + "]";
	}
}
