package jp.co.sevenandinm.kenshuu2015.seven007;

//挨拶と今日の運勢を表示するプログラム

public class Class20150410_01{
	public static void main(String[] args){

		String st_message = "";
		String st_name = "";
		int in_ruck = 0;
		String st_ruck_name = "";
		int in_color = 0;
		String st_color_name = "";

		
//名前の入力		
		st_message = "お名前は：";
		System.out.print( st_message );
		
		
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		st_name = stdIn.nextLine();
		
		System.out.println("こんにちは" +st_name +"さん。");

//ランダム関数取得	
		java.util.Random rnd = new java.util.Random();
		in_ruck = rnd.nextInt(100);
		
		if (0 <= in_ruck && in_ruck <= 9){
			st_ruck_name = "「大吉」";
		}
		else if (10 <= in_ruck && in_ruck <= 24){
			st_ruck_name = "「中吉」";
		}
		else if (25 <= in_ruck && in_ruck <= 54){
			st_ruck_name = "「小吉」";
		}
		else if (55 <= in_ruck && in_ruck <= 74){
			st_ruck_name = "「吉」";
		}
		else if (75 <= in_ruck && in_ruck <= 89){
			st_ruck_name = "「末吉」";
		}
		else {
			st_ruck_name = "「凶」";
		}
		
		java.util.Random rand = new java.util.Random();
		in_color = rand.nextInt(9);
		
		if ( in_color == 0 ){
			st_color_name = "「赤」";
		}
		else if ( in_color == 1 ){
			st_color_name = "「青」";
		}
		else if ( in_color == 2 ){
			st_color_name = "「黄」";
		}
		else if ( in_color == 3 ){
			st_color_name = "「緑」";
		}
		else if ( in_color == 4 ){
			st_color_name = "「灰」";
		}
		else if ( in_color == 5 ){
			st_color_name = "「白」";
		}
		else if ( in_color == 6 ){
			st_color_name = "「黒」";
		}
		else if ( in_color == 7 ){
			st_color_name = "「紫」";
		}
		else {
			st_color_name = "「あずき」";
		}
		
//結果の出力	
		System.out.println("あなたの今日の運勢は" +st_ruck_name +"です。");
		System.out.println("あなたの今日のラッキーカラーは" +st_color_name +"です。");
	}
}
		