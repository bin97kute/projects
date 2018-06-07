package example_session6_2;

public class CellPhone {
	private String model;
	private Battery battery;

	public CellPhone(String model, Battery battery) {
		super();
		this.model = model;
		this.battery = battery;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CellPhone [model=");
		builder.append(model);
		builder.append(", battery=");
		builder.append(battery);
		builder.append("]");
		return builder.toString();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

}
