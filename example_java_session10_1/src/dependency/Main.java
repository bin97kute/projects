package dependency;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Samsung samsung = new Samsung();
		Nokia nokia = new Nokia();
		
		CarHandFree handFree = new CarHandFree();
		
		handFree.pairPhone(nokia);
		handFree.attendCall();
		handFree.declineCall();
		handFree.pairPhone(samsung);
		handFree.attendCall();
		handFree.pairPhone(iphone);
	}

}
