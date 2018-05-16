		/* ***************************************
		 * Chuyển đổi kiểu dữ liệu trong Java
		 * ***************************************/
		// String - Primitive
		String stringTest1 = "100"; 							// Đây là một chuỗi kỹ tự
		int stringToPrimitive = Integer.parseInt(stringTest1); 	// Chuyển đổi String sang int
		int intTest1 = 100;
		int temp1 = intTest1 + stringToPrimitive; 				// Sau khi chuyển đổi có thể thực hiện phép cộng 2 số nguyên
		System.out.println(temp1);
		// Primitive - String
		int intValue2 = 200; 									// Đây là một số nguyên
		String stringValue2 = String.valueOf(intValue2); 		// Chuyển đổi int sang String
		String testString2 = "50";
		String temp2 = stringValue2 + testString2;				// Sau khi chuyển đổi có thể nối 2 chuỗi với nhau
		System.out.println(temp2);
		
		// String - Wrapper object
		String stringValue3 = "300";							// Đây là một chuỗi ký tự
		int intValue3 = 300;									// Đây là một số nguyên
		Integer intWrapper3 = Integer.valueOf(stringValue3);	// Chuyển đổi String sang Wrapper object
		Integer testWrapper3 = Integer.valueOf(intValue3);		// Chuyển đổi int Sang Wrapper object
		System.out.println(intWrapper3 + testWrapper3);			// Sau khi chuyển đổi đã có thể thực hiện phép cộng
		// Wrapper object - String
		int intValue4 = 400;									// Đây là một số nguyên
		Integer intWrapper4 = Integer.valueOf(intValue4);		// Chuyển đổi số nguyên sang Wrapper object
		String stringValue4 = intWrapper4.toString();			// Chuyển đổi một Wrapper object sang String
		String testString4 = "Bốn trăm ";							
		System.out.println(testString4 + stringValue4);			// Sau khi chuyển đổi có thể nối 2 chuỗi với nhau
		
		// Primitive - Wrapper object
		Integer intWrapper5 = Integer.valueOf(500);				// Chuyển đổi int sang Wrapper object
		// Wrapper object to Primitive			
		int intValue5 = intWrapper5.intValue();					// Chuyến đổi Wrapper object sang int
		
		// Wide casting/ Ép kiểu không tường minh: byte -> short -> int -> long -> float -> double
        int intValue6 = 100;
        float floatValue6 = intValue6;
        System.out.println("Giá trị Int: " + intValue6);
        System.out.println("Giá trị Float:  " + floatValue6);
		
		// Narrow casting/ Ép kiểu tường minh: double -> float -> long -> int -> short -> byte
        float floatValue7 = 10.8f;
        int intValue7 = (int) floatValue7;
        System.out.println("Giá trị Int: " + intValue7);
        System.out.println("Giá trị Float:  " + floatValue7);


		/****************************************
		 * Làm việc với mảng
		 ****************************************/
		int arrayExample1[] = new int[3]; 							// Khai báo khởi tạo kích thước
		int arrayExample2[] = new int[]{1,2,3}; 					// Khai báo khởi tạo số phần tử và giá trị các phần tử
		int arrayExample3[] = {10, 20, 30}; 						// Bắt buộc kai báo đồng thời gán cho một mảng nặc danh

		int arrayExample4[][] = new int[2][2];						// Khai báo khởi tạo kích thước
		int arrayExample5[][] = new int[][] {{10, 20},{1, 2}};		// Khai báo khởi tạo số phần tử và giá trị các phần tử
		int arrayExample6[][] = {{10, 20, 30, 40},{1, 2, 3, 4}}; 	// Bắt buộc kai báo đồng thời gán cho một mảng nặc danh

		for (int variable: arrayExample3) {
			System.out.println("Giá trị của phần tử là: " + variable);
		}
		
		


//Loại bỏ một phần tử trong Array
package com.devpro.training;

import java.util.Arrays;

public class Eclair {

	public static int[] removeFromArray(int[] array, int removeIndex) {
		int newArray[] = new int[array.length - 1];
		for (int i = removeIndex; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		
		for(int i=0;i<array.length - 1;i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] intArray = { 2, 4, 6 };
			System.out.println(Arrays.toString(removeFromArray(intArray, 2)));
	}
}


// Tìm giá trị lớn nhất nhỏ nhất
package com.devpro.training;

public class Eclair {
	public static void main(String[] args) {
		int[] ints = { 6, 2, 4, 6, 8, 10 };

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < ints.length; i++) {
			if (ints[i] < minValue) {
				minValue = ints[i];
			}
		}
		
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > maxValue) {
				maxValue = ints[i];
			}
		}
		
		System.out.println(minValue);
		System.out.println(maxValue);
	}
}

//Sao chép 1 mảng bằng cách lặp lại
int[] source = new int[10];
int[] dest   = new int[10];

for(int i=0; i < source.length; i++) {
    source[i] = i;
}

