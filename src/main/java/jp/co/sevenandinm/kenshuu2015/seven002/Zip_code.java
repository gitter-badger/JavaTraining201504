package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Scanner;

public class Zip_code {

	public static void main(String[] args) {

		Zip_code my = new Zip_code();

		String str = inputData();
		boolean flag = execute(str);
		my.dispOut(flag);

	}

	private static boolean execute(String str) {
		return str.matches("^\\d{3}-\\d{4}$");
	}

	private static java.lang.String inputData() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("郵便番号を入力してください");
		Scanner stdIn = new Scanner(System.in);
		String int_phonenum = stdIn.nextLine();
		return int_phonenum;
	}

	void dispOut(boolean flag) {
		// TODO 自動生成されたメソッド・スタブ
		if (flag) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
