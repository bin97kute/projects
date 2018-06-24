package example_java_session9_1;

public class MyThread4 extends Thread {
private Common cm;
	
	public MyThread4(Common cm) {
		this.cm = cm;
	}

	@Override
	public void run() {
		cm.printInfor(10);
	}
}
