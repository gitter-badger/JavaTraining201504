package jp.co.sevenandinm.kenshuu2015.seven007;

public class Class20150413_03 {
	public static void main ( String[] args ) {
		int money = 3340;
		int pen = 46;
		int sharp_sum = 0;
		int enpitsu_sum = 0;
		
		sharp_sum = sharp_total( money,pen );
		enpitsu_sum = 46 - sharp_sum;
		System.out.println( sharp_sum );
		System.out.println( enpitsu_sum );
	}
	
	public static int sharp_total ( int money_sum, int pen_sum ){
		int x;
		
		x = money_sum / 60 - (pen_sum * 40) / 60;
		
		return x;
	}
}
