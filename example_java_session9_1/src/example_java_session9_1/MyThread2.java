package example_java_session9_1;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}

}
