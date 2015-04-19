package jp.co.sevenandinm.kenshuu2015.seven007;


public class Class20150413_02 {
	public static void main (String[] args) {
		int sum = 20;
		int leg_sum = 64;
		int kame = 0;
		int tsuru = 0;
		
		
		kame = kame_number(sum,leg_sum);
		tsuru = sum - kame;
		
		System.out.println( kame );
		System.out.println( tsuru );
		
	}
	
	public static int kame_number (int head_total,int leg_total){
		int ret = 0;
			
		ret = leg_total / 2 - head_total;
		
		return ret;
	}
}




//クラス定義
//mainメソッドの外側だけ制作
//今回のテーマとなるかめの数を求めるクラスメソッドの外側
//mainメソッドでの読み出し部分制作
//亀の数を求めるクラスメソッド

