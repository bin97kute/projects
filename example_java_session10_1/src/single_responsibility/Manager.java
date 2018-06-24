package single_responsibility;

public class Manager extends Employee {

	public void performanceEvaluation() {
		System.out.println("Đánh giá năng lực nhân viên");
	}

	public void promoteEmployee() {
		System.out.println("Thúc đẩy nhân viên phát triển");
	}

}
