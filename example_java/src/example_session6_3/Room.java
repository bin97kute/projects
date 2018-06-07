package example_session6_3;

public class Room {
	private String name;
	private float acreage;
	
	public Room() {
	}

	public Room(String name, float acreage) {
		super();
		this.name = name;
		this.acreage = acreage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAcreage() {
		return acreage;
	}

	public void setAcreage(float acreage) {
		this.acreage = acreage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [name=");
		builder.append(name);
		builder.append(", acreage=");
		builder.append(acreage);
		builder.append("]");
		return builder.toString();
	}

}
