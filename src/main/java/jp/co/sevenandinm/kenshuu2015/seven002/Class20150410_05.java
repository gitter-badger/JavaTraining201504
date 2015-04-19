package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Scanner;
public class Class20150410_05 {

	// 3つの数字の最小値を求めます
	// aの値 : 2
	// bの値 : 5
	// cの値 : 3

	public static void main (String args[]) {
				System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		String message = "";
		int in_max = 0;
		int in_a = Integer.parseInt(args[0]);
		int in_b = Integer.parseInt(args[1]);
		int in_c = Integer.parseInt(args[2]);
	
	
	
	//1.画面にメッセージを入浴
	
		message = "3つの数字の最小値を求めます。";
		System.out.println(message);
	
		//2.キーボードからの出力
		//java.util.Scanner stdIn = new java.util.Scanner(System.in);
		//in_a = stdIn.nextInt();
		//in_b = stdIn.nextInt();
		//in_c = stdIn.nextInt();
	
	//3.計算
		if (in_a < in_b) {
			in_max = in_a;
		}else if (in_a < in_c){
		   in_max = in_a;
		}else if (in_b < in_a){
			in_max = in_b;
		}else if (in_b < in_c){
			in_max = in_b;
		}else if (in_c < in_a){
			in_max = in_c;
		}else if (in_c < in_b){
			in_max = in_c;
		}
//4.結果の出力
	System.out.println("最大値は" + in_max + "です。");

	}
}
