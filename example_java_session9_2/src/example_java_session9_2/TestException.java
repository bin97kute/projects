package example_java_session9_2;

public class TestException {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Tuổi không hợp lệ");
		}else {
			System.out.println("Được phép truy cập");
		}
	}

	public static void main(String[] args) {
//		try {
//			int a=100/0;
//			int b[] = new int[6];
//			System.out.println(b[6]);
//			System.out.println(a);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Sai chỉ số mảng");
//		}catch (ArithmeticException e) {
//			System.out.println("Chia 0");
//		}
		validate(18);
		validate(17);
	}

}
