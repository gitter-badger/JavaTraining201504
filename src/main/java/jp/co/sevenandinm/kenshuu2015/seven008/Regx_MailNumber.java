package jp.co.sevenandinm.kenshuu2015.seven008;

import java.util.Scanner;

public class Regx_MailNumber {

	//メインメソッド
	public static void main(String[] args) {
		Regx_MailNumber my = new Regx_MailNumber();

		String str = inputData();
		boolean flag = execute(str);
		my.dispOut(flag);
	}

	//出力メソッド
	private void dispOut(boolean flag) {
		if(flag){
			System.out.println("正しい");
		}else{
			System.out.println("過ち");
		}
	}

	//正規表現メソッド
	private static boolean execute(String str) {
		return str.matches("^[\\w \\_ \\. \\- \\!]+@+([\\w]+\\.+[\\w]+$||[\\w]+\\.+[\\w]+\\.+[\\w]+$)");
	}


	//入力メソッド
	private static String inputData() {
		System.out.println("メールアドレスを入力してください");
		Scanner stdIn = new Scanner(System.in);
		String str =stdIn.nextLine();
		return str;
	}
}
