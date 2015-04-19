package jp.co.sevenandinm.kenshuu2015.seven007;


public class Class04 {
	public static void main (String[] args){
		
		String message = "";
		double db_input;
		double db_pi = 3.1416;
		double db_surface_area;
		double db_volume;
		
		
		//画面にメッセージを出力
		message = "球の表面積と体積を求めます";
		System.out.println( message );
		
		
		//キーボードからの入力
		java.util.Scanner stdIN = new java.util.Scanner(System. in);
		db_input = stdIN.nextDouble();
		
		//計算
		db_surface_area = 4 * db_pi * Math.pow(db_input,2);
		db_volume = ( 4/3 ) * db_pi * Math.pow(db_input,3);
		
		//結果の出力
		System.out.println("表面積=" + db_surface_area + "です。");
		System.out.println("体積=" + db_volume + "です。");
	}
}

