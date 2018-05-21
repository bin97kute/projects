package example_session5_1;

public class Student {
	private String name;
	private int age;
	private String schoolName;
	private String deptName;
	private String currentAddress;
	private String hometown;
	private String id;
	private String bankAccount;

	public Student() {
	}

	public Student(String schoolName) {
		this.schoolName=schoolName;
	}

	public void insertStudent(String name, int age, String schoolName, String deptName, String currentAddress,
			String hometown, String id, String bankAccount) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
		this.deptName = deptName;
		this.currentAddress = currentAddress;
		this.hometown = hometown;
		this.id = id;
		this.bankAccount = bankAccount;
	}

	public void update(String address, String bankAccount) {
		this.currentAddress = address;
		this.bankAccount = bankAccount;
	}

	public void showInfor() {
		System.out.println("=================| Thông tin sinh viên |===================");
		System.out.println("H�? tên sinh viên: " + getName());
		System.out.println("Mã số sinh viên: " + getID());
		System.out.println("Tuổi: " + getAge());
		System.out.println("Tên trư�?ng: " + getSchoolName());
		System.out.println("Khoa: " + getDeptName());
		System.out.println("�?ịa chỉ hiện tại: " + getCurrentAddress());
		System.out.println("=================| ******************* |=====================");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getID() {
		return id;
	}

	public void setID(String iD) {
		id = iD;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

}
