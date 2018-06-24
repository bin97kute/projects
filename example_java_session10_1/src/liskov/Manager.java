package liskov;

public class Manager extends ManagermentStaff {

	@Override
	public void sendMessage() {
		System.out.println("Thông điệp từ giám đốc");
	}

}
