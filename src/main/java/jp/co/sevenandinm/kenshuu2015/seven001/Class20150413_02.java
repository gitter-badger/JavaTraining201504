package jp.co.sevenandinm.kenshuu2015.seven001;
public class Class20150413_02{
		public static void main (String[] args){
		
			String message ="";
			int count_kame = 0;
			int count_turu = 0;
			int in_total = 20;
			int in_legs = 64;
			
//1画面にメッセージを出力
			message = "亀と鶴の数を求める。";
			System.out.println( message );
			
			int count_kama = get_kame ( in_total , in_legs );
			
			
//3画面に出力
			
			
			System.out.println("亀は" + count_kame + "です。");
		}
		
//計算
		public static int get_kame (int in_total , int in_legs ){
			int count_kame = 0;
			System.out.println("亀と鶴の合計は" + in_total + "です。");
			System.out.println("亀と鶴の足の数の合計は" + in_legs + "です。");
			
			count_kame = in_legs / 2 - in_total;
			
			System.out.println("" + count_kame + "です。");
			return count_kame;
		}
}
