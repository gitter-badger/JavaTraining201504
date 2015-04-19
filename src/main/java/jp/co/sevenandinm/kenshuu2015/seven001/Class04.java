package jp.co.sevenandinm.kenshuu2015.seven001;
public class Class04{
	public static void main(String[] args){
	//1画面にメッセージを出力
	//2キーボードからの入力
	//3計算
	//4結果の出力
	//1
	String message = "";
	double do_input = 0 ;
	double do_surface_area =0 ;
	double do_volume =0 ;
	double do_pi = 3.1416 ;
		
	//1画面にメッセージを出力
	message = "球の表面積と体積を求めます。"+"半径は";
		System.out.println( message );
		
	//2キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		do_input = stdIn.nextDouble();
		
	//3計算
		do_surface_area = 4 * do_pi * Math.pow(do_input,2);
		do_volume = (4 / 3) * do_pi * Math.pow(do_input,3);
		
	//4結果の出力
		System.out.println("表面積は" + do_surface_area + "です。");
		System.out.println("体積は" + do_volume + "です。");
	}
}