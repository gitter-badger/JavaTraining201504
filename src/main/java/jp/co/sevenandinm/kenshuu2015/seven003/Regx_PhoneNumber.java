package jp.co.sevenandinm.kenshuu2015.seven003;

import java.util.Scanner;


public class Regx_PhoneNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電話番号を入力してください");

		Regx_PhoneNumber my = new Regx_PhoneNumber();
		Scanner stdIn = new Scanner(System.in);
		String input = my.inputData(stdIn);
		boolean isTelNo = my.execute(input);
		my.dispOut(input,isTelNo);

	}


	private void dispOut(String input, boolean isTelNo) {
		// TODO 自動生成されたメソッド・スタブ
		if(isTelNo){
			System.out.println("入力された< " + input + " >は電話番号として正しいです。");
		}else{
			System.out.println("入力された< " + input + " >は電話番号ではありません。");
		}
	}

	private boolean execute(String input) {
	 boolean isTelNo = false;
	 String regex = "[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";
		isTelNo = input.matches(regex);
	 return isTelNo;

	}

	private String inputData(Scanner stdIn) {
		// TODO 自動生成されたメソッド・スタブ

		return stdIn.next();
	}

}
