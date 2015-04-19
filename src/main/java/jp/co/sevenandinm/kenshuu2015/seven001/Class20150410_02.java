package jp.co.sevenandinm.kenshuu2015.seven001;
//２桁の入力値であれば表示、そうでなければ表示しない。
public class Class20150410_02{
	public static void main(String[] args){

		String message = "";
			
//画面にメッセージを出力
		message = "数値を入力してください。";
		System.out.println( message );
	
//キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int in_input = stdIn.nextInt();
		
//数値処理
		if( 10 <= in_input && in_input <= 99 ){
			System.out.println( in_input );
		}else{
			System.out.println( "エラー" );
		}

	
	}
}
