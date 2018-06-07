package example_session6_5;

public class HondaMoto implements Motobike {
	private int speed;
	private int gear;

	public void getState() {
		System.out.println("Speed: " + speed);
		System.out.println("Gear: " + gear);
	}

	public HondaMoto() {
		super();
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	@Override
	public void changeGear(int newGear) {
		this.gear = newGear;
	}

	@Override
	public void speedUp(int increase) {
		this.speed = this.speed + increase;
	}

	@Override
	public void brake(int dec) {
		this.speed = this.speed - dec;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HondaMoto [speed=");
		builder.append(speed);
		builder.append(", gear=");
		builder.append(gear);
		builder.append("]");
		return builder.toString();
	}

}
