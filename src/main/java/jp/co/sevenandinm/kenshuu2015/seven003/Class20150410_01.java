package jp.co.sevenandinm.kenshuu2015.seven003;

public class Class20150410_01 {
	public static void main(String[] args){
	
	//名前を入れる
		System.out.println("名前を入れてください。");
		
		
	//キーボード入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		String name = stdIn.nextLine();
	
		System.out.println("こんにちは" +name+ "さん！");
		
		
	//乱数処理
		java.util.Random rnd = new java.util.Random();
		int ran = rnd.nextInt(6);
		int ran_color = rnd.nextInt(9);
		
		switch( ran ) {
			case 0 :
				System.out.println("あなたの今日の運勢は大凶です");
				break;
			case 1 :
				System.out.println("あなたの今日の運勢は凶です");
				break;
			case 2 :
				System.out.println("あなたの今日の運勢は末吉です");
				break;
			case 3 :
				System.out.println("あなたの今日の運勢は小吉です");
				break;
			case 4 :
				System.out.println("あなたの今日の運勢は吉です");
				break;
			case 5 :
				System.out.println("あなたの今日の運勢は中吉です");
				break;
			case 6 :
				System.out.println("あなたの今日の運勢は大吉です");
		}
		
		
		switch( ran_color ) {
			case 0 :
		 		System.out.println("あなたの今日のラッキーカラーはレッドです");
				break;
			case 1 :
		 		System.out.println("あなたの今日のラッキーカラーはホワイトです");
				break;
			case 2 :
		 		System.out.println("あなたの今日のラッキーカラーはパープルです");
				break;
			case 3 :
		 		System.out.println("あなたの今日のラッキーカラーはピンクです");
				break;
			case 4 :
		 		System.out.println("あなたの今日のラッキーカラーはイエローです");
				break;
			case 5 :
		 		System.out.println("あなたの今日のラッキーカラーはゴールドです");
				break;
			case 6 :
		 		System.out.println("あなたの今日のラッキーカラーはブルーです");
			    break;
			case 7 :
				System.out.println("あなたの今日のラッキーカラーはグリーンです");
				break;
			case 8 :
				System.out.println("あなたの今日のラッキーカラーはブラックです");
				break;
		}
		
		
		
		
	}
	
}



