package example_session5_2;

public class MainClass {
	public static void main(String[] args) {
		Developer dev= new Developer();
		Employee emp=new Employee();
		Director dr=new Director();
		
		System.out.println("Lương của deverloper: "+dev.salary);
		System.out.println("Thưởng của deverloper: "+dev.developerBonus);
		System.out.println("Công việc của deverloper: ");
		dev.coding();
		dev.task();
		
		System.out.println("Lương của giám đốc: "+dr.salary);
		System.out.println("Thưởng của giám đốc: "+dr.directorBonus);
		System.out.println("Công việc của giám đốc: ");
		dr.managing();
		dr.task();
		
		System.out.println("Lương của nhân viên thường: "+emp.salary);
		System.out.println("Công việc của nhân viên thường: ");
		emp.task();
	}
}
