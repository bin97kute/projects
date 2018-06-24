package liskov;

public abstract class ManagermentStaff extends Employee {
	public void performanceEvaluation(Employee staff) {
		System.out.println("�?ánh giá năng lực nhân viên");
	}

	public void promoteEmployee(Employee staff) {
		System.out.println("Thúc đẩy nhân viên phát triển");
	}
	
	public abstract void sendMessage();
}
