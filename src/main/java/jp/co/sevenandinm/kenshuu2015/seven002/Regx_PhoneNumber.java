//Scannerで入力された文字が、電話番号であるかどうか判定し、
//あっていれば、「電話番号として正しいです。」
//間違っていれば、「電話番号ではありません」
//と表示するプログラムを作成しなさい。
package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Scanner;

public class Regx_PhoneNumber {

	public static void main(String[] args) {

		Regx_PhoneNumber my = new Regx_PhoneNumber();

		String str = inputData();
		boolean flag = execute(str);
		my.dispOut(flag);

	}

	private static boolean execute(String str) {
		return str.matches("^0\\d{1,2}-\\d{1,4}-\\d{4}$");
	}

	private static java.lang.String inputData() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電話番号を入力してください");
		Scanner stdIn = new Scanner(System.in);
		String int_phonenum = stdIn.nextLine();
		return int_phonenum;
	}

	private void dispOut(boolean flag) {
		// TODO 自動生成されたメソッド・スタブ
		if (flag) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	// String maches = ("^0\\d{1,2}-\\d{1,4}-\\d{4}$");

}
