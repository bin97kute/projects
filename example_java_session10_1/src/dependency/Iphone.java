package dependency;

public class Iphone implements BluetoothConnection {	
	@Override
	public void acceptCall() {
		System.out.println("Iphone Bắt máy");
	}

	@Override
	public void declineCall() {
		System.out.println("Iphone Từ chối");
	}
}
