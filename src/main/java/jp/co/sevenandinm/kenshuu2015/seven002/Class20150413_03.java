package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Scanner;
public class Class20150413_03{


	public static void main (String[] args) {
				
		int in_pen = 0;
		int in_sum = 46;
		int in_exsum = 3340;
		int in_spen = 0;
	
	
	
	//1.画面にメッセージを入浴
	
			
		//2.キーボードからの出力
		//java.util.Scanner stdIn = new java.util.Scanner(System.in);
		//in_a = stdIn.nextInt();
		//in_b = stdIn.nextInt();
		//in_c = stdIn.nextInt();
	
	//3.計算
	in_spen =  spen_1(in_sum, in_exsum);
		in_spen = in_sum - in_pen;
		System.out.println(in_spen);
		
		
	//4.結果の出力
	//	System.out.println("最大値は" + in_max + "です。");

	}
	
	public static int spen_1(int in_sum,int in_exsum){
		int spen_1 = 0;
		
		spen_1 = in_exsum  - in_sum/60;
			return spen_1;
		
			}
		
}
