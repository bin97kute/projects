package example_java_session9_1;

public class MyThread3 extends Thread {
	private Common cm;
	
	public MyThread3(Common cm) {
		this.cm = cm;
	}

	@Override
	public void run() {
		cm.printInfor(5);
	}
}
