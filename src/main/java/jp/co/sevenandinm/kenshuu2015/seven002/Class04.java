package jp.co.sevenandinm.kenshuu2015.seven002;

public class Class04{
	public static void main (String[] args){
	String message = "";
	double do_input =0;
	double do_surface_area =0;
	double do_volume =0;
	double do_pi = 3.1416;
	
	//1.画面にメッセージを入浴
	
		message = "球の表面積と体積を求めます。";
		System.out.println(message);
		//2.キーボードからの出力
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		do_input = stdIn.nextDouble();
	//3.計算
		do_surface_area = 4 * do_pi * Math.pow(do_input,2);
		do_volume = (4/3) * do_pi * Math.pow(do_input,3);
		
	//4.結果の出力
	System.out.println("表面積は" + do_surface_area + "です。");
	System.out.println("体積は" + do_volume + "です。");
	
 }	
}