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
		String tel244="^0\\d-\\d{4}-\\d{4}";
		String tel424="^0\\d{3}-\\d{2}-\\d{4}";
		String tel334="^0\\d{2}-\\d{3}-\\d{4}";
		String telphone="^0\\d0-\\d{4}-\\d{4}";
		return str.matches(tel244+"|"+tel424+"|"+tel334+"|"+telphone);
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
