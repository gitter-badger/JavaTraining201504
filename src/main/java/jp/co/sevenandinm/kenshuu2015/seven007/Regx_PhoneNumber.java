/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven007;

import java.util.Scanner;

/**
 * @author newenployee7
 *
 */
public class Regx_PhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("電話番号を入力してください(例 **-****-****)");
		Scanner stdIn = new Scanner(System. in);
		String put = stdIn.nextLine();
		boolean dispOut = inputData(put);
		if( dispOut == true){
			System.out.println("入力された電話番号(" +put +")は正しいです");
		}else{
			System.out.println("入力された電話番号(" +put +")は不正です");
		}
	}


	private static boolean inputData(String input){
		boolean execute = input.matches("[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]");
		return execute;
	}

}


/*Scannerで入力された文字が、電話番号であるかどうか判定し、
あっていれば、「電話番号として正しいです。」
間違っていれば、「電話番号ではありません」
と表示するプログラムを作成しなさい。



class name	Regx_PhoneNumber
入力値取得メソッド	inputData
電話番号判定処理	execute
結果出力処理	dispOut
*/