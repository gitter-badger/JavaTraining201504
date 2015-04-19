package jp.co.sevenandinm.kenshuu2015.maekawa;

import java.util.*;
public class Class20150410_01{
	public static void main(String [] args){
	
//		System.out.println("file.encoding check:" + System.getProperty("file.encoding"));
		
		String st_Message = "";
		String st_Name = "";
		String st_Transport = "";
		int in_Establishment = 0;
		
		//メッセージ画面
		st_Message = "お名前は：";
		System.out.print(st_Message);
		
		//入力画面
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		st_Name = stdIn.next();
		
		System.out.println("こんにちは" + st_Name + "さん。");
		
		//乱数形成
		java.util.Random rnd = new java.util.Random();
		int ran_Transport = rnd.nextInt(100);
		int ran_Color = rnd.nextInt(9);
		
		//条件分岐
		if(ran_Transport >= 1 && ran_Transport <= 10){
			st_Transport = "大吉";
		}else if(ran_Transport >= 11 && ran_Transport <= 25){
			st_Transport = "中吉";
		}else if(ran_Transport >= 26 && ran_Transport <= 55){
			st_Transport = "少吉";
		}else if(ran_Transport >= 56 && ran_Transport <= 75){
			st_Transport = "吉";
		}else if(ran_Transport >= 76 && ran_Transport <= 90){
			st_Transport = "末吉";
		}else if(ran_Transport >= 91 && ran_Transport <= 100){
			st_Transport = "凶";
		}else{
			System.out.println("dummy");
		}
		
		//結果出力
		System.out.println("あなたの今日の運勢は「" + st_Transport + "」です");
		String strColor = "";
		switch( ran_Color ) {
		case 0 :
		 strColor = "レッド";
		break;
		case 1 :
			strColor = "ホワイト";
//		 System.out.println("あなたの今日のラッキーカラーはホワイトです");
		break;
		case 2 :
			strColor = "パープル";
//		 System.out.println("あなたの今日のラッキーカラーはパープルです");
		break;
		case 3 :
			strColor = "ピンク";
//		 System.out.println("あなたの今日のラッキーカラーはピンクです");
		break;
		case 4 :
			strColor = "イエロー";
//		 System.out.println("あなたの今日のラッキーカラーはイエローです");
		break;
		case 5 :
			strColor = "ゴールド";
//		 System.out.println("あなたの今日のラッキーカラーはゴールドです");
		break;
		case 6 :
			strColor = "ブルー";
//		 System.out.println("あなたの今日のラッキーカラーはブルーです");
		case 7 :
			strColor = "グリーン";
//			System.out.println("あなたの今日のラッキーカラーはグリーンです");
		break;
		case 8 :
			strColor = "ブラック";
//			System.out.println("あなたの今日のラッキーカラーはブラックです");
		break;
		}
		
		//結果出力
		System.out.println("あなたの今日のラッキーカラーは「" + strColor + "」です");
	}
	
}