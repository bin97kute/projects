package example_session5_1;

public class MainClass {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.insertStudent("Diep ngao", 20, "HaUI", "IT department", "Mai Dịch", "Hà Nội", "12761762131327",
				"1298739817238");
		student1.showInfor();
		student1.update("Cầu giấy", "379793279123123");
		student1.showInfor();
	}

}
