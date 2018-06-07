package example_session6_5;

public class MainClass {

	public static void main(String[] args) {
		HondaMoto x = new HondaMoto();
		x.setGear(1);
		x.setSpeed(20);
		x.getState();
		x.changeGear(2);
		x.speedUp(10);
		x.brake(5);
		x.getState();
	}

}
