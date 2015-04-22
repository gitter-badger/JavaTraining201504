package jp.co.sevenandinm.kenshuu2015.seven008;

import java.util.Scanner;

public class Regx_PhoneNumber {

	public static void main(String[] args) {
		Regx_PhoneNumber my = new Regx_PhoneNumber();

		String str = inputData();
		boolean flag = execute(str);
		my.dispOut(flag);
	}

	private void dispOut(boolean flag) {
		if(flag){
			System.out.println("正しい");
		}else{
			System.out.println("過ち");
		}
	}

	private static boolean execute(String str) {
		return str.matches("^\\d{3}-\\d{4}-\\d{4}$");
	}

	private static String inputData() {
		System.out.println("電話番号を入力してください");
		Scanner stdIn = new Scanner(System.in);
		String str =stdIn.nextLine();
		return str;
	}
}