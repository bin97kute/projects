package example_java_session9_1;

public class Common {
	public synchronized void printInfor(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
