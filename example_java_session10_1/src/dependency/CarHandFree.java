package dependency;

public class CarHandFree {
	private BluetoothConnection blc;
	
	public void pairPhone(BluetoothConnection bt) {
		this.blc=bt;
	}
	
	public void attendCall() {
		blc.acceptCall();
	}

	public void declineCall() {
		blc.declineCall();
	}
}