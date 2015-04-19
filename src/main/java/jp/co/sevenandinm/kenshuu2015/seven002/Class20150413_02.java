package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Scanner;
public class Class20150413_02{


	public static void main (String[] args) {
				
		int in_tirtlse = 0;
		int in_sum = 20;
		int in_legsum = 64;
		int in_bird = 0;
	
	
	
	//1.画面にメッセージを入浴
	
			
		//2.キーボードからの出力
		//java.util.Scanner stdIn = new java.util.Scanner(System.in);
		//in_a = stdIn.nextInt();
		//in_b = stdIn.nextInt();
		//in_c = stdIn.nextInt();
	
	//3.計算
	in_tirtlse =  tirtlse_s1(in_sum, in_legsum);
		in_bird = in_sum - in_tirtlse;
		System.out.println(in_tirtlse);
		System.out.println(in_bird);
		
	//4.結果の出力
	//	System.out.println("最大値は" + in_max + "です。");

	}
	
	public static int tirtlse_s1(int in_sum,int in_legsum){
		int tirtlse_s1 = 0;
		
		tirtlse_s1 = in_legsum  - in_sum;
			return tirtlse_s1;
		
			}
		
}
