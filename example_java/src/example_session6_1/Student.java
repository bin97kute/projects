package example_session6_1;

import java.util.List;

public class Student {
	private String id;
	private String name;
	private List<Teacher> teacher;

	public Student() {
	}
	
	public void learning() {
		System.out.println("Học");
	}

	public Student(String id, String name, List<Teacher> teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", teacher=");
		builder.append(teacher);
		builder.append("]");
		return builder.toString();
	}
}
