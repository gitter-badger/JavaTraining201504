package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class07 {
		public static void main (String[] args){
			
		
	    	//画面にメッセージ出力
			String message1  = "お名前は";
			System.out.println ( message1 );
			double a;
			
			
			//キーボードからの入力
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			String name = stdIn.next();
			
			//画面にメッセージ出力
			String message2 = "こんにちは"+ name +"さん。";
			System.out.println ( message2 );
	   		
			//乱数の生成
			
			java.util.Random rnd = new java.util.Random();
			int ran = rnd.nextInt(7);
			
			
			
			
			String message3 = "あなたの今日のラッキーナンバーは"+ ran +"です。";
			System.out.println ( message3 );
			
			
	   		
		}
}
