package example_session6_1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	//vd về association
	public static void main(String[] args) {
		List<Teacher> teachers=new ArrayList<Teacher>();
		Teacher teacher1=new Teacher("A001","Nguyen Van A");
		Teacher teacher2=new Teacher("A002","Nguyen Van B");
		teachers.add(teacher1);
		teachers.add(teacher2);
		
		Student student = new Student("SV01","Nguyen Van C",teachers);
		System.out.println(student.toString());
	}
}
