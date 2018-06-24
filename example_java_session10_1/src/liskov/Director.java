package liskov;

public class Director extends ManagermentStaff{

	@Override
	public void sendMessage() {
		System.out.println("Gửi thông điệp");
	}

}