for(int i=0; i < source.length; i++) {
    dest[i] = source[i];
}


//Sao chép 2 mảng bằng cách dùng Arrays.copyOf()
int[] source = new int[10];
for(int i=0; i < source.length; i++) {
    source[i] = i;
}

int[] dest = Arrays.copyOf(source, source.length);

//Sao chép 2 mảng bằng cách dùng Arrays.copyOfRange()
int[] source = new int[10];

for(int i=0; i < source.length; i++) {
    source[i] = i;
}

int[] dest = Arrays.copyOfRange(source, 0, source.length);


//Arrays to Strings With Arrays.toString()
int[]   ints = new int[10];

for(int i=0; i < ints.length; i++){
    ints[i] = 10 - i;
}

System.out.println(java.util.Arrays.toString(ints));


//Sắp mảng
int[]   ints = new int[10];

for(int i=0; i < ints.length; i++){
    ints[i] = 10 - i;
}

System.out.println(java.util.Arrays.toString(ints));

java.util.Arrays.sort(ints);

System.out.println(java.util.Arrays.toString(ints));

//Sắp xếp mảng đối tượng
private static class Employee{
    public String name;
    public int    employeeId;

    public Employee(String name, int employeeId){
        this.name       = name;
        this.employeeId = employeeId;
    }
}

//---------------
Employee[] employeeArray = new Employee[3];

employeeArray[0] = new Employee("Xander", 1);
employeeArray[1] = new Employee("John"  , 3);
employeeArray[2] = new Employee("Anna"  , 2);

java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
});


for(int i=0; i < employeeArray.length; i++) {
    System.out.println(employeeArray[i].name);
}

//Điền mảng với Arrays.fill()
int[] intArray = new int[10];

Arrays.fill(intArray, 123);

System.out.println(Arrays.toString(intArray));

//Tìm kiếm mảng với Arrays.binarySearch()
int[] ints = {0,2,4,6,8,10};

int index = Arrays.binarySearch(ints, 6);

System.out.println(index);

//Kiểm tra 2 mảng có bằng nhau ko dùng Arrays.equals()
int[] ints1 = {0,2,4,6,8,10};
int[] ints2 = {0,2,4,6,8,10};
int[] ints3 = {10,8,6,4,2,0};

boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

System.out.println(ints1EqualsInts2);
System.out.println(ints1EqualsInts3);


//Vì sao Enum được ra đời?
public class Season {
 public static final String SPRING = "SPRING";
 public static final String SUMMER = "SUMMER";
 public static final String AUTUMN = "AUTUMN";
 public static final String WINTER = "WINTER";
 
 public static String getJob(String season) {
 return (season.equals(Season.SPRING)) ? "Mùa ăn chơi!" : "Làm việc!";
 }
}

public class Ex1 {
 
	public static void main(String[] args) {
		System.out.println(Season.getJob("SPRING"));
	}
}

// khi dùng enum
public enum Season {
 SPRING, SUMMER, AUTUMN, WINTER;
 
 public static String getJob(Season season) {
 return (season.equals(Season.SPRING)) ? "Mùa ăn chơi!" : "Làm việc!";
 }
}

public class Ex2 {
 
	public static void main(String[] args) {
		System.out.println(Season.getJob(Season.SPRING));
	}
 
}

// đa ngôn ngữ
public enum Season {
	SPRING("sp", "Mùa xuân", "Spring"), SUMMER("sm", "Mùa Hạ", "Summer"), AUTUMN("at", "Mùa thu",
			"Autumn"), WINTER("wt", "Mùa đông", "Winter");
 
	private String ma;
	private String tiengViet;
	private String tiengAnh;
 
	private Season(String ma, String tiengViet, String tiengAnh) {
		this.ma = ma;
		this.tiengViet = tiengViet;
		this.tiengAnh = tiengAnh;
	}
 
	public String getMa() {
		return ma;
	}
 
	public void setMa(String ma) {
		this.ma = ma;
	}
 
	public String getTiengViet() {
		return tiengViet;
	}
 
	public void setTiengViet(String tiengViet) {
		this.tiengViet = tiengViet;
	}
 
	public String getTiengAnh() {
		return tiengAnh;
	}
 
	public void setTiengAnh(String tiengAnh) {
		this.tiengAnh = tiengAnh;
	}
 
	public static String getJob(Season season) {
		return (season.equals(Season.SPRING)) ? "Mùa ăn chơi!" : "Làm việc!";
	}
}
 
public class Ex2 {
 
	public static void main(String[] args) {
		Season seasonSP = Season.SPRING;
		// lấy giá trị tên object (enum)
		System.out.println(seasonSP.toString());
		// set giá trị thuộc tính cho object 
		seasonSP.setMa("spnew");
		// lấy giá trị thuộc tính của object enum
		System.out.println(seasonSP.getTiengViet());
	}
 
}

//I/O

System.out.println("simple message");  
System.err.println("error message");  