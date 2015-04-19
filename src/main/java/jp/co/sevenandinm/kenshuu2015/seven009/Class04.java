package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class04 {
		public static void main (String[]args){
			String message ="";
			double fl_input;
			double fl_surface_area;
			double fl_volume;
			double fl_pi =3.1416;
			
			
	    	//画面にメッセージ出力
			message = "球の表面積と体積を求めます";
			System.out.println ( message );
			
			//キーボードからの入力
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			fl_input = stdIn.nextDouble();
			
	   		
			//計算
			fl_surface_area = 4 * fl_pi * Math.pow(fl_input,2);
			fl_volume = ( 4 / 3 ) * fl_pi *  Math.pow(fl_input,3);
			
			
	   		//出力
			System.out.println ("球の表面積は" + fl_surface_area +"です");
			System.out.println ("球の体積は" + fl_volume +"です");

		
			
		
	}

}