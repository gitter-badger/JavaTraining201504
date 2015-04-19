package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Class05 {
	public static void main(String[] args){
		String message = "";
		int int_input01 = 0;
		int int_input02 = 0;
		int int_input03 = 0;
		int int_max = 0;
		
		// 1.0 画面にメッセージを出力
		message = "3つの数字の最大値を求めます。";
		System.out.println( message );
		
		// 2.0 キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		System.out.print( "input a:" );int_input01 = stdIn.nextInt();
		System.out.print( "input b:" );int_input02 = stdIn.nextInt();
		System.out.print( "input c:" );int_input03 = stdIn.nextInt();
		
		// 3.0 計算
		int_max = int_input01;
		if(int_input02 > int_max){
			int_max = int_input02;
		}
		if(int_input03 > int_max){
			int_max = int_input03;
		}
		// 4.0 結果の出力
		System.out.println("最大値は" + int_max + "です。");
	}
}