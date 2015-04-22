package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.Scanner;


public class Regx_PhoneNumber{

	public static void main(String[] args) {

		String str = inputDate();
		boolean flag = excude(str);
		dispOut(flag);


		// TODO 自動生成されたメソッド・スタブ



	}
	public static String inputDate(){
		System.out.println("電話番号を入力してください");
		Scanner scan =new Scanner(System.in);
		String str =scan.nextLine();
		return str;

	}
	public static boolean excude(String str){
		return str.matches("[0-9][0-9]-[0-9]{4}-[0-9]{4}");
	}
	public static void  dispOut(boolean flag){
		if(flag){
		System.out.println("電話番号として正しいです");
		}
		else{
		System.out.println("電話番号ではありません");
		}
	}


}
