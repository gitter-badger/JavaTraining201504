package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Scanner;

public class Recog_mail_adress {

	public static void main(String[] args) {

		Recog_mail_adress my = new Recog_mail_adress();

		String str = inputData();
		boolean flag = execute(str);
		my.dispOut(flag);

	}

	private static boolean execute(String str) {
		return str.matches("^[\\w\\.\\-\\!]+@(?:[\\w\\-]+\\.)+[\\w\\-]+$");
	}

	private static java.lang.String inputData() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Mail Adoress を入力してください");
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

}
