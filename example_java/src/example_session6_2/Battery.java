package example_session6_2;

public class Battery {
	private String capacity;
	private String type;

	public Battery(String capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Battery [capacity=");
		builder.append(capacity);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

}
