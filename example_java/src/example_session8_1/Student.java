package example_session8_1;

public class Student {
	private String name;
	private int age;
	private String id;
	
	public Student() {
		super();
	}
	public Student(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}
