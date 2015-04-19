package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class20150413_02{
	public static void main (String[] args){
		int turu_kame_number = 20;
		int turu_kame_asi = 64;
		int kame = kamenum( turu_kame_number, turu_kame_asi );
		
		
		
	//亀の数を表示する
		System.out.println ("亀は"+ kame + "匹です。");
	}	
	
	public static int kamenum( int turu_kame_number , int turu_kame_asi ){
		
		int kame = 0;
		int turu = 0;
		
		
		kame = ( turu_kame_asi / 2) - turu_kame_number ;
		return kame;
	}	
}