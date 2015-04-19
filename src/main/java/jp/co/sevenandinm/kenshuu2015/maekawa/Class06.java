package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Class06 {
	public static void main(String[] args){
	
		// 1.0 画面にメッセージを出力
		String message = "お名前は：";
		System.out.print( message );
		
		// 2.0 キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		String strIn = stdIn.next();
		
		System.out.print( "こんにちは、" + strIn + "さん" );
		
		// 乱数処理
		java.util.Random rnd = new java.util.Random();
		int ran = rnd.nextInt(10);
		int ran_time = rnd.nextInt(24);

		// 4.0 結果の出力
		System.out.println("あなたのラッキーナンバーは" + ran + "です。");
		System.out.println("あなたのラッキータイムは" + ran_time + "です。");
	}
}