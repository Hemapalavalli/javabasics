package collections;

public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @Override public int compareTo(Object o) { // TODO Auto-generated method stub
	 * //s.compareTo(s1); Student s = (Student)o; return this.name }
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	//[40, 20, 90, 30] -   40-20 = 20 
	//[20,40,90,30] - 40-90= -50
	//90-30 = 60 [20,40,30,90] -> 40-30 = [20,30,40,90]
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.id.compareTo(o.id);
		return this.name.compareTo(o.name);
	}
	
}
