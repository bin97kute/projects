package session3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------Tam giác vuông cạnh a----------");
		System.out.print("Nhập độ dài cạnh a = ");
		Integer a = scanner.nextInt();
		while (a < 1) {
			System.out.print("Hãy nhập a > 0\na = ");
			a = scanner.nextInt();
		}
		scanner.close();
		String temp = "";
		for (int i = 0; i < a; i++) {
			temp += "*";
			System.out.println(temp);
		}
		a = null;
		temp = null;
	}

}
