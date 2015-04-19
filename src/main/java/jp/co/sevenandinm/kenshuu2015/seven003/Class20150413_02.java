package jp.co.sevenandinm.kenshuu2015.seven003;
public class Class20150413_02 {
	public static void main(String[] args) {
		int sum = 20;
		int leg_sum = 64;
		int kame = 0;
		
		kame = kame_no(sum,leg_sum);
		
		System.out.println( kame );
	}
	public static int kame_no (int a, int b){
		int ret = 0;
		ret = b /2 - a ;
		
		return ret;
		
	}
	
	
}





//取り組み方

//クラス定義
//mainメソッドの外側だけ作成（ローカル変数定義）
//今回のテーマとなる亀の数を求めるクラスメソッド（関数）の外側作成
//mainメソッドでの読み出し部分作成
//亀の数を求めるクラスメソッド（関数）の実装


