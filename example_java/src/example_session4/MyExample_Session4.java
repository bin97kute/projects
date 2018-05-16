package example_session4;

public class MyExample_Session4 {
	// cơ bản
	public enum DayOfWeek {
		monday, tuesday, wednesday, thursday, friday, saturday;
	}

	// dùng enum với instance variable
	public enum Website {
		GOOGLE("google.com"), FACEBOOK("facebook.com"), YOUTUBE("youtube.com");
		private String mUrl;

		Website(String url) {
			this.mUrl = url;
		}

		public String url() {
			return mUrl;
		}
	}

	public enum Operattion {
		plu, mul, div, sub;

		double calculate(double x, double y) {
			switch (this) {
			case plu:
				return x + y;
			case sub:
				return x - y;
			case mul:
				return x * y;
			case div:
				return x / y;
			default:
				throw new AssertionError("Phep toan loi");
			}
		}
	}

	public enum season {
		Xuan("Xuân", "Spring"), Ha("Hạ", "Summer");

		private String vietnamese;
		private String english;

		season(String vietnamese, String english) {
			this.vietnamese = vietnamese;
			this.english = english;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DayOfWeek.monday);
		System.out.println(Website.GOOGLE.url());
		for (DayOfWeek day : DayOfWeek.values()) {
			System.out.println(day);
		}

		double result = Operattion.div.calculate(4, 0);
		System.out.println(result);
	}

}
