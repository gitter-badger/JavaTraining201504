/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven007;

import java.util.Scanner;

//入力された電話番号のフォーマットが正しいか判別するプログラム
public class Regx_PhoneNumber {
	public static void main(String[] args) {

		System.out.println("電話番号を入力してください (例 **-****-**** or ***-****-**** or ****-**-****)");
		Scanner stdIn = new Scanner(System. in);
		String put = stdIn.nextLine();
		boolean dispOut = inputData(put);
		if( dispOut == true ){
			System.out.println("入力された電話番号(" +put +")は正しいです");
		}else{
			System.out.println("入力された電話番号(" +put +")は不正です");
		}
	}

	private static boolean inputData(String input){
		boolean execute = input.matches("[0-9]{2,4}-[0-9]{3,4}-[0-9]{4}");
		return execute;
	}
}
