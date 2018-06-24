package dependency;

public class Samsung implements BluetoothConnection{
	@Override
	public void acceptCall() {
		System.out.println("Samsung Bắt máy");
	}

	@Override
	public void declineCall() {
		System.out.println("Samsung Từ chối");
	}
}
