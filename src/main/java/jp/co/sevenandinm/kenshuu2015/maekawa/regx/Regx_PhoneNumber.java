package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

import java.util.Scanner;

public class Regx_PhoneNumber {

	public Regx_PhoneNumber() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 0.準備処理
		System.out.println("電話番号を入力してください。");
		// 1.入力処理
		Regx_PhoneNumber my = new Regx_PhoneNumber();
		Scanner stdIn = new Scanner(System.in);
		String input = my.inputData(stdIn);
		// 2.判定処理
		boolean isTelNo = my.execute(input);
		// 3.出力
		my.dispOut(input,isTelNo);
	}

	/**
	 *
	 * @param input
	 * @param isTelNo
	 */
	private void dispOut(String input, boolean isTelNo) {
		// TODO 自動生成されたメソッド・スタブ
		if(isTelNo){
			System.out.println("入力された値[" + input + "]は、電話番号として正しいです。");
		}else{
			System.out.println("入力された値[" + input + "]は、電話番号であはりません。");
		}

	}

	/**
	 * 電話番号判定処理.
	 *
	 * @param input
	 * @return
	 */
	private boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		boolean isTelNo = false;
		String regex = "(0(\\d{1})-(\\d{4})-(\\d{4}))";
		isTelNo = input.matches(regex);
		return isTelNo;
	}

	/**
	 *
	 * @param stdIn
	 * @return
	 */
	private String inputData(Scanner stdIn) {
		// TODO 自動生成されたメソッド・スタブ
		return stdIn.next();
	}

}
