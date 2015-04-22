package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.Scanner;

public class Regx_PhoneNumber {
	public static void  main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	String number = stdIn.nextLine();
	System.out.println(Telcheck(number));

	}

	public static boolean Telcheck(String number) {
		   String pattern = "^[0-9][0-9]+-[0-9][0-9][0-9][0-9]+-[0-9][0-9][0-9][0-9]+$";

		   boolean flag=number.matches(pattern);

	if(flag){
		System.out.println("電話番号として正しいです");
	}else{
		System.out.println("電話番号として正しくありません");
	}
	return flag;
	}
}

/*Scannerで入力された文字が、電話番号であるかどうか判定し、
あっていれば、「電話番号として正しいです。」
間違っていれば、「電話番号ではありません」
と表示するプログラムを作成しなさい。

*/