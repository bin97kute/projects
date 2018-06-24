package dependency;

public class Nokia implements BluetoothConnection {
	@Override
	public void acceptCall() {
		System.out.println("Nokia Bắt máy");
	}

	@Override
	public void declineCall() {
		System.out.println("Nokia Từ chối");
	}
}
