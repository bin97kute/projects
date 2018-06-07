package example_session6_1;

public class Teacher {
	private String id;
	private String name;
	
	public Teacher() {
		
	}

	public Teacher(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void training() {
		System.out.println("Huấn luyện");
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
