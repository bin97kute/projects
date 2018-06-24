package example_session8_2;
//Sử dụng ArrayList, HashSet, Queue
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import example_session8_1.Student;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student("A",20,"1111");
		Student s2=new Student("B",21,"1121");
		Student s3=new Student("C",22,"2111");
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		System.out.println("Số phần tử của mảng: "+studentList.size());
		System.out.println(studentList.toString());
		studentList.remove(s1);
		System.out.println(studentList.toString());
		
		HashSet<Student> setOfStudent=new HashSet<>();
		setOfStudent.add(s1);
		setOfStudent.addAll(studentList);
		System.out.println(setOfStudent.toString());
		
		Queue<Student> queue=new PriorityQueue<>();
		queue.add(s1);
		//queue.add(s2);
		//queue.add(s3);
		//System.out.println(queue.toString());
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(2, "c");
		for(Map.Entry maps:map.entrySet()) {
			System.out.println(maps.getKey()+" "+maps.getValue());
		}
	}

}
