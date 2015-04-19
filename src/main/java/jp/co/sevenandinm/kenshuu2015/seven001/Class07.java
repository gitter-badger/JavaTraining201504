package jp.co.sevenandinm.kenshuu2015.seven001;
//ラッキーナンバーを求める
public class Class07{
	public static void main(String[] args){
		
	String message = "";
	int int_luk_no = 0 ;
	
		//1 画面にメッセージを出力
		message = "名前を入力してください。";
		System.out.println( message );
		
		//2 キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		String name = stdIn.nextLine();
		System.out.println( "こんにちは" + name + "さん。" );
		
		//3 乱数処理
		java.util.Random rnd = new java.util.Random();
		int ran = rnd.nextInt(10);
		int ran_time = rnd.nextInt(24);
		
		//結果の出力
		System.out.println("あなたの今日のラッキーナンバーは「" + ran + "」です。");
		System.out.println("あなたの今日のラッキータイムは「" + ran_time + "」です。");
		
	
	
	}
}