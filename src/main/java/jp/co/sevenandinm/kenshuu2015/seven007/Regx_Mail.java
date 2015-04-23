/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven007;

import java.util.Scanner;

//メールアドレス判別プログラム
public class Regx_Mail {

	public static void main(String[] args) {
		System.out.println("メールアドレスを入力してください。");
		Scanner stdIn = new Scanner (System. in);
		String inputData = stdIn.nextLine();
		boolean check_out = dispOut(inputData);
		if( check_out == true ){
			System.out.println("入力されたメールアドレス（"+inputData+"）は有効です。");
		}else
			System.out.println("入力されたメールアドレス（"+inputData+"）は無効です。");
	}

	public static boolean dispOut(String adress){
		boolean execute = adress.matches("[0-9a-zA-Z_.-]+@[0-9a-zA-Z_-]+(.[0-9a-zA-Z_-]+){1,2}");
		return execute;
	}
}




/*
name	return
class name	Regx_Mail
入力値取得メソッド	inputData	String
電話番号判定処理	execute	boolean
結果出力処理	dispOut	void
*/