package example_session6_3;

public class Building {
	private String name;
	private String address;
	private Room room = new Room("A006", 100);

	public Building() {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Building [name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", room=");
		builder.append(room);
		builder.append("]");
		return builder.toString();
	}

	public Building(String name, String address, Room room) {
		super();
		this.name = name;
		this.address = address;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
}
