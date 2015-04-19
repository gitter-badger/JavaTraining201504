package jp.co.sevenandinm.kenshuu2015.seven001;
//今日の運勢を表示するプログラム
public class Class20150410_01{
	public static void main(String[] args){
	
		String message = "";
		
		
//画面にメッセージを出力
		message = "名前を入力してください。";
		System.out.println( message );
			
//2 キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		String name = stdIn.nextLine();
		System.out.println("こんにちは" + name + "さん。");
		
//3 乱数処理
		java.util.Random rnd = new java.util.Random();
		int ran_unsei = rnd.nextInt(100);
		int ran_color = rnd.nextInt(9);
		
		if( ran_unsei >= 90 && ran_unsei <= 99 ){
			System.out.println( "あなたの運勢は大吉です。" );
		} else if( ran_unsei >= 75 && ran_unsei <= 89 ){
			System.out.println( "あなたの運勢は中吉です。" );
		} else if( ran_unsei >= 45 && ran_unsei <= 74 ){
			System.out.println( "あなたの運勢は小吉です。" );
		} else if( ran_unsei >= 25 && ran_unsei <= 44 ){
			System.out.println( "あなたの運勢は吉です。" );
		} else if( ran_unsei >= 10 && ran_unsei <= 24 ){
			System.out.println( "あなたの運勢は末吉です。" );
		} else
			System.out.println( "あなたの運勢は凶です。" );
		
		if( ran_color == 0){
			System.out.println( "あなたのラッキーカラーは赤です。" );
		} else if( ran_color == 1 ){
			System.out.println( "あなたのラッキーカラーは青です。" );
		} else if( ran_color == 2 ){
			System.out.println( "あなたのラッキーカラーは黄です。" );
		} else if( ran_color == 3 ){
			System.out.println( "あなたのラッキーカラーは緑です。" );
		} else if( ran_color == 4 ){
			System.out.println( "あなたのラッキーカラーは灰です。" );
		} else if( ran_color == 5 ){
			System.out.println( "あなたのラッキーカラーは白です。" );
		} else if( ran_color == 6 ){
			System.out.println( "あなたのラッキーカラーは黒です。" );
		} else if( ran_color == 7 ){
			System.out.println( "あなたのラッキーカラーは紫です。" );
		} else 
			System.out.println( "あなたのラッキーカラーは小豆です。" );
	
	
	}
}
