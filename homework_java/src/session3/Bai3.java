package session3;

public class Bai3 {
	public static void main(String[] args) {
		String temp = "devpro vietnam";
		Integer dem = 0;
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == 'v') {
				dem++;
			}
		}
		System.out.println("Có " + dem + " chữ v trong " + temp);
		temp = null;
		dem = null;
	}
}
